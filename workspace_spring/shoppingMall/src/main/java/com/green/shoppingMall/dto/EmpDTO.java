package com.green.shoppingMall.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class EmpDTO {
  private int empno;
  private String ename;
  private String job;
  private int mgr;
  private LocalDateTime hiredate;
  private int sal;
  private int comm;
  private int deptno;
  private DeptDTO deptDTO;
  /*1대1관계 : emp : dept*/

}
