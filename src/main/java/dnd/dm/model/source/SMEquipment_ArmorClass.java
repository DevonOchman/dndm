package dnd.dm.model.source;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "base", "dex_bonus", "max_bonus" })
public class SMEquipment_ArmorClass {

	@JsonProperty("base")
	private Double base;
	@JsonProperty("dex_bonus")
	private Boolean dexBonus;
	@JsonProperty("max_bonus")
	private Object maxBonus;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("base")
	public Double getBase() {
		return base;
	}

	@JsonProperty("dex_bonus")
	public Boolean getDexBonus() {
		return dexBonus;
	}

	@JsonProperty("max_bonus")
	public Object getMaxBonus() {
		return maxBonus;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

}
