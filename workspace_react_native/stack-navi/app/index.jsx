import { Pressable, StyleSheet, Text, View } from "react-native";
import React from "react";
import { useRouter } from "expo-router";

// app/index.jsx
const HomeScreen = () => {
  //route 이동 시 사용

  const router = useRouter();

  return (
    <View>
      <Text>첫 페이지 입니다</Text>

      <Pressable onPress={()=>{router.push('/detail')}}> 
                                          {/* 이동하고 싶은 곳의 파일명과 동일 */}
        <Text>디테일로 이동</Text>
      </Pressable>


      <Pressable onPress={()=>{
        router.push({
          pathname : '/detail',
          params : {
            id : 'reacet',
            age : 30
          }
        })
      }}> 
        <Text>디테일로 이동: 데이터 가져가기</Text>
      </Pressable>
      
   
    </View>
  );
};

//react와 다른점: 파일명과 실제 쓰는 컴포넌트명(함수 명)이 달라도 됨
export default HomeScreen;

const styles = StyleSheet.create({});
