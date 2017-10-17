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
@JsonPropertyOrder({ "index", "name", "script", "type", "typical_speakers", "url" })
public class SMLanguage implements SMObject {

	@JsonProperty("index")
	private Double index;
	@JsonProperty("name")
	private String name;
	@JsonProperty("script")
	private String script;
	@JsonProperty("type")
	private String type;
	@JsonProperty("typical_speakers")
	private List<String> typicalSpeakers = null;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("index")
	public Double getIndex() {
		return index;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("script")
	public String getScript() {
		return script;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("typical_speakers")
	public List<String> getTypicalSpeakers() {
		return typicalSpeakers;
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
