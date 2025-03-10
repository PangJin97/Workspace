package com.green.member_manager.service;


import com.green.member_manager.DTO.MemberListDTO;
import com.green.member_manager.maper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{

  private MemberMapper memberMapper;

  @Autowired
  public MemberServiceImpl(MemberMapper memberMapper){
    this.memberMapper = memberMapper;
  }

  @Override
  public List<MemberListDTO> getMemberList() {
    return memberMapper.getMemberList();
  }

  @Override
  public void insertMemberList(MemberListDTO memberListDTO) {
    memberMapper.insertMemberList(memberListDTO);
  }

  @Override
  public MemberListDTO findMemberByMemId(String memId) {
    return memberMapper.findMemberByMemId(memId);
  }

  @Override
  public void updateMember(MemberListDTO memberListDTO) {
    memberMapper.updateMember(memberListDTO);
  }

  @Override
  public void deleteMember(String memId) {
    memberMapper.deleteMember(memId);
  }


}
