package dnd.dm.model.source;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "class", "desc", "features", "index", "name", "spells", "subclass_flavor", "url" })
public class SMSubclass implements SMObject {

	@JsonProperty("class")
	private SMObjectRef clazz;
	@JsonProperty("desc")
	private List<String> desc = null;
	@JsonProperty("features")
	private List<Object> features = null;
	@JsonProperty("index")
	private Double index;
	@JsonProperty("name")
	private String name;
	@JsonProperty("spells")
	private List<SMSubclass_Spell> spells = null;
	@JsonProperty("subclass_flavor")
	private String subclassFlavor;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	@JsonProperty("class")
	public SMObjectRef getClass_() {
	return clazz;
	}



	@JsonProperty("desc")
	public List<String> getDesc() {
	return desc;
	}



	@JsonProperty("features")
	public List<Object> getFeatures() {
	return features;
	}



	@JsonProperty("index")
	public Double getIndex() {
	return index;
	}


	@JsonProperty("name")
	public String getName() {
	return name;
	}



	@JsonProperty("spells")
	public List<SMSubclass_Spell> getSpells() {
	return spells;
	}


	@JsonProperty("subclass_flavor")
	public String getSubclassFlavor() {
	return subclassFlavor;
	}


	@JsonProperty("url")
	public String getUrl() {
	return url;
	}



	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

}
