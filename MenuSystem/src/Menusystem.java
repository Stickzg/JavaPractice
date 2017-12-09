import com.flowacademy.views.Display;
import com.flowacademy.views.exitKeyListener;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Menusystem {

    public static void main(String[] args) {

        Display menu = new Display("MenuSystem", 500, 500);
        JMenuBar mymenu;
        mymenu = menu.createMenuBar();

        JMenu load = menu.newMenu("Load");
        load.setMnemonic(KeyEvent.VK_L);
        JMenu save = menu.newMenu("save");
        save.setMnemonic(KeyEvent.VK_S);
        JMenu exit = menu.newMenu("Exit");
        exit.setMnemonic(KeyEvent.VK_X);


        //add listeners
        exit.add(KeyListener (new exitKeyListener));
    }
}
