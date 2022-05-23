/**
 * Created by iurii on 21.05.2022
 */
public class Question {
    String question;
    String[] answers;
    int correctAnswer;

    Question (String question, String[] answers, int correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    Question() {
    }

    public boolean askQuestion() {
        L08HomeWork.displayStringToUser(this.question);
        L08HomeWork.displayStringToUser("Варианты ответов: ");
        for(int i = 0; i < this.answers.length; i++) {
            L08HomeWork.displayStringToUser((i + 1) + ". " + this.answers[i]);
        }
        L08HomeWork.displayStringToUser("Ваш ответ:");
        int answer = L08HomeWork.getInputInt();
        if(answer == this.correctAnswer && answer <= this.answers.length && answer > 0){
            L08HomeWork.displayStringToUser("Правильно!");
            return true;
        } else if(answer != this.correctAnswer && answer <= this.answers.length && answer > 0) {
            L08HomeWork.displayStringToUser("Неправильно!");
            return false;
        } else {
            L08HomeWork.displayStringToUser("Такого варианта нет в списке.");
            return false;
        }
    }
}
