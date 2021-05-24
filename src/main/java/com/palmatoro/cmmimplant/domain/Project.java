package com.palmatoro.cmmimplant.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.Date;
import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;

    private String name;

    public enum ProjectType {
        WATERFALL,
        AGILE
    }

    private ProjectType projectType;

    private Date startDate;

    private Date endDate;

    // Relationships

    //private List<User> users;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RiskAndOpportunity> risksAndOpportunities;

    // Getters and Setters

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectType getProjectType() {
        return this.projectType;
    }

    public void setProjectType(ProjectType projectType) {
        this.projectType = projectType;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /*public List<User> getUsers() {
        return this.users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }*/

    public List<RiskAndOpportunity> getRisksAndOpportunities(){
        return this.risksAndOpportunities;
    }

    public void setRisksAndOpportunities(List<RiskAndOpportunity> risksAndOpportunities){
        this.risksAndOpportunities = risksAndOpportunities;
    }
}
