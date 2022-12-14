package week1.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CaloryCalculator {

    public int OneMostCalories(File file) throws FileNotFoundException {
        List<Integer> list = fileToList(file);
        return Collections.max(list);
    }

    private static List<Integer> fileToList(File file) throws FileNotFoundException {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            var temp = sc.nextLine();
            if(temp.isBlank()){
                list.add(sum);
                sum = 0;
            } else {
                sum += Integer.parseInt(temp);
            }
        }
        sc.close();
        return list;
    }

    public int ThreeMostCalories(File file) throws FileNotFoundException {
        List<Integer> list = fileToList(file);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += Collections.max(list);
            list.remove(Collections.max(list));
        }
        return sum;
    }
}
