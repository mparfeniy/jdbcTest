package net.proselyte.test.repository.hibernate;

import net.proselyte.test.model.Skill;
import net.proselyte.test.repository.SkillRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Collection;
import java.util.List;

public class HibernateSkillRepoImpl implements SkillRepository {

    private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    @Override
    public void save(Skill skill) {
        Session session = sessionFactory.openSession();
        Transaction transaction;

        transaction = session.beginTransaction();
        session.save(skill);
        transaction.commit();
        session.close();
    }

    @Override
    public Skill getById(Long aLong) {
        Session session = sessionFactory.openSession();
        Transaction transaction;

        transaction = session.beginTransaction();
        Skill skill = session.get(Skill.class, aLong);
        transaction.commit();
        session.close();
        return skill;
    }

    @Override
    public Collection<Skill> getAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List<Skill> skills = session.createQuery("FROM Skill").list();
        for (Skill skill : skills) {
            System.out.println(skill);
            System.out.println("\n================\n");
        }
        transaction.commit();
        session.close();
        return skills;
    }

    @Override
    public void delete(Long aLong) {
        Session session = sessionFactory.openSession();
        Transaction transaction;

        transaction = session.beginTransaction();
        Skill skill = session.get(Skill.class, aLong);
        session.delete(skill);
        transaction.commit();
        session.close();
    }

}
