package com.green.shoppingMall.controller;

import com.green.shoppingMall.dto.BoardDTO;
import com.green.shoppingMall.dto.JoinDTO;
import com.green.shoppingMall.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
  private final TestService testService;

  @GetMapping("/1")
  public List<JoinDTO> tes1(){
    return testService.getEmpList();
  }

  @GetMapping("/2")
  public List<BoardDTO> tes2(){
    return testService.joinList();
  }

  /*
  1:N 관계에서는 객체 리스트 안에 객체 안에 리스트가 있다
  [
    {
        "boardNum": 1,
        "title": "첫번째 글",
        "writer": "김자바",
        "content": "하이헬로우",
        "redCnt": 0,
        "regDate": null,
        "replyList": [
            {
                "replyNum": 0,
                "replyContent": null,
                "replyWriter": null,
                "replyRegDate": null,
                "boardNum": 1
            }
        ]
    },
    {
        "boardNum": 2,
        "title": "제목입니다",
        "writer": "이자바",
        "content": "반갑습니다",
        "redCnt": 0,
        "regDate": null,
        "replyList": [
            {
                "replyNum": 0,
                "replyContent": null,
                "replyWriter": null,
                "replyRegDate": null,
                "boardNum": 2
            }
        ]
    }
]
*/

  /*
  1:1관계
  조회결과 보면알겠지만 전체는 리스트
  * 리스트 안에 객체 그 객체안에 객체
  * 리엑트에서 데이터 뽑아갈때 콘솔로 찍어보며
  * 잘 추출해야한다,,,!!
  */
  /*
  [
    {
        "empno": 1001,
        "ename": "김사랑",
        "job": null,
        "mgr": 0,
        "hiredate": null,
        "sal": 300,
        "comm": 0,
        "deptno": 20,
        "deptDTO": {
            "deptno": 20,
            "dname": "인사부",
            "loc": "인천"
        }
    },
    {
        "empno": 1002,
        "ename": "한예슬",
        "job": null,
        "mgr": 0,
        "hiredate": null,
        "sal": 250,
        "comm": 0,
        "deptno": 30,
        "deptDTO": {
            "deptno": 30,
            "dname": "영업부",
            "loc": "용인"
        }
    },
    {
        "empno": 1003,
        "ename": "오지호",
        "job": null,
        "mgr": 0,
        "hiredate": null,
        "sal": 500,
        "comm": 0,
        "deptno": 30,
        "deptDTO": {
            "deptno": 30,
            "dname": "영업부",
            "loc": "용인"
        }
    },
    {
        "empno": 1004,
        "ename": "이병헌",
        "job": null,
        "mgr": 0,
        "hiredate": null,
        "sal": 600,
        "comm": 0,
        "deptno": 20,
        "deptDTO": {
            "deptno": 20,
            "dname": "인사부",
            "loc": "인천"
        }
    },
    {
        "empno": 1005,
        "ename": "신동협",
        "job": null,
        "mgr": 0,
        "hiredate": null,
        "sal": 450,
        "comm": 0,
        "deptno": 30,
        "deptDTO": {
            "deptno": 30,
            "dname": "영업부",
            "loc": "용인"
        }
    },
    {
        "empno": 1006,
        "ename": "장동건",
        "job": null,
        "mgr": 0,
        "hiredate": null,
        "sal": 480,
        "comm": 0,
        "deptno": 30,
        "deptDTO": {
            "deptno": 30,
            "dname": "영업부",
            "loc": "용인"
        }
    },
    {
        "empno": 1007,
        "ename": "이문세",
        "job": null,
        "mgr": 0,
        "hiredate": null,
        "sal": 520,
        "comm": 0,
        "deptno": 10,
        "deptDTO": {
            "deptno": 10,
            "dname": "경리부",
            "loc": "서울"
        }
    },
    {
        "empno": 1008,
        "ename": "감우성",
        "job": null,
        "mgr": 0,
        "hiredate": null,
        "sal": 500,
        "comm": 0,
        "deptno": 30,
        "deptDTO": {
            "deptno": 30,
            "dname": "영업부",
            "loc": "용인"
        }
    },
    {
        "empno": 1009,
        "ename": "안성기",
        "job": null,
        "mgr": 0,
        "hiredate": null,
        "sal": 1000,
        "comm": 0,
        "deptno": 20,
        "deptDTO": {
            "deptno": 20,
            "dname": "인사부",
            "loc": "인천"
        }
    },
    {
        "empno": 1010,
        "ename": "이병헌",
        "job": null,
        "mgr": 0,
        "hiredate": null,
        "sal": 500,
        "comm": 0,
        "deptno": 10,
        "deptDTO": {
            "deptno": 10,
            "dname": "경리부",
            "loc": "서울"
        }
    },
    {
        "empno": 1011,
        "ename": "조향기",
        "job": null,
        "mgr": 0,
        "hiredate": null,
        "sal": 280,
        "comm": 0,
        "deptno": 30,
        "deptDTO": {
            "deptno": 30,
            "dname": "영업부",
            "loc": "용인"
        }
    },
    {
        "empno": 1012,
        "ename": "강혜정",
        "job": null,
        "mgr": 0,
        "hiredate": null,
        "sal": 300,
        "comm": 0,
        "deptno": 20,
        "deptDTO": {
            "deptno": 20,
            "dname": "인사부",
            "loc": "인천"
        }
    },
    {
        "empno": 1013,
        "ename": "박중훈",
        "job": null,
        "mgr": 0,
        "hiredate": null,
        "sal": 560,
        "comm": 0,
        "deptno": 20,
        "deptDTO": {
            "deptno": 20,
            "dname": "인사부",
            "loc": "인천"
        }
    },
    {
        "empno": 1014,
        "ename": "조인성",
        "job": null,
        "mgr": 0,
        "hiredate": null,
        "sal": 250,
        "comm": 0,
        "deptno": 10,
        "deptDTO": {
            "deptno": 10,
            "dname": "경리부",
            "loc": "서울"
        }
    }
]

*/

}
