package com.company;
import java.util.ArrayList;
/**
 * Created by sd1500 on 3/15/2019.
 */
public class Sections {
    private String sectionName;

    private ArrayList<Students> students;

    public Sections(String sectionName) {
        this.sectionName = sectionName;
        students = new ArrayList<>();
    }

    public String getSectionName() {
        return sectionName;
    }

    public boolean addStudent(String firstName, String lastName, String username, long phoneNumber){
        int studentIndex = getStudentIndexByUsername(username);
        if(studentIndex != -1){
            return false;
        }
        return students.add(new Students(firstName, lastName, username, phoneNumber));
    }

    public boolean markTardy(String username){
        Students curStudent = getCurrentStudent(username);
        if(curStudent == null){
            return false;
        }
        curStudent.markTardy();
        return true;
    }

    public boolean markAbsent(String username){
        Students curStudent = getCurrentStudent(username);
        if(curStudent == null){
            return false;
        }
        curStudent.markAbsent();
        return true;
    }

    public int getTardyCount(String username){
        Students curStudent = getCurrentStudent(username);
        if(curStudent == null){
            return -1;
        }
        return curStudent.getTardyCount();
    }

    public int getAbsentCount(String username){
        Students curStudent = getCurrentStudent(username);
        if(curStudent == null){
            return -1;
        }
        return curStudent.getAbsentCount();
    }

    public boolean addAssignmentToStudent(String username, String assignmentName, int pointsPossible){
        Students curStudent = getCurrentStudent(username);
        if(curStudent == null){
            return false;
        }
        return curStudent.addAssignmentToStudent(assignmentName, pointsPossible);
    }

    public boolean addAssignmentToSection(String assignmentName, int pointsPossible){
        //if no students return false
        if(students.size() == 0){
            return false;
        }
        //if a student already has the assignemnt return false
        if(checkIfStudentDoesNotHaveAssignment(assignmentName)==false){
            return false;
        }
        //add assignement to all students
        int s = 0;
        while(s<students.size()){
            students.get(s).addAssignmentToStudent(assignmentName, pointsPossible);
            s++;
        }
        return true;
    }

    public double getOverallScore(String username){
        Students curStudent = getCurrentStudent(username);
        if(curStudent == null){
            return -1;
        }
        if(students.size() == 0){
            return -1;
        }

        return curStudent.getOverallScore();
    }

    public double getOverallScoreAvg(){
        if(students.size() == 0){
            return -1;
        }
        double getOverallScoreAvg = 0;
        int s = 0;
        int avg = 0;
        while(s<students.size()){
            if(students.get(s).getAssignments() != 0){
                getOverallScoreAvg = getOverallScoreAvg + students.get(s).getOverallScore();
                avg++;
                s++;
            }
            else{
                s++;
            }
        }
        getOverallScoreAvg = getOverallScoreAvg/avg;
        return getOverallScoreAvg;
    }

    public double getAssignmentScorePercent(String username, String assignmentName){
        if(students.size() == 0){
            return -1;
        }
        Students curStudent = getCurrentStudent(username);
        if(curStudent == null){
            return -1;
        }
        return curStudent.getAssignmentScorePercent(assignmentName);
    }

    public double getAssignmentScoreAvg(String assignmentName){
        if(students.size() == 0){
            return -1;
        }
        int s = 0;
        int avg = 0;
        double a = 0;
        while(s<students.size()){
            Students curStudent = students.get(s);
            double x = curStudent.getAssignmentScoreAvg(assignmentName);
            if(x != -1){
                avg++;
                a = a + curStudent.getAssignmentScorePercent(assignmentName);
            }
            s++;
        }
        if(avg == 0){
            return -1;
        }
        double getAssignmentScoreAvg = a/avg;
        return getAssignmentScoreAvg;

    }

    public boolean setScore(String username, String assignmentName, int pointsEarned){
        if(students.size() == 0){
            return false;
        }
        Students curStudent = getCurrentStudent(username);
        if(curStudent == null){
            return false;
        }
        return curStudent.setScore(assignmentName, pointsEarned);
    }

    private int getStudentIndexByUsername(String username){
        int index = 0;
        while(index<students.size()){
            if(username.equalsIgnoreCase(students.get(index).getUsername())){
                return index;
            }
            index++;
        }
        return -1;
    }

    private Students getCurrentStudent(String username){
        int index = getStudentIndexByUsername(username);
        if(index == -1){
            return null;
        }
        return students.get(index);
    }


    //returns true if student does not have the assignment already
    private boolean checkIfStudentDoesNotHaveAssignment(String assignmentName){
        int index = 0;
        while(index<students.size()){
            int assignmentIndex = students.get(index).getAssignmentIndexByAssignmentName(assignmentName);
            //if exists return false
            if(assignmentIndex != -1){
                return false;
            }
            index++;
        }
        return true;
    }

}
