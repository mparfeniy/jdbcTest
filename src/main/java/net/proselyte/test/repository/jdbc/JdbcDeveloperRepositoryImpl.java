package net.proselyte.test.repository.jdbc;

import net.proselyte.test.model.Developer;
import net.proselyte.test.repository.DeveloperRepository;
import net.proselyte.test.repository.SkillRepository;
import net.proselyte.test.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by proselyte on 22.05.18.
 */
public class JdbcDeveloperRepositoryImpl implements DeveloperRepository {

    Connection connection;
    ConnectionUtil connectionUtil = new ConnectionUtil();
    SkillRepository skillRepository = new JdbcSkillRepositoryImpl();

    public JdbcDeveloperRepositoryImpl() {
        this.connection = connectionUtil.getConnection();
    }

    public void save(Developer developer) {
        try {
            Statement stmt = connection.createStatement();
            stmt.executeQuery("INSERT INTO skills VALUES ('" + developer.getName() + "', '"
                    + developer.getSkills() + "')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Developer getById(Long id) {
        try {
            Statement stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM developers WHERE id = '" + id + "'");
            res.next();
            return new Developer(id, res.getString(1), ((JdbcSkillRepositoryImpl) skillRepository).getList(id));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Collection<Developer> getAll() {
        Set<Developer> developers = new TreeSet<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM developers");
            while (res.next()){
                developers.add(new Developer(res.getLong(1), res.getString(2),
                        ((JdbcSkillRepositoryImpl) skillRepository).getList(res.getLong(1))));
            }
            return developers;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void delete(Long id) {
        try {
            Statement stmt = connection.createStatement();
            stmt.executeQuery("DELETE FROM developers WHERE id = '" + id + "'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
