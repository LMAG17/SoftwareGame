package SoftwareGame.Screens;

import SoftwareGame.Constants.Colors;
import SoftwareGame.Data.Data;
import SoftwareGame.Factory.ComponentFactory;
import SoftwareGame.Main;
import SoftwareGame.Models.Player;
import SoftwareGame.Models.Question;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class QuestionScreen {
    static JPanel panel = new JPanel();
    static JLabel title = ComponentFactory.getTitle("");
    static JLabel currentPlayerName = ComponentFactory.getSubTitle("");
    static JLabel twoPlayerName = ComponentFactory.getDescription("");
    static ArrayList<Question> questions = Data.getQuestions();
    static Question question;

    public static JPanel showQuestion() {
        if (question == null) {
            getQuestion();
        }

        panel.setBackground(Colors.backgroundColor);
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        panel.setLayout(new GridLayout(0, 1));

        ComponentFactory.presentInNewFrame(panel);

        return panel;

    }

    public static void getQuestion() {
        panel.setVisible(false);
        panel.removeAll();

        question = questions.get(new Random().nextInt(questions.size()));

        JPanel hud = new JPanel();
        hud.setLayout(new GridLayout(0, 2));
        hud.setBackground(Colors.backgroundColor);
        hud.setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));
        currentPlayerName.setText(Main.players.get(0).getName());
        hud.add(currentPlayerName);
        Player secondPlayer = Main.players.get(1);
        if (secondPlayer != null) {
            twoPlayerName.setText(secondPlayer.getName());
            hud.add(twoPlayerName);
        }

        title.setText(question.getQuestion());
        panel.add(hud);
        panel.add(title);

        List<String> answers = question.getAnswers();
        for (int i = 0; i < answers.size(); i++) {
            String currentAnswer = answers.get(i);
            JButton button = new JButton(currentAnswer);
            button.addActionListener(e -> {
                if (Objects.equals(currentAnswer, question.getRightAnswer())) {
                    button.setForeground(Color.green);
                } else {
                    button.setForeground(Color.red);
                }
            });
            panel.add(button);
        }
        panel.setVisible(true);

        JButton passButton = new JButton("No se, paso");
        passButton.addActionListener(e -> {
            getQuestion();
        });
        panel.add(passButton);
    }
}
