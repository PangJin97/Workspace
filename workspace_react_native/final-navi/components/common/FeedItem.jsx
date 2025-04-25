import { Pressable, StyleSheet, Text, View } from "react-native";
import React from "react";
import Octicons from "@expo/vector-icons/Octicons";
import MaterialCommunityIcons from "@expo/vector-icons/MaterialCommunityIcons";
import { colors } from "@/constants/colorConstant";
import Profile from "./Profile";

const FeedItem = ({item}) => {

  const isLike = false;


  return (
    // 피드 하나하나
    <View style={styles.feedContainer}>
      <Profile writer={item.writer} createDate={item.createData} />
      <Text style={styles.title}>{item.title}</Text>
      <Text style={styles.content} numberOfLines={2}>
        {item.content}
      </Text>

      <View style={styles.menuContainer}>
        <Pressable style={styles.menu}>
          <Octicons name={isLike ? 'heart-fill' : 'heart'} size={20} color="red" />
          <Text>{item.likeCnt}</Text>
        </Pressable>

        <Pressable style={styles.menu}>
          <Octicons name="comment" size={20} color="black" />
          <Text style={isLike && {color : 'red'}}>{item.replyCnt}</Text>
        </Pressable>

        <Pressable style={styles.menu}>
          <MaterialCommunityIcons name="eye-outline" size={20} color="black" />
          <Text>{item.readCnt}</Text>
        </Pressable>
      </View>
    </View>
  );
};

export default FeedItem;

const styles = StyleSheet.create({
  feedContainer: {
    padding: 16,
  },
 
  menuContainer: {
    flexDirection: "row",
    justifyContent: "space-around",
    alignItems: "center",
    borderTopWidth: StyleSheet.hairlineWidth,
    borderTopColor: colors.GRAY_600,
  },
 
  menu: {
    flexDirection: "row",
    justifyContent: "center",
    alignItems: "center",
    paddingVertical: 16,
    gap: 5,
    width: "33.3%",
  },
 
  title: {
    fontSize: 16,
    marginBottom: 14,
  },
  
  content: {
    fontSize: 14,
    color: colors.GRAY_600,
    marginBottom: 14,
  },
});
