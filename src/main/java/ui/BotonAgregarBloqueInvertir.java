package ui;

import java.util.HashMap;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueInvertir extends BotonUI{
	
	Pane panel;
	HashMap<String, BotonUI> botones;
	BloqueUI bloque;
	MenuButton menu;
	
	public BotonAgregarBloqueInvertir(Pane panelEnviado, HashMap<String, BotonUI> botonesEnviados){
		panel = panelEnviado;
		menu = new MenuButton("Bloque Invertir");
		this.getChildren().add(menu);
		botones = botonesEnviados;
		this.addBotones();
	}
	
	
	@Override
	public BloqueUI crearBloque() {
		BloqueUI invertir = new BloqueInvertirUI(bloque);
		return invertir;
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
