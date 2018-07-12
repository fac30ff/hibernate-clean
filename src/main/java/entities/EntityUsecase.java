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
        User user = dao.get(20);
        System.out.println(user);

/*
        System.out.println("==== DELETE 1(26) & PRINT ALL");
        dao.delete(26);
        all = dao.getAll();
        all.forEach(System.out::println);
*/

/*
        System.out.println("==== UPDATE 13 & PRINT ALL");
        User u = dao.get(25);
        u.setGroupId(999);
        dao.update(u);
        all = dao.getAll();
        all.forEach(System.out::println);
*/
        User u = new User();
        u.setLogin("LLL-XXX");
        u.setName("NNN-XJJ");
        System.out.println(u);
        dao.insert(u);
        System.out.println(u);
        all = dao.getAll();
        all.forEach(System.out::println);


        HibernateUtil.getSessionFactory().close();
    }
}
