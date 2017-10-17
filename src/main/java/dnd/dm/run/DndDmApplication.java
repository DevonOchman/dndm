package dnd.dm.run;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import dnd.dm.model.source.load.SourceModelLoader;

@SpringBootApplication
@ComponentScan("dnd.dm.*")
public class DndDmApplication {
	
	@Autowired
	private SourceModelLoader sourceModelLoader;

	@Bean
	public SourceModelLoader sourceModelLoader() throws IOException{
		return new SourceModelLoader();
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
