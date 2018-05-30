package net.proselyte.test.repository.jdbc;

import net.proselyte.test.model.Developer;
import net.proselyte.test.model.Skill;
import net.proselyte.test.repository.SkillRepository;
import net.proselyte.test.util.ConnectionUtil;

import java.sql.*;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by proselyte on 22.05.18.
 */
public class JdbcSkillRepositoryImpl implements SkillRepository {

    //TODO: add getting connections logic
    Connection connection = null;
    ConnectionUtil connectionUtil = new ConnectionUtil();

    public JdbcSkillRepositoryImpl() {
        this.connection = connectionUtil.getConnection();
    }

    public Set<Skill> getList(long id) throws SQLException {
        Set<Skill> skills = new TreeSet<>();
        Statement stmt = connection.createStatement();
        ResultSet res = stmt.executeQuery("SELECT skills.id, skills.`name` " +
                "FROM production_db.developers_skills INNER JOIN skills ON skills.id = skill_id WHERE developer_id = " + id);
        while (res.next()){
            skills.add(new Skill(res.getLong(1), res.getString(2)));
        }
        return skills;
    }

    public void save(Skill skill) {
        try {
            Statement stmt = connection.createStatement();
            stmt.executeQuery("INSERT INTO skills VALUES ('" + skill.getName() + "')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Skill getById(Long id) {
        try {
            Statement stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT skills.name FROM skills WHERE skills.id = '" + id + "'");
            res.next();
            return new Skill(id, res.getString(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Collection<Skill> getAll() {
        Set<Skill> skills = new TreeSet<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM skills");
            while (res.next()){
                skills.add(new Skill(res.getLong(1), res.getString(2)));
            }
            return skills;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void delete(Long id) {
        try {
            Statement stmt = connection.createStatement();
            stmt.executeQuery("DELETE FROM skills WHERE id = '" + id + "'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public ResultSet executeQuery(String sql) {
//        Statement stmt;
//        try {
//            stmt = connection.createStatement();
//            return stmt.executeQuery(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}
