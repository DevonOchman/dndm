package dnd.dm.model.source;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "additional_magical_secrets_max_lvl"})
public class SMLevel_SubclassSpecific {
	
	@JsonProperty("additional_magical_secrets_max_lvl")
	private Double additionalMagicalSecretsMaxLvl;
	
	@JsonProperty("additional_magical_secrets_max_lvl")
	private Double getAdditionalMagicalSecretsMaxLvl(){
		return additionalMagicalSecretsMaxLvl;
	}

}
