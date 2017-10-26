package dnd.dm.run;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import dnd.dm.model.source.load.SourceModelLibrary;

@SpringBootApplication
@ComponentScan("dnd.dm.*")
public class DndDmApplication {
	
	@Autowired
	private SourceModelLibrary sourceModelLoader;

	@Bean
	public SourceModelLibrary sourceModelLoader() throws IOException{
		return new SourceModelLibrary();
	}
	
	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(DndDmApplication.class, args);
		
		String[] beans = appContext.getBeanDefinitionNames();
        Arrays.sort(beans);
        for (String bean : beans) {
//            System.out.println(bean);
        }
	}
}
