package handlers;


import java.util.ArrayList;

import bloque.Bloque;
import bloque.BloqueAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import ui.BloqueAlgoritmoUI;
import ui.BotonUI;
import ui.ContenedorBloques;
import ui.Main;

public class HandlerAgregarBotonAlgoritmo implements EventHandler<ActionEvent>{
	
	private ContenedorBloques panel;
	private Main juego;
	
	public HandlerAgregarBotonAlgoritmo(Main juegoEnviado, ContenedorBloques contenedor) {
		panel = contenedor;
		juego = juegoEnviado;
	}
	
	@Override
	public void handle(ActionEvent e) {
		ArrayList<Bloque> listaBloques = panel.getBloques();
		BloqueAlgoritmo bloqueAlgoritmo = new BloqueAlgoritmo();
		for(Bloque bloque : listaBloques) {
			bloqueAlgoritmo.agregarBloque(bloque);
		}
		BloqueAlgoritmoUI bloqueUI = new BloqueAlgoritmoUI(bloqueAlgoritmo);
		
		juego.agregarBotonAlgoritmo(bloqueUI);
		panel.volverAEmpezar();
	}
}
