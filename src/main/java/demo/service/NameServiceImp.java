package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.domain.Names;
import demo.repository.NamesRepository;

@Service
public class NameServiceImp implements NameService {
	
	@Autowired
	private NamesRepository nameRepository;
	
	public List<Names> getAllNames() {
		return nameRepository.getAllNames();
	}
	
	public Names getName(int id) {
		return nameRepository.getName(id);
	}
	
	public List<Names> addName(Names name) {
		return nameRepository.addName(name);
	}
		
	public Names updateName(Names name, int id) {
		return nameRepository.updateName(name, id);
	}
	
	public Names patchName(Names name, int id) {
		return nameRepository.patchName(name, id);
	}
	
	public List<Names> deleteName(int id) {
		return nameRepository.deleteName(id);
	}
	
}
