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
@JsonPropertyOrder({ "attack_bonus", "desc", "name" })
public class SMMonster_SpecialAbility {

	@Override
	public String toString() {
		return "SpecialAbility [attackBonus=" + attackBonus + ", desc=" + desc + ", name=" + name
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("attack_bonus")
	private Double attackBonus;
	@JsonProperty("desc")
	private String desc;
	@JsonProperty("name")
	private String name;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("attack_bonus")
	public Double getAttackBonus() {
		return attackBonus;
	}

	@JsonProperty("attack_bonus")
	public void setAttackBonus(Double attackBonus) {
		this.attackBonus = attackBonus;
	}

	@JsonProperty("desc")
	public String getDesc() {
		return desc;
	}

	@JsonProperty("desc")
	public void setDesc(String desc) {
		this.desc = desc;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
