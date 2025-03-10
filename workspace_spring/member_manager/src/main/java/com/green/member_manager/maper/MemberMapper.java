package com.green.member_manager.maper;

import com.green.member_manager.DTO.MemberListDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

  public List<MemberListDTO> getMemberList();

  public void insertMemberList(MemberListDTO memberListDTO);

  public MemberListDTO findMemberByMemId(String memId);

  public void updateMember(MemberListDTO memberListDTO);

  public void deleteMember(String memId);
}
