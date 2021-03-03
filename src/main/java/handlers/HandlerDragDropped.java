package handlers;

import javafx.event.EventHandler;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;

public class HandlerDragDropped implements EventHandler<DragEvent> {

    public HandlerDragDropped(){ }

    @Override
    public void handle(DragEvent event) {
        Dragboard db = event.getDragboard();
        boolean success = false;
        if (db.hasString()) {
            success = true;
        }
        event.setDropCompleted(success);

        event.consume();
    }
}