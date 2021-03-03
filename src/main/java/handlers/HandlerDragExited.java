package handlers;

import javafx.event.EventHandler;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class HandlerDragExited implements EventHandler<DragEvent> {
    Pane target;

    public HandlerDragExited(Pane target){
        this.target = target;
    }
    @Override
    public void handle(DragEvent event) {
        event.consume();
    }
}