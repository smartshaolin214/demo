package demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import demo.domain.Hello;

@Repository
public class InMemoryHelloRepository {
	
	private List<Hello> hello = new ArrayList<Hello>();
	
	public InMemoryHelloRepository() {
		Hello h1 = new Hello();
		h1.setId(1);
		h1.setMessage("Hello");

		Hello h2 = new Hello();
		h2.setId(2);
		h2.setMessage("Kunichiwa");
		
		hello.add(h1);
		hello.add(h2);
		
	}
	
	public List<Hello> getAll() {
		return hello;
	}
}
