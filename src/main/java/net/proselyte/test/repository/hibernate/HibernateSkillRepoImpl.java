package net.proselyte.test.repository.hibernate;

import net.proselyte.test.model.Developer;
import net.proselyte.test.model.Skill;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Set;

public class HibernateSkillRepoImpl {

    private static SessionFactory sessionFactory;

    public Long add(String name) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Skill skill = new Skill(name);
        Long skillId = (Long)session.save(skill);
        transaction.commit();
        session.close();
        return skillId;
    }

    public void list() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        List<Skill> skills = session.createQuery("FROM Skill").list();
        for (Skill skill : skills) {
            System.out.println(skill);
            System.out.println("\n================\n");
        }
        session.close();
    }

    public void update(Long skillId, String name) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Skill skill = session.get(Skill.class, skillId);
        skill.setName(name);
        session.update(skill);
        transaction.commit();
        session.close();
    }

    public void delete(Long skillId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        transaction = session.beginTransaction();
        Skill skill = session.get(Skill.class, skillId);
        session.delete(skillId);
        transaction.commit();
        session.close();
    }
}
