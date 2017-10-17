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
@JsonPropertyOrder({ "desc", "index", "name", "url" })
public class SMCondition implements SMObject {

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

	@JsonProperty("desc")
	public List<String> getDesc() {
		return this.desc;
	}

	@Override
	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	@Override
	@JsonProperty("index")
	public Double getIndex() {
		return this.index;
	}

	@Override
	@JsonProperty("url")
	public String getUrl() {
		return this.url;
	}
	
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@Override
	public String toString() {
		return "Condition [desc=" + desc + ", index=" + index + ", name=" + name + ", url=" + url + "]";
	}


}
