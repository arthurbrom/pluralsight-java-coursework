package settingupajavadevelopmentenvironment.sectionthree;

import javax.swing.*;
import java.awt.*;

/**
 * This can be created into a JAR file by going into Terminal/Commandline and going to the file and calling
 * jar cvf TitlecaseConverter.jar
 * $ java -jar TitlecaseConverter.jar
 * no main mainifest attribute, in TItlecaseConverter.jar
 *
 * jar cvmf TC-MANIFEST.MF TitlecaseConverter.jar
 * $ java -jar TitlecaseConverter.jar
 *
 * Creating a jar file within IntelliJ.
 *  Go to File > Project Structure
 *  Project Settings > Artifacts
 *  Click on the + sign > JAR > From dependencies...
 *  Select the module, it’s MAIN class and select OK
 *  JAR should be available after running the MANIFEST.MF through:
 *      {projectName}/out/artifacts/location of the JAR
 */

public class Main {
    public static void main(String... args){
        JFrame application = createGUI();
        application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        application.setVisible(true);
    }

    private static JFrame createGUI() {
        JTextField input = new JTextField();
        input.setPreferredSize(new Dimension(300, 40));

        JButton convertButton = new JButton("Convert");

        JLabel output = new JLabel();
        output.setPreferredSize(new Dimension(300, 40));

        convertButton.addActionListener(event -> {
            output.setText(TitlecaseConverter.convertToTitleCase(input.getText()));
        });

        JFrame gui = new JFrame("Title case converter");
        gui.setLayout(new FlowLayout());
        gui.add(input);
        gui.add(convertButton);
        gui.add(output);
        gui.pack();
        gui.setLocationRelativeTo(null); // Centering the screen

        return gui;
    }
}
