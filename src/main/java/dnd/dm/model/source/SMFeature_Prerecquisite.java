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
@JsonPropertyOrder({ "feature", "level","proficiency", "spell", "type" })
public class SMFeature_Prerecquisite {

	@JsonProperty("feature")
	private String feature;
	@JsonProperty("level")
	private String level;
	@JsonProperty("spell")
	private String spell;
	@JsonProperty("proficiency")
	private String proficiency;
	@JsonProperty("type")
	private String type;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("feature")
	public String getFeature() {
		return feature;
	}
	
	@JsonProperty("level")
	public String getLevel() {
		return level;
	}

	@JsonProperty("proficiency")
	public String getProficiency() {
		return proficiency;
	}

	@JsonProperty("spell")
	public String getSpell() {
		return spell;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

}
