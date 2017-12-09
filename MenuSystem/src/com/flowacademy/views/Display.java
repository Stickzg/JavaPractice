package com.flowacademy.views;

import javax.swing.*;


public class Display {

    private String title;
    private int width, height;

    private JFrame frame;
    private JMenuBar jMenuBar;
    private JMenu jMenu;
    private JMenuItem jMenuItem;

    public Display(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;

        newDisplay(title, width, height);
    }



    public JFrame newDisplay(String title, int width, int height) {

        frame = new JFrame();

        frame.setTitle(title);
        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        return frame;
    }

    public JMenuBar createMenuBar() {
        jMenuBar = new JMenuBar();
        return jMenuBar;
    }

    public JMenu newMenu (String name) {
        jMenu = new JMenu(name);
        return jMenu;
    }
}
