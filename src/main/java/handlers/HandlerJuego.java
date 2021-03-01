package handlers;


import java.util.ArrayList;

import bloque.Bloque;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import juegoCodigo.JuegoCodigo;
import posicion.Posicion;
import ui.BloqueMoverDerechaUI;
import ui.BloqueUI;
import ui.BotonAgregarBloqueAlgoritmo;
import ui.ContenedorBloques;
import ui.Main;

public class HandlerJuego{
	
	Main ventanaUI;
	JuegoCodigo juego;

	public HandlerJuego(Main ventana) {
		ventanaUI = ventana;
		juego = new JuegoCodigo();
	}
	
	public void ejecutarBloque(Bloque bloque) {
		ArrayList<Posicion> posiciones = juego.ejecutarBloque(bloque);
		ventanaUI.actualizarPosiciones(posiciones);
	}
	
	public void actualizarImagenes() {
		ventanaUI.actualizarImagenes();
	}
}
