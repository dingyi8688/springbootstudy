package com.example.demo.contoller;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.pojo.Student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentMysqlController {
	@Autowired
	StudentMapper studentMapper;

	@RequestMapping("/addStudent")
	public String listStudent(Student student) throws Exception {
		studentMapper.save(student);
		return "redirect:listStudent";
	}

	@RequestMapping("/deleteStudent")
	public String deleteStudent(Student student) throws Exception {
		studentMapper.delete(student.getId());
		return "redirect:listStudent";
	}

	@RequestMapping("/updateStudent")
	public String updateStudent(Student student) throws Exception {
		studentMapper.update(student);
		return "redirect:listStudent";
	}

	@RequestMapping("/editStudent")
	public String listStudent(int id, Model m) throws Exception {
		Student student = studentMapper.get(id);
		m.addAttribute("student", student);
		return "editStudent";
	}

	@RequestMapping("/listStudent")
	public String listStudent(Model m, @RequestParam(value = "start", defaultValue = "0") int start,
			@RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
		PageHelper.startPage(start, size, "id desc");
		List<Student> students = studentMapper.findAll();
		PageInfo<Student> page = new PageInfo<>(students);
		m.addAttribute("page", page);
		return "listStudent";
	}
}