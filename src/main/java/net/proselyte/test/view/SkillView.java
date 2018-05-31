package net.proselyte.test.view;

import net.proselyte.test.model.Skill;
import net.proselyte.test.service.SkillService;

import java.sql.SQLException;

public class SkillView {

        private SkillService skillService;

        public void useService(){

            skillService = new SkillService();

            try {
                skillService.save(new Skill(1L, "C#"));
                System.out.println(skillService.getById(2L));
                System.out.println(skillService.getAll());
                skillService.delete(1L);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}
