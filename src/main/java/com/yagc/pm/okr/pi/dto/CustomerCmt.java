package com.yagc.pm.okr.pi.dto;

/**
 * Objective to hold attributes for customer commit
 *
 * @author Kapil
 * @created 26/01/2021 - 1:12 PM
 * @project pi
 */
public class CustomerCmt {

    private boolean isCustomerCmt; // whether or not its a customer commitment
    private String customerCmtTicket;  // link to the jira ticket linking the customer commitment

    public boolean isCustomerCmt() {
        return isCustomerCmt;
    }

    public void setCustomerCmt(boolean customerCmt) {
        isCustomerCmt = customerCmt;
    }

    public String getCustomerCmtTicket() {
        return customerCmtTicket;
    }

    public void setCustomerCmtTicket(String customerCmtTicket) {
        this.customerCmtTicket = customerCmtTicket;
    }
}
