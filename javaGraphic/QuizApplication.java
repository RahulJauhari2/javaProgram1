import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizApplication {

    private JFrame frame;
    private JPanel panel;
    private JLabel questionLabel;
    private JRadioButton option1, option2, option3, option4;
    private ButtonGroup optionsGroup;
    private JButton nextButton, submitButton;
    private int currentQuestion = 0;
    private int score = 0;

    private String[] questions = {
        "Question 1?",
        "Question 2?",
        "Question 3?"
    };
    private String[][] options = {
        {"Option 1", "Option 2", "Option 3", "Option 4"},
        {"Option 1", "Option 2", "Option 3", "Option 4"},
        {"Option 1", "Option 2", "Option 3", "Option 4"}
    };
    private String[] answers = {"Option 1", "Option 2", "Option 3"};

    public QuizApplication() {
        frame = new JFrame("Quiz Application");
        panel = new JPanel();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);

        questionLabel = new JLabel();
        questionLabel.setBounds(10, 20, 380, 25);
        panel.add(questionLabel);

        option1 = new JRadioButton();
        option1.setBounds(10, 50, 380, 25);
        panel.add(option1);

        option2 = new JRadioButton();
        option2.setBounds(10, 80, 380, 25);
        panel.add(option2);

        option3 = new JRadioButton();
        option3.setBounds(10, 110, 380, 25);
        panel.add(option3);

        option4 = new JRadioButton();
        option4.setBounds(10, 140, 380, 25);
        panel.add(option4);

        optionsGroup = new ButtonGroup();
        optionsGroup.add(option1);
        optionsGroup.add(option2);
        optionsGroup.add(option3);
        optionsGroup.add(option4);

        nextButton = new JButton("Next");
        nextButton.setBounds(50, 200, 100, 25);
        panel.add(nextButton);

        submitButton = new JButton("Submit");
        submitButton.setBounds(200, 200, 100, 25);
        panel.add(submitButton);

        frame.add(panel);
        frame.setVisible(true);

        displayQuestion();

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentQuestion++;
                displayQuestion();
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
                JOptionPane.showMessageDialog(frame, "Your score is: " + score);
            }
        });
    }

    private void displayQuestion() {
        if (currentQuestion < questions.length) {
            questionLabel.setText(questions[currentQuestion]);
            option1.setText(options[currentQuestion][0]);
            option2.setText(options[currentQuestion][1]);
            option3.setText(options[currentQuestion][2]);
            option4.setText(options[currentQuestion][3]);
        }
    }

    private void checkAnswer() {
        String selectedOption = null;
        if (option1.isSelected()) {
            selectedOption = option1.getText();
        } else if (option2.isSelected()) {
            selectedOption = option2.getText();
        } else if (option3.isSelected()) {
            selectedOption = option3.getText();
        } else if (option4.isSelected()) {
            selectedOption = option4.getText();
        }

        if (selectedOption != null && selectedOption.equals(answers[currentQuestion])) {
            score++;
        }
    }

    public static void main(String[] args) {
        new QuizApplication();
    }
}
