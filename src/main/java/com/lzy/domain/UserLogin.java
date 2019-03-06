package com.lzy.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserLogin {
    private Integer id;
    private UserInfo userInfo;
    private String password;
}
