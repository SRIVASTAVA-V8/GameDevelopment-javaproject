package com.gaming;
import javax.swing.JFrame;

public class GameFrame extends JFrame {
    public GameFrame()
    {    G_board board= new G_board(); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1500,920);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        add(board);
        this.setVisible(true);
    
    }

    public static void main(String[] args) throws Exception {
        new GameFrame();
        
    }
}
