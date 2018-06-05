package net.proselyte.test;

import net.proselyte.test.view.DeveloperView;
import net.proselyte.test.view.SkillView;
import org.hibernate.HibernateException;

public class Main {

    public static void main(String[] args) {

        DeveloperView developerView = new DeveloperView();
        try {
            developerView.useService();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
}
