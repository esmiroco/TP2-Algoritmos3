package ui;

import java.util.ArrayList;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import posicion.Posicion;

public class MapaUI extends Pane {

	
	ArrayList<Posicion> posicionesAActualizar = new ArrayList<Posicion>();
    public GridPane grid = new GridPane();
    public PosicionUI[][] gridArray = new PosicionUI[10][10];
    public PersonajeUI personaje;
    public PosicionUI posicionActualUI;
    public Posicion posicionActual;
    ImagenUI imagenPj = new ImagenUI();

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
        // esto hay que refactorizarlo
        posicionActualUI = gridArray[1][1];
        posicionActual = new Posicion(-1, -1);
        
    }
    public void colocarPersonaje(Posicion posicion){
    	if (posicionActual.esIgualA(posicion)) {
    		return;
    	}
    	if(posicion.obtenerX() > posicionActual.obtenerX()){
    		personaje.actualizarImagen(imagenPj.imgDerechaLapizArriba);
		}
    	if(posicion.obtenerY() < posicionActual.obtenerY()){
    		personaje.actualizarImagen(imagenPj.imgArribaLapizArriba);
		}
    	if(posicion.obtenerX() < posicionActual.obtenerX()){
			personaje.actualizarImagen(imagenPj.imgIzquierdaLapizArriba);
		}
		if(posicion.obtenerY() > posicionActual.obtenerY()){
			personaje.actualizarImagen(imagenPj.imgAbajoLapizArriba);
		}
    	posicionActualUI = gridArray[posicion.obtenerX()][posicion.obtenerY()];
    	posicionActualUI.getChildren().add(personaje);
    	posicionActual = posicion;
    	pintar(posicion);
    }

    private void pintar(Posicion posicion){
    	if (posicion.estoyPintado()){
        	posicionActualUI.pintate();
    	}
    }

	public void agregarPosiciones(ArrayList<Posicion> posiciones) {
		posicionesAActualizar.addAll(posiciones);
	}
	
	public void actualizarImagenes() {
		actualizarImagenes(0);
	}

	private void actualizarImagenes(int i) {
		Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), ev -> {
			colocarPersonaje(posicionesAActualizar.get(i));
			if(i < (posicionesAActualizar.size()-1)) {
				actualizarImagenes(i + 1);
			}
			else {
				posicionesAActualizar.clear();
				
			}
			
		}));
		timeline.play();
	}

}
