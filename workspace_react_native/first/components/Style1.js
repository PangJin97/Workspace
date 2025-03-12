import { SafeAreaView, SafeAreaViewBase, StyleSheet, Text, View } from 'react-native'
import React from 'react'


const Style1 = () => {
  return (
      <SafeAreaView style={styles.container}>
        <View style={styles.v1}>
          <Text>text1</Text>
        </View>
        <View style={styles.v2}>
          <Text>text2</Text>
        </View>
        <View style={styles.v3}>
          <Text>text3</Text>
        </View>
      </SafeAreaView>
  )
}
// safeareaview : ios노치영역을 제거 


export default Style1

//react native의 컴포넌트들은 모두 flex가 기본값이다. 
//flex direction은 기본값이 column이기 때문에 세로로 배치 
//가로 배치를 원하면 flexDirection을 'row'로 변경 
const styles = StyleSheet.create({
  container : {
    // flexDirection : 'row'
  },
  v1:{
    backgroundColor : '#cccccc',
    flex : 1
  },
  v2:{
    backgroundColor : 'blue',
    flex : 1
  },
  v3 :{
    backgroundColor : 'yellow',
    alignItems: 'center',
    flex : 1
  }
})