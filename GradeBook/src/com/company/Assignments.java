package com.company;

/**
 * Created by sd1500 on 3/15/2019.
 */
public class Assignments {
    private String assignmentName;
    private int pointsPossible;
    private int pointsEarned;

    public Assignments(String assignmentName, int pointsPossible) {
        this.assignmentName = assignmentName;
        this.pointsPossible = pointsPossible;
        this.pointsEarned = 0;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public int getPointsPossible() {
        return pointsPossible;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public boolean setScore(int pointsEarned) {
        this.pointsEarned = pointsEarned;
        return true;
    }
}
