package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMSpellcastingFactory extends SMFactory {

	private static SMSpellcastingFactory instance;

	private SMSpellcastingFactory(){
		super("spellcasting");
		this.typeReference = new TypeReference<List<SMSpellcasting>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMSpellcastingFactory();
		}
		return instance;
	}
}
