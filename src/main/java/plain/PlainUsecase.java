package plain;

import org.hibernate.Session;
import util.HibernateUtil;

public class PlainUsecase {
    public void main() {
        System.out.println("Hello, JPA, Plain Usecase");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        PlainQueries pq = new PlainQueries(session);

        System.out.println(pq.req1());
        System.out.println(pq.req2());
        pq.req3().forEach(System.out::println);

        session.getTransaction().commit();
        session.close();

        HibernateUtil.getSessionFactory().close();
    }
}
