package net.proselyte.test.view;

import net.proselyte.test.model.Developer;
import net.proselyte.test.model.Skill;
import net.proselyte.test.repository.jdbc.JdbcSkillRepositoryImpl;
import net.proselyte.test.service.DeveloperService;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;
import java.util.Set;
import java.util.TreeSet;

public class DeveloperView {

    private DeveloperService developerService;
    private JdbcSkillRepositoryImpl jdbcSkillRepository;
    private static SessionFactory sessionFactory;


    public void useService() throws HibernateException {
        sessionFactory = new Configuration().configure().buildSessionFactory();
        developerService = new DeveloperService();
        jdbcSkillRepository = new JdbcSkillRepositoryImpl();

        Set<Skill> skills = new TreeSet<>();
        skills.add(new Skill(1L, "Ruby"));
        skills.add(new Skill(2L, "Perl"));

        Long developerId1 = developerService.addDeveloper("Michael", skills);
        Long developerId2 = developerService.addDeveloper("Ivan", skills);

        System.out.println("List of developers");
        DeveloperService.listDevelopers();

        System.out.println("===================================");
        System.out.println("Updating Michael");
        DeveloperService.updateDeveloper(developerId1, "Misha");

        System.out.println("===================================");
        System.out.println("Deleting Ivan");
        DeveloperService.removeDeveloper(2L);

        System.out.println("Final list of developers");

        DeveloperService.listDevelopers();
        System.out.println("===================================");
        sessionFactory.close();
    }
}
