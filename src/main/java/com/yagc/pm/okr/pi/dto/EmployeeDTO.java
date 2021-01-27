package com.yagc.pm.okr.pi.dto;

/**
 * @author Kapil
 * @created 26/01/2021 - 1:18 PM
 * @project pi
 */
public class EmployeeDTO {

    //TODO See and check how we can structure the data
    // TODO i need to apply trie or any type of trees for faster retrieval of data
    private EmployeeDetails details;
    private String role;// engineering manager or developer or architect or QE
    private String availabilityForPI;
    private String unavailabilityForPI;
    private String leaveOfAbsenceStartDate;
    private String leaveOfAbsenceEndDate;

    public EmployeeDetails getDetails() {
        return details;
    }

    public void setDetails(EmployeeDetails details) {
        this.details = details;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAvailabilityForPI() {
        return availabilityForPI;
    }

    public void setAvailabilityForPI(String availabilityForPI) {
        this.availabilityForPI = availabilityForPI;
    }

    public String getUnavailabilityForPI() {
        return unavailabilityForPI;
    }

    public void setUnavailabilityForPI(String unavailabilityForPI) {
        this.unavailabilityForPI = unavailabilityForPI;
    }

    public String getLeaveOfAbsenceStartDate() {
        return leaveOfAbsenceStartDate;
    }

    public void setLeaveOfAbsenceStartDate(String leaveOfAbsenceStartDate) {
        this.leaveOfAbsenceStartDate = leaveOfAbsenceStartDate;
    }

    public String getLeaveOfAbsenceEndDate() {
        return leaveOfAbsenceEndDate;
    }

    public void setLeaveOfAbsenceEndDate(String leaveOfAbsenceEndDate) {
        this.leaveOfAbsenceEndDate = leaveOfAbsenceEndDate;
    }
}
