package dnd.dm.model.source;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "long", "normal" })
public class SMEquipment_ThrowRange {

	@JsonProperty("long")
	private Object _long;
	@JsonProperty("normal")
	private Double normal;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("long")
	public Object getLong() {
		return _long;
	}

	@JsonProperty("normal")
	public Double getNormal() {
		return normal;
	}
}