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
  /*사원한명은 부서정보 하나를 갖는다 */
  /*DeptDTO deptDTO 는 하나의 부서정보를 갖는 것*/

}
