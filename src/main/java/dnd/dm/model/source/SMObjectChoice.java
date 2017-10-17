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
@JsonPropertyOrder({ "choose", "from", "type" })
public class SMObjectChoice {

	@JsonProperty("choose")
	private Double choose;
	@JsonProperty("from")
	private List<SMObjectRef> from = null;
	@JsonProperty("type")
	private String type;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("choose")
	public Double getChoose() {
		return choose;
	}

	@JsonProperty("from")
	public List<SMObjectRef> getFrom() {
		return from;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
}
