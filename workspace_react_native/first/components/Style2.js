import {
  Pressable,
  SafeAreaView,
  StyleSheet,
  Text,
  TextInput,
  View,
} from "react-native";
import React, { useState } from "react";

const Style2 = () => {
  const [id, setId] = useState("");

  return (
    <SafeAreaView style={styles.container}>
       <View style={styles.content}>
        <View>
          <Text>아이디</Text>
          <TextInput
            onChangeText={(text) => {
              setId(text);
              console.log(text)
            }}
            style={styles.input}
          />
        </View>

        <View>
          <Text>비밀번호</Text>
          <TextInput style={styles.input} />
        </View>

        <View style={styles.btnView}>
          <Pressable onPress={() => {}} style={styles.btnContainer}>
            <Text style={styles.btn}>로그인</Text>
          </Pressable>
        </View>
      </View>
    </SafeAreaView>
  );
};

export default Style2;

const styles = StyleSheet.create({
  container: {
    flex: 1,
    //padding: 20,
    //justifyContent: "center",
    borderWidth:3
  },

  content: {
    gap: 20,
  },

  input: {
    borderWidth: 1,
    borderRadius: 4,
  },

  btnContainer: {
    borderRadius: 6,
    height: 34,
    width: "50%",
    backgroundColor: "#dddddd",
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: "blue",
  },

  btn: {
    color: "white",
  },

  btnView: {
    alignItems: "center",
  },
});
