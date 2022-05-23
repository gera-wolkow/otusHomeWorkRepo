package objects;

import static integration.Input.getInputInt;
import static integration.Output.displayStringToUser;

/**
 * Created by iurii on 21.05.2022
 */
public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Question (String question, String[] answers, int correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public Question() {
    }

    public boolean askQuestion() {
        displayStringToUser(this.question);
        displayStringToUser("Варианты ответов: ");
        for(int i = 0; i < this.answers.length; i++) {
            displayStringToUser((i + 1) + ". " + this.answers[i]);
        }
        displayStringToUser("Ваш ответ:");
        int answer = getInputInt();
        if(answer == this.correctAnswer && answer <= this.answers.length && answer > 0){
            displayStringToUser("Правильно!");
            return true;
        } else if(answer != this.correctAnswer && answer <= this.answers.length && answer > 0) {
            displayStringToUser("Неправильно!");
            return false;
        } else {
            displayStringToUser("Такого варианта нет в списке.");
            return false;
        }
    }
}
