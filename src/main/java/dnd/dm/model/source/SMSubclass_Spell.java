package dnd.dm.model.source;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "level_acquired", "prerequisites", "spell_acquisition_method", "spell" })
public class SMSubclass_Spell {

	@JsonProperty("level_acquired")
	private Double levelAcquired;
	@JsonProperty("prerequisites")
	private List<SMObjectRef> prerequisites = null;
	@JsonProperty("spell_acquisition_method")
	private SMObjectRef spellAcquisitionMethod;
	@JsonProperty("spell")
	private SMObjectRef spell;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("level_acquired")
	public Double getLevelAcquired() {
		return levelAcquired;
	}

	@JsonProperty("prerequisites")
	public List<SMObjectRef> getPrerequisites() {
		return prerequisites;
	}

	@JsonProperty("spell_acquisition_method")
	public SMObjectRef getSpellAcquisitionMethod() {
		return spellAcquisitionMethod;
	}

	@JsonProperty("spell")
	public SMObjectRef getSpell() {
		return spell;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

}
