package com.cogent.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/insert")
	public Mono<Student> insert(@RequestBody Student student) {
		return studentService.insert(student);
	}

	@GetMapping("/fetchall")
	public Flux<Student> fetchAllRecords()

	{
		return studentService.fetchAllRecords();
	}

	@GetMapping("/fetch/{id}")
	public Mono<Student> fetchRecordByID(@PathVariable("id") int id)

	{
		return studentService.fetchRecordByID(id);
	}

}
