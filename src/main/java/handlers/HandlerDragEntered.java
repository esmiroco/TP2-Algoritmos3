package handlers;

import javafx.event.EventHandler;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class HandlerDragEntered implements EventHandler<DragEvent> {
    Pane target;
    Text drop;

    public HandlerDragEntered(Pane target, Text drop){
        this.target = target;
        this.drop = drop;
    }
    @Override
    public void handle(DragEvent event) {
        if (event.getGestureSource() != target) {
            target.getChildren().add(drop);
        }

        event.consume();
    }
}