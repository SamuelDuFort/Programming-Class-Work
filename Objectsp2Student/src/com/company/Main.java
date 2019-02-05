package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student myStudent = new Student("Sam",234532,16);
        myStudent.SetContentGrade(97);
        myStudent.SetWorkHabitGrade(91);
        myStudent.SetParticipation(87);
        myStudent.GetGrade();
        myStudent.printGrade();

        Student myStudent2 = new Student();
        myStudent2.SetContentGrade(34);
        myStudent2.SetWorkHabitGrade(90);
        myStudent2.SetParticipation(87);
        myStudent2.GetGrade();
        myStudent2.printGrade();

    }
}
