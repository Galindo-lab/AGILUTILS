package SCRUM;

import agileutils.Team;
import agileutils.TeamMember;


public class ScrumTeam extends Team {

    private ScrumMaster scrumMaster;

    public ScrumTeam(ScrumMaster scrumMaster, int id, String name) {
        super(id, name);
        this.scrumMaster = scrumMaster;
    }

    public ScrumMaster getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(TeamMember scrumMaster) {
        this.scrumMaster = (ScrumMaster) scrumMaster;
    }

}
