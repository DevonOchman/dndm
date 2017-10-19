package dnd.dm.model.source;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"desc",
"index",
"name",
"url"
})
public class SMMagicSchool implements SMObject  {
	
	@JsonProperty("desc")
	private String desc;
	@JsonProperty("index")
	private Double index;
	@JsonProperty("name")
	private String name;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	@JsonProperty("desc")
	public String getDesc() {
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
