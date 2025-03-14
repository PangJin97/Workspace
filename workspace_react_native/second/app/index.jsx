
import { StatusBar, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { SafeAreaView } from 'react-native'
import Login from '../components/Login'
import CartList from '../components/CartList'

const MainScreen = () => {
  return (
    <SafeAreaView>
      <StatusBar 
      barStyle={'light-content'}
      backgroundColor={'#555555'}
      />
      {/* 최상단의 상태창 약간이나마 수정 */}
      {/* ios는 미적용 */}

      {/* <Login /> */}
      <CartList />
   
   
    </SafeAreaView>
  )
}

export default MainScreen

const styles = StyleSheet.create({})
