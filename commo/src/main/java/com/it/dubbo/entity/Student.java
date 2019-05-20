package com.it.dubbo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author duanqb
 * @date 2019/5/17 17:02
 */

@Getter
@Setter
@ToString
public class Student implements Serializable {

    private String s_id;
    private String s_name;
    private String s_birth;
    private String s_sex;
}
