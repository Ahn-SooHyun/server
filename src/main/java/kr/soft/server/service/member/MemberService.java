package kr.soft.server.service.member;

import kr.soft.server.dto.member.MemberJoinReq;
import kr.soft.server.dto.member.MemberJoinRes;

import java.util.List;

public interface MemberService {

    //Member 관리 test
    String selectCheck();

    //결과 불러오기
    List<MemberJoinRes> valueCheck();

    //값 삽입하기
    int regist(MemberJoinReq memberJoinReq);
}
