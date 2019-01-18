package com.iotek.test;

import com.iotek.pojo.Student;
import com.iotek.student.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Student student = new Student();
        student.setName("zs");
        student.setPassword("123");
        student.setSalt("123");
        StudentService studentService = applicationContext.getBean("studentServiceImpl", StudentService.class);
        int i = studentService.addStu(student);
        System.out.println(i);
    }
}
