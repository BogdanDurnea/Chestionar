package QuestionsFinalExam.Utility.Utility;

import QuestionsFinalExam.Utility.Models.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class QuestionMenu {
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
            Question question = findByID();
            // metoda de afisare
            // scan raspuns si verificare daca e corect -> note++
            String customerInput = myRandomQuestionNumber.toString();
            if (Objects.equals(customerInput, question.getCorrectAnswer())) {
                note++;
            } else {
                List<Question> wronQuestion = new ArrayList<>();
                wronQuestion.add(question);
            }
            // String question, String answerA,B,C,D, correct.answer
        }

        System.out.println(note + "/10");

    }

    private static Question findByID() {
        return new Question();
    }
}
