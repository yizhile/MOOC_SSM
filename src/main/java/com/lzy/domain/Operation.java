package com.lzy.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Operation {
    private Integer id;
    private UserInfo userInfo;
    private String name;
    private Date time;
    private Integer type;
}
