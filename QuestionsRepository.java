package QuestionsFinalExam.Repository;
import QuestionsFinalExam.Model.Questions;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class QuestionsRepository {
    private final EntityManager entityManager;

    public QuestionsRepository(EntityManager entityManager) {

        this.entityManager = entityManager;
    }

    public Questions saveQuestions(Questions questions) {
        try {
            EntityTransaction entityTransaction = entityManager.getTransaction();
            if (!entityTransaction.isActive()) {
                entityTransaction.begin();
            }
            entityManager.persist(questions);
            entityTransaction.commit();
            return questions;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
