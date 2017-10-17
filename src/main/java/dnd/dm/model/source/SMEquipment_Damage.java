package dnd.dm.model.source;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "dice_count", "dice_value", "type" })
public class SMEquipment_Damage {

	@JsonProperty("dice_count")
	private Double diceCount;
	@JsonProperty("dice_value")
	private Double diceValue;
	@JsonProperty("damage_type")
	private SMObjectRef type;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("dice_count")
	public Double getDiceCount() {
		return diceCount;
	}

	@JsonProperty("dice_value")
	public Double getDiceValue() {
		return diceValue;
	}

	@JsonProperty("type")
	public SMObjectRef getType() {
		return type;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

}
