package com.example.campusteamup;

public class Team_Members_Model {
    String teamLeader , member2 , member3 , member4 , member5 , member6;

    public Team_Members_Model() {
    }

    public Team_Members_Model(String teamLeader, String member2, String member3, String member4, String member5, String member6) {
        this.teamLeader = teamLeader;
        this.member2 = member2;
        this.member3 = member3;
        this.member4 = member4;
        this.member5 = member5;
        this.member6 = member6;
    }

    public String getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(String teamLeader) {
        this.teamLeader = teamLeader;
    }

    public String getMember2() {
        return member2;
    }

    public void setMember2(String member2) {
        this.member2 = member2;
    }

    public String getMember3() {
        return member3;
    }

    public void setMember3(String member3) {
        this.member3 = member3;
    }

    public String getMember4() {
        return member4;
    }

    public void setMember4(String member4) {
        this.member4 = member4;
    }

    public String getMember5() {
        return member5;
    }

    public void setMember5(String member5) {
        this.member5 = member5;
    }

    public String getMember6() {
        return member6;
    }

    public void setMember6(String member6) {
        this.member6 = member6;
    }
}
