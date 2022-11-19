package QuestionsFinalExam.Utility.src.SessionFactory;
import QuestionsFinalExam.Utility.src.Models.Question;
import org.hibernate.cfg.Configuration;
public class SessionFactory extends AbstractSessionManager {
    private static final SessionFactory INSTANCE = new SessionFactory();
    public static org.hibernate.SessionFactory getSessionFactory() {
        return INSTANCE.getSessionFactory("chestionar");
    }
    public static void shutdown() {
        INSTANCE.shutdownSessionManager();
    }
    @Override
    protected void setAnnotatedClasses(Configuration configuration) {
        configuration.addAnnotatedClass(Question.class);

    }
}

