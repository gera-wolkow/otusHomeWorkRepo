import java.util.Scanner;

/**
 * Created by iurii on 26.04.2022
 */
public class L06HomeWork {

    public static void main(String[] args) {
        String[] questions = new String[4];
        questions[0] = "Неспешен, невозмутим, имеет устойчивые стремления и настроение, внешне скуп на проявление эмоций и чувств.";
        questions[1] = "Быстрый, страстный, порывистый, однако совершенно неуравновешенный, с резко меняющимся настроением с эмоциональными вспышками, быстро истощаемый.";
        questions[2] = "Человек легко ранимый, склонный к постоянному переживанию различных событий, он мало реагирует на внешние факторы.";
        questions[3] = "Живой, горячий, подвижный человек, с частой сменой настроения, впечатлений, с быстрой реакцией на все события, происходящие вокруг него, довольно легко примиряющийся со своими неудачами и неприятностями.";

        String[][] answers = {
                {"Холерик", "Сангвиник", "Меланхолик", "Флегматик"},
                {"Флегматик", "Меланхолик", "Холерик", "Сангвиник"},
                {"Меланхолик", "Флегматик", "Сангвиник", "Холерик"},
                {"Холерик", "Сангвиник", "Меланхолик", "Флегматик"}
        };

        int[] correctAnswers = {4,3,1,2};

        int allCorrectAnswers = 0;
        int allIncorrectAnswers = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Тест: Типы темперамента.");
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("Варианты ответов: ");
            for(int j = 0; j < answers[i].length; j++) {
                System.out.println(j + 1 + ". " + answers[i][j]);
            }
            System.out.println("Ваш ответ: ");
            int answer = scanner.nextInt();
            if (answer == correctAnswers[i] && answer <= answers[i].length && answer > 0) {
                System.out.println("Правильно!");
                allCorrectAnswers++;
            } else if (answer != correctAnswers[i] && answer <= answers[i].length && answer > 0) {
                System.out.println("Неправильно!");
                allIncorrectAnswers++;
            } else {
                System.out.println("Такого варианта нет в списке.");
                allIncorrectAnswers++;
            }
        }
        System.out.println("Результат: правильно " + allCorrectAnswers + ", неправильно " + allIncorrectAnswers);
    }
}
