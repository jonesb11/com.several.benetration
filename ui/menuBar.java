package ui;

import javax.swing.*;

public class menuBar extends JMenuBar {
    
    public menuBar(){
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        exitMenuItem.addActionListener(e -> System.exit(0));
        fileMenu.add(exitMenuItem);
        add(fileMenu);
    }


}