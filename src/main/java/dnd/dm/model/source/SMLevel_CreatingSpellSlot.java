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
@JsonPropertyOrder({ "sorcery_point_cost", "spell_slot_level" })
public class SMLevel_CreatingSpellSlot {

	@JsonProperty("sorcery_point_cost")
	private Double sorceryPointCost;
	@JsonProperty("spell_slot_level")
	private Double spellSlotLevel;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("sorcery_point_cost")
	public Double getSorceryPointCost() {
		return sorceryPointCost;
	}

	@JsonProperty("spell_slot_level")
	public Double getSpellSlotLevel() {
		return spellSlotLevel;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

}
