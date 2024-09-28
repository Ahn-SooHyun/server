package kr.soft.server.controller;

import kr.soft.server.dto.member.MemberJoinReq;
import kr.soft.server.dto.member.MemberJoinRes;
import kr.soft.server.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    MemberService memberService;

    @GetMapping("/test1")
    public void test() {
        System.out.println("test");
        String result = memberService.selectCheck();
        System.out.println(result);
    }

    @GetMapping("/result")
    public void getResult() {
        List<MemberJoinRes> list = memberService.valueCheck();
        for(MemberJoinRes li : list) {
            System.out.println(li.toString());
        }
    }

    @GetMapping("/regist")
    public void regist() {
        MemberJoinReq req = new MemberJoinReq();
        req.setName("테스트");
        req.setScore(99);
        int cnt = memberService.regist(req);
    }

    //name <= method 필드명으로 갖고 오면 됨.
    //http://localhost:8080/api/test/param?name=bbb
    @GetMapping("/param")
    public void param(MemberJoinReq memberJoinReq) {
        System.out.println(memberJoinReq.getName());
    }

    /**
     * Lombok test
     */
    @GetMapping("/lombok")
    public void lombok() {
        MemberJoinRes memberJoinRes = new MemberJoinRes();
        memberJoinRes.setName("가나다");
        String nam = memberJoinRes.getName();
        System.out.println(nam);
    }
}
