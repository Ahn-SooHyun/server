package kr.soft.server.service.member;

import kr.soft.server.dao.member.MemberDao;
import kr.soft.server.dto.member.MemberJoinReq;
import kr.soft.server.dto.member.MemberJoinRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    MemberDao memberDao;

    @Override
    public String selectCheck() {
        System.out.println("service 반응");
        return memberDao.selectCheck();
    }

    @Override
    public List<MemberJoinRes> valueCheck() {
            return memberDao.valueCheck();
    }

    @Override
    @Transactional
    public int regist(MemberJoinReq memberJoinReq) {
        return memberDao.regist(memberJoinReq);
    }
}
