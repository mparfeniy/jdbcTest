package net.proselyte.test.view;

import net.proselyte.test.model.Skill;
import net.proselyte.test.service.SkillService;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SkillView {

    private SkillService skillService;
    private static SessionFactory sessionFactory;

        public void useService(){

            sessionFactory = new Configuration().configure().buildSessionFactory();
            skillService = new SkillService();

            skillService.save(new Skill(1L,"Ruby"));
            skillService.save(new Skill(2L, "Perl"));

            System.out.println("List of skills:");
            skillService.getAll();

            System.out.println("Getting skill by id");
            skillService.getById(1L);

            System.out.println("===================================");
            System.out.println("Deleting 2nd skill");
            skillService.delete(2L);

            System.out.println("Final list of skills");

            skillService.getAll();
            System.out.println("===================================");
            sessionFactory.close();

        }
}
