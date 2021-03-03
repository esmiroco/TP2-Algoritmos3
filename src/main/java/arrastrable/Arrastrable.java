package arrastrable;

import handlers.*;
import javafx.event.EventHandler;
import javafx.scene.input.*;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import ui.BotonUI;

public class Arrastrable {
    final Text drop = new Text(300, 100, "Agregar aca");
    ClipboardContent content = new ClipboardContent();
    BotonUI source;
    Pane target;

    public Arrastrable(BotonUI source, Pane target){
        this.source = source;
        this.target = target;
    }

    public void ejecutar() {

        source.obtenerBoton().setOnDragDetected(new HandlerDragDetected(source, content));

        target.setOnDragOver(new HandlerDragOver(target));

        target.setOnDragEntered(new HandlerDragEntered(target, drop));

        target.setOnDragExited(new HandlerDragExited(target, drop));

        target.setOnDragDropped(new HandlerDragDropped());

        source.setOnDragDone(new HandlerDragDone(source));

    }
}