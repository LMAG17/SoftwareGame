package SoftwareGame.Screens;

import SoftwareGame.Constants.Colors;
import SoftwareGame.Constants.Labels;
import SoftwareGame.Factory.ComponentFactory;
import SoftwareGame.Navigation.NavigationManager;

import javax.swing.*;
import java.awt.*;

public class SplashScreen {
    static JFrame frame;
    static JPanel setupGamePanel = new JPanel();
    public static JPanel setupGame() {

        JButton initButton = new JButton(Labels.initGame);
        initButton.addActionListener(e -> {
            NavigationManager.initGame();
        });

        setupGamePanel.setBackground(Colors.backgroundColor);
        setupGamePanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        setupGamePanel.setLayout(new GridLayout(0, 1));

        setupGamePanel.add(ComponentFactory.getTitle(Labels.gameTitle));
        setupGamePanel.add(initButton);

        frame = ComponentFactory.presentInNewFrame(setupGamePanel);

        return setupGamePanel;
    }

    public static void hideSplashScreen (){
        frame.dispose();
    }
}
