package Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Kakao_Stop {
    public static void main(String[] args) {
        Solution14 sol = new Solution14();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi frodo", "muzi neo","apeach muzi"};
        int k = 2;
        sol.solution(id_list, report, k);
    }
}

class Solution14 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        report = deduplication(report);
        HashMap<String, Integer> grade = make_grade(id_list);
        // HashMap<String, String> declaration_list = 
        return answer;
    }

    public String[] deduplication(String[] report) {
        LinkedHashSet<String> linkedhashset = new LinkedHashSet<>(Arrays.asList(report));
        String[] return_report = linkedhashset.toArray(new String[0]);

        return return_report;
    }

    public HashMap<String, Integer> make_grade(String[] id_list) {
        HashMap<String, Integer> grade = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            grade.put(id_list[i], 0);
        }
        return grade;
    }

    public HashMap<String, String> make_declaration_list(String[] report) {
        HashMap<String, String> declaration_list = new HashMap<>();
        for (int i = 0; i < report.length; i++) {
            if(report[i].contains("\\s")){
                String[] arr = report[i].split("\\s");
                declaration_list.put(arr[0], arr[1]);
            }
        }
        return declaration_list;
    }
}
