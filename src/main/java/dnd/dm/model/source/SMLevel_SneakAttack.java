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
    "creating_spell_slots",
    "dice_count",
    "dice_value",
    "metamagic_known",
    "sorcery_points"
})
public class SMLevel_SneakAttack {

	@JsonProperty("creating_spell_slots")
    private List<SMLevel_CreatingSpellSlot> creatingSpellSlots = null;
    @JsonProperty("dice_count")
    private Double diceCount;
    @JsonProperty("dice_value")
    private Double diceValue;
    @JsonProperty("metamagic_known")
    private Double metamagicKnown;
    @JsonProperty("sorcery_points")
    private Double sorceryPoints;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("creating_spell_slots")
    public List<SMLevel_CreatingSpellSlot> getCreatingSpellSlots() {
        return creatingSpellSlots;
    }



    @JsonProperty("dice_count")
    public Double getDiceCount() {
        return diceCount;
    }


    @JsonProperty("dice_value")
    public Double getDiceValue() {
        return diceValue;
    }



    @JsonProperty("metamagic_known")
    public Double getMetamagicKnown() {
        return metamagicKnown;
    }



    @JsonProperty("sorcery_points")
    public Double getSorceryPoints() {
        return sorceryPoints;
    }


    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }


}
