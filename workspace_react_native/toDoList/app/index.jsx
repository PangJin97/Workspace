import { SafeAreaView, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import ToDoList from '../components/ToDoList'

const index = () => {
  return (
    <SafeAreaView>
      <ToDoList />
    </SafeAreaView>
  )
}

export default index

const styles = StyleSheet.create({})