import React from "react";
import { NavLink, useNavigate } from "react-router-dom";
import styles from "./Header.module.css";

const Header = () => {
  const nav = useNavigate();

  return (
    <div className={styles.header}>
      <ul className={styles.menu}>
        <li>
          <NavLink
            to={"/"}
            className={(data) => {
              return data.isActive ? styles.active : "";
              //truty false
            }}
          >
            상품정보
          </NavLink>
        </li>
        <li>
          <NavLink
            to={"/insert"}
            className={(data) => {
              return data.isActive ? styles.active : "";
              //truty false
            }}
          >
            상품등록
          </NavLink>
        </li>
        <li>
          <NavLink
            to={"/order"}
            className={(data) => {
              return data.isActive ? styles.active : "";
              //truty false
            }}
          >
            주문하기
          </NavLink>
        </li>
        <li>
          <NavLink
            to={"/orderList"}
            className={(data) => {
              return data.isActive ? styles.active : "";
              //truty false
            }}
          >
            주문목록
          </NavLink>
        </li>
      </ul>
    </div>
  );
};

export default Header;
