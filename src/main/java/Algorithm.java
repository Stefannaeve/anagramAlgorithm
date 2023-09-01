import java.util.Arrays;

public class Algorithm {
    public void sorting(String string){
        char[] sortArray = string.toLowerCase().toCharArray();
        int size = sortArray.length;
        Arrays.sort(sortArray);
        String sortedString = Arrays.toString(sortArray);
        System.out.println(sortedString);
    }
    public boolean abc(){
        return true;
    }
}
