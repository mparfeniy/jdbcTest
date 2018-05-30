package net.proselyte.test.view;

import net.proselyte.test.model.Skill;
import net.proselyte.test.service.SkillService;

import java.sql.SQLException;

public class SkillView {

        SkillService skillService = new SkillService();

        public void useService(){
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
