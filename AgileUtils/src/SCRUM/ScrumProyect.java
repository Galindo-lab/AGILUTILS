package SCRUM;

import agileutils.Activity;
import agileutils.Proyect;
import agileutils.Requirement;
import agileutils.Team;
import agileutils.UserHistory;
import java.time.Period;
import java.util.Vector;

public class ScrumProyect extends Proyect {

    public Vector<Risk> risks = new Vector<>();
    public Vector<Evaluation> evaluations = new Vector<>();
    public Vector<ScrumTeam> scrumTeam = new Vector<>();

    public Vector<Team> teams = new Vector<>();
    
    public ScrumBacklog backlog = new ScrumBacklog();

    public ScrumProyect(String name, String objetive) {
        super(name, objetive);
    }

    public void addRequirement(String description) {
        this.requirements.add(new Requirement(description));
    }

    public void addTask(int id, String name, String description, Period period) {
        this.taskboard.addActivity(new Activity(id, name, description, period));
    }

    public void addUserHistory(String title, String description, String aceptationCriteria) {
        this.stories.add(new UserHistory(title, description, aceptationCriteria));
    }

    public void addTeam(String name) {
        this.teams.add(new Team(teams.size(), name));
    }
}
