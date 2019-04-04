package mvcproject_chatbot;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.Random;

public class ChatBotModel {
    
    ArrayList<String> tempResponses = new ArrayList();
    String input;
    String output;
    
    public ChatBotModel(String input){
        this.input = input;
    }
    
    public String getResponses() throws FileNotFoundException{
        String path = System.getProperty("user.dir");
        System.out.println(path + "/output");
        File file = new File(path + "/output");
        Scanner sc = new Scanner(file);
        Random rand = new Random();
        for(int i = -1; i < rand.nextInt(12); i++){
            output = sc.nextLine();
        }
        return output;
    }
    
    public static String choose(File file) throws FileNotFoundException{
        String result = null;
        Random rand = new Random(0);
        int n = 0;
        for(Scanner sc = new Scanner(file); sc.hasNext();){
            ++n;
            String line = sc.nextLine();
            if(rand.nextInt(n) == 0){
                result = line;
            }
        }
        return result;
    }
    
    
    
}
