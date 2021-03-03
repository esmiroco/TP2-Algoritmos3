package handlers;

import javafx.event.EventHandler;
import javafx.scene.input.DragEvent;
import ui.BotonUI;

public class HandlerDragDone implements EventHandler<DragEvent> {
    BotonUI source;

    public HandlerDragDone(BotonUI source){
        this.source = source;
    }
    @Override
    public void handle(DragEvent event) {
        source.ejecutar();
        event.consume();
    }
}