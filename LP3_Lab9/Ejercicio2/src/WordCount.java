import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WordCount {
  public static void main(String[] args) {
      try {
          File file = new File("src/lear.txt");
          Scanner scanner = new Scanner(file);

          int lineCount = 0;
          int wordCount = 0;
          int charCount = 0;

          while (scanner.hasNextLine()) {
              String line = scanner.nextLine();

              lineCount++;

              String[] words = line.split("\\s+");
              wordCount += words.length;

              charCount += line.length();
          }

          JFrame frame = new JFrame("Word Count");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(400, 300);
          frame.setLayout(null);

          JLabel label1 = new JLabel("File: " + file.getName());
          label1.setBounds(10, 10, 300, 20);
          frame.add(label1);

          JLabel label2 = new JLabel("Lines: " + lineCount);
          label2.setBounds(10, 30, 300, 20);
          frame.add(label2);

          JLabel label3 = new JLabel("Words: " + wordCount);
          label3.setBounds(10, 50, 300, 20);
          frame.add(label3);

          JLabel label4 = new JLabel("Chars: " + charCount);
          label4.setBounds(10, 70, 300, 20);
          frame.add(label4);

          frame.setVisible(true);

          scanner.close();
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      }
  }
}

