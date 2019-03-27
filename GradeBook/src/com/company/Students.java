package com.company;

import java.util.ArrayList;

/**
 * Created by sd1500 on 3/15/2019.
 */
public class Students {
    private String firstName;
    private String lastName;
    private String username;
    private long phoneNumber;
    private int tardyCount;
    private int absentCount;

    private ArrayList<Assignments> assignments;

    public Students(String firstName, String lastName, String username, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.tardyCount = 0;
        this.absentCount = 0;
        assignments = new ArrayList<>();
    }

    public String getUsername(){
        return username;
    }

    public void markTardy(){
        tardyCount++;
    }

    public void markAbsent(){
        absentCount++;
    }

    public int getTardyCount(){
        return tardyCount;
    }

    public int getAbsentCount(){
        return absentCount;
    }

    public int getAssignments() {
        return assignments.size();
    }

    public boolean addAssignmentToStudent(String assignmentName, int pointsPossible){
        Assignments curAssignment = getCurrentAssignment(assignmentName);
        if(curAssignment == null){
            assignments.add(new Assignments(assignmentName, pointsPossible));
            return true;
        }
        return false;
    }

    public double getOverallScore(){
        if(assignments.size() == 0){
            return -1;
        }
        double totalPointsEarned = 0;
        double totalPointsPossible = 0;
        int a = 0;
        while(a<assignments.size()){
            totalPointsEarned = totalPointsEarned + assignments.get(a).getPointsEarned();
            totalPointsPossible = totalPointsPossible + assignments.get(a).getPointsPossible();
            a++;
        }
        double getOverallScore = totalPointsEarned/totalPointsPossible;
        getOverallScore = getOverallScore*100;
        return getOverallScore;
    }

    public boolean setScore(String assignmentName, int pointsEarned){
        if(assignments.size() == 0){
            return false;
        }
        Assignments curAssignment = getCurrentAssignment(assignmentName);
        if(curAssignment == null){
            return false;
        }
        boolean x = curAssignment.setScore(pointsEarned);

        if(curAssignment.getPointsPossible()<pointsEarned){
            return false;
        }
        return x;
    }

    public double getAssignmentScorePercent(String assignmentName){
        if(assignments.size() == 0){
            return -1;
        }
        Assignments curAssignment = getCurrentAssignment(assignmentName);
        if(curAssignment == null){
            return -1;
        }
        double pointsEarnedOnAssignment = curAssignment.getPointsEarned();
        double pointsPossibleOnAssignment = curAssignment.getPointsPossible();
        double scoreAsDecimal = pointsEarnedOnAssignment/pointsPossibleOnAssignment;
        double getAssignmentScorePercent = scoreAsDecimal*100;
        return getAssignmentScorePercent;
    }

    public double getAssignmentScoreAvg(String assignmentName){
        if(assignments.size() == 0){
            return -1;
        }
        Assignments curAssignment = getCurrentAssignment(assignmentName);
        if(curAssignment == null){
            return -1;
        }
        return 1;
    }

    public int getAssignmentIndexByAssignmentName(String assignmentName){
        int index = 0;
        while(index<assignments.size()){
            if(assignmentName.equalsIgnoreCase(assignments.get(index).getAssignmentName())){
                return index;
            }
            index++;
        }
        return -1;
    }

    private Assignments getCurrentAssignment(String assignmentName){
        int index = getAssignmentIndexByAssignmentName(assignmentName);
        if(index == -1){
            return null;
        }
        return assignments.get(index);
    }

}
