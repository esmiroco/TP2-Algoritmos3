package ui;

import java.util.HashMap;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueRepetirTresVeces extends BotonUI{
	
	Pane panel;
	HashMap<String, BotonUI> botones;
	BloqueUI bloque;
	MenuButton menu;
	
	public BotonAgregarBloqueRepetirTresVeces(Pane panelEnviado, HashMap<String, BotonUI> botonesEnviados){
		panel = panelEnviado;
		menu = new MenuButton("Bloque Repetir Tres Veces");
		this.getChildren().add(menu);
		botones = botonesEnviados;
		this.addBotones();
	}
	
	
	@Override
	public BloqueUI crearBloque() {
		BloqueUI repetir = new BloqueRepetirTresVecesUI(bloque);
		return repetir;
	}
	
	private void addBotones() {
		
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
