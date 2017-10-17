package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMClassFactory extends SMFactory {

	
	private static SMClassFactory instance;

	private SMClassFactory(){
		this.typeReference = new TypeReference<List<SMClass>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMClassFactory();
		}
		return instance;
	}
}
