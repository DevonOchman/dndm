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
@JsonPropertyOrder({ "cantrips_known", "spells_known", "spell_slots_level_1", "spell_slots_level_2", "spell_slots_level_3", "spell_slots_level_4",
		"spell_slots_level_5", "spell_slots_level_6", "spell_slots_level_7", "spell_slots_level_8",
		"spell_slots_level_9" })
public class SMLevel_Spellcasting {
	@JsonProperty("cantrips_known")
	private Double cantripsKnown;
	@JsonProperty("spells_known")
	private Double spellsKnown;
	@JsonProperty("spell_slots_level_1")
	private Double spellSlotsLevel1;
	@JsonProperty("spell_slots_level_2")
	private Double spellSlotsLevel2;
	@JsonProperty("spell_slots_level_3")
	private Double spellSlotsLevel3;
	@JsonProperty("spell_slots_level_4")
	private Double spellSlotsLevel4;
	@JsonProperty("spell_slots_level_5")
	private Double spellSlotsLevel5;
	@JsonProperty("spell_slots_level_6")
	private Double spellSlotsLevel6;
	@JsonProperty("spell_slots_level_7")
	private Double spellSlotsLevel7;
	@JsonProperty("spell_slots_level_8")
	private Double spellSlotsLevel8;
	@JsonProperty("spell_slots_level_9")
	private Double spellSlotsLevel9;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("cantrips_known")
	private Double getCantripsKnown(){
		return cantripsKnown;
	}
	@JsonProperty("spells_known")
	private Double getSpellsKnown(){
		return spellsKnown;
	}
	
	@JsonProperty("spell_slots_level_1")
	public Double getSpellSlotsLevel1() {
		return spellSlotsLevel1;
	}

	@JsonProperty("spell_slots_level_2")
	public Double getSpellSlotsLevel2() {
		return spellSlotsLevel2;
	}

	@JsonProperty("spell_slots_level_3")
	public Double getSpellSlotsLevel3() {
		return spellSlotsLevel3;
	}

	@JsonProperty("spell_slots_level_4")
	public Double getSpellSlotsLevel4() {
		return spellSlotsLevel4;
	}

	@JsonProperty("spell_slots_level_5")
	public Double getSpellSlotsLevel5() {
		return spellSlotsLevel5;
	}

	@JsonProperty("spell_slots_level_6")
	public Double getSpellSlotsLevel6() {
		return spellSlotsLevel6;
	}

	@JsonProperty("spell_slots_level_7")
	public Double getSpellSlotsLevel7() {
		return spellSlotsLevel7;
	}

	@JsonProperty("spell_slots_level_8")
	public Double getSpellSlotsLevel8() {
		return spellSlotsLevel8;
	}

	@JsonProperty("spell_slots_level_9")
	public Double getSpellSlotsLevel9() {
		return spellSlotsLevel9;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

}
