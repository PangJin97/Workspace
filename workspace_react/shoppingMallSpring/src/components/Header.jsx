import React from "react";
import { NavLink, useNavigate } from "react-router-dom";
import styles from "./Header.module.css";

const Header = () => {
  const nav = useNavigate();

  return (
    <div className={styles.header}>
      <ul className={styles.menu}>
        <li>
          {/* NavLink 현재 선택된 link에 css 적용 기능 제공*/}
          {/* className에 함수 적용 */}
          {/* data를 콘솔에 찍어보면 isActive */}
          {/* data는 객체 자료형이니까 data.isActive */}
          <NavLink
            to={"/"}
            className={(data) => {
              return data.isActive ? styles.active : "";
              //지금 이 li가 선택되면
              // navelink의 data.isActive가 ture
              //선택되지 않으면 false 
              //이걸 이용해 삼항 연산자로 css를 줄 수 있다 
            }}
          >
            상품정보
          </NavLink>
        </li>
        <li>
          <NavLink
            to={"/insert"}
            className={(data) => {
              return data.isActive ? styles.active : "";
              //truty false
            }}
          >
            상품등록
          </NavLink>
        </li>
        <li>
          <NavLink
            to={"/order"}
            className={(data) => {
              return data.isActive ? styles.active : "";
              //truty false
            }}
          >
            주문하기
          </NavLink>
        </li>
        <li>
          <NavLink
            to={"/orderList"}
            className={(data) => {
              return data.isActive ? styles.active : "";
              //truty false
            }}
          >
            주문목록
          </NavLink>
        </li>
      </ul>
    </div>
  );
};

export default Header;
