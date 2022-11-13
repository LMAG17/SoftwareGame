package SoftwareGame.Screens;

import SoftwareGame.Constants.Colors;
import SoftwareGame.Factory.ComponentFactory;
import SoftwareGame.Models.Player;
import SoftwareGame.Navigation.NavigationManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PlayerNameScreen {
    static JPanel panel = new JPanel();
    static TextField playerOneTextField = new TextField();
    static TextField playerTwoTextField = new TextField();

    static JFrame frame;

    public static void getPlayersName(int players) {

        JLabel title = ComponentFactory.getTitle("Escoge un nombre para los jugadores");
        panel.add(title);

        playerOneTextField.setText("Jugador 1");
        panel.add(playerOneTextField);

        if (players == 2) {
            playerTwoTextField.setText("Jugador 2");
            panel.add(playerTwoTextField);
        }

        JButton submitButton = new JButton("Aceptar");
        submitButton.addActionListener(e -> {
            NavigationManager.setPLayersName(setPlayersName(players));
        });

        panel.add(submitButton);

        panel.setBackground(Colors.backgroundColor);
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        panel.setLayout(new GridLayout(0, 1));
        frame = ComponentFactory.presentInNewFrame(panel);

    }

    public static void dispose() {
        frame.dispose();
    }

    public static ArrayList<Player> setPlayersName(int players) {
        ArrayList<Player> pls = new ArrayList<>();
        pls.add(new Player(playerOneTextField.getText()));
        if (players == 2) {
            pls.add(new Player(playerTwoTextField.getText()));
        }
        return pls;
    }

}
