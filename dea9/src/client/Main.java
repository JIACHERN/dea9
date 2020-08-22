package com.company;

import adt.arrListInterface;
import adt.arrList;
import entity.Question;
import java.util.Scanner;

public class Main {

    arrListInterface<Question> arrQuestionList = new arrList<Question>(15);

    public static void main(String[] args) {
        int position = 0;
        Main main = new Main();

        main.displayLoading();

        System.out.println("\n");

        main.displayQuestion(position);

        main.redoOrNot();
    }

    public void displayLoading() {
        System.out.print("LOADING");

        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(800);
                System.out.print(".");
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
        }

        System.out.print("\n");

        System.out.print("PLEASE HAVE A SECOND");
        for (int j = 0; j < 3; j++) {
            try {
                Thread.sleep(1000);
                System.out.print(".");
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
        }

        System.out.print("\n\n");

        System.out.println("===========");
        System.out.println(" ATTENTION ");
        System.out.println("===========");
        System.out.print("-> Answer A or B or C or D only, other than this COUNT as WRONG!!");
        for (int j = 0; j < 3; j++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
        }

        System.out.print("\n\n");

        System.out.print("WISH YOU ALL THE BEST ^.^ ");
        for (int j = 0; j < 2; j++) {
            try {
                System.out.print(">");
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
        }

        System.out.print(" SO LET'S START THE QUIZ");
        for (int j = 0; j < 2; j++) {
            try {
                Thread.sleep(850);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
        }
    }

    private void question(){
        arrQuestionList = new arrList<>();

        arrQuestionList.add(new Question("How many hours are there in seven days? (10 points)", "168", "186", "200", "250", 'A'));
        arrQuestionList.add(new Question("Which one of these is the Pythagorean theorem? (10 points)", "2a + 2b = 2c", "a + b = c^2", "a^2 + b^2 = c^2", "a^2 + b^2 = 2c", 'C'));
        arrQuestionList.add(new Question("If 5 dogs each buried 4 bones, how many bones were buried? (10 points)", "9", "20", "19", "24", 'B'));
        arrQuestionList.add(new Question("What is the cube root of 343? (10 points)", "13", "11", "7", "8", 'C'));
        arrQuestionList.add(new Question("If 6.74 X 10n = 6,740,000, what is the value of n? (10 points)", "100000", "10000", "1000", "6.74", 'A'));

        arrQuestionList.add(new Question("What mathematical term is given to 3.14159265? (15 points)", "X", "Pi", "Y", "S", 'B'));
        arrQuestionList.add(new Question("How many prime numbers occur from 11 to 19? (15 points)", "4", "5", "6", "3", 'A'));
        arrQuestionList.add(new Question("What is the sum of all the internal angles of a hexagon? (15 points)", "630", "700", "720", "810", 'C'));
        arrQuestionList.add(new Question("Which compass point is fixed at 0 degrees? (15 points)", "East", "West", "North", "South", 'C'));
        arrQuestionList.add(new Question("How many lines of symmetry does a star have? (15 points)", "5", "6", "4", "8", 'A'));

        arrQuestionList.add(new Question("Five pencils and 2 erasers cost 95 cents. Three pencils and 4 erasers cost 85 cents. If x is the cost of a pencil and y is the cost of an eraser, then which of the following systems of equations can be used to find the cost of a pencil? (20 points)", "5x + 2y = 95, 3x + 4y = 85", "5x + 2y = 85, 3x + 4y = 95", "5x + 4y = 85, 2x + 4y = 85", "5x + 4y = 95, 3x + 2y = 85", 'A'));
        arrQuestionList.add(new Question("A car can cover a distance of 522 km on 36 liters of petrol. How far can it travel on 14 liters of petrol?", "213", "223", "203", "302", 'C'));
        arrQuestionList.add(new Question("There are 250 seniors in a class. 60% have plans to go to college. Of those with plans to go to college, 40% plan to go to a college out-of-state. How many students plan to attend an in-state college? (20 points)", "90", "150", "60", "100", 'A'));
        arrQuestionList.add(new Question("One day, a person went to horse racing area, Instead of counting the number of human and horses, he instead counted 74 heads and 196 legs. Yet he knew the number of humans and horses there. How many humans and horses are there? (20 points)", "24 Horses and 50 Humans", "20 Horses and 54 Humans", "15 Horses and 45 Humans", "25 Horses and 55 Humans", 'A'));
        arrQuestionList.add(new Question("You have two block of clay in cube form and the edges are 10 cm. How many spheres with a radius of 5 cm can you make with that amount of clay? (20 points)", "3", "1", "2", "4", 'A'));
    }

    public void displayQuestion(int position){
        Scanner scan = new Scanner(System.in);
        char answer = 0;

        question();

        for(int i=0; i<arrQuestionList.getLength(); i++){
            System.out.println((i+1) + arrQuestionList.toString(i));

            for (int j = 0; j < 2; j++) {
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    System.err.format("IOException: %s%n", e);
                }
            }

            System.out.print("Please enter your answer >> ");
            checkAnswer(answer, i+1);
        }
    }

    public void redoOrNot() {
        Scanner scan = new Scanner(System.in);
        int position = 0;
        char decision;

        do {
            System.out.print("Would you like to redo the quiz again? (Y/N) ");
            decision = scan.next().charAt(0);

            if (decision == 'Y' || decision == 'y') {
                System.out.println("\n");
                displayQuestion(position);
            } else if (decision == 'N' || decision == 'n') {
                System.out.print("Thank you for your cooperation ^_^ !\n");
            } else {
                System.out.print("Please enter Yes or No <Y/N> only!\n\n");
            }
        } while (!(decision == 'Y' || decision == 'y' || decision == 'N' || decision == 'n'));
    }

    public void answerCorrect(){
        System.out.println("\n-----------------------");
        System.out.println("Your answer is CORRECT!");
        System.out.print("-----------------------\n\n\n");

        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(550);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
        }
    }

    public void answerWrong(){
        System.out.println("\n------------------------");
        System.out.println("Your answer is WRONG >.<");
        System.out.print("------------------------\n\n\n");

        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(550);
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
        }
    }

    public void checkAnswer(char answer, int i){
        Scanner scan = new Scanner(System.in);

            answer = scan.next().charAt(0);
            answer = Character.toUpperCase(answer);

            char answerInList = arrQuestionList.getEntry(i).getAnswer();
            if(Character.compare(answerInList, answer) == 0){
                answerCorrect();
            } else {
                answerWrong();
            };
    }
}
