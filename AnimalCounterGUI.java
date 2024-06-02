import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimalCounterGUI {
    private JFrame frame;
    private JLabel alligatorCountLabel;
    private JLabel sheepCountLabel;
    private Alligator alligator;
    private Sheep sheep;

    public AnimalCounterGUI() {
        alligator = new Alligator();
        sheep = new Sheep();

        frame = new JFrame("Animal Counter");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel welcomeLabel = new JLabel("Welcome to Animal Counter!");
        welcomeLabel.setBounds(10, 10, 200, 25);
        frame.add(welcomeLabel);

        alligatorCountLabel = new JLabel("Alligator Count: " + alligator.getCount());
        alligatorCountLabel.setBounds(10, 40, 200, 25);
        frame.add(alligatorCountLabel);

        sheepCountLabel = new JLabel("Sheep Count: " + sheep.getCount());
        sheepCountLabel.setBounds(10, 70, 200, 25);
        frame.add(sheepCountLabel);

        JButton addAlligatorButton = new JButton("Add Alligator");
        addAlligatorButton.setBounds(10, 100, 150, 25);
        addAlligatorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                alligator.incrementCount();
                updateLabels();
            }
        });
        frame.add(addAlligatorButton);

        JButton addSheepButton = new JButton("Add Sheep");
        addSheepButton.setBounds(10, 130, 150, 25);
        addSheepButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sheep.incrementCount();
                updateLabels();
            }
        });
        frame.add(addSheepButton);

        JButton displayCountsButton = new JButton("Display Counts");
        displayCountsButton.setBounds(10, 160, 150, 25);
        displayCountsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Alligator Count: " + alligator.getCount() + "\nSheep Count: " + sheep.getCount());
            }
        });
        frame.add(displayCountsButton);

        JRadioButton alligatorRadioButton = new JRadioButton("Alligator");
        alligatorRadioButton.setBounds(10, 190, 100, 25);
        frame.add(alligatorRadioButton);

        JRadioButton sheepRadioButton = new JRadioButton("Sheep");
        sheepRadioButton.setBounds(110, 190, 100, 25);
        frame.add(sheepRadioButton);

        ButtonGroup group = new ButtonGroup();
        group.add(alligatorRadioButton);
        group.add(sheepRadioButton);

        JButton resetCountsButton = new JButton("Reset Counts");
        resetCountsButton.setBounds(10, 220, 150, 25);
        resetCountsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (alligatorRadioButton.isSelected()) {
                    alligator.resetCount();
                } else if (sheepRadioButton.isSelected()) {
                    sheep.resetCount();
                }
                updateLabels();
            }
        });
        frame.add(resetCountsButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(10, 250, 150, 25);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.add(exitButton);

        frame.setVisible(true);
    }

    private void updateLabels() {
        alligatorCountLabel.setText("Alligator Count: " + alligator.getCount());
        sheepCountLabel.setText("Sheep Count: " + sheep.getCount());
    }

    public static void main(String[] args) {
        new AnimalCounterGUI();
    }
}
