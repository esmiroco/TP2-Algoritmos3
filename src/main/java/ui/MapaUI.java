package ui;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import personaje.Personaje;
import posicion.Posicion;
import ui.PosicionUI;

public class MapaUI extends Pane {

    public GridPane grid = new GridPane();
    public PosicionUI[][] gridArray = new PosicionUI[10][10];

    public MapaUI() {
    	grid.setGridLinesVisible(true);
    	
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                PosicionUI pos = new PosicionUI();
                grid.add(pos, i, j);
                gridArray[i][j] = pos;
            }
        }
    }

    public void colocarPersonaje(PersonajeUI personaje, Posicion posicion){
        grid.add(personaje, posicion.obtenerX(),posicion.obtenerY());
    }

    public void pintar(Posicion posicion){
        gridArray[posicion.obtenerX()][posicion.obtenerY()].pintate();
    }

}
