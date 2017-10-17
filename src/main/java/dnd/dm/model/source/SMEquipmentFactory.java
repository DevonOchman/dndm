package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMEquipmentFactory extends SMFactory {

	private static SMEquipmentFactory instance;

	private SMEquipmentFactory(){
		this.typeReference = new TypeReference<List<SMEquipment>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMEquipmentFactory();
		}
		return instance;
	}
}
