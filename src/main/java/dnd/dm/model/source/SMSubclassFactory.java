package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMSubclassFactory extends SMFactory {

	private static SMSubclassFactory instance;

	private SMSubclassFactory(){
		this.typeReference = new TypeReference<List<SMSubclass>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMSubclassFactory();
		}
		return instance;
	}
}
