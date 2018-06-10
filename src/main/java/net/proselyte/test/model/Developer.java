package net.proselyte.test.model;

import org.hibernate.annotations.Entity;

import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Objects;
import java.util.Set;

/**
 * Created by proselyte on 22.05.18.
 */
@Entity
@Table(name = "developers")
public class Developer extends BaseEntity implements Comparable{
    private String name;
    private Set<Skill> skills;

    public Developer() {
    }

    public Developer(String name, Set<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }

    public Developer(Long id, String name, Set<Skill> skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany
    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(name, developer.name) &&
                Objects.equals(skills, developer.skills);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, skills);
    }

    @Override
    public String toString() {
        return  "\tid = " + id +
                ", name = " + name +
                ", skills = " + skills +
                '\n';
    }

    @Override
    public int compareTo(Object o) {
        return Double.compare(id, ((Developer)o).id);
    }
}
