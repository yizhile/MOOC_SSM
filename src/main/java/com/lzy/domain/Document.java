package com.lzy.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
public class Document {
    private Integer id; //id的值为自增主键，不需要添加，会自动生成
    private String name;
    private Integer kindId;
    private Kind kind;
    private String uploaduser;
    private UserInfo userInfo;
    private Date uploaddate;
    private String keyword;
    private String url;
    private String summary;
}
