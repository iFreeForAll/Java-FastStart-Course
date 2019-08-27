package Lesson06;

//code from the 6th lesson of the course
//making a game Catch the Drop
//using OOP, JFrame, overriding a method
//HW was to draw a line

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private static GameWindow gameWindow;

    public static void main(String[] args) {
        gameWindow = new GameWindow();
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //stopping the program when the user closes the window
        gameWindow.setLocation(500, 300); //setting where the window appears on screen, x - vertical (from top to bottom), y - horizontal (from left to right)
        gameWindow.setSize(906, 478); //setting the size of the window
        gameWindow.setResizable(false); //setting whether we can change the size of the window or not

        GameField gameField = new GameField();
        gameWindow.add(gameField);

        gameWindow.setVisible(true);
    }

    private static void onRepaint(Graphics g) {
        g.fillOval(10, 10,200,100);
        g.drawLine(200,200,400,400); //HW was to draw a line
    }

    private static class GameField extends JPanel {
        //JPanel has method paintComponent, but we want to make our own, so we @Override it
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); //if we still want to use the original method, we can use "super". This method draws the panel.
            onRepaint(g);
        }
    }
}