package mvcproject_chatbot;
import java.io.FileNotFoundException;
public class ChatBotController {
    
    String input;
    String output;
    
    IOFormat io= new IOFormat();
    
    public ChatBotController() throws FileNotFoundException{
        ChatBotViewer cbv = new ChatBotViewer(this);
        ChatBotModel cbm = new ChatBotModel(input);
        this.output = cbm.getResponses();
        this.input = cbv.getInput();
        cbv.setVisible(true);
    }
    
    public String getInput(){
        return this.input;
    }
    public String getOutput() throws FileNotFoundException{
        return io.format(new ChatBotModel(input).getResponses());
    }
}
