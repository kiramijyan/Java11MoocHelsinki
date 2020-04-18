/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hkira
 */
        import java.util.ArrayList;
        import java.util.Scanner;

public class UserInterface {

    public Scanner scanner;
    private ArrayList<Integer> pointList;
    private ArrayList<Integer> pointListPass;
    private int userInput;
    private int countGrade0;
    private int countGrade1;
    private int countGrade2;
    private int countGrade3;
    private int countGrade4;
    private int countGrade5;

    public UserInterface (){
        this.scanner = new Scanner(System.in);
        this.userInput = 0;
        this.pointList = new ArrayList<>();
        this.pointListPass = new ArrayList<>();
        this.countGrade0 = 0;
        this.countGrade1 = 0;
        this.countGrade2 = 0;
        this.countGrade3 = 0;
        this.countGrade4 = 0;
        this.countGrade5 = 0;
    }

    public void start(){
        System.out.println("Enter point totals, -1 stops:");

        while(true){
            userInput = Integer.valueOf(scanner.nextLine());
            if(userInput == -1){
                break;
            }
            addPoints(userInput);
            addPointsPass(userInput);
        }

        System.out.println("Point average (all): " + average(pointList));
        System.out.println("Point average (passing): " + average(pointListPass));
        System.out.println("Pass percentage: " + percentage(pointListPass.size(), pointList.size()));
        grade(pointList);
    }

    public void addPoints(int userInput){
        if(userInput >= 0 && userInput <= 100){
            pointList.add(userInput);
        }
    }

    public void addPointsPass(int userInput){
        if(userInput >= 0 && userInput <= 100){
            if(userInput >= 50){
                pointListPass.add(userInput);
            }
        }
    }


    public double average(ArrayList<Integer> list){
        int sum = 0;

        for(int i = 0; i<list.size(); i++){
            sum = sum + list.get(i);
        }
        return (double) sum / list.size();
    }

    public double percentage(double passing, double participants){
        double percentage = 0;
        if(passing != 0 || participants != 0){
            percentage = 100 * passing / participants;
            return percentage;
        }
        return 0.0;
    }

    public void grade(ArrayList<Integer> list){
        System.out.println("Grade distribution:");

        for(int i = 0; i< list.size(); i++){

            if(list.get(i) >= 90){
                countGrade5++;
            }

            if(list.get(i) < 90 && list.get(i) >= 80){
                countGrade4++;
            }

            if(list.get(i) < 80 && list.get(i) >= 70){
                countGrade3++;
            }

            if(list.get(i) < 70 && list.get(i) >= 60){
                countGrade2++;
            }

            if(list.get(i) < 60 && list.get(i) >= 50){
                countGrade1++;
            }

            if(list.get(i) < 50){
                countGrade0++;
            }
        }
        System.out.println("5:" + printStar(countGrade5));
        System.out.println("4:" + printStar(countGrade4));
        System.out.println("3:" + printStar(countGrade3));
        System.out.println("2:" + printStar(countGrade2));
        System.out.println("1:" + printStar(countGrade1));
        System.out.println("0:" + printStar(countGrade0));
    }

    public String printStar(int timesToPrint){
        String star = "";
        for(int i = 0; i < timesToPrint; i++){
            star = star + "*";
        }
        return star;
    }
}
