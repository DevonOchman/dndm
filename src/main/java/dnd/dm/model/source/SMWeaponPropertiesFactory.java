package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMWeaponPropertiesFactory extends SMFactory {

	private static SMWeaponPropertiesFactory instance;

	private SMWeaponPropertiesFactory(){
		this.typeReference = new TypeReference<List<SMWeaponProperties>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMWeaponPropertiesFactory();
		}
		return instance;
	}
}
