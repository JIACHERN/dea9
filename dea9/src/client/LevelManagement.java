/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.ArrListJC;
import adt.ListInterfaceJC;
import entity.Questions;
import entity.Rules;

/**
 *
 * @author Peanut Chern
 */
public class LevelManagement {

    ListInterfaceJC<Rules> rules = new ArrListJC<Rules>(10);
    //ArrListJC<Rules> arrList = new ArrListJC<Rules>;
    Rules ruleEntity = new Rules();
    private Questions[] ques;

    public void LevelComplete() {
        System.out.println("Congratulation, Level Complete!");

        System.out.println("YOU LOSE!");
    }

    public void answerAllQues() {
        
        System.out.println("You have answered " + "questions");
        System.out.println("You have wronged " +  ruleEntity.getTotalWrongQuestions() + "questions");
        System.out.println("Try Again?");
        System.out.println("Do you want to redeem questions?");
    }

    public void diamondAchieve(int totalDiamondReceive) {
        int diamond;
        int questionsCorrect;

        for (int level = 1; level <= 3; level++) {
            diamond = 0;
            totalDiamondReceive = 0;
            for (questionsCorrect = 1; questionsCorrect <= 10; questionsCorrect++) {
                diamond = 15;
            }
            //Calculate total diamond
            totalDiamondReceive += diamond;
        }
        System.out.println("Congratulations, you have won " + totalDiamondReceive + " of diamond");
    }

    public void life(int totalGamesLife) {
        int gamesLife = 3;
        int level = 0;
        int questionsWrong = 0;

        if (level == 1) {
            if (questionsWrong == 0) {
                gamesLife = 3;
            } else if (questionsWrong <= 3) {
                gamesLife = gamesLife - 1;
            }
            totalGamesLife = gamesLife;
        } else if (level == 2) {
            if (questionsWrong == 0) {
                gamesLife = 3;
            } else if (questionsWrong <= 3) {
                gamesLife = gamesLife - 1;
            }
            totalGamesLife = gamesLife;
        } else if (level == 3) {
            if (questionsWrong == 0) {
                gamesLife = 3;
            } else if (questionsWrong <= 3) {
                gamesLife = gamesLife - 1;
            }
            totalGamesLife = gamesLife;
        } else if (level == 1 && level == 2 && level == 3) {
            if (questionsWrong == 0) {
                gamesLife = 3;
            } else if (questionsWrong == 3) {
                gamesLife = gamesLife - 1;
            }
            totalGamesLife = gamesLife;
        } else {
            gamesLife = 3;
        }
        totalGamesLife = gamesLife;
        System.out.println("You left " + totalGamesLife + " life");
    }

    public void assignLevel(int maxLevel) {
        for (int num = 1; num < maxLevel; num++) {
            Rules rul = new Rules(num);

            rules.addLevel(rul);
            System.out.println("Level " + num);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int diamond = 0;
        int totalLife = 0;
        LevelManagement level = new LevelManagement();
        Rules rules = new Rules();

        level.LevelComplete();
        level.answerAllQues();
        level.diamondAchieve(diamond);
        level.life(totalLife);
        level.assignLevel(4);
    }
}
