package ui;

import java.util.ArrayList;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class ContenedorBloques extends VBox {
	
	Boolean recoleccion = false;
	ArrayList<Pane> recolectados = new ArrayList<Pane>();
	RecolectorBloques bloqueAEnviar;
	Button terminarRecoleccion;
	VBox contenedorBoton;
	VBox contenedorBloques;
	
	public ContenedorBloques() {
		super();
		contenedorBoton = new VBox();
		contenedorBloques = new VBox();
		this.getChildren().add(contenedorBloques);
		this.getChildren().add(contenedorBoton);
		terminarRecoleccion = new Button("Terminar Recoleccion");
		terminarRecoleccion.setDisable(true);
		terminarRecoleccion.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				desactivarRecoleccionBloques();
			}
        });
		
		this.setVgrow(contenedorBloques, Priority.ALWAYS);
		contenedorBoton.getChildren().add(terminarRecoleccion);
	}
	
	public void activarRecoleccionBloques(RecolectorBloques bloque) {
		recoleccion = true;
		bloqueAEnviar = bloque;
		terminarRecoleccion.setDisable(false);
	}
	
	public void desactivarRecoleccionBloques() {
		recoleccion = false;
		recolectados = new ArrayList<Pane>();
		terminarRecoleccion.setDisable(true);
		
	}
	
	public void agregarBloque(Pane bloque) {
		if (recoleccion) {
			bloqueAEnviar.agregarBloque(bloque);
		}
		else {
			contenedorBloques.getChildren().add(bloque);
		}
	}
	
	public ObservableList<Node> getBloques(){
		return contenedorBloques.getChildren();
	}
	
	public void volverAEmpezar() {
		contenedorBloques.getChildren().clear();
		this.desactivarRecoleccionBloques();
	}
}
