package dnd.dm.model.source;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { dnd.dm.model.source.SMEquipmentFactory.class})
public class SMEquipmentFactoryTest {
	
	private File sourceFile = null;
	
	private SMFactory subject = SMEquipmentFactory.getInstance();

	@Before
	public void init(){
		sourceFile = new File(getClass().getClassLoader().getResource("ModelSource/" + subject.getSourceFileName()).getFile());
		sourceFile = new File(sourceFile.getPath().replaceAll("%20", " "));
		assertNotNull(sourceFile);
	}
	
	@Test
	public void testLoadSMObjects() throws JsonParseException, JsonMappingException, IOException{
		subject.loadSMObjects(sourceFile);
		assertFalse(subject.isEmpty());
		assertNotEquals(0, subject.size());
		//TODO more checks against contents
	}
}
