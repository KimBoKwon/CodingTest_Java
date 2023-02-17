package Lv2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class VowelDictionary {
    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        sol.solution("I");
    }
}

class Solution11 {
    static char[] alphabet= {'A','E','I','O','U'};
    static ArrayList<String> list;
    
    public int solution(String word) {
        list= new ArrayList<>();
        int answer = 0;
        
        combination(0, "");
        System.out.println(Arrays.deepToString(list.toArray()));
        Collections.sort(list);
        answer= list.indexOf(word)+1;
        
        return answer;
    }
    
    public void combination(int index, String str){
        if(index>=5) return;
        for(int i=0; i<alphabet.length; i++){
            list.add(str+alphabet[i]);
            combination(index+1, str+alphabet[i]);
        }
    }//comb
}