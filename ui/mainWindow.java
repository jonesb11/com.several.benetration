package ui;
import javax.swing.*;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;



public class mainWindow extends JFrame {
    
    public mainWindow(){
        setTitle("Benetration v0.1");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            MetalLookAndFeel.setCurrentTheme(new DefaultMetalTheme());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Adding menu bar to top of screen.

        menuBar menu = new menuBar();

        setJMenuBar(menu);


        setVisible(true);
    }    

    public static void main(String [] args){
        new mainWindow();
    }

}
