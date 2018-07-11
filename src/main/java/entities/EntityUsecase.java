package entities;

import util.HibernateUtil;

import java.util.List;

public class EntityUsecase {
    public void main() {
        System.out.println("Hello, JPA, Plain Entity Usecase");
        DAOUser dao = new DAOUser(HibernateUtil.getSessionFactory());
        // select all
        System.out.println("==== GET ALL");
        List<User> all = dao.getAll();
        all.forEach(System.out::println);

        System.out.println("==== GET 1");
        User user = dao.get(13);
        System.out.println(user);

/*
        System.out.println("==== DELETE 1(24) & PRINT ALL");
        dao.delete(24);
        all = dao.getAll();
        all.forEach(System.out::println);
*/
/*
        System.out.println("==== UPDATE 13 & PRINT ALL");
        User u = dao.get(13);
        u.setGroupId(77);
        dao.update(u);
        all = dao.getAll();
        all.forEach(System.out::println);
*/
        User u = new User();
        u.setLogin("LLL-X");
        u.setName("NNN-X");
        System.out.println(u);
        dao.insert(u);
        System.out.println(u);
        all = dao.getAll();
        all.forEach(System.out::println);


        HibernateUtil.getSessionFactory().close();
    }
}
