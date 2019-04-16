package mvcproject_chatbot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.DefaultCaret;

public class ChatBotViewer extends JFrame{
    
    private JTextField userText = new JTextField();
    private JTextArea readArea = new JTextArea();
    
    private String input = null;
    private String output = null;
      
    private ChatBotController cbc;
    
    public ChatBotViewer(ChatBotController cbc) throws FileNotFoundException{
        this.cbc = cbc;
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("MVC Chatbot");
        
        userText.setSize(590,30);
        userText.setLocation(2,540);
        userText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = userText.getText();
                readArea.append("You: " + text + "\n");
                userText.setText("");
                input = text;
                try {
                    respond();
                } catch (FileNotFoundException ex) {
                    System.out.println("File Not Found.");
                }
            }
        });
        
        readArea.setSize(560,510);
        readArea.setLocation(20,5);
        readArea.setEditable(false);
        readArea.setLineWrap(true);
        readArea.setWrapStyleWord(true);
        
        //JScrollPane scroll = new JScrollPane(readArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
               
        this.add(userText);
        this.add(readArea);
        
        
    }
    
    public String getInput(){
        return this.input;
    }
    public void setOutput(String output){
        this.output = output;
    }
    
    public void refreshOutput() throws FileNotFoundException{
        this.output = cbc.getOutput();
    }
    public void respond() throws FileNotFoundException{
        refreshOutput();
        readArea.append("AI: " + this.output + "\n");
    }
}