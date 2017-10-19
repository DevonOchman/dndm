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
@JsonPropertyOrder({ "ability_bonuses", "desc", "index", "language_options", "languages", "name", "race",
		"racial_traits", "racial_trait_options", "starting_proficiencies:", "starting_proficiency_options", "url" })
public class SMSubrace implements SMObject {

	@JsonProperty("ability_bonuses")
	private List<Double> abilityBonuses = null;
	@JsonProperty("desc")
	private String desc;
	@JsonProperty("index")
	private Double index;
	@JsonProperty("language_options")
	private SMObjectChoice languageOptions;
	@JsonProperty("languages")
	private List<Object> languages = null;
	@JsonProperty("name")
	private String name;
	@JsonProperty("race")
	private SMObjectRef race;
	@JsonProperty("racial_traits")
	private List<SMObjectRef> racialTraits = null;
	@JsonProperty("racial_trait_options")
	private SMObjectChoice racialTraitOptions = null;
	@JsonProperty("starting_proficiencies:")
	private List<SMObjectRef> startingProficiencies = null;
	@JsonProperty("starting_proficiency_options")
	private SMObjectChoice startingProficiencyOptions;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("ability_bonuses")
	public List<Double> getAbilityBonuses() {
		return abilityBonuses;
	}

	@JsonProperty("desc")
	public String getDesc() {
		return desc;
	}

	@JsonProperty("index")
	public Double getIndex() {
		return index;
	}

	@JsonProperty("language_options")
	public SMObjectChoice getLanguageOptions() {
		return languageOptions;
	}

	@JsonProperty("languages")
	public List<Object> getLanguages() {
		return languages;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("race")
	public SMObjectRef getRace() {
		return race;
	}

	@JsonProperty("racial_traits")
	public List<SMObjectRef> getRacialTraits() {
		return racialTraits;
	}

	@JsonProperty("racial_trait_options")
	private SMObjectChoice racialTraitOptions() {
		return this.racialTraitOptions;
	}

	@JsonProperty("starting_proficiencies:")
	public List<SMObjectRef> getStartingProficiencies() {
		return startingProficiencies;
	}

	@JsonProperty("starting_proficiency_options")
	public SMObjectChoice getStartingProficiencyOptions() {
		return startingProficiencyOptions;
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
