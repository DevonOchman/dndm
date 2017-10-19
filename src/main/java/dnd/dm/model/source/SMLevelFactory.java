package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMLevelFactory extends SMFactory {

	private static SMLevelFactory instance;

	private SMLevelFactory(){
		super("Levels.json");
		this.typeReference = new TypeReference<List<SMLevel>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMLevelFactory();
		}
		return instance;
	}
}
