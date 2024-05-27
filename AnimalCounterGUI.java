import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnimalCounterGUI extends JFrame {
    private JLabel welcomeLabel;
    private JLabel alligatorCountLabel;
    private JLabel sheepCountLabel;
    private JButton addAlligatorButton;
    private JButton addSheepButton;
    private JButton displayCountsButton;
    private JButton resetCountsButton;
    private JRadioButton alligatorRadioButton;
    private JRadioButton sheepRadioButton;
    private ButtonGroup radioGroup;
    private JButton exitButton;

    private Alligator alligator;
    private Sheep sheep;

    public AnimalCounterGUI() {
        setTitle("Animal Counter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 1));

        welcomeLabel = new JLabel("Welcome to Animal Counter");
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        add(welcomeLabel);

        alligator = new Alligator();
        sheep = new Sheep();

        alligatorCountLabel = new JLabel("Alligators: " + alligator.getCount());
        alligatorCountLabel.setHorizontalAlignment(JLabel.CENTER);
        add(alligatorCountLabel);

        sheepCountLabel = new JLabel("Sheep: " + sheep.getCount());
        sheepCountLabel.setHorizontalAlignment(JLabel.CENTER);
        add(sheepCountLabel);

        addAlligatorButton = new JButton("Add Alligator");
        addSheepButton = new JButton("Add Sheep (2)");
        displayCountsButton = new JButton("Display Counts");
        resetCountsButton = new JButton("Reset Counts");

        ButtonHandler handler = new ButtonHandler();
        addAlligatorButton.addActionListener(handler);
        addSheepButton.addActionListener(handler);
        displayCountsButton.addActionListener(handler);
        resetCountsButton.addActionListener(handler);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addAlligatorButton);
        buttonPanel.add(addSheepButton);
        buttonPanel.add(displayCountsButton);
        buttonPanel.add(resetCountsButton);
        add(buttonPanel);

        alligatorRadioButton = new JRadioButton("Alligator");
        sheepRadioButton = new JRadioButton("Sheep");
        radioGroup = new ButtonGroup();
        radioGroup.add(alligatorRadioButton);
        radioGroup.add(sheepRadioButton);
        JPanel radioPanel = new JPanel();
        radioPanel.add(alligatorRadioButton);
        radioPanel.add(sheepRadioButton);
        add(radioPanel);

        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);

        setVisible(true);
    }

    public void displayWelcomeMessage() {
        JOptionPane.showMessageDialog(this, "Welcome to Animal Counter App!");
    }

    public void initializeCounts() {
        alligator.resetCount();
        sheep.resetCount();
        updateCountLabels();
    }

    private void updateCountLabels() {
        alligatorCountLabel.setText("Alligators: " + alligator.getCount());
        sheepCountLabel.setText("Sheep: " + sheep.getCount());
    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == addAlligatorButton) {
                alligator.incrementCount();
                updateCountLabels();
            } else if (e.getSource() == addSheepButton) {
                sheep.incrementCount();
                updateCountLabels();
            } else if (e.getSource() == displayCountsButton) {
                JOptionPane.showMessageDialog(AnimalCounterGUI.this,
                        "Alligators: " + alligator.getCount() + "\nSheep: " + sheep.getCount(),
                        "Current Counts", JOptionPane.INFORMATION_MESSAGE);
            } else if (e.getSource() == resetCountsButton) {
                if (alligatorRadioButton.isSelected()) {
                    alligator.resetCount();
                }
                if (sheepRadioButton.isSelected()) {
                    sheep.resetCount();
                }
                updateCountLabels();
            }
        }
    }
}
