package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMConditionFactory extends SMFactory {
	
	private static SMConditionFactory instance;

	private SMConditionFactory(){
		this.typeReference = new TypeReference<List<SMCondition>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMConditionFactory();
		}
		return instance;
	}
}
