package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.domain.Hello;
import demo.repository.InMemoryHelloRepository;

@RestController
@RequestMapping("/greeting")
public class HelloController {
	
	@Autowired
	private InMemoryHelloRepository inMemoryHelloRepository;
	
	@RequestMapping
	ResponseEntity<String> getGreeting() {
		return ResponseEntity.ok("Hello World!");
	}
	
	@RequestMapping("/xmlgreeting")
	ResponseEntity<List<Hello>> getXMLGreeting() {
		return ResponseEntity.ok(inMemoryHelloRepository.getAll());
	}
	
}
