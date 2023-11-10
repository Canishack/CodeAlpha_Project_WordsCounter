import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class wordscounter {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Word Counter App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            
            JPanel panel = new JPanel();
            JLabel titleLabel = new JLabel("Word Counter");
            JTextArea textArea = new JTextArea(10, 30);
            JButton countButton = new JButton("Count Words");
            JLabel resultLabel = new JLabel("Word Count: 0");

            countButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = textArea.getText();
                    String[] words = text.split("\\s+"); 
                    int wordCount = words.length;
                    resultLabel.setText("Word Count: " + wordCount);
                }
            });
            panel.add(titleLabel);
            panel.add(textArea);
            panel.add(countButton);
            panel.add(resultLabel);

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
