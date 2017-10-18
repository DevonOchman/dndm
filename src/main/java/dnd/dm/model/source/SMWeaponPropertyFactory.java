package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMWeaponPropertyFactory extends SMFactory {

	private static SMWeaponPropertyFactory instance;

	private SMWeaponPropertyFactory(){
		super("Weapon-Properties.json");
		this.typeReference = new TypeReference<List<SMWeaponProperty>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMWeaponPropertyFactory();
		}
		return instance;
	}
}
