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
@JsonPropertyOrder({ "casting_time", "classes", "components", "concentration", "desc", "duration", "higher_level",
		"index", "level", "material", "name", "page", "range", "ritual", "school", "subclasses", "url" })
public class SMSpell implements SMObject {

	@JsonProperty("casting_time")
	private String castingTime;
	@JsonProperty("classes")
	private List<SMObjectRef> classes = null;
	@JsonProperty("components")
	private List<String> components = null;
	@JsonProperty("concentration")
	private String concentration;
	@JsonProperty("desc")
	private List<String> desc = null;
	@JsonProperty("duration")
	private String duration;
	@JsonProperty("higher_level")
	private List<String> higherLevel = null;
	@JsonProperty("index")
	private Double index;
	@JsonProperty("level")
	private Double level;
	@JsonProperty("material")
	private String material;
	@JsonProperty("name")
	private String name;
	@JsonProperty("page")
	private String page;
	@JsonProperty("range")
	private String range;
	@JsonProperty("ritual")
	private String ritual;
	@JsonProperty("school")
	private SMObjectRef school;
	@JsonProperty("subclasses")
	private List<SMObjectRef> subclasses = null;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("casting_time")
	public String getCastingTime() {
		return castingTime;
	}

	@JsonProperty("classes")
	public List<SMObjectRef> getClasses() {
		return classes;
	}

	@JsonProperty("components")
	public List<String> getComponents() {
		return components;
	}

	@JsonProperty("concentration")
	public String getConcentration() {
		return concentration;
	}

	@JsonProperty("desc")
	public List<String> getDesc() {
		return desc;
	}

	@JsonProperty("duration")
	public String getDuration() {
		return duration;
	}

	@JsonProperty("higher_level")
	public List<String> getHigherLevel() {
		return higherLevel;
	}

	@JsonProperty("index")
	public Double getIndex() {
		return index;
	}

	@JsonProperty("level")
	public Double getLevel() {
		return level;
	}

	@JsonProperty("material")
	public String getMaterial() {
		return material;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("page")
	public String getPage() {
		return page;
	}

	@JsonProperty("range")
	public String getRange() {
		return range;
	}

	@JsonProperty("ritual")
	public String getRitual() {
		return ritual;
	}

	@JsonProperty("school")
	public SMObjectRef getSchool() {
		return school;
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
