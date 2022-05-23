import objects.Question;
import objects.Quiz;

/**
 * Created by iurii on 21.05.2022
 */
public class L08HomeWork {

    public static void main(String[] args) {
        Question questionOne = new Question();
        questionOne.setQuestion("Неспешен, невозмутим, имеет устойчивые стремления и настроение, внешне скуп на проявление эмоций и чувств.");
        questionOne.setAnswers(new String[]{"Холерик", "Сангвиник", "Меланхолик", "Флегматик"});
        questionOne.setCorrectAnswer(4);

        Question questionTwo = new Question();
        questionTwo.setQuestion("Быстрый, страстный, порывистый, однако совершенно неуравновешенный, с резко меняющимся настроением с эмоциональными вспышками, быстро истощаемый.");
        questionTwo.setAnswers(new String[]{"Флегматик", "Меланхолик", "Холерик", "Сангвиник"});
        questionTwo.setCorrectAnswer(3);

        Question questionThree = new Question();
        questionThree.setQuestion("Человек легко ранимый, склонный к постоянному переживанию различных событий, он мало реагирует на внешние факторы.");
        questionThree.setAnswers(new String[]{"Меланхолик", "Флегматик", "Сангвиник", "Холерик"});
        questionThree.setCorrectAnswer(1);

        Question questionFour = new Question();
        questionFour.setQuestion("Живой, горячий, подвижный человек, с частой сменой настроения, впечатлений, с быстрой реакцией на все события, происходящие вокруг него, довольно легко примиряющийся со своими неудачами и неприятностями.");
        questionFour.setAnswers(new String[]{"Холерик", "Сангвиник", "Меланхолик", "Флегматик"});
        questionFour.setCorrectAnswer(2);

        String quizName = "Типы темперамента.";
        Question[] questions = {questionOne, questionTwo, questionThree, questionFour};

        Quiz quiz = new Quiz(quizName, questions);
        quiz.runQuiz();
    }
}
