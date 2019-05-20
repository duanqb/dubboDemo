package com.it.dubbo.api.service;

import com.it.dubbo.entity.Student;

import java.util.List;

/**
 * @author duanqb
 * @date 2019/5/17 16:15
 */
public interface StudentService {

    public List<Student> findAll();
}
