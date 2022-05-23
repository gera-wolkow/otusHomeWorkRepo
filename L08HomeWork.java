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
        quiz.startQuiz();
        quiz.askQuestions();
        quiz.finishQuiz();
    }

    static String getInputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static Integer getInputInt() {
        Scanner scanner = new Scanner(System.in);
        int input = -10;
        try {
            input = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            displayStringToUser("Неправильный формат ввода. Ожидаются цифры");
        }
        return input;
    }

    static void displayStringToUser(String string) {
        System.out.println(string);
    }
}
