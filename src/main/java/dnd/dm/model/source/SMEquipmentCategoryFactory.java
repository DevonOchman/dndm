package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMEquipmentCategoryFactory extends SMFactory {

	private static SMEquipmentCategoryFactory instance;

	private SMEquipmentCategoryFactory(){
		super("Equipment-Categories.json");
		this.typeReference = new TypeReference<List<SMEquipmentCategory>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMEquipmentCategoryFactory();
		}
		return instance;
	}
}
