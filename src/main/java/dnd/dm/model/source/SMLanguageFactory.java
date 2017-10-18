package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMLanguageFactory extends SMFactory {

	private static SMLanguageFactory instance;

	private SMLanguageFactory(){
		super("Languages.json");
		this.typeReference = new TypeReference<List<SMLanguage>>(){};
	}

	public static SMFactory getInstance() {
		if(instance == null){
			instance = new SMLanguageFactory();
		}
		return instance;
	}

}
