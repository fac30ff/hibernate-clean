package plain;

import entities.User;
import org.hibernate.Session;

import java.math.BigInteger;
import java.util.List;

public class PlainQueries {
    private final Session session;

    public PlainQueries(Session session) {
        this.session = session;
    }

    public String req1() {
        String sql1 = "select version()";
        return (String) session.createNativeQuery(sql1).getSingleResult();
    }

    public BigInteger req2() {
        String sql2 = "select count(*) from users";
        return (BigInteger)session.createNativeQuery(sql2).getSingleResult();
    }

    public List<User> req3() {
        String sql3 = "select * from users";
        return session.createNativeQuery(sql3, User.class).getResultList();
    }
}
