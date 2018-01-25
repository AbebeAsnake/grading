package com.abebe.grading;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
@RestController
public class MainController {
    @RequestMapping(value="/home")
    public String ShowLetterGrade()
    {
        int grade;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter score out of %50:");
         grade = keyboard.nextInt();
        /*Scanner keyBoard = new Scanner(System.in);
        grade = keyBoard.nextLine();*/
        String letterGrade;
         grade = grade *2;
        if(grade >=90){
            letterGrade ="A";
        }
        else if(grade >=80){
            letterGrade ="B";
        }
        else if(grade >=70){
            letterGrade = "C";
        }
        else  if(grade >=60){
            letterGrade = "D";
        }
        else {
           letterGrade = "F";
        }
        System.out.println("Your grade:");

        System.out.println("Your letter grade:" +letterGrade);

        return  letterGrade;
    }
}
