import java.util.LinkedHashMap;
import java.util.Map;
public class Each_Char_Count {
    public static void main(String[] args){
        String name = "welcome";
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>(); //creates a map to store character count
        for(int i=0; i<name.length(); i++){  //loop through each character
            char ch = name.charAt(i);       //extract one character at a time
            if(map.containsKey(ch)){    //Checks: Is this character already in the map?
                map.put(ch, map.get(ch)+1);  //If character already exists, update the count
            }else{
                map.put(ch, 1);             //if character does not exist, then put 1
            }
        }
        System.out.println(map);
    }
}



