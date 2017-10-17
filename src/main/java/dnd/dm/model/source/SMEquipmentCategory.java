package dnd.dm.model.source;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "equipment", "index", "name", "url" })
public class SMEquipmentCategory implements SMObject {

	@JsonProperty("equipment")
	private List<SMObjectRef> equipment = null;
	@JsonProperty("index")
	private Double index;
	@JsonProperty("name")
	private String name;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("equipment")
	public List<SMObjectRef> getEquipment() {
		return equipment;
	}

	@JsonProperty("index")
	public Double getIndex() {
		return index;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
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
