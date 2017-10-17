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
@JsonPropertyOrder({ "actions", "alignment", "armor_class", "challenge_rating", "charisma", "condition_immunities",
		"constitution", "damage_immunities", "damage_resistances", "damage_vulnerabilities", "dexterity", "hit_dice",
		"hit_points", "index", "intelligence", "languages", "legendary_actions", "name", "perception", "senses", "size",
		"special_abilities", "speed", "strength", "subtype", "type", "url", "wisdom" })
public class SMMonster implements SMObject {

	@JsonProperty("actions")
	private List<Object> actions = null;
	@JsonProperty("alignment")
	private String alignment;
	@JsonProperty("armor_class")
	private Double armorClass;
	@JsonProperty("challenge_rating")
	private Double challengeRating;
	@JsonProperty("charisma")
	private Double charisma;
	@JsonProperty("condition_immunities")
	private String conditionImmunities;
	@JsonProperty("constitution")
	private Double constitution;
	@JsonProperty("damage_immunities")
	private String damageImmunities;
	@JsonProperty("damage_resistances")
	private String damageResistances;
	@JsonProperty("damage_vulnerabilities")
	private String damageVulnerabilities;
	@JsonProperty("dexterity")
	private Double dexterity;
	@JsonProperty("hit_dice")
	private String hitDice;
	@JsonProperty("hit_points")
	private Double hitPoints;
	@JsonProperty("index")
	private Double index;
	@JsonProperty("intelligence")
	private Double intelligence;
	@JsonProperty("languages")
	private String languages;
	@JsonProperty("legendary_actions")
	private List<SMMonster_LegendaryAction> legendaryActions = null;
	@JsonProperty("name")
	private String name;
	@JsonProperty("perception")
	private Double perception;
	@JsonProperty("senses")
	private String senses;
	@JsonProperty("size")
	private String size;
	@JsonProperty("special_abilities")
	private List<SMMonster_SpecialAbility> specialAbilities = null;
	@JsonProperty("speed")
	private String speed;
	@JsonProperty("strength")
	private Double strength;
	@JsonProperty("subtype")
	private String subtype;
	@JsonProperty("type")
	private String type;
	@JsonProperty("url")
	private String url;
	@JsonProperty("wisdom")
	private Double wisdom;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("actions")
	public List<Object> getActions() {
		return actions;
	}

	@JsonProperty("actions")
	public void setActions(List<Object> actions) {
		this.actions = actions;
	}

	@JsonProperty("alignment")
	public String getAlignment() {
		return alignment;
	}

	@JsonProperty("alignment")
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	@JsonProperty("armor_class")
	public Double getArmorClass() {
		return armorClass;
	}

	@JsonProperty("armor_class")
	public void setArmorClass(Double armorClass) {
		this.armorClass = armorClass;
	}

	@JsonProperty("challenge_rating")
	public Double getChallengeRating() {
		return challengeRating;
	}

	@JsonProperty("challenge_rating")
	public void setChallengeRating(Double challengeRating) {
		this.challengeRating = challengeRating;
	}

	@JsonProperty("charisma")
	public Double getCharisma() {
		return charisma;
	}

	@JsonProperty("charisma")
	public void setCharisma(Double charisma) {
		this.charisma = charisma;
	}

	@JsonProperty("condition_immunities")
	public String getConditionImmunities() {
		return conditionImmunities;
	}

	@JsonProperty("condition_immunities")
	public void setConditionImmunities(String conditionImmunities) {
		this.conditionImmunities = conditionImmunities;
	}

	@JsonProperty("constitution")
	public Double getConstitution() {
		return constitution;
	}

	@JsonProperty("constitution")
	public void setConstitution(Double constitution) {
		this.constitution = constitution;
	}

	@JsonProperty("damage_immunities")
	public String getDamageImmunities() {
		return damageImmunities;
	}

	@JsonProperty("damage_immunities")
	public void setDamageImmunities(String damageImmunities) {
		this.damageImmunities = damageImmunities;
	}

	@JsonProperty("damage_resistances")
	public String getDamageResistances() {
		return damageResistances;
	}

	@JsonProperty("damage_resistances")
	public void setDamageResistances(String damageResistances) {
		this.damageResistances = damageResistances;
	}

	@JsonProperty("damage_vulnerabilities")
	public String getDamageVulnerabilities() {
		return damageVulnerabilities;
	}

	@JsonProperty("damage_vulnerabilities")
	public void setDamageVulnerabilities(String damageVulnerabilities) {
		this.damageVulnerabilities = damageVulnerabilities;
	}

	@JsonProperty("dexterity")
	public Double getDexterity() {
		return dexterity;
	}

	@JsonProperty("dexterity")
	public void setDexterity(Double dexterity) {
		this.dexterity = dexterity;
	}

	@JsonProperty("hit_dice")
	public String getHitDice() {
		return hitDice;
	}

	@JsonProperty("hit_dice")
	public void setHitDice(String hitDice) {
		this.hitDice = hitDice;
	}

	@JsonProperty("hit_points")
	public Double getHitPoints() {
		return hitPoints;
	}

	@JsonProperty("hit_points")
	public void setHitPoints(Double hitPoints) {
		this.hitPoints = hitPoints;
	}

	@JsonProperty("index")
	public Double getIndex() {
		return index;
	}

	@Override
	public String toString() {
		return "Monster [actions=" + actions + ", alignment=" + alignment + ", armorClass=" + armorClass
				+ ", challengeRating=" + challengeRating + ", charisma=" + charisma + ", conditionImmunities="
				+ conditionImmunities + ", constitution=" + constitution + ", damageImmunities=" + damageImmunities
				+ ", damageResistances=" + damageResistances + ", damageVulnerabilities=" + damageVulnerabilities
				+ ", dexterity=" + dexterity + ", hitDice=" + hitDice + ", hitPoints=" + hitPoints + ", index=" + index
				+ ", intelligence=" + intelligence + ", languages=" + languages + ", legendaryActions="
				+ legendaryActions + ", name=" + name + ", perception=" + perception + ", senses=" + senses + ", size="
				+ size + ", specialAbilities=" + specialAbilities + ", speed=" + speed + ", strength=" + strength
				+ ", subtype=" + subtype + ", type=" + type + ", url=" + url + ", wisdom=" + wisdom
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("index")
	public void setIndex(Double index) {
		this.index = index;
	}

	@JsonProperty("intelligence")
	public Double getIntelligence() {
		return intelligence;
	}

	@JsonProperty("intelligence")
	public void setIntelligence(Double intelligence) {
		this.intelligence = intelligence;
	}

	@JsonProperty("languages")
	public String getLanguages() {
		return languages;
	}

	@JsonProperty("languages")
	public void setLanguages(String languages) {
		this.languages = languages;
	}

	@JsonProperty("legendary_actions")
	public List<SMMonster_LegendaryAction> getLegendaryActions() {
		return legendaryActions;
	}

	@JsonProperty("legendary_actions")
	public void setLegendaryActions(List<SMMonster_LegendaryAction> legendaryActions) {
		this.legendaryActions = legendaryActions;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("perception")
	public Double getPerception() {
		return perception;
	}

	@JsonProperty("perception")
	public void setPerception(Double perception) {
		this.perception = perception;
	}

	@JsonProperty("senses")
	public String getSenses() {
		return senses;
	}

	@JsonProperty("senses")
	public void setSenses(String senses) {
		this.senses = senses;
	}

	@JsonProperty("size")
	public String getSize() {
		return size;
	}

	@JsonProperty("size")
	public void setSize(String size) {
		this.size = size;
	}

	@JsonProperty("special_abilities")
	public List<SMMonster_SpecialAbility> getSpecialAbilities() {
		return specialAbilities;
	}

	@JsonProperty("special_abilities")
	public void setSpecialAbilities(List<SMMonster_SpecialAbility> specialAbilities) {
		this.specialAbilities = specialAbilities;
	}

	@JsonProperty("speed")
	public String getSpeed() {
		return speed;
	}

	@JsonProperty("speed")
	public void setSpeed(String speed) {
		this.speed = speed;
	}

	@JsonProperty("strength")
	public Double getStrength() {
		return strength;
	}

	@JsonProperty("strength")
	public void setStrength(Double strength) {
		this.strength = strength;
	}

	@JsonProperty("subtype")
	public String getSubtype() {
		return subtype;
	}

	@JsonProperty("subtype")
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	@JsonProperty("wisdom")
	public Double getWisdom() {
		return wisdom;
	}

	@JsonProperty("wisdom")
	public void setWisdom(Double wisdom) {
		this.wisdom = wisdom;
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