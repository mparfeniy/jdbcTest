package net.proselyte.test.view;

import net.proselyte.test.model.Skill;
import net.proselyte.test.service.DeveloperService;
import net.proselyte.test.service.SkillService;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Set;
import java.util.TreeSet;

public class SkillView {

        private SkillService skillService;
    private static SessionFactory sessionFactory;

        public void useService(){

            sessionFactory = new Configuration().configure().buildSessionFactory();
            skillService = new SkillService();

            Long skillId1 = skillService.add("Ruby");
            Long skillId2 = skillService.add("Perl");

            System.out.println("List of skills:");
            skillService.list();

            System.out.println("===================================");
            System.out.println("Updating 1st skill");
            skillService.update(skillId1, "Python");

            System.out.println("===================================");
            System.out.println("Deleting 2nd skill");
            skillService.delete(skillId2);

            System.out.println("Final list of skills");

            skillService.list();
            System.out.println("===================================");
            sessionFactory.close();

        }
}
