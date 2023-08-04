/**
 * Name: Jue Wu
 * Date: 04/20/2023
 * Assignment2 - BinaryKnitting View class
 * */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BinaryKnittingView extends JFrame {
    private final JTextField textField;
    private final JTextArea textArea;
    private final JTextArea knitArea;
    private final JButton button;

    public BinaryKnittingView() {
        setTitle("BinaryKnitting");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Please enter the text you want to encrypt below:");
        textField = new JTextField(30);
        button = new JButton("Start knitting");
        textArea = new JTextArea(10, 150);
        textArea.setEditable(false);
//        textArea.setLineWrap(true);
        textArea.getPreferredScrollableViewportSize();
        knitArea = new JTextArea(10, 150);
        knitArea.setEditable(false);
//        knitArea.setLineWrap(true);
        knitArea.getPreferredScrollableViewportSize();


        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        add(panel, BorderLayout.NORTH);


        JPanel patternPanel = new JPanel(new BorderLayout());
        patternPanel.setPreferredSize(new Dimension(100, 150));
        JScrollPane patternScrollPane = new JScrollPane(knitArea);
        patternScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        patternScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        patternScrollPane.getVerticalScrollBar().setValue(0);
        patternPanel.add(new JLabel("Knit Pattern:"), BorderLayout.NORTH);
        patternPanel.add(patternScrollPane, BorderLayout.CENTER);
        add(patternPanel, BorderLayout.CENTER);
//        patternScrollPane.getVerticalScrollBar().setValue(patternScrollPane.getVerticalScrollBar().getMaximum());



        JPanel binaryPanel = new JPanel(new BorderLayout());
        binaryPanel.setPreferredSize(new Dimension(100, 150));
        JScrollPane binaryScrollPane = new JScrollPane(textArea);
        binaryScrollPane.getVerticalScrollBar().setValue(0);
        binaryPanel.add(new JLabel("Binary Message:"), BorderLayout.NORTH);
        binaryPanel.add(binaryScrollPane, BorderLayout.CENTER);
        add(binaryPanel, BorderLayout.SOUTH);
//        binaryScrollPane.getVerticalScrollBar().setValue(patternScrollPane.getVerticalScrollBar().getMaximum());

        pack();
        setVisible(true);
    }

    public String getMessage() {
        return textField.getText();
    }

    public void setBinaryMessage(String binaryMessage) {
        textArea.setText(binaryMessage);

    }

    public void setKnitPattern(String knitPattern, String binaryMessage) {
        String knitPatternStr = String.join(", ", knitPattern);
        knitArea.setText(knitPatternStr + "\n\n" + BinaryKnittingModel.pattern(binaryMessage));

    }

    public void addButtonListener(ActionListener listener) {
        button.addActionListener(listener);
    }
}
