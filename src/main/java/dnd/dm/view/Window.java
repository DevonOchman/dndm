package dnd.dm.view;


import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class Window extends VBox {

	public Window(){
		this.setPrefHeight(600);
		this.setPrefWidth(900);
		
		createMenuBar();
		
		SplitPane sPlane = new SplitPane();
		sPlane.setDividerPositions(0.2505567928730512, 0.7505567928730512);
		sPlane.setFocusTraversable(true);
		sPlane.setPrefHeight(-1);
		sPlane.setPrefWidth(-1);

		AnchorPane ap1 = new AnchorPane();
		Button b1 = new Button();
		b1.setLayoutX(14.0);
		b1.setLayoutY(14.0);
		b1.setMnemonicParsing(false);
		b1.setText("Button");
		ap1.getChildren().add(b1);
		
		ScrollPane sp = new ScrollPane();
		AnchorPane ap2 = new AnchorPane();
		ap2.setId("Content");
		Label l1 = new Label();
		l1.setAlignment(Pos.CENTER);
		l1.setLayoutX(14);
		l1.setLayoutY(14);
		l1.setStyle("&#10");
		l1.setText("View");
		l1.setTextAlignment(TextAlignment.CENTER);
		l1.setWrapText(false);
		Font f1 = new Font(18);
		Color c1 = new Color(0.624, 0.624, 0.624, 1);
		l1.setFont(f1);
		l1.setTextFill(c1);
		ap2.getChildren().add(l1);
		sp.setContent(ap2);
		
		AnchorPane ap3 = new AnchorPane();
		Label l2 = new Label();
		l2.setAlignment(Pos.CENTER);
		l2.setLayoutX(14);
		l2.setLayoutY(14);
		l2.setStyle("&#10");
		l2.setText("Details");
		l2.setFont(f1);
		l2.setTextFill(c1);
		ap3.getChildren().add(l2);
		
		sPlane.getItems().add(ap1);
		sPlane.getItems().add(sp);
		sPlane.getItems().add(ap3);
		
		this.getChildren().add(sPlane);
		
		this.setVgrow(sPlane, Priority.ALWAYS);
	}
	
	private void createMenuBar(){
		MenuItem mi1 = new MenuItem();
		mi1.setMnemonicParsing(false);
		mi1.setText("Option One");
		MenuItem mi2 = new MenuItem();
		mi2.setMnemonicParsing(false);
		mi2.setText("Option Two");
		MenuItem mi3 = new MenuItem();
		mi3.setMnemonicParsing(false);
		mi3.setText("Option Three");
		
		Menu menu1 = new Menu("File",null,mi1, mi2, mi3);
		menu1.setMnemonicParsing(false);
		menu1.setText("File");
		
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().add(menu1);
		
		this.getChildren().add(menuBar);
		this.setVgrow(menuBar, Priority.NEVER);
	}
}
