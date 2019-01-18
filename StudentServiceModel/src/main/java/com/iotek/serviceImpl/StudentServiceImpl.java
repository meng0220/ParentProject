package com.iotek.serviceImpl;

import com.iotek.mapper.StudentMapper;
import com.iotek.pojo.Student;
import com.iotek.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public int addStu(Student student) {
        System.out.println("student111:::"+student);
        return studentMapper.insertStu(student);
    }
}
