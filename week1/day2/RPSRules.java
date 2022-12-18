package week1.day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RPSRules {

    public List<String[]> getShapeList(File file) throws FileNotFoundException {
        List<String[]> list = new ArrayList<>();
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
        String line = sc.nextLine();
        list.add(line.split("\\s"));
        }
        return list;
    }

    public List<String[]> decryptShapeListP1(List<String[]> list) {
        for (String[] i: list) {
            switch (i[0]){
                case "A":
                    i[0] = "Rock";
                    break;
                case "B":
                    i[0] = "Paper";
                    break;
                case "C":
                    i[0] = "Scrissors";
                    break;
            }

            switch (i[1]){
                case "X":
                    i[1] = "Rock";
                    break;
                case "Y":
                    i[1] = "Paper";
                    break;
                case "Z":
                    i[1] = "Scrissors";
                    break;
            }
        }
        return list;
    }

    public List<String[]> decryptShapeListP2(List<String[]> list) {
        for (String[] i: list) {
            switch (i[0]){
                case "A":
                    i[0] = "Rock";
                    break;
                case "B":
                    i[0] = "Paper";
                    break;
                case "C":
                    i[0] = "Scrissors";
                    break;
            }

            switch (i[1]){
                case "X":
                    i[1] = "Lose";
                    break;
                case "Y":
                    i[1] = "Draw";
                    break;
                case "Z":
                    i[1] = "Win";
                    break;
            }
        }
        return list;
    }

    public int getShapeScore(String shape){
        switch (shape){
            case "Rock":
                return 1;
            case "Paper":
                return 2;
            case "Scrissors":
                return 3;
            default:
                return 0;
        }
    }

    public int getRoundScoreP1(String[] shape){
        if (shape[0] == shape[1]){
            return 3;
        } else switch(shape[1]) {
            case "Rock":
                if (shape[0] == "Scrissors"){
                    return 6;
                } else return 0;
            case "Paper":
                if (shape[0] == "Rock"){
                    return 6;
                } else return 0;
            case "Scrissors":
                if (shape[0] == "Paper"){
                    return 6;
                } else return 0;
            default:
                return 0;
        }
    }

    public int getRoundScoreP2(String[] shape){
        if (shape[1] == "Draw"){
            shape[1] = shape[0];
            return 3;
        } else if (shape[1] == "Win") {
            switch(shape[0]) {
                case "Rock":
                    shape[1] = "Paper";
                    break;
                case "Paper":
                    shape[1] = "Scrissors";
                    break;
                case "Scrissors":
                    shape[1] = "Rock";
                    break;
            }
            return 6;
        } else {
            switch(shape[0]) {
                case "Rock":
                    shape[1] = "Scrissors";
                    break;
                case "Paper":
                    shape[1] = "Rock";
                    break;
                case "Scrissors":
                    shape[1] = "Paper";
                    break;
            }
            return 0;
        }
    }

    public int getGameScoreP1(List<String[]> list){
        int sum = 0;
        for (String[] i: list){
            sum += getRoundScoreP1(i) + getShapeScore(i[1]);
        }
        return sum;
    }

    public int getGameScoreP2(List<String[]> list){
        int sum = 0;
        for (String[] i: list){
            sum += getRoundScoreP2(i) + getShapeScore(i[1]);
        }
        return sum;
    }
}
