package mvcproject_chatbot;

import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatBotViewer extends JFrame{
    
    private JTextArea userInput = new JTextArea(2,56);
    private JEditorPane messageOutput = new JEditorPane();
    String input = "";
    String output = "";
    private JPanel chat;
    private JPanel userIn;
    private JPanel buttonPanel;
    private final ChatBotController cbc;
    
    public ChatBotViewer(ChatBotController cbc) throws FileNotFoundException{
       this.cbc = cbc;
       initialize();
       setFieldView();
        
    }
    
    private void initialize() throws FileNotFoundException{
        setTitle("Chat Bot");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

        chat = new JPanel();
        chat.add(new JLabel("Message History"));
        messageOutput.setPreferredSize(new Dimension(700,500));
        messageOutput.setEditable(false);
        chat.add(messageOutput);
        
        userIn = new JPanel();
        userIn.add(new JLabel("User Input"));
        userIn.add(userInput);
        
        buttonPanel = new JPanel(new BorderLayout());
        JButton enterButton = new JButton("Enter");
        enterButton.addActionListener(event -> {
            try {
                update(userInput.getText());
            } catch (FileNotFoundException ex) {
                System.out.println("File Not Found");
            }
        });
        buttonPanel.add(enterButton);
        
        setContentPane(new JPanel(new BorderLayout()));
        getContentPane().add(chat, BorderLayout.PAGE_START);
        getContentPane().add(userIn,BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
        
        
    }
    public void update(String input) throws FileNotFoundException{
        this.input = input;
        this.output = cbc.getOutput();
        setFieldView();
    }
    public String getInput(){
        return this.input;
    }
    private void setFieldView(){
        if(messageOutput.equals("")){
            messageOutput.setText(input + "\n" + output);
        }
        else{
            messageOutput.setText(messageOutput.getText() + "\n" + input + "\n" +output);
        }      
        userInput.setText("");
    }
}
