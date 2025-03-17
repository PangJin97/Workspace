import { Image, Pressable, StyleSheet, Text, TextInput, View } from "react-native";
import React, { useEffect, useState } from "react";
import { icon } from "../constants/icons";

const Task = ({item, cartList, setCartList}) => {
  //수정 상태 여부 
  const [isEditing, setIsEditing] = useState(false)

  //수정을 위해서 input태그에 입력한 글자, id도 필요 
  //전체 데이터도 필요 

  //장바구니 목록 데이터 수정
  const handleCartList = () => {
   //상품목록에서 현재 수정 중인 상품의 id를 찾아서 
    //찾은 상품의 item 속성값을 input태그에 입력한 글자로 바꾸겠다
    
    //-----1번 풀이 -----//
    // const copyCartList = [...cartList];
    // for(const cart of copyCartList){
    //   if(cart.id === item.id){
    //     cart.item === newText;
    //   }
    // }
    // setCartList(copyCartList);
    //-----1번 풀이 끝----//
      
    //-----2번 플이 -----//
    //find : 조건과 일치하는 데이터만 리턴한다.
    //filter : 조건과 일치하는 데이터만 필터링한다(제외한다)  

  const copyCartList = [...cartList];
 
  const findCart = copyCartList.find((cart)=>
                  //cartList.find  
  {return cart.id === item.id});
  findCart.item = newText
   
   setCartList(copyCartList)
   //setCartList([...cartList])
   
   //이것도 바로 수정하는 것 보단 복사 배열을 만드는게 좋다.
  }
   
//----------------------------------------------------------------------------------


  //input태그에 입력한 데이터 
  //주의! props로 전달된 데이터를 state 변수의 초기값으로 주면 안 됨!
  const [newText, setNewText] = useState('')

  //그래서 useEffect
  //item이 바뀔때도 실행 
  useEffect(() => {
    setNewText(item.item)
  },[item])

  return (
    <View style={styles.container}>
      {
        isEditing
        ?
        <>
          <TextInput style={styles.input} autoFocus={true} 
          // 포커스 아웃 이벤트(인풋 태그가 활성되있는 동안 다른데를 터치했을때)
          //react도 똑같이 있음
          onBlur={()=>{
            setIsEditing(false) 
            setNewText(item.item)}}
          onChangeText={text => setNewText(text)}
          value={newText}
          onSubmitEditing={()=>{
            handleCartList()
          }}
          />
        </>
        :
        <>
         <Text style={styles.title}>{item.item}</Text>
         <Pressable onPress={() => {setIsEditing(true)}}>
           <Image source={icon.ICON_EDIT} />
         </Pressable>
         <Image source={icon.ICON_DELETE} />
        </>
      }
    </View>
    // 이걸 컴포넌트로 따로 빼서 컴포넌트를 반복돌림
  );
};

export default Task;

const styles = StyleSheet.create({
  container: {
    borderWidth: 1,
    margin: 12,
    backgroundColor: "#eeeeee",
    borderRadius: 4,
    flexDirection: "row",
    alignItems: "center",
    padding: 10,
    gap: 8,
  },

  title: {
    flex: 1,
    fontSize: 18,
  },

  input: {
    borderWidth : 1,
    width: '100%'
  }
});
