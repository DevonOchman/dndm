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
@JsonPropertyOrder({ "2h_damage", "armor_category", "armor_class", "capacity","category_range", "contents", "cost", "damage",
		"desc", "equipment_category", "gear_category", "index", "name", "properties", "range", "special","speed", "str_minimum",
		"stealth_disadvantage","tool_category", "throw_range","url", "vehicle_category","weapon_category:", "weapon_range", "weight" })
public class SMEquipment implements SMObject {

	@JsonProperty("2h_damage")
	private SMEquipment_2hDamage twohDamage;
	@JsonProperty("armor_category")
	private String armorCategory;
	@JsonProperty("armor_class")
	private SMEquipment_ArmorClass armorClass;
	@JsonProperty("capacity")
	private String capacity;
	@JsonProperty("category_range")
	private String categoryRange;
	@JsonProperty("contents")
	private List<SMEquipment_Content> contents = null;
	@JsonProperty("cost")
	private SMEquipment_Cost cost;
	@JsonProperty("damage")
	private SMEquipment_Damage damage;
	@JsonProperty("desc")
	private List<String> desc = null;
	@JsonProperty("equipment_category")
	private String equipmentCategory;
	@JsonProperty("gear_category")
	private String gearCategory;
	@JsonProperty("index")
	private Double index;
	@JsonProperty("name")
	private String name;
	@JsonProperty("properties")
	private List<SMObjectRef> properties = null;
	@JsonProperty("range")
	private SMEquipment_Range range;
	@JsonProperty("special")
	private List<String> special = null;
	@JsonProperty("speed")
	private SMEquipment_Speed speed;
	@JsonProperty("stealth_disadvantage")
	private Boolean stealthDisadvantage;
	@JsonProperty("str_minimum")
	private Double strMinimum;
	@JsonProperty("tool_category")
	private String toolCategory;
	@JsonProperty("throw_range")
	private SMEquipment_ThrowRange throw_range;
	@JsonProperty("url")
	private String url;
	@JsonProperty("vehicle_category")
	private String vehicleCategory;
	@JsonProperty("weapon_category:")
	private String weaponCategory;
	@JsonProperty("weapon_range")
	private String weaponRange;
	@JsonProperty("weight")
	private Double weight;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("2h_damage")
	public SMEquipment_2hDamage getTwohDamage() {
		return twohDamage;
	}

	@JsonProperty("armor_category")
	public String getArmorCategory() {
		return armorCategory;
	}

	@JsonProperty("armor_class")
	public SMEquipment_ArmorClass getArmorClass() {
		return armorClass;
	}
	
	@JsonProperty("capacity")
	private String capacity(){
		return capacity;
	}

	@JsonProperty("category_range")
	public String getCategoryRange() {
		return categoryRange;
	}

	@JsonProperty("contents")
	public List<SMEquipment_Content> getContents() {
		return contents;
	}

	@JsonProperty("cost")
	public SMEquipment_Cost getCost() {
		return cost;
	}

	@JsonProperty("desc")
	public List<String> getDesc() {
		return this.desc;
	}

	@JsonProperty("damage")
	public SMEquipment_Damage getDamage() {
		return damage;
	}

	@JsonProperty("equipment_category")
	public String getEquipmentCategory() {
		return equipmentCategory;
	}

	@JsonProperty("gear_category")
	private String gearCategory() {
		return gearCategory;
	}

	@JsonProperty("index")
	public Double getIndex() {
		return index;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("properties")
	public List<SMObjectRef> getProperties() {
		return properties;
	}

	@JsonProperty("range")
	public SMEquipment_Range getRange() {
		return range;
	}

	@JsonProperty("special")
	public List<String> getSpecial() {
		return special;
	}
	
	@JsonProperty("speed")
	private SMEquipment_Speed speed(){
		return speed;
	}

	@JsonProperty("stealth_disadvantage")
	public Boolean getStealthDisadvantage() {
		return stealthDisadvantage;
	}

	@JsonProperty("str_minimum")
	public Double getStrMinimum() {
		return strMinimum;
	}

	@JsonProperty("tool_category")
	private String toolCategory(){
		return toolCategory();
	}
	
	@JsonProperty("throw_range")
	public SMEquipment_ThrowRange getThrow_range() {
		return throw_range;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}
	
	@JsonProperty("vehicle_category")
	private String vehicleCategory(){
		return vehicleCategory;
	}

	@JsonProperty("weapon_category:")
	public String getWeaponCategory() {
		return weaponCategory;
	}

	@JsonProperty("weapon_range")
	public String getWeaponRange() {
		return weaponRange;
	}

	@JsonProperty("weight")
	public Double getWeight() {
		return weight;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

}
