package dnd.dm.model.source;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "quantity", "unit" })
public class SMEquipment_Cost {

	@JsonProperty("quantity")
	private Double quantity;
	@JsonProperty("unit")
	private String unit;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("quantity")
	public Double getQuantity() {
		return quantity;
	}

	@JsonProperty("unit")
	public String getUnit() {
		return unit;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
}
