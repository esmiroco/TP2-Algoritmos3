package ui;

import arrastrable.Arrastrable;
import bloque.BloqueAlgoritmo;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class BotonAgregarBloqueAlgoritmo extends BotonUI{
	
	ContenedorBloques panel;
	BloqueAlgoritmo bloque = null;
	Button boton;
	Arrastrable arrastrable;
	
	public BotonAgregarBloqueAlgoritmo(ContenedorBloques panelEnviado){
		panel = panelEnviado;
		boton = new Button("Bloque Algoritmo");
		this.getChildren().add(boton);
		arrastrable = new Arrastrable(this,panel);
		arrastrable.ejecutar();
		boton.setDisable(true);
		this.setMargin(boton, new Insets(5,5,5,5));
		boton.setStyle("-fx-text-fill: white; -fx-background-color: slategrey;");
		boton.setMinSize(150, 50);

	}
	
	
	public BloqueUI getBloque() {
		BloqueAlgoritmoUI bloqueUI = new BloqueAlgoritmoUI(bloque);
		return bloqueUI;
	}

	public void agregarBloque(BloqueAlgoritmo bloqueAlgoritmo) {
		bloque = bloqueAlgoritmo;
		boton.setDisable(false);
		
		
	}
	@Override
	public Button obtenerBoton(){ return boton;}

	@Override
	public void ejecutar(){
		panel.agregarBloque(getBloque());}

}
