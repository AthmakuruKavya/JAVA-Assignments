package String;
import java.util.HashMap;

public class UniqueChar {

    //387. First Unique Character in a String
    public static void main(String[] args) {
        String str = "loveleetcode";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int val = map.get(ch);
            if(val == 1){
                System.out.println(str.indexOf(ch));
                break;
            }
        }
    }
}
