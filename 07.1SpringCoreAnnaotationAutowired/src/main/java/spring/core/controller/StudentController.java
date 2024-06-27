package spring.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.core.service.StudentService;

@Component("sc")
public class StudentController {

	@Autowired
	StudentService sc;

	@Override
	public String toString() {
		return "StudentController [sc=" + sc + "]";
	}

	public StudentService getSc() {
		return sc;
	}

	public void setSc(StudentService sc) {
		this.sc = sc;
	}
}
