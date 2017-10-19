package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMTraitFactory extends SMFactory{
	
	private static SMTraitFactory instance;

	private SMTraitFactory(){
		super("Traits.json");
		this.typeReference = new TypeReference<List<SMTrait>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMTraitFactory();
		}
		return instance;
	}

}
