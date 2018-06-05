package net.proselyte.test.service;

import net.proselyte.test.repository.hibernate.HibernateSkillRepoImpl;

public class SkillService {
//    private SkillRepository skillRepository;
    private HibernateSkillRepoImpl hibernateSkillRepo;

    public SkillService() {
        hibernateSkillRepo = new HibernateSkillRepoImpl();
    }

    public Long add(String skill) {
       return this.hibernateSkillRepo.add(skill);
    }

    public void list(){
        this.hibernateSkillRepo.list();
    }

    public void update(Long skillId, String name){
        this.hibernateSkillRepo.update(skillId, name);
    }

    public void delete(Long skillId){
        this.hibernateSkillRepo.delete(skillId);
    }

}
