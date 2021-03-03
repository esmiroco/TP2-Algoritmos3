package handlers;

import javafx.event.EventHandler;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class HandlerDragEntered implements EventHandler<DragEvent> {
    Pane target;

    public HandlerDragEntered(Pane target){
        this.target = target;
    }
    @Override
    public void handle(DragEvent event) {
        if (event.getGestureSource() != target) {
        }

        event.consume();
    }
}