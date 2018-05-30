package net.proselyte.test.model;

/**
 * Base class that extends {@link BaseEntity} adding property name.
 *
 * @author Eugene Suleimanov
 */
public class NamedEntity extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NamedEntity{" +
                "id='" + super.id + '\'' +
                "name='" + name + '\'' +
                '}';
    }
}
