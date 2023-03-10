package org.example;

import javax.swing.*;

public class GameWindow extends JFrame {

    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    public GameWindow() {
        setTitle("My RPG Game");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Character player = new Character("Player", 1, 100, 10, 5);
        JLabel playerLabel = new JLabel("Name: " + player.getName() + ", Level: " + player.getLevel() + ", Health: " + player.getHealth() + "/" + player.getMaxHealth() + ", Attack: " + player.getAttack() + ", Defense: " + player.getDefense());
        playerLabel.setBounds(50, 50, 300, 30);
        add(playerLabel);

        // Add other game components to the content pane as needed

        setVisible(true);
    }

    public static void main(String[] args) {
        new GameWindow();
    }
}
