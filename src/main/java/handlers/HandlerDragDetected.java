package handlers;

import javafx.event.EventHandler;
import javafx.scene.input.*;
import ui.BotonUI;

public class HandlerDragDetected implements EventHandler<MouseEvent> {
    BotonUI source;
    ClipboardContent clipboardContent;

    public HandlerDragDetected(BotonUI source, ClipboardContent clipboard){
        this.source = source;
        this.clipboardContent = clipboard;
    }

    @Override
    public void handle(MouseEvent event) {
        Dragboard db = source.obtenerBoton().startDragAndDrop(TransferMode.ANY);
        clipboardContent.putString(source.obtenerBoton().getText());
        db.setContent(clipboardContent);
        event.consume();
    }
}