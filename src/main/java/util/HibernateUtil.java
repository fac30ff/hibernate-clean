package util;

import entities.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Properties prop = new Properties() {{
                put(Environment.DRIVER, "org.postgresql.Driver");
                put(Environment.URL, "jdbc:postgresql://localhost:5432/danit");
                put(Environment.USER, "postgres");
                put(Environment.PASS, "pg123457");
                put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL9Dialect");
            }};
            sessionFactory = new Configuration()
                    .addProperties(prop)
                    .addAnnotatedClass(User.class)
                    .buildSessionFactory();
        }
        return sessionFactory;
    }
}
