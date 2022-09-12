import java.util.List;
import java.util.LinkedList;
class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        List valueS = checkString(s);
        List valueT = checkString(t);
        
        if (valueS.size() != valueT.size())
            return false;
        
        return valueS.equals(valueT);
        
    }
    
    public List checkString(String str) {
        LinkedList<Character> list = new LinkedList<>();

        
        for (int i = 0; i < str.length(); i ++) {
            Character temp = str.charAt(i);
            
            if (temp != '#') {
                list.add(temp);
            } 
            else {
                if (!list.isEmpty()) {
                    list.removeLast();
                }
            }
        }
        
        return list;
    }
}