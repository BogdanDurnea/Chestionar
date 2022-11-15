package QuestionsFinalExam;

import QuestionsFinalExam.Model.Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class QuestionsMenu {
    public static void main(String[] args) {

    }
    public static void start() {
        // design baza de date
        // entitatea Question

        List<Integer> myRandomQuestionNumber = new ArrayList<>();
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            int number = random.nextInt(1, 130);
            myRandomQuestionNumber.add(number);
        }

        int note = 0;
        for (Integer questionNumber : myRandomQuestionNumber) {
            // call in baza de date si aduci intrebarea respectiva
            Questions questions = findByID(myRandomQuestionNumber);
            // metoda de afisare
            // scan raspuns si verificare daca e corect -> note++
            String customerInput = myRandomQuestionNumber.toString();
            if (Objects.equals(customerInput, questions.getCorrectAnswer())) {
                note++;
            } else {
                List<Questions> wronQuestions = new ArrayList<>();
                wronQuestions.add(questions);
            }
            // String question, String answer, correct.answer
        }

        System.out.println(note + "/10");

    }

    private static Questions findByID(List<Integer> myRandomQuestionNumber) {
        Questions QuestionsMenu = new Questions();
        return QuestionsMenu;
    }
}
