package com.selenium.scripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotClassTest {
    public static void main(String[] args) {
        try {
            // Create an instance of the Robot class
            Robot robot = new Robot();

            // Open Notepad (Assuming it's in the path)
            Runtime.getRuntime().exec("notepad.exe");

            // Delay to allow Notepad to open
            Thread.sleep(2000);

            // Type some text (for demonstration purposes)
            String textToCopy = "This is the text to copy.";
            for (char c : textToCopy.toCharArray()) {
                robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
                robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
            }

            // Copy the selected text (Ctrl+C)
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_C);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // Open another instance of Notepad
            Runtime.getRuntime().exec("notepad.exe");
            
            // Delay to allow the second Notepad to open
            Thread.sleep(2000);

            // Paste the copied text (Ctrl+V)
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
