package net.proselyte.test.service;

import net.proselyte.test.model.Skill;
import net.proselyte.test.repository.hibernate.HibernateSkillRepoImpl;

public class SkillService {
//    private SkillRepository skillRepository;
    private HibernateSkillRepoImpl hibernateSkillRepo;

    public SkillService() {
        hibernateSkillRepo = new HibernateSkillRepoImpl();
    }

    public void save(Skill skill) {
       this.hibernateSkillRepo.save(skill);
    }

    public void getAll(){
        this.hibernateSkillRepo.getAll();
    }

    public void getById(Long aLong){
        this.hibernateSkillRepo.getById(aLong);
    }

    public void delete(Long skillId){
        this.hibernateSkillRepo.delete(skillId);
    }

}
