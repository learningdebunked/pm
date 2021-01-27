package com.yagc.pm.okr.pi.dto;

import java.util.List;

/**
 * @author Kapil
 * @created 26/01/2021 - 1:17 PM
 * @project pi
 */
public class ScrumTeamDTO {

    //A scrum team is composed of Employees
    private EmployeeDTO employeeDTO;

    private String totalCapacity; //in person sprints including FE + BE
    private String totalLeaves; // in person sprints including FE + BE

    private String totalFEAvailabilityInPersonSprints;
    private String totalBEAvailabilityInPersonSprints;
    private String totalFEUnAvailabilityInPersonSprints;
    private String totalBEUnAvailabilityInPersonSprints;

    //A scrum team is tagged with objectives
    private List<PIObjectives> piObjectiveList; //this objective holds list of objectives

    public List<PIObjectives> getPiObjectiveList() {
        return piObjectiveList;
    }

    public void setPiObjectiveList(List<PIObjectives> piObjectiveList) {
        this.piObjectiveList = piObjectiveList;
    }

    public EmployeeDTO getEmployeeDTO() {
        return employeeDTO;
    }

    public void setEmployeeDTO(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    public String getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(String totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public String getTotalLeaves() {
        return totalLeaves;
    }

    public void setTotalLeaves(String totalLeaves) {
        this.totalLeaves = totalLeaves;
    }


    public String getTotalFEAvailabilityInPersonSprints() {
        return totalFEAvailabilityInPersonSprints;
    }

    public void setTotalFEAvailabilityInPersonSprints(String totalFEAvailabilityInPersonSprints) {
        this.totalFEAvailabilityInPersonSprints = totalFEAvailabilityInPersonSprints;
    }

    public String getTotalBEAvailabilityInPersonSprints() {
        return totalBEAvailabilityInPersonSprints;
    }

    public void setTotalBEAvailabilityInPersonSprints(String totalBEAvailabilityInPersonSprints) {
        this.totalBEAvailabilityInPersonSprints = totalBEAvailabilityInPersonSprints;
    }

    public String getTotalFEUnAvailabilityInPersonSprints() {
        return totalFEUnAvailabilityInPersonSprints;
    }

    public void setTotalFEUnAvailabilityInPersonSprints(String totalFEUnAvailabilityInPersonSprints) {
        this.totalFEUnAvailabilityInPersonSprints = totalFEUnAvailabilityInPersonSprints;
    }

    public String getTotalBEUnAvailabilityInPersonSprints() {
        return totalBEUnAvailabilityInPersonSprints;
    }

    public void setTotalBEUnAvailabilityInPersonSprints(String totalBEUnAvailabilityInPersonSprints) {
        this.totalBEUnAvailabilityInPersonSprints = totalBEUnAvailabilityInPersonSprints;
    }


    //other analytic metrics can go here , i will figure this out as i make progress
}