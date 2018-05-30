package net.proselyte.test.service;

import net.proselyte.test.model.Developer;
import net.proselyte.test.repository.DeveloperRepository;
import net.proselyte.test.repository.jdbc.JdbcDeveloperRepositoryImpl;

import java.sql.SQLException;
import java.util.Collection;

public class DeveloperService {

    DeveloperRepository developerRepository = new JdbcDeveloperRepositoryImpl();

    public void save(Developer developer) {
        this.developerRepository.save(developer);
    }

    public Developer getById(Long id) {
        return this.developerRepository.getById(id);
    }

    public Collection<Developer> getAll() throws SQLException {
        return this.developerRepository.getAll();
    }

    public void delete(Long id) {
        this.developerRepository.delete(id);
    }
}
