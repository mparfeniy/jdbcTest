package net.proselyte.test.repository.jdbc;

import net.proselyte.test.model.Developer;
import net.proselyte.test.model.Skill;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Set;

public class HibernateDAO {

    private static SessionFactory sessionFactory;

    public static Long addDeveloper(String name, Set<Skill> skills) throws HibernateException {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Developer developer = new Developer(name, skills);
        developer.setSkills(skills);
        Long developerId = (Long)session.save(developer);
        transaction.commit();
        session.close();
        return developerId;
    }

    public static void listDevelopers() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List<Developer> developers = session.createQuery("FROM Developer").list();
        for (Developer developer : developers) {
            System.out.println(developer);
            Set<Skill> skills = developer.getSkills();
            for (Skill project : skills) {
                System.out.println(project);
            }
            System.out.println("\n================\n");
        }
        session.close();
    }

    public static void updateDeveloper(Long developerId, String name) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Developer developer = session.get(Developer.class, developerId);
        developer.setName(name);
        session.update(developer);
        transaction.commit();
        session.close();
    }

    public static void removeDeveloper(Long developerId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Developer developer = session.get(Developer.class, developerId);
        session.delete(developer);
        transaction.commit();
        session.close();
    }
}
