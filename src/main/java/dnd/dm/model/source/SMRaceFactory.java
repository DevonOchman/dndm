package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMRaceFactory extends SMFactory {

	private static SMRaceFactory instance;

	private SMRaceFactory(){
		super("Races.json");
		this.typeReference = new TypeReference<List<SMRace>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMRaceFactory();
		}
		return instance;
	}
}
