package SoftwareGame.Screens;

import SoftwareGame.Constants.Colors;
import SoftwareGame.Factory.ComponentFactory;
import SoftwareGame.Main;
import SoftwareGame.Navigation.NavigationManager;

import javax.swing.*;
import java.awt.*;

public class PlayersScreen {

    private static JFrame frame;

    public static void showPlayerSelection() {
        JPanel globalPanel = new JPanel();
        JLabel selectPlayerTitle = ComponentFactory.getTitle("Selecciona la cantidad de Jugadores");

        JPanel onePlayerContainer = new JPanel();
        JLabel onePlayerTitle = ComponentFactory.getSubTitle("1 Jugador");
        JLabel onePlayerDescription = ComponentFactory.getDescription("Juega respondiendo la mayor cantidad de preguntas que te sea posible");
        JButton onePlayerButton = new JButton("Jugar");
        onePlayerButton.addActionListener(e -> {
            NavigationManager.setPlayers(1);
        });
        onePlayerContainer.setLayout(new GridLayout(0, 1));
        onePlayerContainer.setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));
        onePlayerContainer.setBackground(Colors.backgroundColor);
        onePlayerContainer.add(onePlayerTitle);
        onePlayerContainer.add(onePlayerDescription);
        onePlayerContainer.add(onePlayerButton);

        JPanel twoPlayerContainer = new JPanel();
        JLabel twoPlayerTitle = ComponentFactory.getSubTitle("2 Jugadores");
        JLabel twoPlayerDescription = ComponentFactory.getDescription("Juega compitiendo con un amigo");
        JButton twoPlayerButton = new JButton("Jugar");
        twoPlayerContainer.setLayout(new GridLayout(0, 1));
        twoPlayerButton.addActionListener(e -> {
            NavigationManager.setPlayers(2);
        });
        twoPlayerContainer.setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));
        twoPlayerContainer.setBackground(Colors.backgroundColor);
        twoPlayerContainer.add(twoPlayerTitle);
        twoPlayerContainer.add(twoPlayerDescription);
        twoPlayerContainer.add(twoPlayerButton);

        JPanel buttonsPanel = new JPanel();
        globalPanel.setBackground(Colors.backgroundColor);
        globalPanel.setLayout(new GridLayout(1, 2));

        globalPanel.add(selectPlayerTitle);
        buttonsPanel.add(onePlayerContainer);
        buttonsPanel.add(twoPlayerContainer);
        globalPanel.add(buttonsPanel);
        globalPanel.setBackground(Colors.backgroundColor);
        globalPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        globalPanel.setLayout(new GridLayout(0, 1));

        frame = ComponentFactory.presentInNewFrame(globalPanel);
    }

    public static void dispose() {
        frame.dispose();
    }
}
