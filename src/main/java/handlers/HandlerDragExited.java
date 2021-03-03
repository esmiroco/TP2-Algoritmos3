package handlers;

import javafx.event.EventHandler;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class HandlerDragExited implements EventHandler<DragEvent> {
    Pane target;
    Text drop;

    public HandlerDragExited(Pane target, Text drop){
        this.target = target;
        this.drop = drop;
    }
    @Override
    public void handle(DragEvent event) {
        target.getChildren().remove(drop);
        event.consume();
    }
}