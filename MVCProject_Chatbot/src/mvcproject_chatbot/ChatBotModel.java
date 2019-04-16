package mvcproject_chatbot;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.Random;

public class ChatBotModel {
    
    private ArrayList<String> responses = new ArrayList();
    private String input;
    private String output;
    
    public ChatBotModel(String input){
        this.input = input;
    }
    
    public void loadResponses() throws FileNotFoundException{
        String path = System.getProperty("user.dir");
        //System.out.println(path + "/responses");
        File file = new File(path + "/responses");
        System.out.println("Loading...");
        for(Scanner sc = new Scanner(file); sc.hasNext(); ){
           String[] temp = sc.nextLine().split("~"); 
           responses.add(temp[4]);
           
        }
        System.out.println("Loading Complete!");
    }
    
    public String getResponse(){
        Random rand = new Random();
        int pick = rand.nextInt(304713);
        //System.out.println(responses.get(pick) + pick);
        this.output = responses.get(pick);
        return responses.get(pick);
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
