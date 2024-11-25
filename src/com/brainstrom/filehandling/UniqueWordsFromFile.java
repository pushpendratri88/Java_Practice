package com.brainstrom.filehandling;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UniqueWordsFromFile {
    public static void main(String[] args) {
        System.out.println(uniqueString());
    }

    private static String uniqueString(){
        String filePath = "C:\\Backup\\work\\Learning_Development\\Interview_Stuff\\Hybris_Interview_Questions.txt";
        String newString = "";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while( (line = br.readLine()) != null){
                String[] stringArray = line.split(" ");
                for(String string : stringArray){
                    boolean writing = true;
                    Map<Character,Integer> map = new HashMap();
                    char[] charArray = string.toCharArray();
                    for (char ch : charArray){
                        map.put(ch,map.getOrDefault(ch,0)+1);
                    }
                    for(Map.Entry<Character,Integer> entry : map.entrySet()){
                        if(entry.getValue() > 1){
                            writing = false;
                        }
                    }
                    if(writing){
                        newString = newString +" "+ string;
                    }
                }
                newString = newString +"\n";
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return newString;
    }
}
