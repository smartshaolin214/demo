package demo.service;

import java.util.List;
import demo.domain.Names;

public interface NameService {
	
	public List<Names> getAllNames();
	
	public Names getName(int id);
	
	public List<Names> addName(Names name);
	
	public Names updateName(Names name, int id);
	
	public Names patchName(Names name, int id);
	
	public List<Names> deleteName(int id);
}
