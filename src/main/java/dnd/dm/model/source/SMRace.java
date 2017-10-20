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
@JsonPropertyOrder({ "ability_bonuses", "age", "alignment", "index", "language_desc", "languages", "language_options",
		"name", "size_description", "size", "speed", "starting_proficiencies", "starting_proficiency_options",
		"subraces", "traits", "trait_options", "url" })

public class SMRace implements SMObject {

	@JsonProperty("ability_bonuses")
	private List<Double> abilityBonuses = null;
	@JsonProperty("age")
	private String age;
	@JsonProperty("alignment")
	private String alignment;
	@JsonProperty("index")
	private Double index;
	@JsonProperty("language_desc")
	private String languageDesc;
	@JsonProperty("languages")
	private List<SMObjectRef> languages = null;
	@JsonProperty("language_options")
	private SMObjectChoice languageOptions;
	@JsonProperty("name")
	private String name;
	@JsonProperty("size_description")
	private String sizeDescription;
	@JsonProperty("size")
	private String size;
	@JsonProperty("speed")
	private Double speed;
	@JsonProperty("starting_proficiencies")
	private List<SMObjectRef> startingProficiencies = null;
	@JsonProperty("starting_proficiency_options")
	private SMObjectChoice startingProficienciesOptions;
	@JsonProperty("subraces")
	private List<SMObjectRef> subraces = null;
	@JsonProperty("traits")
	private List<SMObjectRef> traits = null;
	@JsonProperty("trait_options")
	private SMObjectChoice traitOptions;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("ability_bonuses")
	public List<Double> getAbilityBonuses() {
		return abilityBonuses;
	}

	@JsonProperty("age")
	public String getAge() {
		return age;
	}

	@JsonProperty("alignment")
	public String getAlignment() {
		return alignment;
	}

	@JsonProperty("index")
	public Double getIndex() {
		return index;
	}

	@JsonProperty("language_desc")
	public String getLanguageDesc() {
		return languageDesc;
	}

	@JsonProperty("languages")
	public List<SMObjectRef> getLanguages() {
		return languages;
	}

	@JsonProperty("language_options")
	public SMObjectChoice languageOptions() {
		return languageOptions;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("size_description")
	public String getSizeDescription() {
		return sizeDescription;
	}

	@JsonProperty("size")
	public String getSize() {
		return size;
	}

	@JsonProperty("speed")
	public Double getSpeed() {
		return speed;
	}

	@JsonProperty("starting_proficiencies")
	public List<SMObjectRef> getStartingProficiencies() {
		return startingProficiencies;
	}

	@JsonProperty("starting_proficiency_options")
	public SMObjectChoice getStartingProficienciesOptions() {
		return startingProficienciesOptions;
	}

	@JsonProperty("subraces")
	public List<SMObjectRef> getSubraces() {
		return subraces;
	}

	@JsonProperty("traits")
	public List<SMObjectRef> getTraits() {
		return traits;
	}

	@JsonProperty("trait_options")
	public SMObjectChoice getTraitOptions() {
		return this.traitOptions;
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
