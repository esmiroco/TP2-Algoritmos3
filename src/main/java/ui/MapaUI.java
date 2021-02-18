package ui;

import java.util.ArrayList;
import java.util.Timer;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import personaje.Personaje;
import posicion.Posicion;
import ui.PosicionUI;

public class MapaUI extends Pane {

    public GridPane grid = new GridPane();
    public PosicionUI[][] gridArray = new PosicionUI[10][10];
    public PersonajeUI personaje;
    public PosicionUI posicionActual;

    public MapaUI(PersonajeUI personajeEnviado) {
    	personaje = personajeEnviado;
    	grid.setGridLinesVisible(true);
    	this.getChildren().add(grid);
    	
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                PosicionUI pos = new PosicionUI();
                grid.add(pos, i, j);
                gridArray[i][j] = pos;
            }
        }
    }

    public void colocarPersonaje(Posicion posicion){
    	posicionActual = gridArray[posicion.obtenerX()][posicion.obtenerY()];
    	posicionActual.getChildren().add(personaje);
    }

    private void pintar(Posicion posicion){
    	if (posicion.estoyPintado()){
        	posicionActual.pintate();
    	}
    }

	public void actualizarPosiciones(ArrayList<Posicion> posiciones) {
		for(Posicion pos : posiciones) {
			posicionActual.getChildren().remove(personaje);
			this.colocarPersonaje(pos);
			this.pintar(pos);
		}
	}

}
