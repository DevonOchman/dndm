package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMProficiencyFactory extends SMFactory {

	private static SMProficiencyFactory instance;

	private SMProficiencyFactory(){
		this.typeReference = new TypeReference<List<SMProficiency>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMProficiencyFactory();
		}
		return instance;
	}

}
