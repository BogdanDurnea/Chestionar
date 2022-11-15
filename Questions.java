package QuestionsFinalExam.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "Questions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Questions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private String id;

    @Column(name = "answers")
    private String answers;

    @Column(name = "correctAnswer")
    private String correctAnswer;

    @Override
    public String toString() {
        return "Questions{" +
                "id='" + id + '\'' +
                ", answers='" + answers + '\'' +
                ", correct_answer='" + correctAnswer + '\'' +
                '}';
    }

    public String getAnswers() {
        return answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getId() {
        return id;
    }
    private List<Questions>questions;
}
