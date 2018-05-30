package net.proselyte.test.model;

import java.util.Objects;
import java.util.Set;

/**
 * Created by proselyte on 22.05.18.
 */
public class Developer extends BaseEntity{
    private String name;
    private Set<Skill> skills;

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
        return "Developer{" +
                "id=" + id +
                "name='" + name + '\'' +
                ", skills=" + skills +
                '}';
    }
}
