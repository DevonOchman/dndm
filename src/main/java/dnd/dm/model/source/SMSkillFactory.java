package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMSkillFactory extends SMFactory {
	
	private static SMSkillFactory instance;

	private SMSkillFactory(){
		this.typeReference = new TypeReference<List<SMSkill>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMSkillFactory();
		}
		return instance;
	}

}
