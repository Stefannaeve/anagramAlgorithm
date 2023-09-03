import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();
        List<String> list = new ArrayList<String>();

        list.add("Erling Jevne");
        list.add("Peter Tom");
        list.add("Linjedommervas");
        list.add("Trompete");
        list.add("Jeg vil renne");
        list.add("Mons Ivar Mjelde");

        algorithm.getList(list);
    }
}
