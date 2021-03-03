package handlers;

import javafx.event.EventHandler;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;

public class HandlerDragOver implements EventHandler<DragEvent> {
    Pane target;

    public HandlerDragOver(Pane target){
        this.target = target;
    }
    @Override
    public void handle(DragEvent event) {
        if (event.getGestureSource() != target &&
                event.getDragboard().hasString()) {
            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        }

        event.consume();
    }
}