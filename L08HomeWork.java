import java.util.Scanner;

/**
 * Created by iurii on 21.05.2022
 */
public class L08HomeWork {

    public static void main(String[] args) {
        Question questionOne = new Question();
        questionOne.question = "Неспешен, невозмутим, имеет устойчивые стремления и настроение, внешне скуп на проявление эмоций и чувств.";
        questionOne.answers = new String[]{"Холерик", "Сангвиник", "Меланхолик", "Флегматик"};
        questionOne.correctAnswer = 4;

        Question questionTwo = new Question();
        questionTwo.question = "Быстрый, страстный, порывистый, однако совершенно неуравновешенный, с резко меняющимся настроением с эмоциональными вспышками, быстро истощаемый.";
        questionTwo.answers = new String[]{"Флегматик", "Меланхолик", "Холерик", "Сангвиник"};
        questionTwo.correctAnswer = 3;

        Question questionThree = new Question();
        questionThree.question = "Человек легко ранимый, склонный к постоянному переживанию различных событий, он мало реагирует на внешние факторы.";
        questionThree.answers = new String[]{"Меланхолик", "Флегматик", "Сангвиник", "Холерик"};
        questionThree.correctAnswer = 1;

        Question questionFour = new Question();
        questionFour.question = "Живой, горячий, подвижный человек, с частой сменой настроения, впечатлений, с быстрой реакцией на все события, происходящие вокруг него, довольно легко примиряющийся со своими неудачами и неприятностями.";
        questionFour.answers = new String[]{"Холерик", "Сангвиник", "Меланхолик", "Флегматик"};
        questionFour.correctAnswer = 2;

        String quizName = "Типы темперамента.";
        Question[] questions = {questionOne, questionTwo, questionThree, questionFour};

        Quiz quiz = new Quiz(quizName, questions);
        startQuiz(quiz);
        for(int i = 0; i < quiz.questions.length; i++) {
            setResult(quiz, askQuestion(quiz.questions[i]));
        }
        finishQuiz(quiz);
    }

    public static void startQuiz (Quiz quiz) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите свое имя.");
        quiz.userName = scanner.nextLine();
        System.out.println("Тест: " + quiz.quizName);
    }

    public static boolean askQuestion(Question question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question.question);
        System.out.println("Варианты ответов: ");
        for(int i = 0; i < question.answers.length; i++) {
            System.out.println( (i + 1) + ". " + question.answers[i]);
        }
        System.out.println("Ваш ответ: ");
        int answer = scanner.nextInt();
        if(answer == question.correctAnswer && answer <= question.answers.length && answer > 0){
            System.out.println("Правильно!");
            return true;
        } else if(answer != question.correctAnswer && answer <= question.answers.length && answer > 0) {
            System.out.println("Неправильно!");
            return false;
        } else {
            System.out.println("Такого варианта нет в списке.");
            return false;
        }
    }

    public static void setResult(Quiz quiz, boolean result) {
        if(result) {
            quiz.allCorrectAnswers ++;
        } else {
            quiz.allIncorrectAnswers++;
        }
    }

    public static void finishQuiz (Quiz quiz) {
        System.out.println(quiz.userName + ", Вы прошли тест.");
        System.out.println("Ваш результат: правильно " + quiz.allCorrectAnswers + ", неправильно " + quiz.allIncorrectAnswers);
    }
}
