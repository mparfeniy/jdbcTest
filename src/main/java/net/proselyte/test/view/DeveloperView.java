package net.proselyte.test.view;

import net.proselyte.test.model.Developer;
import net.proselyte.test.repository.DeveloperRepository;
import net.proselyte.test.repository.jdbc.JdbcSkillRepositoryImpl;
import net.proselyte.test.service.DeveloperService;

import java.sql.SQLException;

public class DeveloperView {

    DeveloperService developerService;
    JdbcSkillRepositoryImpl jdbcSkillRepository;

    public void useService(){

        developerService = new DeveloperService();
        jdbcSkillRepository = new JdbcSkillRepositoryImpl();

        try {
            developerService.save(new Developer(1L, "Vitya", jdbcSkillRepository.getList(1L)));
            developerService.getAll();
            developerService.getById(3L);
            developerService.delete(1L);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
