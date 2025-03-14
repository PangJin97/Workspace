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

  const [isEdit, setIsEdit] = useState(null);
  //조건부 랜더링을 위한 변수 -> 핵심은  내가 누른(onPress)
  // textinput의 아이디 값을 setIsEdit에 줘서 선택한 textinput만 수정 가능하도록


  //filter함수를 이용한 삭제 기능
  const remove = (id) => {
    setToDoList(
      toDoList.filter((e) => {
        return e.id !== id;
      })
    );
  };

  //find함수를 이용한 수정 기능
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
          value={newDoIt}
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

            //빈문자 유효성 검사
            if (newData.text === "") {
              alert("빈문자는 입력 불가합니다");
              return;
            } else {
              setToDoList([...toDoList, newData]);
              setNewDoIt("");
              alert(`${newData.text} 등록완료`);
            }
          }}
        />
      </View>
      <View style={styles.jobsCotainer}>
        {toDoList.map((doList, i) => {
          return (
            <View key={i} style={styles.jobs}>
             
              {/* 아이디와 조건부 랜더링의 state변수(isEdit)가
              일치한다면 내가 누른 textInput 수정만 가능하다! */}
             
              {/* 만약에 내가 누른 textinput의 doList.id = 3 이면  
              isEdit = 3으로 변하고 해당하는 textinput만 보이며 수정가능*/}
             
              {isEdit === doList.id ? (
                <TextInput
                  style={styles.ediTadd}
                  onChangeText={(text) => {
                    edit(doList.id, text);
                  }}
                  value={doList.text}
                  onSubmitEditing={() => {
                    setIsEdit(null);
                  }}
                />
              ) : (
                <Text style={styles.todo}>{doList.text}</Text>
              )}

              <View
                style={[
                  styles.iconContainer,
                  { opacity: isEdit === doList.id ? 0 : 1 },
                ]}
                //다중속성을 배열로 주고 opacity의 값을 삼항연산자를 통해
                //상황에 따라 준다
               
                //opacity 불투명도를 줘서 아이콘이 사라지지 않고 그저 보이지 않게
              
                //textInput을 누르면 isEdit값이 내가 누른 textInput의 아이디 값을 가진다 그러면 0이 되니 투명하게 됨
                //선택하지 않으면 값이 없으니 1이 되서 보인다 
              >
                <Pressable onPress={() => setIsEdit(doList.id)}>
                  {/*내가 아이콘 누르면 선택한 textInput의 아이디를 isEdit에 준다! 
                  그러면 내가 선택한 곳만 수정가능,,,! */}
                  <Image source={icon.ICON_EDIT} />
                </Pressable>
                <Pressable onPress={() => remove(doList.id)}>
                  <Image source={icon.ICON_DELETE} />
                </Pressable>
              </View>
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
    margin: 4,
    backgroundColor: "#eeeeee",
    alignItems: "center",
    padding: 15,
    gap: 10,
    position: "relative",
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

  ediTadd: {
    borderWidth: 1,
    position: "absolute",
    top: 5,
    left: 10,
    width: "100%",
    fontSize: 20,
  },

  iconContainer: {
    width: 70,
    flexDirection: "row",
  },
});
