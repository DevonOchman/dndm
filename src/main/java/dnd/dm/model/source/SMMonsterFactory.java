package dnd.dm.model.source;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
public class SMMonsterFactory extends SMFactory {
	
	private static SMMonsterFactory instance;
	
	private SMMonsterFactory(){
		super("Monsters.json");
		this.typeReference = new TypeReference<List<SMMonster>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMMonsterFactory();
		}
		return instance;
	}

}
