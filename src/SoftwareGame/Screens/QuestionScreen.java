/**
* Clase con las pantallas de preguntas
*En: Nov 12 de 2022
*@autor: Luis Miguel Álvarez, Cristian Mesa
*@documentador: Fabián Melo, Andres Mauricio Silva
*@QA: Martha Mera, Luz Molina
*/

package SoftwareGame.Screens;
/**
 * Pertenece al paquete de Screens que incluye las pantallas del juego
 */


import SoftwareGame.Constants.Colors;
import SoftwareGame.Data.Data;
import SoftwareGame.Factory.ComponentFactory;
import SoftwareGame.Main;
import SoftwareGame.Models.Player;
import SoftwareGame.Models.Question;

/**
 * Usa las librerías propias del juego
 */


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * Usa las librerías de Java para manejo de interfaces gráficas
 */

public class QuestionScreen {  //clase para crear os elementos de la pantalla de pregunta
    static JPanel panel = new JPanel(); //Contenedor de objetos de interfaz gráfica
    static JLabel title = ComponentFactory.getTitle(null); 
    static JLabel currentPlayerName = ComponentFactory.getSubTitle(null);
    static JLabel twoPlayerName = ComponentFactory.getDescription(null);
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
