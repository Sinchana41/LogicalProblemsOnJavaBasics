package org;

import java.util.*;

public class TeamAssignmentGame {

    static int minDiff = Integer.MAX_VALUE;
    static List<Integer> bestTeamA = new ArrayList<Integer>();
    static List<Integer> bestTeamB = new ArrayList<Integer>();

    public static void divideTeams(int[] skills) {
        int n = skills.length;

        if (n % 2 != 0) {
            System.out.println("Number of players must be even.");
            return;
        }

        backtrack(skills, 0, new ArrayList<Integer>(), new ArrayList<Integer>());
        System.out.println("Team A: " + bestTeamA);
        System.out.println("Team B: " + bestTeamB);
    }

    public static void backtrack(int[] skills, int index,
                                 List<Integer> teamA, List<Integer> teamB) {
        if (index == skills.length) {
            if (teamA.size() == teamB.size()) {
                int sumA = sum(teamA);
                int sumB = sum(teamB);
                int diff = Math.abs(sumA - sumB);
                if (diff < minDiff) {
                    minDiff = diff;
                    bestTeamA = new ArrayList<Integer>(teamA);
                    bestTeamB = new ArrayList<Integer>(teamB);
                }
            }
            return;
        }

        
        if (teamA.size() < skills.length / 2) {
            teamA.add(skills[index]);
            backtrack(skills, index + 1, teamA, teamB);
            teamA.remove(teamA.size() - 1);  
        }

       
        if (teamB.size() < skills.length / 2) {
            teamB.add(skills[index]);
            backtrack(skills, index + 1, teamA, teamB);
            teamB.remove(teamB.size() - 1);  
        }
    }

    public static int sum(List<Integer> list) {
        int total = 0;
        for (int num : list) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] skills = {10, 20, 30, 30};
        divideTeams(skills);
    }
}
