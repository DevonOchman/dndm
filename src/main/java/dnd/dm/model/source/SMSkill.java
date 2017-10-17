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
@JsonPropertyOrder({
"ability_score",
"desc",
"index",
"name",
"url"
})
public class SMSkill implements SMObject {

	@JsonProperty("ability_score")
	private SMObjectRef abilityScore;
	@JsonProperty("desc")
	private List<String> desc = null;
	@JsonProperty("index")
	private Double index;
	@JsonProperty("name")
	private String name;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("ability_score")
	public SMObjectRef getAbilityScore() {
	return abilityScore;
	}



	@JsonProperty("desc")
	public List<String> getDesc() {
	return desc;
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
