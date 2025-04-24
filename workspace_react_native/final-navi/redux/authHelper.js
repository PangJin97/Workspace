import { jwtDecode } from 'jwt-decode';

// 기존 방식(OR연산자) - 왼쪽 데이터가 falsy일때 오른쪽 데이터 실행

// const username = user.name || 'Guest'
// 이 코드는 user.name이 falsy 값이면 'Guest'를 사용해요.

// falsy 값이란?
// false, 0, '' (빈 문자열), null, undefined, NaN
// 즉, user.name이 빈 문자열('')이더라도 'Guest'가 대입됩니다.


// Nullish 병합 연산자 = 왼쪽 데이터가 null또는 undeifend 일때만 오른쪽 데이터 실행 
// const username = user.name ?? 'Guest'

// 이 코드는 user.name이 null 또는 undefined일 때만 'Guest'를 사용합니다.
// 다른 falsy 값들('', 0, false)은 유효한 값으로 간주되어 그대로 사용됩니다.


//토큰에서 로그인한 회원 email 추출
export const getUserSubFromToken = (token) => {
  if (!token) return null;

  try {
    const decoded = jwtDecode(token);

    // const result = '';

    // decoded !== null && decoded !== undefined

    // => truty falsey
    // 
    // if(decoded){
    //   result = decoded.name
    // }
    // else{
    //   result = null
    // }


    //optional chaining 연산자 : ? 
    //decoded가 null또는 undefined면 => undefined 반환

//    decoded?.sub:
        // decoded 객체가 존재한다면(undefined가 아니라면) 그 안의 sub 속성을 참조합니다.
//    || null:
        // 만약 decoded?.sub가 falsy 값이면 null을 대입합니다.
        // 즉, decoded?.sub이 undefined, null, 0, false, '' 등 falsy 값이면 null이 됩니다.
    
    return decoded?.sub || null;
    
  } catch (error) {
    console.log('jwtDecode 실패:', error);
    return null;
  }
};

export const getUserRoleFromToken = (token) => {
  if (!token) return null;

  try {
    const decoded = jwtDecode(token);
    return decoded?.role || null;
  } catch (error) {
    console.log('jwtDecode 실패:', error);
    return null;
  }
};