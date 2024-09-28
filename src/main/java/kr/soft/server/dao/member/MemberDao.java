package kr.soft.server.dao.member;

import kr.soft.server.dto.member.MemberJoinReq;
import kr.soft.server.dto.member.MemberJoinRes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberDao {

    String selectCheck();

    //결과 불러오기
    List<MemberJoinRes> valueCheck();

    //값 삽입하기
    int regist(MemberJoinReq memberJoinReq);
}
