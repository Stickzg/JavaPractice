package com.flowacademy.views;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class exitKeyListener implements KeyListener {
    @Override
    public void keyTyped(KeyEvent keyEvent) {
        char mykey = keyEvent.getKeyChar();
        if ( mykey == 'x' ) {
            System.exit(0);
        }
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
