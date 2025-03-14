import {
  Image,
  Pressable,
  StyleSheet,
  Text,
  TextInput,
  View,
} from "react-native";
import React, { useState } from "react";
import { icon } from "../constants/icons";
import { data } from "../data/todoList";

const ToDoList = () => {
  const [toDoList, setToDoList] = useState(data);
  const [newDoIt, setNewDoIt] = useState("");

  const remove = (id) => {
    setToDoList(
      toDoList.filter((e) => {
        return e.id !== id;
      })
    );
  };

  const edit = (id, text) => {
    const foundText = toDoList.find((e) => e.id === id);
    if (foundText) {
      foundText.text = text;
      setToDoList([...toDoList]);
    }
  };

  return (
    <View style={styles.container}>
      <View>
        <Text style={styles.title}>To Do List</Text>
      </View>

      <View style={styles.addView}>
        <TextInput
          style={styles.add}
          placeholder="+Add a Task"
          onChangeText={(text) => {
            setNewDoIt(text);
          }}
          onSubmitEditing={() => {
            const maxId = Math.max(
              ...toDoList.map((e, i) => {
                return e.id;
              })
            );
            const newData = {
              id: maxId + 1,
              text: newDoIt,
            };

            setToDoList([...toDoList, newData]);
            setNewDoIt("");
            console.log(toDoList);
          }}
        />
      </View>

      <View style={styles.jobsCotainer}>
        {toDoList.map((doList, i) => {
          return (
            <View key={i} style={styles.jobs}>
              <Text style={styles.todo}>{doList.text}</Text>

              <TextInput
                style={styles.add}
                onChangeText={(text) => {
                  edit(doList.id, text);
                }}
                value={doList.text}
              />

              <Pressable onPress={() => {}}>
                <Image source={icon.ICON_EDIT} />
              </Pressable>

              <Pressable
                onPress={() => {
                  remove(doList.id);
                }}
              >
                <Image source={icon.ICON_DELETE} />
              </Pressable>
            </View>
          );
        })}
      </View>
    </View>
  );
};

export default ToDoList;

const styles = StyleSheet.create({
  container: {
    justifyContent: "center",
    gap: 30,
    padding: 20,
  },

  jobsCotainer: {
    backgroundColor: "grey",
    padding: 8,
  },

  jobs: {
    flexDirection: "row",
    borderWidth: 1,
    margin: 5,
    backgroundColor: "#eeeeee",
    alignItems: "center",
    padding: 12,
    gap: 10,
  },

  todo: {
    flex: 1,
    fontSize: 20,
  },

  add: {
    borderWidth: 1,
  },

  title: {
    fontSize: 50,
  },
});
