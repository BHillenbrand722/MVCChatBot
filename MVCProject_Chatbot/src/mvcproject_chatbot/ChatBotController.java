package mvcproject_chatbot;
import java.io.FileNotFoundException;
public class ChatBotController {
    
    private String input;
    private String output;
    
    private IOFormat io= new IOFormat();
    private ChatBotModel cbm;
    
    public ChatBotController() throws FileNotFoundException{
        ChatBotViewer cbv = new ChatBotViewer(this);
        this.input = cbv.getInput();
        
        cbm = new ChatBotModel(input);
        cbm.loadResponses();
        this.output = cbm.getResponse();
                
        cbv.setOutput(this.output);
    }
    
    public String getInput(){
        return this.input;
    }
    public String getOutput() throws FileNotFoundException{
        this.output = cbm.getResponse();
        return io.format(this.output);
    }
}
