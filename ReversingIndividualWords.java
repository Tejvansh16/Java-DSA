import java.util.*;
public class ReversingIndividualWords {
		static void revWords(String str){
        
        String s = "";
        for(int i = 0; i < str.length(); ++i){ 
            if(str.charAt(i) != ' '){ 
                s = str.charAt(i)+s;
            }
       
            else{ 
                System.out.print(s+" ");
                s = "";
            } 
        } 
       
        System.out.print(s); 
    } 
	public static void main(String[] args) 
	{
		String s = "TutorialCup - changing the way of learning";
        revWords(s);
		
	}	
}
