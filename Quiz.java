/**
 * Created by iurii on 21.05.2022
 */
public class Quiz {
    String userName;
    String quizName;
    Question[] questions;
    int allCorrectAnswers;
    int allIncorrectAnswers;

    public Quiz(String quizName, Question[] questions) {
        this.quizName = quizName;
        this.questions = questions;
    }
}
