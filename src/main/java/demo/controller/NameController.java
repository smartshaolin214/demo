package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.domain.Names;
import demo.service.NameService;

@RestController
@RequestMapping("/name")
public class NameController {
	
	@Autowired
	private NameService nameService;
	
	@RequestMapping("/all")
	ResponseEntity<List<Names>> getAllNames() {
		return ResponseEntity.ok(nameService.getAllNames());
	}
	
	@GetMapping("/{id}")
	ResponseEntity<Names> getName(@PathVariable("id") int id) {
		return ResponseEntity.ok(nameService.getName(id));
	}
	
	@PostMapping
	ResponseEntity<List<Names>> addName(@RequestBody Names name) {
		return ResponseEntity.ok(nameService.addName(name));
	}
	
	@PutMapping("/{id}")
	ResponseEntity<Names> updateName(@RequestBody Names name, @PathVariable("id") int id) {
		return ResponseEntity.ok(nameService.updateName(name, id));
	}
	
	@PatchMapping("/{id}")
	ResponseEntity<Names> patchName(@RequestBody Names name, @PathVariable("id") int id) {
		return ResponseEntity.ok(nameService.patchName(name,id));
	}
	
	@DeleteMapping("/delete/{id}")
	ResponseEntity<List<Names>> deleteId(@PathVariable("id") int id) {
		return ResponseEntity.ok(nameService.deleteName(id));
	}
}
