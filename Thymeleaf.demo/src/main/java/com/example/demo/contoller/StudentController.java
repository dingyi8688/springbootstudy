package com.example.demo.contoller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.pojo.Student;
@Controller

public class StudentController {

    @RequestMapping("/Student")
    public String Student(Model model) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("张三", 1));
//        students.add(new Student("李四", 2));
//        students.add(new Student("王五", 3));
//        students.add(new Student("二麻子", 4));
//        students.add(new Student("三棒子", 5));

        model.addAttribute("students", students);
        model.addAttribute("student", new Student("我没有三颗心脏", 1));
        return "Student";
       
    }
}