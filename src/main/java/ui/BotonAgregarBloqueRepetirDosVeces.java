package ui;

import java.util.HashMap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class BotonAgregarBloqueRepetirDosVeces extends BotonUI{
	
	Pane panel;
	HashMap<String, BotonUI> botones;
	BloqueUI bloque;
	MenuButton menu;
	
	public BotonAgregarBloqueRepetirDosVeces(Pane panelEnviado){
		
		panel = panelEnviado;
		menu = new MenuButton("Bloque Repetir 2 Veces");
		this.getChildren().add(menu);		
	}
	
	
	@Override
	public BloqueUI crearBloque() {
		BloqueUI repetir = new BloqueRepetirDosVecesUI(bloque);
		return repetir;
	}
	
	public void addBotones(HashMap botonesEnviados) {
		botones = botonesEnviados;
		
		EventHandler<ActionEvent> evento = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 
            	bloque = botones.get(((MenuItem) e.getSource()).getText()).crearBloque();
    		    panel.getChildren().add(crearBloque());
            } 
        }; 
		
		for ( String key : botones.keySet() ) {
			MenuItem item = new MenuItem(key);
			item.setOnAction(evento);
			menu.getItems().add(item);
		}
		
	}

}
