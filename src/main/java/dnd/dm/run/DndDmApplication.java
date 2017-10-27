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
import dnd.dm.view.Window;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

@SpringBootApplication
@ComponentScan("dnd.dm.*")
public class DndDmApplication extends Application {
	
//	@Autowired
//	private SourceModelLibrary sourceModelLoader;
//
//	@Bean
//	public SourceModelLibrary sourceModelLoader() throws IOException{
//		return new SourceModelLibrary();
//	}
	
	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(DndDmApplication.class, args);
		
		String[] beans = appContext.getBeanDefinitionNames();
        Arrays.sort(beans);
        for (String bean : beans) {
//            System.out.println(bean);
        }
        
        launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		VBox root = new Window();
//		root.getChildren().add(new Text(300, 200, "D&D DM Application"));
		
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.show();
		
	}
}
