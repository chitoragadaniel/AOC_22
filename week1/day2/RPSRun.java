package week1.day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class RPSRun {
    public static void main(String[] args) throws FileNotFoundException {
        RPSRules rules = new RPSRules();
        File file = new File("C:\\Users\\User\\Desktop\\TCS\\AOC\\_22\\src\\week1\\day2\\ChoicesMade.txt");
        List<String[]> list = rules.getShapeList(file);
        //System.out.println(rules.getGameScoreP1(rules.decryptShapeListP1(list)));
        System.out.println(rules.getGameScoreP2(rules.decryptShapeListP2(list)));
    }
}
