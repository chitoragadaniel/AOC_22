package week1.day1;


import java.io.File;
import java.io.FileNotFoundException;

public class CaloryCalculatorRun {
    public static void main(String[] args) throws FileNotFoundException {
        // System.out.println(new CaloryCalculator().OneMostCalories(new File("C:\\Users\\User\\Desktop\\TCS\\AOC\\_22\\src\\week1\\day1\\ListOfCalories.txt")));
        System.out.println(new CaloryCalculator().ThreeMostCalories(new File("C:\\Users\\User\\Desktop\\TCS\\AOC\\_22\\src\\week1\\day1\\ListOfCalories.txt")));
    }
}
