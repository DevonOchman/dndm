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
@JsonPropertyOrder({ "choice", "class", "desc","group", "index", "level", "name", "prerequisites", "reference", "subclass",
		"url" })
public class SMFeature implements SMObject {

	@JsonProperty("choice")
	private SMObjectChoice choice;
	@JsonProperty("class")
	private SMObjectRef clazz;
	@JsonProperty("desc")
	private List<String> desc = null;
	@JsonProperty("group")
	private String group;
	@JsonProperty("index")
	private Double index;
	@JsonProperty("level")
	private Double level;
	@JsonProperty("name")
	private String name;
	@JsonProperty("prerequisites")
	private List<SMFeature_Prerecquisite> prerequisites;
	@JsonProperty("reference")
	private String reference;
	@JsonProperty("subclass")
	private SMObjectRef subclass;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("choice")
	private SMObjectChoice getChoice() {
		return choice;
	}

	@JsonProperty("class")
	public SMObjectRef getClazz() {
		return clazz;
	}

	@JsonProperty("desc")
	public List<String> getDesc() {
		return desc;
	}
	
	@JsonProperty("group")
	public String getGroup() {
		return group;
	}

	@JsonProperty("index")
	public Double getIndex() {
		return index;
	}

	@JsonProperty("level")
	public Double getLevel() {
		return level;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("reference")
	public String getReference() {
		return reference;
	}

	@JsonProperty("subclass")
	public SMObjectRef getSubclass() {
		return subclass;
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
