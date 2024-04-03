package WorkPermission;

import java.util.Objects;

public class Team {

    private String id;
    private String LeaderName;
    private String LeaderH2S;
    private String crewNames;
    private String crewH2S;
    private String roles;





    public Team(String id, String leaderName, String leaderH2S, String crewNames, String crewH2S, String roles) {
        this.id = id;
        LeaderName = leaderName;
        LeaderH2S = leaderH2S;
        this.crewNames = crewNames;
        this.crewH2S = crewH2S;
        this.roles = roles;
    }

    public String getLeaderName() {
        return LeaderName;
    }

    public void setLeaderName(String leaderName) {
        LeaderName = leaderName;
    }

    public String getLeaderH2S() {
        return LeaderH2S;
    }

    public void setLeaderH2S(String leaderH2S) {
        LeaderH2S = leaderH2S;
    }

    public String getCrewNames() {
        return crewNames;
    }

    public void setCrewNames(String crewNames) {
        this.crewNames = crewNames;
    }

    public String getCrewH2S() {
        return crewH2S;
    }

    public void setCrewH2S(String crewH2S) {
        this.crewH2S = crewH2S;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(id, team.id) && Objects.equals(LeaderH2S, team.LeaderH2S) && Objects.equals(crewH2S, team.crewH2S);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, LeaderH2S, crewH2S);
    }

    @Override
    public String toString() {
        return "Team{" +
                "id='" + id + '\'' +
                ", LeaderName='" + LeaderName + '\'' +
                ", LeaderH2S='" + LeaderH2S + '\'' +
                ", crewNames='" + crewNames + '\'' +
                ", crewH2S='" + crewH2S + '\'' +
                ", roles='" + roles + '\'' +
                '}';
    }

}
