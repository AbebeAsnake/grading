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
       /* if(grade >=90){
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
        }*/

        switch(grade/10)
        {
            case 10: letterGrade = "A";
                     break;
            case 9: letterGrade = "A";
                    break;
            case 8: letterGrade = "B";
                    break;
            case 7: letterGrade = "C";
                    break;
            case 6: letterGrade = "D";
                break;
            default:
                    letterGrade = "F";
        }

        System.out.println("Your letter grade:" +letterGrade);
        String showGradeIn100Percent = "Your score " +grade +"%";
        String showGrade = "Your Letter grade:" + letterGrade;
        String exiting = "Do you want to continue?" + " "+" Y /N";
        if(exiting.equalsIgnoreCase("N")){
        keyboard.close();
    }
        return showGradeIn100Percent +"\n" + showGrade ;
}
}
