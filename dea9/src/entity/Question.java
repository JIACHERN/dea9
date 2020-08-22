package entity;

public class Question {
    private String question;
    private String a;
    private String b;
    private String c;
    private String d;
    private char answer;

    public Question(){

    }

    public Question(String question, String a, String b, String c, String d, char answer) {
        this.question = question;
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
        this.answer = answer;
    }

    public String getQuestion(){
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public char getAnswer() {
        return answer;
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return  ". " + question + '\n' +
                "   A. " + a + '\n' +
                "   B. " + b + '\n' +
                "   C. " + c + '\n' +
                "   D. " + d;
    }
}
