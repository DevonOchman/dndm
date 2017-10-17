package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMAbilityScoreFactory extends SMFactory {
	
	private static SMAbilityScoreFactory instance;

	private SMAbilityScoreFactory(){
		this.typeReference = new TypeReference<List<SMAbilityScore>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMAbilityScoreFactory();
		}
		return instance;
	}
}
