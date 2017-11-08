package dnd.dm.model.source.load;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dnd.dm.model.source.SMAbilityScoreFactory;
import dnd.dm.model.source.SMClassFactory;
import dnd.dm.model.source.SMConditionFactory;
import dnd.dm.model.source.SMDamageTypeFactory;
import dnd.dm.model.source.SMEquipmentCategoryFactory;
import dnd.dm.model.source.SMEquipmentFactory;
import dnd.dm.model.source.SMMonsterFactory;
import dnd.dm.model.source.SMProficiencyFactory;
import dnd.dm.model.source.SMRaceFactory;
import dnd.dm.model.source.SMSkillFactory;
import dnd.dm.model.source.SMSpellFactory;
import dnd.dm.model.source.SMSpellcastingFactory;
import dnd.dm.model.source.SMStartingEquipmentFactory;
import dnd.dm.model.source.SMSubclassFactory;
import dnd.dm.model.source.SMSubraceFactory;
import dnd.dm.model.source.SMTraitFactory;
import dnd.dm.model.source.SMFactory;
import dnd.dm.model.source.SMFeatureFactory;
import dnd.dm.model.source.SMLanguageFactory;
import dnd.dm.model.source.SMLevelFactory;
import dnd.dm.model.source.SMMagicSchoolFactory;
import dnd.dm.model.source.SMWeaponPropertyFactory;

@Configuration
@PropertySource(value = "classpath:modelSource.properties")
public class SourceModelLibrary {

	private static final Logger log = LoggerFactory.getLogger(SourceModelLibrary.class);

	@Value("${dnd.source.json.folder}")
	private String sourceModelJsonFolder;

	private HashMap<String, SMFactory> factories;

	public SourceModelLibrary() {
		factories = new HashMap<String, SMFactory>();

		//TODO change keys to /class/{i} et al.
		factories.put("monsters", SMMonsterFactory.getInstance());

		factories.put("conditions", SMConditionFactory.getInstance());

		factories.put("equipment", SMEquipmentFactory.getInstance());
		factories.put("damage-types", SMDamageTypeFactory.getInstance());
		factories.put("weapon-properties", SMWeaponPropertyFactory.getInstance());
		
		factories.put("equipment-categories", SMEquipmentCategoryFactory.getInstance());
//		startingequipment  	TODO test
		factories.put("startingequipment", SMStartingEquipmentFactory.getInstance());
//		spellcasting 		TODO test
		
		factories.put("spellcasting", SMSpellcastingFactory.getInstance());
		factories.put("ability-scores", SMAbilityScoreFactory.getInstance());
		factories.put("proficiencies", SMProficiencyFactory.getInstance());
		factories.put("languages", SMLanguageFactory.getInstance());
		factories.put("skills", SMSkillFactory.getInstance());
		
		factories.put("classes", SMClassFactory.getInstance());
		factories.put("subclasses", SMSubclassFactory.getInstance());
		factories.put("features", SMFeatureFactory.getInstance());
		//TODO figure out how to store level details
		//subclasses/lore/level/14
		//classes/wizard/level/18
		factories.put("Levels.json", SMLevelFactory.getInstance());
		
		factories.put("races", SMRaceFactory.getInstance());
		factories.put("subraces", SMSubraceFactory.getInstance());
		factories.put("traits", SMTraitFactory.getInstance());
		
		factories.put("spells", SMSpellFactory.getInstance());
		factories.put("magic-schools", SMMagicSchoolFactory.getInstance());
		
	}

	@PostConstruct
	public void init() {
		try {
			for (File jsonFile : getFilesInFolder(sourceModelJsonFolder)) {
				for (Entry<String, SMFactory> e : factories.entrySet()) {
					if (e.getValue().getSourceFileName().equals(jsonFile.getName())) {
						factories.get(e.getKey()).loadSMObjects(jsonFile);
						log.info("Loaded data from: " + jsonFile.getPath());
//						 System.out.println(factories.get(e.getKey()));
					}
				}
			}
		} catch (Exception e) {
			log.info("An error occured fetching model source files: " + e.getMessage());
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	private File[] getFilesInFolder(String sourceModelJsonFolder) throws IOException {
		log.info("Fetching model source files...");
		File modelSourceFile = new File(getClass().getClassLoader().getResource(sourceModelJsonFolder).getFile());
		if (modelSourceFile == null) {
			throw new IOException("Failed to locate resource folder: " + sourceModelJsonFolder);
		}
		modelSourceFile = new File(modelSourceFile.getPath().replaceAll("%20", " "));
		if (!modelSourceFile.isDirectory()) {
			throw new IOException("Resource folder: " + sourceModelJsonFolder + " is not a directory.");
		}

		return modelSourceFile.listFiles();
	}

}
