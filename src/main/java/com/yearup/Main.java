package com.yearup;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int grade[]={50,60,70,80,90,100,150,200,300,350};
int highScore=grade[0];
for (int eachGrade:grade){
    if (eachGrade>highScore)
        highScore=eachGrade;
}
int minScore=grade[0];

    for ( int eachMinScore:grade) {
        if (eachMinScore < minScore)
            minScore = eachMinScore;
    }
    int sum=0;
    for(int grades:grade)
    {
     sum += grades;
    }
    double average=  sum/grade.length;
        System.out.println(highScore);
        System.out.println(minScore);
        System.out.println(average);
        String txt = "Hello wWyorld";
        System.out.println(txt.indexOf("World"));



                }
            }


//average
//- high score
//- low score