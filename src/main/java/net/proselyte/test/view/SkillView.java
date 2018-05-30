package net.proselyte.test.view;

import net.proselyte.test.model.Skill;
import net.proselyte.test.service.SkillService;

import java.sql.SQLException;

public class SkillView {

        SkillService skillService;

        public void useService(){

            skillService = new SkillService();

            try {
                skillService.save(new Skill(1L, "Vasya"));
                skillService.getById(2L);
                skillService.getAll();
                skillService.delete(1L);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}
