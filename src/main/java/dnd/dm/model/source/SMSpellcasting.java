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
@JsonPropertyOrder({ "class", "index", "info", "level", "spellcasting_ability", "url" })
public class SMSpellcasting implements SMObject {

	@JsonProperty("class")
	private SMObjectRef clazz;
	@JsonProperty("index")
	private Double index;
	@JsonProperty("info")
	private List<SMSpellcasting_Info> info = null;
	@JsonProperty("level")
	private Double level;
	@JsonProperty("spellcasting_ability")
	private SMObjectRef spellcastingAbility;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("class")
	public SMObjectRef getClazz() {
		return clazz;
	}

	@JsonProperty("index")
	public Double getIndex() {
		return index;
	}

	@JsonProperty("info")
	public List<SMSpellcasting_Info> getInfo() {
		return info;
	}

	@JsonProperty("level")
	public Double getLevel() {
		return level;
	}

	@JsonProperty("spellcasting_ability")
	public SMObjectRef getSpellcastingAbility() {
		return spellcastingAbility;
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
		return "" + index;
	}
}
