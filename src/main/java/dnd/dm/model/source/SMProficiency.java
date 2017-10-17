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
@JsonPropertyOrder({ "classes", "index", "name", "races", "type", "url" })
public class SMProficiency implements SMObject {

	@JsonProperty("classes")
	private List<SMObjectRef> classes = null;
	@JsonProperty("index")
	private Double index;
	@JsonProperty("name")
	private String name;
	@JsonProperty("races")
	private List<SMObjectRef> races = null;
	@JsonProperty("type")
	private String type;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("classes")
	public List<SMObjectRef> getClasses() {
		return classes;
	}

	@JsonProperty("index")
	public Double getIndex() {
		return index;
	}


	@JsonProperty("name")
	public String getName() {
		return name;
	}


	@JsonProperty("races")
	public List<SMObjectRef> getRaces() {
		return races;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
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
