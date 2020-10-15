package demo.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import demo.domain.Names;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class InMemoryNamesRepository implements NamesRepository {
	
	private List<Names> listOfNames = new ArrayList<Names>();
	
	public InMemoryNamesRepository() {
		
		Names n1 = new Names();
		n1.setId(1);
		n1.setFirstName("Michael Jose");
		n1.setMiddleName("Alarcon");
		n1.setLastName("Yukim");

		Names n2 = new Names();
		n2.setId(2);
		n2.setFirstName("Michael Jose");
		n2.setMiddleName("Alarcon");
		n2.setLastName("Yukim");
		
		Names n3 = new Names();
		n3.setId(3);
		n3.setFirstName("Michael Jose");
		n3.setMiddleName("Alarcon");
		n3.setLastName("Yukim");
		
		listOfNames.add(n1);
		listOfNames.add(n2);
		listOfNames.add(n3);
		
	}
	
	public List<Names> getAllNames() {
		return listOfNames;
	}
	
	public Names getName(int id) {
		boolean isFound = false;
		int index=0;
		for(int i=0; i < listOfNames.size(); i++) {
			if(listOfNames.get(i).getId() == id) {
				index = i;
				isFound = true;
			}
		}
		
		log.info(" " + listOfNames.get(index));
		if (isFound) {
			return listOfNames.get(index);
		}
		return null;
	}
	
	public List<Names> addName(Names name) {
		
		Names newName = new Names();
		newName.setId(name.getId());
		newName.setFirstName(name.getFirstName());
		newName.setLastName(name.getLastName());
		newName.setMiddleName(name.getMiddleName());
		
		listOfNames.add(newName);
		
		return listOfNames;
	}
	
	public Names updateName(Names name, int id) {
		boolean isFound = false;
		int index=0;
		for(int i=0; i < listOfNames.size(); i++) {
			if(listOfNames.get(i).getId() == id) {
				index = i;
				isFound = true;
			}
		}
		
		if (isFound) {
			listOfNames.get(index).setFirstName(name.getFirstName());
			listOfNames.get(index).setLastName(name.getLastName());
			listOfNames.get(index).setMiddleName(name.getMiddleName());
			return listOfNames.get(index);
		}
		
		return null;
	}
	
	public Names patchName(Names name, int id) {
		boolean isFound = false;
		int index=0;
		for(int i=0; i < listOfNames.size(); i++) {
			if(listOfNames.get(i).getId() == id) {
				index = i;
				isFound = true;
			}
		}
			
		if (isFound) {
			listOfNames.get(index).setFirstName(name.getFirstName());
			listOfNames.get(index).setLastName(name.getLastName());
			listOfNames.get(index).setMiddleName(name.getMiddleName());
			return listOfNames.get(index);
		}
		
		return null;
	}
	
	public List<Names> deleteName(int id) {
		
		boolean isFound = false;
		int index=0;
		for(int i=0; i < listOfNames.size(); i++) {
			if(listOfNames.get(i).getId() == id) {
				index = i;
				isFound = true;
			} 
		}	
			
		if (isFound) {
			listOfNames.remove(index);
		}
		
		return listOfNames;
	}
	
}
