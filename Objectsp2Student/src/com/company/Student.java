package com.company;

/**
 * Created by sd1500 on 2/4/2019.
 */
public class Student {
    int studentID;
    String name;
    double contentGrade;
    double workHabitGrade;
    double participation;
    int age;

    public Student(String Name,int ID,int Age){
        name = Name;
        studentID = ID;
        age = Age;
        contentGrade = 0;
        workHabitGrade = 0;
        participation = 0;
    }

    public Student(){
        name = "TestStudent";
        studentID = -1;
        age = 18;
        contentGrade = 0;
        workHabitGrade = 0;
        participation = 0;
    }

    public void SetContentGrade(int grade){
        contentGrade = grade;
    }

    public void SetWorkHabitGrade(int grade){
        workHabitGrade = grade;
    }

    public void SetParticipation(int grade){
        participation = grade;
    }

    public void GetGrade(){
        double overAllGrade = .35*workHabitGrade + .4*contentGrade + .25*participation;
    }

    public void printGrade(){
        double overAllGrade = .35*workHabitGrade + .4*contentGrade + .25*participation;
        System.out.println(overAllGrade);
    }
}
