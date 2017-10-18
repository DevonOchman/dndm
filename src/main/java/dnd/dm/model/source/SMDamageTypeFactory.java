package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMDamageTypeFactory extends SMFactory {

	private static SMDamageTypeFactory instance;

	private SMDamageTypeFactory(){
		super("Damage-Types.json");
		this.typeReference = new TypeReference<List<SMDamageType>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMDamageTypeFactory();
		}
		return instance;
	}
}
