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
@JsonPropertyOrder({ "action_surges", "additional_magical_secrets_max_lvl", "arcane_recovery_levels", "aura_range",
		"bardic_inspiration_die", "brutal_critical_dice", "channel_divinity_charges", "creating_spell_slots", "destroy_undead_cr",
		"extra_attacks", "favored_enemies", "favored_terrain", "indomitable_uses", "invocations_known", "ki_points",
		"magical_secrets_max_5", "magical_secrets_max_7", "magical_secrets_max_9", "martial_arts","metamagic_known",
		"mystic_arcanum_level_6", "mystic_arcanum_level_7", "mystic_arcanum_level_8", "mystic_arcanum_level_9",
		"rage_count", "rage_damage_bonus", "sneak_attack", "sorcery_points","song_of_rest_die", "unarmored_movement", "wild_shape_fly",
		"wild_shape_max_cr", "wild_shape_swim" })
public class SMLevel_ClassSpecific {

	@JsonProperty("action_surges")
	private Double actionSurges;
	@JsonProperty("additional_magical_secrets_max_lvl")
	private Double additionalMagicalSecretsMaxLvl;
	@JsonProperty("arcane_recovery_levels")
	private Double arcaneRecoveryLevels;
	@JsonProperty("aura_range")
	private Double auraRange;
	@JsonProperty("bardic_inspiration_die")
	private Double bardicInspirationDie;
	@JsonProperty("brutal_critical_dice")
	private Double brutalCriticalDice;
	@JsonProperty("channel_divinity_charges")
	private Double channelDivinityCharges;
	@JsonProperty("creating_spell_slots")
	private List<SMLevel_CreatingSpellSlot> creatingSpellSlots;
	@JsonProperty("destroy_undead_cr")
	private Double destroyUndeadCr;
	@JsonProperty("extra_attacks")
	private Double extraAttacks;
	@JsonProperty("favored_enemies")
	private Double favoredEnemies;
	@JsonProperty("favored_terrain")
	private Double favoredTerrain;
	@JsonProperty("indomitable_uses")
	private Double indomitableUses;
	@JsonProperty("invocations_known")
	private Double invocationsKnown;
	@JsonProperty("ki_points")
	private Double kiPoints;
	@JsonProperty("magical_secrets_max_5")
	private Double magicalSecretsMax5;
	@JsonProperty("magical_secrets_max_7")
	private Double magicalSecretsMax7;
	@JsonProperty("magical_secrets_max_9")
	private Double magicalSecretsMax9;
	@JsonProperty("martial_arts")
	private SM_Level_MartialArts martialArts;
	@JsonProperty("metamagic_known")
	private Double metamagicKnown;
	@JsonProperty("mystic_arcanum_level_6")
	private Double mysticArcanumLevel6;
	@JsonProperty("mystic_arcanum_level_7")
	private Double mysticArcanumLevel7;
	@JsonProperty("mystic_arcanum_level_8")
	private Double mysticArcanumLevel8;
	@JsonProperty("mystic_arcanum_level_9")
	private Double mysticArcanumLevel9;
	@JsonProperty("rage_count")
	private Double rageCount;
	@JsonProperty("rage_damage_bonus")
	private Double rageDamageBonus;
	@JsonProperty("sneak_attack")
	private SMLevel_SneakAttack sneakAttack;
	@JsonProperty("sorcery_points")
	private Double sorceryPoints;
	@JsonProperty("song_of_rest_die")
	private Double songOfRestDie;
	@JsonProperty("unarmored_movement")
	private Double unarmoredMovement;
	@JsonProperty("wild_shape_fly")
	private String wildShapeFly;
	@JsonProperty("wild_shape_max_cr")
	private Double wildShapeMaxCr;
	@JsonProperty("wild_shape_swim")
	private String wildShapeSwim;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("action_surges")
	public Double getActionSurges() {
		return actionSurges;
	}

	@JsonProperty("additional_magical_secrets_max_lvl")
	public Double getAdditionalMagicalSecretsMaxLvl() {
		return additionalMagicalSecretsMaxLvl;
	}

	@JsonProperty("arcane_recovery_levels")
	public Double getArcaneRecoveryLevels() {
		return arcaneRecoveryLevels;
	}

	@JsonProperty("aura_range")
	public Double getAuraRange() {
		return auraRange;
	}

	@JsonProperty("bardic_inspiration_die")
	public Double getBardicInspirationDie() {
		return bardicInspirationDie;
	}

	@JsonProperty("brutal_critical_dice")
	public Double getBrutalCriticalDice() {
		return brutalCriticalDice;
	}

	@JsonProperty("channel_divinity_charges")
	public Double getChannelDivinityCharges() {
		return channelDivinityCharges;
	}

	@JsonProperty("creating_spell_slots")
	private List<SMLevel_CreatingSpellSlot> getCreatingSpellSlots(){
		return creatingSpellSlots;
	}
	
	@JsonProperty("destroy_undead_cr")
	public Double getDestroyUndeadCr() {
		return destroyUndeadCr;
	}

	@JsonProperty("extra_attacks")
	public Double getExtraAttacks() {
		return extraAttacks;
	}

	@JsonProperty("favored_enemies")
	public Double getFavoredEnemies() {
		return favoredEnemies;
	}

	@JsonProperty("favored_terrain")
	public Double getFavoredTerrain() {
		return favoredTerrain;
	}

	@JsonProperty("indomitable_uses")
	public Double getIndomitableUses() {
		return indomitableUses;
	}

	@JsonProperty("invocations_known")
	public Double getInvocationsKnown() {
		return invocationsKnown;
	}

	@JsonProperty("ki_points")
	public Double getKiPoints() {
		return kiPoints;
	}

	@JsonProperty("magical_secrets_max_5")
	public Double getMagicalSecretsMax5() {
		return magicalSecretsMax5;
	}

	@JsonProperty("magical_secrets_max_7")
	public Double getMagicalSecretsMax7() {
		return magicalSecretsMax7;
	}

	@JsonProperty("magical_secrets_max_9")
	public Double getMagicalSecretsMax9() {
		return magicalSecretsMax9;
	}

	@JsonProperty("martial_arts")
	public SM_Level_MartialArts getMartialArts() {
		return martialArts;
	}
	@JsonProperty("metamagic_known")
	private Double metamagicKnown(){
		return metamagicKnown;
	}

	@JsonProperty("mystic_arcanum_level_6")
	public Double getMysticArcanumLevel6() {
		return mysticArcanumLevel6;
	}

	@JsonProperty("mystic_arcanum_level_7")
	public Double getMysticArcanumLevel7() {
		return mysticArcanumLevel7;
	}

	@JsonProperty("mystic_arcanum_level_8")
	public Double getMysticArcanumLevel8() {
		return mysticArcanumLevel8;
	}

	@JsonProperty("mystic_arcanum_level_9")
	public Double getMysticArcanumLevel9() {
		return mysticArcanumLevel9;
	}

	@JsonProperty("rage_count")
	public Double getRageCount() {
		return rageCount;
	}

	@JsonProperty("rage_damage_bonus")
	public Double getRageDamageBonus() {
		return rageDamageBonus;
	}

	@JsonProperty("sneak_attack")
	public SMLevel_SneakAttack getSneakAttack() {
		return sneakAttack;
	}
	
	@JsonProperty("sorcery_points")
	private Double getSorceryPoints(){
		return sorceryPoints;
	}

	@JsonProperty("song_of_rest_die")
	public Double getSongOfRestDie() {
		return songOfRestDie;
	}

	@JsonProperty("unarmored_movement")
	public Double getUnarmoredMovement() {
		return unarmoredMovement;
	}

	@JsonProperty("wild_shape_fly")
	public String getWildShapeFly() {
		return wildShapeFly;
	}

	@JsonProperty("wild_shape_max_cr")
	public Double getWildShapeMaxCr() {
		return wildShapeMaxCr;
	}

	@JsonProperty("wild_shape_swim")
	public String getWildShapeSwim() {
		return wildShapeSwim;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

}
