import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { Stack } from 'expo-router'

// app/_layout.jsx
//app폴더안의 구조잡기 
const Layout = () => {
  return (
    <Stack screenOptions={{headerShown : false}}/>
  )
}

export default Layout

const styles = StyleSheet.create({})