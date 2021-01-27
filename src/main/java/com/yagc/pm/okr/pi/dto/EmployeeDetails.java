package com.yagc.pm.okr.pi.dto;

/**
 * This DTO can be populated by
 *
 * @author Kapil
 * @created 26/01/2021 - 1:19 PM
 * @project pi
 */
public class EmployeeDetails {

    private String fName;
    private String lName;
    private String mNumber;
    private String emergencyContactNumber;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }
}
