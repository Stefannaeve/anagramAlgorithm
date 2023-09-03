import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Algorithm {

    HashMap<String, String> hashMap = new HashMap<String, String>();
    public void sorting(String string){
            String temp = string;
            char[] sortArray = temp.toLowerCase().toCharArray();
            Arrays.sort(sortArray);
            ArrayList<Character> tempArray = new ArrayList<>();
        for (int i = 0; i < sortArray.length; i++) {
            if (sortArray[i] != ' '){
            tempArray.add(sortArray[i]);
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

        for (int i = 0; i < unsortedList.size(); i++) {
            sorting(unsortedList.get(i));
        }
        System.out.println(" ");
        for (String key : hashMap.keySet()) {
            System.out.print(hashMap.get(key) + " = ");
            System.out.println(key);
        }
    }
    public void sortHashmap(){

    }
    public boolean abc(){
        return true;
    }
}
