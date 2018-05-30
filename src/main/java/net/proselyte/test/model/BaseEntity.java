package net.proselyte.test.model;

/**
 * Base class that contains property ID.
 *
 * @author Eugene Suleimanov
 */
public class BaseEntity {

    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isNew() {
        return this.id == null;
    }
}
