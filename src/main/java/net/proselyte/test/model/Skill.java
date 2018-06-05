package net.proselyte.test.model;

import org.hibernate.annotations.Entity;

import javax.persistence.Table;
import java.util.Objects;

/**
 * Simple JavaBean domain object that represents Skill.
 *
 * @author Eugene Suleimanov
 */
@Entity
@Table(name = "skills")
public class Skill extends NamedEntity implements Comparable {

    private String name;

    public Skill() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\tid: ");
        sb.append(id).append(", name='").append(name).append('\n');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return Objects.equals(getName(), skill.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName());
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Skill(String name) {
        this.name = name;
    }

    public Skill(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return Double.compare(id, ((Skill)o).id);
    }
}
