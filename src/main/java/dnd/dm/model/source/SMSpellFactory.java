package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMSpellFactory extends SMFactory {

	private static SMSpellFactory instance;

	private SMSpellFactory(){
		super("Spells.json");
		this.typeReference = new TypeReference<List<SMSpell>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMSpellFactory();
		}
		return instance;
	}
}
