package com.cogent.demo;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public Mono<Student> insert(Student student)
	{
		return studentRepository.save(student);
	}

	public Flux<Student> fetchAllRecords()

	{
		return studentRepository.findAll().delayElements(Duration.ofSeconds(1));
	}

	public Mono<Student> fetchRecordByID(int id)

	{
		return studentRepository.findById(id);
	}

}
