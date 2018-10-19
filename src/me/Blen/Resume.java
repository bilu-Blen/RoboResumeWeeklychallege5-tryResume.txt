package me.Blen;

import java.util.ArrayList;

public class Resume {
    private String name;
    private String email;
    private int phoneNumber;
    private ArrayList<Education> educationalAchievements;
    private ArrayList<Experience> experiencesList;
    private ArrayList<Skill> skillList;

    public Resume() {
        educationalAchievements = new ArrayList<>();
        experiencesList = new ArrayList<>();
        skillList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Education> getEducationalAchievements() {
        return educationalAchievements;
    }

    public void setEducationalAchievements(ArrayList<Education> educationalAchievements) {
        this.educationalAchievements = educationalAchievements;
    }

    public ArrayList<Experience> getExperiencesList() {
        return experiencesList;
    }

    public void setExperiencesList(ArrayList<Experience> experiencesList) {
        this.experiencesList = experiencesList;
    }

    public ArrayList<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(ArrayList<Skill> skillList) {
        this.skillList = skillList;
    }
}
