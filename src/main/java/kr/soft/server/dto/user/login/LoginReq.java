package kr.soft.server.dto.user.login;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginReq {
    private String ID;
    private String Password;
}
