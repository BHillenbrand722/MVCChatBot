package mvcproject_chatbot;
import java.util.Random;
import java.util.Arrays;
public final class IOFormat {
    
    Random rand = new Random();
    Character[] punctuation = {'.','!','?'};
    
    public IOFormat(){}
    
    public String format(String io){
        if(Character.isLowerCase(io.charAt(0))){
            Character.toUpperCase(io.charAt(0));
        }
        if(!(io.endsWith(".")) && !(io.endsWith("!")) && !(io.endsWith("?"))){
            io += punctuation[rand.nextInt(3)];
        }
        return io;
    }
}
