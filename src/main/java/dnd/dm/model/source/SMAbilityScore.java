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
@JsonPropertyOrder({
"desc",
"full_name",
"index",
"name",
"skills",
"url"
})
public class SMAbilityScore implements SMObject {

	@JsonProperty("desc")
	private List<String> desc = null;
	@JsonProperty("full_name")
	private String fullName;
	@JsonProperty("index")
	private Double index;
	@JsonProperty("name")
	private String name;
	@JsonProperty("skills")
	private List<SMObjectRef> skills = null;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("desc")
	public List<String> getDesc() {
	return desc;
	}


	@JsonProperty("full_name")
	public String getFullName() {
	return fullName;
	}


	@JsonProperty("index")
	public Double getIndex() {
	return index;
	}


	@JsonProperty("name")
	public String getName() {
	return name;
	}

	@JsonProperty("skills")
	public List<SMObjectRef> getSkills() {
	return skills;
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
