package Lesson07;

//code from the 7th lesson of the course
//continue making the game Catch the Drop
//using images, system's time as velocity
//HW was to make the drop falling by diagonal (line 50)

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GameWindowV2 extends JFrame {

    private static GameWindowV2 gameWindow;
    private static long lastFrameTime;
    private static Image background;
    private static Image gameOver;
    private static Image drop;

    private static float dropLeft = 200.0f;
    private static float dropTop = -100.0f;
    private static float dropVelocity = 200.0f;

    public static void main(String[] args) throws IOException {
        background = ImageIO.read(GameWindowV2.class.getResourceAsStream("background.png")); //that's how we work with the pictures
        gameOver = ImageIO.read(GameWindowV2.class.getResourceAsStream("game_over.png"));
        drop = ImageIO.read(GameWindowV2.class.getResourceAsStream("drop.png"));

        gameWindow = new GameWindowV2();
        gameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //stopping the program when the user closes the window
        gameWindow.setLocation(500, 300); //setting where the window appears on screen, x - vertical (from top to bottom), y - horizontal (from left to right)
        gameWindow.setSize(906, 478); //setting the size of the window
        gameWindow.setResizable(false); //setting whether we can change the size of the window or not

        lastFrameTime = System.nanoTime(); //returns current time in nano seconds

        GameField gameField = new GameField();
        gameWindow.add(gameField);

        gameWindow.setVisible(true);
    }

    private static void onRepaint(Graphics g) {
        long currentTime = System.nanoTime();
        float deltaTime = (currentTime - lastFrameTime) * 0.000000001f;
        lastFrameTime = System.nanoTime();

        dropTop = dropTop + dropVelocity * deltaTime;
        dropLeft = dropLeft + dropVelocity * deltaTime; //HW was to make the drop falling by diagonal
        g.drawImage(background, 0, 0, null);
        g.drawImage(drop, (int) dropLeft, (int) dropTop, null);
        //g.drawImage(gameOver, 280, 120, null);
    }

    private static class GameField extends JPanel {
        //JPanel has method paintComponent, but we want to make our own, so we @Override it
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); //if we still want to use the original method, we can use "super". This method draws the panel.
            onRepaint(g);
            repaint();
        }
    }
}