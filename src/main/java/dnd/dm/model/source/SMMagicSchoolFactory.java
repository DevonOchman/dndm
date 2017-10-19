package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMMagicSchoolFactory extends SMFactory {

	private static SMMagicSchoolFactory instance;

	private SMMagicSchoolFactory(){
		super("Magic-Schools.json");
		this.typeReference = new TypeReference<List<SMMagicSchool>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMMagicSchoolFactory();
		}
		return instance;
	}
}
