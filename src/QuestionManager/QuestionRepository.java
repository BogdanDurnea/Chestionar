package QuestionsFinalExam.Utility.src.QuestionManager;

import QuestionsFinalExam.Utility.src.Models.Question;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class QuestionRepository {
    private final EntityManager entityManager;

    public QuestionRepository(EntityManager entityManager) {

        this.entityManager = entityManager;
    }

    public Question saveQuestion(Question question) {
        try {
            EntityTransaction entityTransaction = entityManager.getTransaction();
            if (!entityTransaction.isActive()) {
                entityTransaction.begin();
            }
            entityManager.persist(question);
            entityTransaction.commit();
            return question;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Question findById(Question question) {
        try {
            EntityTransaction entityTransaction = entityManager.getTransaction();
            if (!entityTransaction.isActive()) {
                entityTransaction.begin();
            }
            entityManager.persist(question);
            entityTransaction.commit();
            return question;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


