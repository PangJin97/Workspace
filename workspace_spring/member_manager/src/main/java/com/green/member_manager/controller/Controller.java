package com.green.member_manager.controller;

import com.green.member_manager.DTO.MemberListDTO;
import com.green.member_manager.service.MemberService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("members")
public class Controller {

  private MemberService memberService;

  public Controller(MemberService memberService){
    this.memberService =  memberService;
  }

  @GetMapping("")
  public List<MemberListDTO> getMember(){
    return memberService.getMemberList();
  }

  @GetMapping("/{memId}")
  public MemberListDTO findMemberByMemId(@PathVariable ("memId") String memId){
    return memberService.findMemberByMemId(memId);
  }


  @PostMapping("")
  public void insertMember(@RequestBody MemberListDTO memberListDTO){
    memberService.insertMemberList(memberListDTO);
  }

  @PutMapping("/{memId}")
  public void updateMember(@PathVariable("memId") String memId, @RequestBody MemberListDTO memberListDTO ){
    memberListDTO.setMemId(memId);
    memberService.updateMember(memberListDTO);
  }

  @DeleteMapping("/{memId}")
  public void deleteMember(@PathVariable("memId") String memId){
    memberService.deleteMember(memId);
  }
}
