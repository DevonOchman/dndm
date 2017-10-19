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
@JsonPropertyOrder({
"ability_score_bonuses",
"aura_range",
"class_specific",
"class",
"feature_choices",
"features",
"index",
"level",
"prof_bonus",
"spellcasting",
"subclass",
"subclass_specific",
"url"
})
public class SMLevel implements SMObject {

	@JsonProperty("ability_score_bonuses")
	private Double abilityScoreBonuses;
	@JsonProperty("aura_range")
	private Double auraRange;
	@JsonProperty("class_specific")
	private SMLevel_ClassSpecific classSpecific;
	@JsonProperty("class")
	private SMObjectRef _class;
	@JsonProperty("feature_choices")
	private List<Object> featureChoices = null;
	@JsonProperty("features")
	private List<Object> features = null;
	@JsonProperty("index")
	private Double index;
	@JsonProperty("level")
	private Double level;
	@JsonProperty("prof_bonus")
	private Double profBonus;
	@JsonProperty("spellcasting")
	private SMLevel_Spellcasting spellcasting;
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
	@JsonProperty("subclass")
	private SMObjectRef subclass;
	@JsonProperty("subclass_specific")
	private SMLevel_SubclassSpecific subclassSpecific;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("ability_score_bonuses")
	public Double getAbilityScoreBonuses() {
	return abilityScoreBonuses;
	}

	@JsonProperty("aura_range")
	private Double getAuraRange(){
		return auraRange;
	}

	@JsonProperty("class_specific")
	public SMLevel_ClassSpecific getClassSpecific() {
	return classSpecific;
	}


	@JsonProperty("class")
	public SMObjectRef getClass_() {
	return _class;
	}



	@JsonProperty("feature_choices")
	public List<Object> getFeatureChoices() {
	return featureChoices;
	}


	@JsonProperty("features")
	public List<Object> getFeatures() {
	return features;
	}

	@JsonProperty("index")
	public Double getIndex() {
	return index;
	}


	@JsonProperty("level")
	public Double getLevel() {
	return level;
	}


	@JsonProperty("prof_bonus")
	public Double getProfBonus() {
	return profBonus;
	}


	@JsonProperty("spellcasting")
	public SMLevel_Spellcasting getSpellcasting() {
	return spellcasting;
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

	@JsonProperty("subclass")
	public SMObjectRef getSubclass() {
	return subclass;
	}
	
	@JsonProperty("subclass_specific")
	private SMLevel_SubclassSpecific getSubclassSpecific(){
		return subclassSpecific;
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
		return getName() + " "+ getLevel();
	}

	
}
