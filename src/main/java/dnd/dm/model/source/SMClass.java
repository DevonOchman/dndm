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
@JsonPropertyOrder({ "class_levels", "hit_die", "index", "name", "proficiencies", "proficiency_choices",
		"saving_throws", "spellcasting", "starting_equipment", "subclasses", "url" })
public class SMClass implements SMObject {

	@JsonProperty("class_levels")
	private SMClassRef classLevels;
	@JsonProperty("hit_die")
	private Double hitDie;
	@JsonProperty("index")
	private Double index;
	@JsonProperty("name")
	private String name;
	@JsonProperty("proficiencies")
	private List<SMObjectRef> proficiencies = null;
	@JsonProperty("proficiency_choices")
	private List<SMObjectChoice> proficiencyChoices = null;
	@JsonProperty("saving_throws")
	private List<SMObjectRef> savingThrows = null;
	@JsonProperty("spellcasting")
	private SMClassRef spellcasting;
	@JsonProperty("starting_equipment")
	private SMClassRef startingEquipment;
	@JsonProperty("subclasses")
	private List<SMObjectRef> subclasses = null;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("class_levels")
	public SMClassRef getClassLevels() {
		return classLevels;
	}

	@JsonProperty("hit_die")
	public Double getHitDie() {
		return hitDie;
	}

	@JsonProperty("index")
	public Double getIndex() {
		return index;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("proficiencies")
	public List<SMObjectRef> getProficiencies() {
		return proficiencies;
	}

	@JsonProperty("proficiency_choices")
	public List<SMObjectChoice> getProficiencyChoices() {
		return proficiencyChoices;
	}

	@JsonProperty("saving_throws")
	public List<SMObjectRef> getSavingThrows() {
		return savingThrows;
	}

	@JsonProperty("spellcasting")
	public SMClassRef getSpellcasting() {
		return spellcasting;
	}

	@JsonProperty("starting_equipment")
	public SMClassRef getStartingEquipment() {
		return startingEquipment;
	}

	@JsonProperty("subclasses")
	public List<SMObjectRef> getSubclasses() {
		return subclasses;
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
