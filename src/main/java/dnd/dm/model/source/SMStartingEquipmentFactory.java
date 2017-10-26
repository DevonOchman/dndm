package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMStartingEquipmentFactory extends SMFactory {

	private static SMStartingEquipmentFactory instance;

	private SMStartingEquipmentFactory(){
		super("startingequipment");
		this.typeReference = new TypeReference<List<SMStartingEquipment>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMStartingEquipmentFactory();
		}
		return instance;
	}
}
