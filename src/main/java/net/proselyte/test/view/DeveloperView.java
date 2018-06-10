package net.proselyte.test.view;

import net.proselyte.test.model.Developer;
import net.proselyte.test.model.Skill;
import net.proselyte.test.repository.hibernate.HibernateDevRepoImpl;
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

    public void useService() throws HibernateException {
        developerService = new DeveloperService();

        Set<Skill> skills = new TreeSet<>();
        skills.add(new Skill(1L, "Ruby"));
        skills.add(new Skill(2L, "Perl"));

        developerService.save(new Developer("Michael", skills));
        developerService.save(new Developer("Ivan", skills));

        System.out.println("List of developers");
        developerService.getAll();

        System.out.println("Getting developer by id");
        developerService.getById(1L);

        System.out.println("===================================");
        System.out.println("Deleting Ivan");
        developerService.delete(2L);

        System.out.println("Final list of developers");

        developerService.getAll();
        System.out.println("===================================");

        developerService.closeSessionFactory();
    }
}
