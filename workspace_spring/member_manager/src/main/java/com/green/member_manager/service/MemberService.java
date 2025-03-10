package com.green.member_manager.service;

import com.green.member_manager.DTO.MemberListDTO;

import java.util.List;

public interface MemberService {

  public List<MemberListDTO> getMemberList();

  public void insertMemberList(MemberListDTO memberListDTO);

  public MemberListDTO findMemberByMemId(String memId);

  public void updateMember(MemberListDTO memberListDTO);

  public void deleteMember(String memId);
}
