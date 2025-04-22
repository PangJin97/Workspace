import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { useLocalSearchParams, useRouter } from 'expo-router'
import { AppRegistry } from 'react-native';

const DetailScreen = () => {
  const router = useRouter();

  // router 이동 시 전달되는 데이터 받기
  //const params = useLocalSearchParams();

  //params로 통채로 받아도 되지만 구조분해할당으로
  const {id, age} = useLocalSearchParams();


  return (
    <View>
      <Text>디테일 스크린입니다 데이터 받음: {id} / {age}</Text>

      <Pressable onPress={()=>{router.push('/myPage')}}>
        <Text>마이페이지로 이동: push</Text>
      </Pressable>

      
      <Pressable onPress={()=>{router.replace('/myPage')}}>
        <Text>마이페이지로 이동: replace</Text>
      </Pressable>





    </View>
  )
}

export default DetailScreen

const styles = StyleSheet.create({})