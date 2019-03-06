package com.lzy.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class UserInfo {
    private String username;
    private String nickname;
    private String name;
    private String email;
    private Integer userType;
    private String school;
    private Date createTime;
    private String birthday;

}
