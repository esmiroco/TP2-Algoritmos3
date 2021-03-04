package ui;

import java.util.ArrayList;

import bloque.Bloque;
import handlers.HandlerAgregarBotonAlgoritmo;
import handlers.HandlerTerminarRecoleccion;
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
	RecolectorBloques bloqueAEnviar;
	Button terminarRecoleccion;
	Button agregarBotonAlgoritmo;
	VBox contenedorBoton;
	VBox contenedorBloques;
	Main ventanaUI;
	
	public ContenedorBloques(Main ventana) {
		super();
		ventanaUI = ventana;
		contenedorBoton = new VBox();
		contenedorBloques = new VBox();
		agregarBotonAlgoritmo = new Button("Agregar Bloque Algoritmo");
		contenedorBoton.getChildren().add(agregarBotonAlgoritmo);
		this.getChildren().add(contenedorBloques);
		this.getChildren().add(contenedorBoton);
		this.setVgrow(contenedorBloques, Priority.ALWAYS);
		
		HandlerAgregarBotonAlgoritmo handlerBoton = new HandlerAgregarBotonAlgoritmo(ventana, this);
		agregarBotonAlgoritmo.setOnAction(handlerBoton);
		
	}
	
	public void activarRecoleccionBloques(RecolectorBloques bloque) {
		recoleccion = true;
		bloqueAEnviar = bloque;
		terminarRecoleccion = new Button("Terminar Recoleccion");
		terminarRecoleccion.setOnAction(new HandlerTerminarRecoleccion(this));
		contenedorBoton.getChildren().clear();
		contenedorBoton.getChildren().add(terminarRecoleccion);
	}
	
	public void desactivarRecoleccionBloques() {
		recoleccion = false;
		contenedorBoton.getChildren().clear();
		contenedorBoton.getChildren().add(agregarBotonAlgoritmo);
	}
	
	public void agregarBloque(BloqueUI bloque) {
		if (recoleccion) {
			bloqueAEnviar.agregarBloque(bloque);
		}
		else {
			contenedorBloques.getChildren().add(bloque);
		}
	}
	
	public ArrayList<Bloque> getBloques(){
		ArrayList<Bloque> listaBloques = new ArrayList<Bloque>();
		for(Node bloque :contenedorBloques.getChildren()) {
			listaBloques.add(((BloqueUI)bloque).devolverBloque());
		}
		return listaBloques;
	}
	
	public void volverAEmpezar() {
		contenedorBloques.getChildren().clear();
		this.desactivarRecoleccionBloques();
	}
}
