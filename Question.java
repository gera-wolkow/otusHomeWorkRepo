/**
 * Created by iurii on 21.05.2022
 */
public class Question {
    String question;
    String[] answers;
    int correctAnswer;

    public Question (String question, String[] answers, int correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public Question() {
    }
}
