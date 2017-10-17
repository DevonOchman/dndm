package dnd.dm.model.source;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "url", "class" })
public class SMClassRef implements SMObject {
	@JsonProperty("class")
	private String clazz;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("index")
	public Double getIndex() {
		String[] s = url.split("/");
		return Double.parseDouble(s[s.length - 1]);
	}

	@JsonProperty("class")
	public String getClazz() {
		return clazz;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@Override
	public String getName() {
		return getClazz();
	}
}
