package net.proselyte.test;

import net.proselyte.test.view.DeveloperView;
import net.proselyte.test.view.SkillView;

public class Main {

    public static void main(String[] args) {

        SkillView skillView = new SkillView();
        DeveloperView developerView = new DeveloperView();
        skillView.useService();
        developerView.useService();

    }
}
