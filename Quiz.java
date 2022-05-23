
/**
 * Created by iurii on 21.05.2022
 */
public class Quiz {
    String userName;
    String quizName;
    Question[] questions;
    int allCorrectAnswers;
    int allIncorrectAnswers;

    Quiz(String quizName, Question[] questions) {
        this.quizName = quizName;
        this.questions = questions;
    }

    public void startQuiz () {
        L08HomeWork.displayStringToUser("Пожалуйста, введите свое имя.");
        this.userName = L08HomeWork.getInputString();
        L08HomeWork.displayStringToUser("Тест: " + this.quizName);
    }

    public void askQuestions() {
        for (Question question : this.questions) {
            boolean result = (question.askQuestion());
            if (result) {
                this.allCorrectAnswers++;
            } else {
                this.allIncorrectAnswers++;
            }
        }
    }

    public void finishQuiz() {
        L08HomeWork.displayStringToUser(this.userName + ", Вы прошли тест.");
        L08HomeWork.displayStringToUser("Ваш результат: правильно " + this.allCorrectAnswers + ", неправильно " + this.allIncorrectAnswers);
    }
}
