package stelnet.helper;

import java.awt.AWTException;
import java.awt.Robot;

public class KeyboardHelper {

    public static void send(int key) {
        // this is a hack to fix IntelUIAPI.recreateIntelUI() large description bug
        try {
            Robot robot = new Robot();
            robot.keyPress(key);
            robot.keyRelease(key);
        } catch (AWTException exception) {
        }
    }
}
