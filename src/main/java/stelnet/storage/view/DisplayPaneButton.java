package stelnet.storage.view;

import com.fs.starfarer.api.ui.IntelUIAPI;
import com.fs.starfarer.api.util.Misc;

import stelnet.storage.StorageBoard;
import stelnet.ui.SimpleCallback;
import stelnet.ui.Size;
import stelnet.ui.ToggleButton;

public class DisplayPaneButton extends ToggleButton {

    public DisplayPaneButton() {
        super(new Size(180, 24), "Display Ships", "Display Items", true, Misc.getButtonTextColor(),
                Misc.getButtonTextColor(), true);
        setCallback(new SimpleCallback() {

            @Override
            public void confirm(IntelUIAPI ui) {
                StorageBoard board = StorageBoard.getInstance();
                board.togglePane();
            }
        });
    }
}
