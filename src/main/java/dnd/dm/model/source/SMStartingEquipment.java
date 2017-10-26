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
@JsonPropertyOrder({
"choice_1",
"choice_2",
"choice_3",
"choice_4",
"choice_5",
"choices_to_make",
"class",
"index",
"starting_equipment",
"url"
})
public class SMStartingEquipment implements SMObject {

	@JsonProperty("choice_1")
	private List<SMStartingEquipment_Choice> choice1 = null;
	@JsonProperty("choice_2")
	private List<SMStartingEquipment_Choice> choice2 = null;
	@JsonProperty("choice_3")
	private List<SMStartingEquipment_Choice> choice3 = null;
	@JsonProperty("choice_4")
	private List<SMStartingEquipment_Choice> choice4 = null;
	@JsonProperty("choice_5")
	private List<SMStartingEquipment_Choice> choice5 = null;
	@JsonProperty("choices_to_make")
	private Double choicesToMake;
	@JsonProperty("class")
	private SMObjectRef clazz;
	@JsonProperty("index")
	private Double index;
	@JsonProperty("starting_equipment")
	private List<SMStartingEquipment_SE> startingEquipment = null;
	@JsonProperty("url")
	private String url;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("choice_1")
	public List<SMStartingEquipment_Choice> getChoice1() {
	return choice1;
	}


	@JsonProperty("choice_2")
	public List<SMStartingEquipment_Choice> getChoice2() {
	return choice2;
	}


	@JsonProperty("choice_3")
	public List<SMStartingEquipment_Choice> getChoice3() {
	return choice3;
	}
	
	@JsonProperty("choice_4")
	public List<SMStartingEquipment_Choice> getChoice4() {
	return choice4;
	}


	@JsonProperty("choice_5")
	public List<SMStartingEquipment_Choice> getChoice5() {
	return choice5;
	}


	@JsonProperty("choices_to_make")
	public Double getChoicesToMake() {
	return choicesToMake;
	}


	@JsonProperty("class")
	public SMObjectRef getClazz() {
	return clazz;
	}


	@JsonProperty("index")
	public Double getIndex() {
	return index;
	}


	@JsonProperty("starting_equipment")
	public List<SMStartingEquipment_SE> getStartingEquipment() {
	return startingEquipment;
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
