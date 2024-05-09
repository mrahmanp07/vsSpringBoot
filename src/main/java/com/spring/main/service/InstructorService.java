package com.spring.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.entity.Instructor;
import com.spring.main.repository.InstructorRepository;

@Service
public class InstructorService {

	@Autowired
	private InstructorRepository instructorRepository;
	
	public Instructor post(Instructor instructor) {
		if (!instructor.equals(null)) {
			return instructorRepository.save(instructor);
		}
		return null;
	}
	
	public List<Instructor> getAll() {
		return instructorRepository.findAll();
	}
	
	public Instructor getById(int id) {
		Optional<Instructor> optional = instructorRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}	
		return null;
	}
	
//	public Instructor update(Instructor instructor) {
//		Optional<Instructor> optional = instructorRepository.findById(instructor.getInstructor_id());
//		if (optional.isPresent()) {
//			return optional.get();
//		}
//		return instructorRepository.save(instructor);
//	}
	
	public String delete(int id) {
		Optional<Instructor> optional = instructorRepository.findById(id);
		if (optional.isPresent()) {
			instructorRepository.delete(optional.get());
			return "Success!";
		}
		return "Failed!";
	}
	
	public List<Instructor> postAll(List<Instructor> list) {
		return instructorRepository.saveAll(list);
	}
}
