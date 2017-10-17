package dnd.dm.model.source;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class SMFactory {

	private ObjectMapper mapper = new ObjectMapper();

	@SuppressWarnings("rawtypes")
	protected TypeReference typeReference;
	// = new TypeReference<List<TTTT>>() {});

	protected HashMap<String, SMObject> smObjects = new HashMap<String, SMObject>();

	public void loadSMObjects(File f) throws JsonParseException, JsonMappingException, IOException {
		List<SMObject> loaded = mapper.readValue(f, typeReference);
		for (SMObject obj : loaded) {
			smObjects.put(obj.getUrl(), obj);
		}
	}

	public SMObject getByKey(String key) {
		return smObjects.get(key);
	}

	public SMObject getByName(String name) {
		for (SMObject smo : smObjects.values()) {
			if (smo.getName().equals(name)) {
				return smo;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		try {
			String s = this.getClass().getSimpleName() + " [";
			for (SMObject smo : smObjects.values()) {
				s += mapper.writerWithDefaultPrettyPrinter().writeValueAsString(smo) + ",\n";
			}
			s = s.substring(0, s.length() - 2) + "]";
			return s;
		} catch (JsonProcessingException e) {
			return "SMFactory [typeReference=" + typeReference + ", smObjects=" + smObjects + "]";
		}
	}

}
