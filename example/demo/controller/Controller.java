package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Model;
import com.example.demo.repository.BookRepository;

@RestController
public class Controller {
	@Autowired
private BookRepository bookrepository;
	@PostMapping("/addBook")
public String addBook(@RequestBody Model book) {
	bookrepository.save(book);
	return "Book added is :"+book.getId();
}
	@GetMapping("/getAll")
	public List<Model> getAll(Model book){
		return bookrepository.findAll();
	}
	@DeleteMapping("/deleteOne/{id}")
	public List<Model> deleteOne(@PathVariable int id){
		bookrepository.deleteById(id);
		return bookrepository.findAll();
	}
}
