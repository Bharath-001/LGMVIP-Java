import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        ScientificCalculator scientificCalculator = new ScientificCalculator();

        scientificCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scientificCalculator.setSize(700, 500);
        scientificCalculator.setVisible(true);

    }
}
