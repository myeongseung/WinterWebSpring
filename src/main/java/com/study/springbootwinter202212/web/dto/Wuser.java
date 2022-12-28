package com.study.springbootwinter202212.web.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Wuser {
    private String wuserId;
    private String wuserPassword;
    private String wuserName;
    private String wuserPhone;
}
