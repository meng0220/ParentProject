package com.iotek.controller;

import com.iotek.pojo.Student;
import com.iotek.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println("连接成功");
        return "success";
    }
    @RequestMapping("regist")
    @ResponseBody
    public String regist(Student student){
        System.out.println("student::::::"+student);
        studentService.addStu(student);


        return "success";
    }

}
