package Lab3;

import java.io.*;
import java.util.Scanner;

public class Exercise5 {
	 public static void main(String args[])throws IOException
     {
                 Scanner scr=new Scanner(System.in);
               
                 File file = new File("C:\\Users\\dell\\Desktop\\test.txt");
                 FileInputStream fileStream = new FileInputStream(file);
                 InputStreamReader input = new InputStreamReader(fileStream);
                 BufferedReader reader = new BufferedReader(input);
                   
                 String line;
                   
                 
                 int countWord = 0;
                 int sentenceCount = 0;
                 int characterCount = 0;
                 
                   
                
                 while((line = reader.readLine()) != null)
                 {
                    
                         characterCount += line.length();
                           
                         
                         String[] wordList = line.split("\\s+");
                           
                         countWord += wordList.length;
                        
                           
                        
                         String[] sentenceList = line.split("[!?.:]+");
                           
                         sentenceCount += sentenceList.length;
                     
                 }
                   
                 System.out.println("Total word count = " + countWord);
                 System.out.println("Total number of lines = " + sentenceCount);
                 System.out.println("Total number of characters = " + characterCount);
                 
                scr.close();
                reader.close();


     }
}
