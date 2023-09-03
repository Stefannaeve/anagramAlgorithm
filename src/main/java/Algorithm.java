import java.util.*;

public class Algorithm {

    HashMap<String, String> hashMap = new HashMap<>();

    public void sorting(String string) {
        char[] sortArray = string.toLowerCase().toCharArray();
        Arrays.sort(sortArray);
        ArrayList<Character> tempArray = new ArrayList<>();
        for (char cha : sortArray) {
            if (cha != ' ') {
                tempArray.add(cha);
            }
        }
        char[] sortedArray = new char[tempArray.size()];
        for (int i = 0; i < tempArray.size(); i++) {
            sortedArray[i] = tempArray.get(i);
        }
        String sortedString = new String(sortedArray);
        hashMap.put(string, sortedString);
    }

    public void getList(List<String> unsortedList) {

        for (String s : unsortedList) {
            sorting(s);
        }
        findAnagrams();
    }

    public void findAnagrams() {
        HashMap<String, List<String>> anagramHashMap = new HashMap<>();
        for (String i : hashMap.keySet()) {
            List<String> anagramList = new ArrayList<>();
            String valueI = hashMap.get(i);
            for (String j : hashMap.keySet()) {
                String valueJ = hashMap.get(j);
                if (!Objects.equals(i, j) && Objects.equals(valueI, valueJ)) {
                    anagramList.add(j);
                }
            }
            anagramHashMap.put(i, anagramList);
        }
        for (String key : anagramHashMap.keySet()) {
            System.out.println(key + " = " + anagramHashMap.get(key));
        }
    }
}
