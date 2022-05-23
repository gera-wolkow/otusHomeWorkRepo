package objects;

import static integration.Input.getInputString;
import static integration.Output.displayStringToUser;

/**
 * Created by iurii on 21.05.2022
 */
public class Quiz {
    private String userName;
    private String quizName;
    private Question[] questions;
    private int allCorrectAnswers;
    private int allIncorrectAnswers;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    public int getAllCorrectAnswers() {
        return allCorrectAnswers;
    }

    public void setAllCorrectAnswers(int allCorrectAnswers) {
        this.allCorrectAnswers = allCorrectAnswers;
    }

    public int getAllIncorrectAnswers() {
        return allIncorrectAnswers;
    }

    public void setAllIncorrectAnswers(int allIncorrectAnswers) {
        this.allIncorrectAnswers = allIncorrectAnswers;
    }

    public Quiz(String quizName, Question[] questions) {
        this.quizName = quizName;
        this.questions = questions;
    }

    private void startQuiz () {
        displayStringToUser("Пожалуйста, введите свое имя.");
        this.userName = getInputString();
        displayStringToUser("Тест: " + this.quizName);
    }

    private void askQuestions() {
        for (Question question : this.questions) {
            boolean result = (question.askQuestion());
            if (result) {
                this.allCorrectAnswers++;
            } else {
                this.allIncorrectAnswers++;
            }
        }
    }

    private void finishQuiz() {
        displayStringToUser(this.userName + ", Вы прошли тест.");
        displayStringToUser("Ваш результат: правильно " + this.allCorrectAnswers + ", неправильно " + this.allIncorrectAnswers);
    }

    public void runQuiz() {
        startQuiz();
        askQuestions();
        finishQuiz();
    }
}
