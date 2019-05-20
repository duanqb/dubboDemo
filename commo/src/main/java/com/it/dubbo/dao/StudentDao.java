package com.it.dubbo.dao;

import com.it.dubbo.entity.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author duanqb
 * @date 2019/5/17 17:11
 */

public interface StudentDao {

    @Select("select * from student")
    public List<Student> findAll();
}
