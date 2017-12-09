import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MenuSystemConstructor extends JPanel implements ActionListener {

    JButton exitButton, openButton, saveButton;
    JTextArea log;
    JFileChooser fileChooser;
    BufferedReader br;

    public MenuSystemConstructor () {
        super(new BorderLayout());

        log = new JTextArea(10,20);
        log.setEditable(false);
        log.setMargin(new Insets(5,5,5,5));
        JScrollPane logScrollPane = new JScrollPane(log);

        fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        // create buttons

        openButton = new JButton("Open");
        openButton.addActionListener(this);

        saveButton = new JButton("Save");
        saveButton.addActionListener(this);

        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(openButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(exitButton);

        // place layout
        add(buttonPanel, BorderLayout.PAGE_START);
        add(logScrollPane, BorderLayout.CENTER);

    }

    public List fileReader (File filePath) throws IOException {
        br = new BufferedReader(new FileReader(filePath));
        String line;
        List<String> readFile = new ArrayList<>();
        while ((line=br.readLine()) != null ) {
            String[] temp =line.split(";");
            for (String string : temp) {
                readFile.add(string);
            }
            readFile.add("\n");
        }
        br.close();
        return readFile;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if ( actionEvent.getSource() == openButton ) {
            int returnVal = fileChooser.showOpenDialog(MenuSystemConstructor.this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();

                try {
                    List<String> inputString = fileReader(file);
                    for (String string : inputString) {
                        log.append(string);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                log.append("Opening: " + file.getName() + "." + "\n");
            } else {
                log.append("Open cancelled " + "\n");
            }
            log.setCaretPosition(log.getDocument().getLength());

        } else if (actionEvent.getSource() == saveButton) {
            int returnVal = fileChooser.showSaveDialog(MenuSystemConstructor.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();





                log.append("Saved to " + file.getName() + "." + "\n");
            } else {
                log.append("Save command cancelled by user." + "\n");
            }
            log.setCaretPosition(log.getDocument().getLength());

        } else if (actionEvent.getSource() == exitButton) {
            log.append("Window closing.");
            System.exit(0);
        }
    }

    public static void createDisplay(){
        JFrame frame = new JFrame("File editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new MenuSystemConstructor());

        frame.pack();
        frame.setVisible(true);
    }

}
