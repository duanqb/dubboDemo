package com.it.dubbo.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.it.dubbo.api.service.StudentService;
import com.it.dubbo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author duanqb
 * @date 2019/5/17 19:11
 */

@RestController
@RequestMapping("/test")
public class ControllerDemo {
    @Reference(version = "${demo.service.version}")
    private StudentService studentService;

    @GetMapping("/list")
    public List<Student> getList(){
        List<Student> list = studentService.findAll();
        return  list;
    }
}
