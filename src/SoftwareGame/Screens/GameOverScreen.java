package SoftwareGame.Screens;

import SoftwareGame.Constants.Colors;
import SoftwareGame.Factory.ComponentFactory;
import SoftwareGame.Main;
import SoftwareGame.Models.Player;
import SoftwareGame.Navigation.NavigationManager;

import javax.swing.*;
import java.awt.*;

public class GameOverScreen {
    static JFrame frame;
    static JPanel panel = new JPanel();
    static JLabel title = ComponentFactory.getTitle("");

    static JButton tryAgainButton = new JButton("Jugar de nuevo");

    public static void show(Player player, boolean goodEnding) {
        panel.removeAll();
        panel.setBackground(Colors.backgroundColor);
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        panel.setLayout(new GridLayout(0, 1));

        tryAgainButton.addActionListener(e->{
            NavigationManager.showSplashScreen();
            dispose();
        });

        if (Main.players.size() > 1) {
            title.setText("Has arrazado " + player.getName());
        } else {
            title.setText(goodEnding ? "Grandioso, debes ser un gran programador" : "Estuvo cerca, intentalo de nuevo");
        }
        panel.add(title);
        panel.add(tryAgainButton);
        frame = ComponentFactory.presentInNewFrame(panel);
    }

    public static void dispose() {
        frame.dispose();
    }
}
