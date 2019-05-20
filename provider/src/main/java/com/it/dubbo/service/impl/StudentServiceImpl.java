package com.it.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.it.dubbo.api.service.StudentService;
import com.it.dubbo.dao.StudentDao;
import com.it.dubbo.entity.Student;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author duanqb
 * @date 2019/5/17 16:30
 */


@Service(version = "${demo.service.version}")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public List<Student> findAll() {
        List<Student> all = studentDao.findAll();
        System.out.println(all);
        return all;
    }
}
