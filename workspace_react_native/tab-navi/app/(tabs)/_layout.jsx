import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { Tabs } from 'expo-router'
import MaterialIcons from '@expo/vector-icons/MaterialIcons';

// app/(tabs)/_layout.jsx
//tabs 폴더안의 레이아웃 
//각 폴더마다 레이아웃이 많아짐

//텝에도 헤드가 있어서 보인다 
const TabLayout = () => {
  return (
    <Tabs screenOptions={{headerShown : false}}>
      {/* 탭하나하나가 Tabs.Screen */}
      <Tabs.Screen 
        name='index' //탭 터치 시 보여줄 파일명(경로)
        options={{
          title: 'Home' , //탭의 제목(이름)  
          tabBarIcon : () => <MaterialIcons name="home" size={24} color="black" />

        }}

      />
      
      <Tabs.Screen 
        name='mypage'
        options={{
          title : 'MyPage' ,
          tabBarIcon : () => <MaterialIcons name="person" size={24} color="black" />
        }}

      />
      
      <Tabs.Screen 
        name='settings'
        options={{
          title : 'Setting',
          tabBarIcon : () => <MaterialIcons name="settings" size={24} color="black" />
        }}
      />
    </Tabs>
  )
}

export default TabLayout

const styles = StyleSheet.create({})