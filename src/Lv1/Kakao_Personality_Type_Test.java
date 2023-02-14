package Lv1;

import java.util.HashMap;

public class Kakao_Personality_Type_Test {
    public static void main(String[] args) {
        
    }
}

class Solution18 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Integer, Integer> grade = make_grade();
        HashMap<String, Integer> total_grade = make_total_grade();

        for (int i = 0; i < survey.length; i++) {
            if(choices[i] < 4){
                String survey_english = survey[i].substring(0, 1);
                int plus_num = total_grade.get(survey_english) + grade.get(choices[i]);
                total_grade.replace(survey_english, plus_num);
            }else if(choices[i] > 4){
                String survey_english = survey[i].substring(1);
                int plus_num = total_grade.get(survey_english) + grade.get(choices[i]);
                total_grade.replace(survey_english, plus_num);
            }
        }

        answer = result(total_grade);

        return answer;
    }

    public String result(HashMap<String, Integer> total_grade) {
        String answer = "";
        if(total_grade.get("R") > total_grade.get("T")){
            answer += "R";
        }else if(total_grade.get("R") < total_grade.get("T")){
            answer += "T";
        }else if(total_grade.get("R") == total_grade.get("T")){
            answer += "R";
        }
        if(total_grade.get("C") > total_grade.get("F")){
            answer += "C";
        }else if(total_grade.get("C") < total_grade.get("F")){
            answer += "F";
        }else if(total_grade.get("C") == total_grade.get("F")){
            answer += "C";
        }
        if(total_grade.get("J") > total_grade.get("M")){
            answer += "J";
        }else if(total_grade.get("J") < total_grade.get("M")){
            answer += "M";
        }else if(total_grade.get("J") == total_grade.get("M")){
            answer += "J";
        }
        if(total_grade.get("A") > total_grade.get("N")){
            answer += "A";
        }else if(total_grade.get("A") < total_grade.get("N")){
            answer += "N";
        }else if(total_grade.get("A") == total_grade.get("N")){
            answer += "A";
        }
        
        return answer;
    }

    public HashMap<Integer, Integer> make_grade(){
        HashMap<Integer, Integer> grade = new HashMap<Integer, Integer>();
        grade.put(1, 3);
        grade.put(2, 2);
        grade.put(3, 1);
        grade.put(4, 0);
        grade.put(5, 1);
        grade.put(6, 2);
        grade.put(7, 3);
        return grade;
    }

    public HashMap<String, Integer> make_total_grade(){
        HashMap<String, Integer> total_grade = new HashMap<String, Integer>();
        total_grade.put("R", 0);
        total_grade.put("T", 0);
        total_grade.put("C", 0);
        total_grade.put("F", 0);
        total_grade.put("J", 0);
        total_grade.put("M", 0);
        total_grade.put("A", 0);
        total_grade.put("N", 0);
        return total_grade;
    }

}
