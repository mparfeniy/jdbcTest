package net.proselyte.test.repository.hibernate;

import net.proselyte.test.model.Developer;
import net.proselyte.test.model.Skill;
import net.proselyte.test.repository.DeveloperRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class HibernateDevRepoImpl implements DeveloperRepository {

    private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    @Override
    public void save(Developer developer) {
        Session session = sessionFactory.openSession();
        Transaction transaction;

        transaction = session.beginTransaction();
        session.createQuery("INSERT INTO skills VALUES ('" + developer.getName() + "', '"
                + developer.getSkills() + "')");
        transaction.commit();
        session.close();
    }

    @Override
    public Developer getById(Long aLong) {
        Session session = sessionFactory.openSession();
        Transaction transaction;

        transaction = session.beginTransaction();
        Developer developer = session.get(Developer.class, aLong);
        transaction.commit();
        session.close();
        return developer;
    }

    @Override
    public Collection<Developer> getAll() {
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
        transaction.commit();
        session.close();
        return developers;
    }

    @Override
    public void delete(Long aLong) {
        Session session = sessionFactory.openSession();
        Transaction transaction;

        transaction = session.beginTransaction();
        Developer developer = session.get(Developer.class, aLong);
        session.delete(developer);
        transaction.commit();
        session.close();
    }

    public void closeSessionFactory(){
        sessionFactory.close();
    }

}
