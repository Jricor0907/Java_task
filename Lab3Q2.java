import java.util.ArrayList;
import java.util.Random;

public class Lab3Q2 {
    static ArrayList<Integer> listNames = new ArrayList<>();
    static ArrayList<Integer> listNamesClone = new ArrayList<>();

    public static void main(String[] args) {
        Random rondom = new Random();
        for (int i = 0; i < 10; i++) {
            int iValue = rondom.nextInt(50);
            listNames.add(iValue);
        }
        listNamesClone = (ArrayList<Integer>) listNames.clone();
        Lab3Q2 show = new Lab3Q2();
        show.changeNum(9, -5);
        show.displayList(listNames);
        System.out.println("------------");
        show.displayList(listNamesClone);
    }

    void displayList(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    void changeNum(int position, Integer newNum) {
        listNames.set(position, newNum);
    }
}