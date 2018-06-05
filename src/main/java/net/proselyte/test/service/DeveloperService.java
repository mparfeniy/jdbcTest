package net.proselyte.test.service;

import net.proselyte.test.model.Developer;
import net.proselyte.test.model.Skill;
import net.proselyte.test.repository.DeveloperRepository;
import net.proselyte.test.repository.jdbc.HibernateDAO;
import net.proselyte.test.repository.jdbc.JdbcDeveloperRepositoryImpl;
import org.hibernate.HibernateException;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Set;

public class DeveloperService {

    static HibernateDAO hibernateDAO;

    public DeveloperService() {
        hibernateDAO = new HibernateDAO();
    }

    public Long addDeveloper(String name, Set<Skill> skills) throws HibernateException {
        return HibernateDAO.addDeveloper(name, skills);
    }

    public static void listDevelopers(){
        HibernateDAO.listDevelopers();
    }

    public static void updateDeveloper(Long developerId, String name){
        HibernateDAO.updateDeveloper(developerId, name);
    }

    public static void removeDeveloper(Long developerId){
        HibernateDAO.removeDeveloper(developerId);
    }

}
