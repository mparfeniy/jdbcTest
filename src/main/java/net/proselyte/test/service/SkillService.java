package net.proselyte.test.service;

import net.proselyte.test.model.Skill;
import net.proselyte.test.repository.SkillRepository;
import net.proselyte.test.repository.jdbc.JdbcSkillRepositoryImpl;

/**
 *
 */
public class SkillService {
    SkillRepository skillRepository = new JdbcSkillRepositoryImpl();

    void save(Skill skill){
        this.skillRepository.save(skill);
    }




}
