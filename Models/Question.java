package QuestionsFinalExam.Utility.Models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Question")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private String id;

    @Column(name = "answerA")
    private String answerA;

    @Column(name = "answerB")
    private String answerB;

    @Column(name = "answerC")
    private String answerC;

    @Column(name = "answerD")
    private String answerD;

    @Column(name = "correctAnswer")
    private String correctAnswer;

    @Override
    public String toString() {
        return "Question{" +
                "id='" + id + '\'' +
                ", answerA='" + answerA + '\'' +
                ", answerB='" + answerB + '\'' +
                ", answerC='" + answerC + '\'' +
                ", answerD='" + answerD + '\'' +
                ", correctAnswer='" + correctAnswer + '\'' +
                ", question=" + question +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getAnswerA() {
        return answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public List<Question> getQuestion() {
        return question;
    }

    private List<Question>question;
}
