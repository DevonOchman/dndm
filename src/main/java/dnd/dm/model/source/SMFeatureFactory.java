package dnd.dm.model.source;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

public class SMFeatureFactory extends SMFactory {

	private static SMFeatureFactory instance;

	private SMFeatureFactory() {
		super("Features.json");
		this.typeReference = new TypeReference<List<SMFeature>>() {
		};
	}

	public static SMFactory getInstance() {
		if (instance == null) {
			instance = new SMFeatureFactory();
		}
		return instance;
	}
}
