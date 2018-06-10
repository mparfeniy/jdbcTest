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

    private static SessionFactory sessionFactory;
    private Transaction transaction;

    public HibernateSkillRepoImpl() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public void save(Skill skill) {

        Session session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        session.save(skill);
        transaction.commit();
        session.close();
    }

    @Override
    public Skill getById(Long aLong) {
        Session session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        Skill skill = session.get(Skill.class, aLong);
        transaction.commit();
        session.close();
        return skill;
    }

    @Override
    public Collection<Skill> getAll() {
        Session session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        List<Skill> skills = session.createCriteria(Skill.class).list();
        transaction.commit();
        session.close();
        return skills;
    }

    @Override
    public void delete(Long aLong) {
        Session session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        Skill skill = session.get(Skill.class, aLong);
        session.delete(skill);
        transaction.commit();
        session.close();
    }

}
