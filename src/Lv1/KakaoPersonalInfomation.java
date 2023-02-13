package Lv1;

import java.util.ArrayList;

public class KakaoPersonalInfomation {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(sol.solution4(today, terms, privacies));
    }
}

class Solution4 {
    public ArrayList<Integer> solution4(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int day_num = day(today);
        ArrayList<String[]> terms_list = terms_data(terms);
        ArrayList<String[]> privacies_list = privacies_data(privacies);
        for (int i = 0; i < privacies_list.size(); i++) {
            for (int j = 0; j < terms_list.size(); j++) {
                if(privacies_list.get(i)[1].equals(terms_list.get(j)[0])) {
                    System.out.println(day_num);
                    System.out.println(Integer.parseInt(terms_list.get(j)[1]) + Integer.parseInt(privacies_list.get(i)[0]));
                    if(day_num >= Integer.parseInt(terms_list.get(j)[1]) + Integer.parseInt(privacies_list.get(i)[0])) {
                        answer.add(i+1);
                    }
                }
            }
        }
        return answer;
    }

    public int day(String today) {
        String[] day_list = today.split("\\.");
        int day = Integer.parseInt(day_list[0]) * 12 * 28 + Integer.parseInt(day_list[1]) * 28 +  Integer.parseInt(day_list[2]);
        return day;
    }

    public ArrayList<String[]> terms_data(String[] terms) {
        ArrayList<String[]> terms_list = new ArrayList<String[]>();
        for (int i = 0; i < terms.length; i++) {
            String[] value_list = new String[2];
            value_list = terms[i].split("\\s");
            value_list[1] = Integer.toString(Integer.parseInt(value_list[1]) * 28);
            terms_list.add(value_list);
        }
        return terms_list;
    }

    public ArrayList<String[]> privacies_data(String[] privacies) {
        ArrayList<String[]> privacies_list = new ArrayList<String[]>();
        for (int i = 0; i < privacies.length; i++) {
            String[] value_list = new String[2];
            value_list = privacies[i].split("\\s");
            String[] value_list2 = new String[3];
            value_list2 = value_list[0].split("\\.");
            value_list[0] = Integer.toString(Integer.parseInt(value_list2[0]) * 12 * 28 + 
            Integer.parseInt(value_list2[1]) * 28 + Integer.parseInt(value_list2[2]));
            privacies_list.add(value_list);
        }
        return privacies_list;
    }
}
