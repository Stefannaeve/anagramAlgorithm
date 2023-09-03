import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Algorithm {

    HashMap<String, String> hashMap = new HashMap<>();
    public void sorting(String string){
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
        System.out.println(sortedString);
            hashMap.put(sortedString, string);
    }
    public void getList(List<String> unsortedList){

        for (String s : unsortedList) {
            sorting(s);
        }
        System.out.println(" ");
        for (String key : hashMap.keySet()) {
            System.out.print(hashMap.get(key) + " = ");
            System.out.println(key);
        }
    }
}
