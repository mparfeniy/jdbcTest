package net.proselyte.test.service;

import net.proselyte.test.model.Skill;
import net.proselyte.test.repository.hibernate.HibernateDevRepoImpl;
import org.hibernate.HibernateException;

import java.util.Set;

public class DeveloperService {

    HibernateDevRepoImpl hibernateDevRepo;

    public DeveloperService() {
        hibernateDevRepo = new HibernateDevRepoImpl();
    }

    public Long add(String name, Set<Skill> skills) throws HibernateException {
        return this.hibernateDevRepo.save(name, skills);
    }

    public void list(){
        this.hibernateDevRepo.list();
    }

    public void update(Long developerId, String name){
        this.hibernateDevRepo.update(developerId, name);
    }

    public void remove(Long developerId){
        this.hibernateDevRepo.delete(developerId);
    }

}
