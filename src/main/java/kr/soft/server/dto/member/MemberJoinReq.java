package kr.soft.server.dto.member;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberJoinReq {

    private int num;
    private String name;
    private int score;
}
