package ui;

import arrastrable.Arrastrable;
import bloque.BloqueAlgoritmo;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

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
	//	boton.setOnAction(new HandlerBloqueAlgoritmo(panelEnviado, this));
	//	boton.setDisable(true);

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
