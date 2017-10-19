package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMSubraceFactory extends SMFactory {

	private static SMSubraceFactory instance;

	private SMSubraceFactory(){
		super("Subraces.json");
		this.typeReference = new TypeReference<List<SMSubrace>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMSubraceFactory();
		}
		return instance;
	}
}
