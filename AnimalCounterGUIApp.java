import javax.swing.*;

public class AnimalCounterGUIApp {

    public static void main(String[] args) {
        // Make an instance of AnimalCounterGUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                AnimalCounterGUI gui = new AnimalCounterGUI();
                gui.displayWelcomeMessage();
                gui.initializeCounts();
                gui.setVisible(true);
            }
        });
    }
}
