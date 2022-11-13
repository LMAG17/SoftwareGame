package SoftwareGame.Factory;

import SoftwareGame.Constants.Fonts;
import SoftwareGame.Constants.Labels;

import javax.swing.*;
import java.awt.*;

public class ComponentFactory {

    public static JLabel getTitle (String titleText) {
        JLabel title = new JLabel(titleText);
        title.setFont(Fonts.title);
        title.setForeground(Color.white);
        return title;
    }

    public static JLabel getSubTitle (String subTitleText) {
        JLabel title = new JLabel(subTitleText);
        title.setFont(Fonts.subTitle);
        title.setForeground(Color.white);
        return title;
    }

    public static JLabel getDescription (String descriptionText) {
        JLabel title = new JLabel(descriptionText);
        title.setFont(Fonts.description);
        title.setForeground(Color.white);
        return title;
    }
    public static JFrame presentInNewFrame(JPanel panel) {
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(Labels.gameTitle);
        frame.getContentPane().setBackground(new Color(112, 177, 181));
        frame.pack();
        frame.setVisible(true);
        return frame;
    }
}
