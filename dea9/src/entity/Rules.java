/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Peanut Chern
 */
public class Rules {
    
    private int levelNum;
    private int diamond;
    private String levelQues;
    private int lifeLeft;
    private int totalWrongQuestions;
    private int redeemQues;
    private int totalDiamond;

    //Default Constructor
    public Rules (){
        
    }

    public Rules(int levelNum) {
       this.levelNum = levelNum;
    }
    
    //Constructor with Variable
    public Rules(int levelNum, int diamond, String levelQues, int lifeLeft, int totalWrongQuestions, int redeemQues, int totalDiamond) {
        this.levelNum = levelNum;
        this.diamond = diamond;
        this.levelQues = levelQues;
        this.lifeLeft = lifeLeft;
        this.totalWrongQuestions = totalWrongQuestions;
        this.redeemQues = redeemQues;
        this.totalDiamond = totalDiamond;
    }
    
    //Getter and Setter method
    public int getLevelNum() {
        return levelNum;
    }

    public void setLevelNum(int levelNum) {
        this.levelNum = levelNum;
    }

    public int getDiamond() {
        return diamond;
    }

    public void setDiamond(int diamond) {
        this.diamond = diamond;
    }

    public String getLevelQues() {
        return levelQues;
    }

    public void setLevelQues(String levelQues) {
        this.levelQues = levelQues;
    }

    public int getLifeLeft() {
        return lifeLeft;
    }

    public void setLifeLeft(int lifeLeft) {
        this.lifeLeft = lifeLeft;
    }

    public int getTotalWrongQuestions() {
        return totalWrongQuestions;
    }

    public void setTotalWrongQuestions(int totalWrongQuestions) {
        this.totalWrongQuestions = totalWrongQuestions;
    }

    public int getRedeemQues() {
        return redeemQues;
    }

    public void setRedeemQues(int redeemQues) {
        this.redeemQues = redeemQues;
    }

    public int getTotalDiamond() {
        return totalDiamond;
    }

    public void setTotalDiamond(int totalDiamond) {
        this.totalDiamond = totalDiamond;
    }
    
    
}
