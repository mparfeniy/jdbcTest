package net.proselyte.test.service;

import net.proselyte.test.model.Skill;
import net.proselyte.test.repository.SkillRepository;
import net.proselyte.test.repository.jdbc.JdbcSkillRepositoryImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 */
public class SkillService {
    private SkillRepository skillRepository;

    public SkillService() {
        skillRepository = new JdbcSkillRepositoryImpl();
    }

    public void save(Skill skill){
        this.skillRepository.save(skill);
    }

    public Skill getById(Long id) {
        return this.skillRepository.getById(id);
    }

    public Collection<Skill> getAll() throws SQLException {
        return this.skillRepository.getAll();
    }

    public void delete(Long id) {
        this.skillRepository.delete(id);
    }

}
