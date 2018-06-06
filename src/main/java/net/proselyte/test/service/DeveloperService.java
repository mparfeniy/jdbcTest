package net.proselyte.test.service;

import net.proselyte.test.model.Developer;
import net.proselyte.test.model.Skill;
import net.proselyte.test.repository.hibernate.HibernateDevRepoImpl;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

import java.util.Set;

public class DeveloperService {

    HibernateDevRepoImpl hibernateDevRepo;

    public DeveloperService() {
        hibernateDevRepo = new HibernateDevRepoImpl();
    }

    public void save(Developer developer) throws HibernateException {
        this.hibernateDevRepo.save(developer);
    }

    public void getById(Long aLong){
        this.hibernateDevRepo.getById(aLong);
    }

    public void getAll(){
        this.hibernateDevRepo.getAll();
    }

    public void delete(Long developerId){
        this.hibernateDevRepo.delete(developerId);
    }

    public void closeSessionFactory(){
        this.hibernateDevRepo.closeSessionFactory();
    }

}
