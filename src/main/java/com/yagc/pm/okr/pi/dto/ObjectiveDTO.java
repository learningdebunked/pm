package com.yagc.pm.okr.pi.dto;

import java.util.List;


/**
 * @author Kapil
 * @created 26/01/2021 - 1:08 PM
 * @project pi
 */
public class ObjectiveDTO {

    private List<PIObjectives> piObjective;
    private String name; // name of the objective
    private String jiraTicket; // link to jira ticket
    private String featureLink; // link to confluence page
    private String objectiveTargetReleaseDate; //target release date of the objective
    private String actualReleaseDate; // actual release date of the objective
    private String commitment;  // above the line or stretch goal for the Team
    private CustomerCmt customer;
    private String rank;
    private DependencyDTO dependency;
    private RiskDTO risk;  //risks associated with this dependency
    private boolean isNewProduct;
    private boolean isNewFeature;
    private boolean isEnhancementWithConfigs;
    private boolean isEnhancementWithoutConfigs;
    private List<PriorityDTO> priority;
    private List<ValueDTO> values;
    private String delayedReason;
    private String targetedSprintDelivery;
    private String actualSprintDelivery;
    private String fixVersion;


    public List<PIObjectives> getPiObjective() {
        return piObjective;
    }

    public void setPiObjective(List<PIObjectives> piObjective) {
        this.piObjective = piObjective;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJiraTicket() {
        return jiraTicket;
    }

    public void setJiraTicket(String jiraTicket) {
        this.jiraTicket = jiraTicket;
    }

    public String getFeatureLink() {
        return featureLink;
    }

    public void setFeatureLink(String featureLink) {
        this.featureLink = featureLink;
    }

    public String getObjectiveTargetReleaseDate() {
        return objectiveTargetReleaseDate;
    }

    public void setObjectiveTargetReleaseDate(String objectiveTargetReleaseDate) {
        this.objectiveTargetReleaseDate = objectiveTargetReleaseDate;
    }

    public String getActualReleaseDate() {
        return actualReleaseDate;
    }

    public void setActualReleaseDate(String actualReleaseDate) {
        this.actualReleaseDate = actualReleaseDate;
    }

    public String getCommitment() {
        return commitment;
    }

    public void setCommitment(String commitment) {
        this.commitment = commitment;
    }

    public CustomerCmt getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerCmt customer) {
        this.customer = customer;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public DependencyDTO getDependency() {
        return dependency;
    }

    public void setDependency(DependencyDTO dependency) {
        this.dependency = dependency;
    }

    public RiskDTO getRisk() {
        return risk;
    }

    public void setRisk(RiskDTO risk) {
        this.risk = risk;
    }

    public boolean isNewProduct() {
        return isNewProduct;
    }

    public void setNewProduct(boolean newProduct) {
        isNewProduct = newProduct;
    }

    public boolean isNewFeature() {
        return isNewFeature;
    }

    public void setNewFeature(boolean newFeature) {
        isNewFeature = newFeature;
    }

    public boolean isEnhancementWithConfigs() {
        return isEnhancementWithConfigs;
    }

    public void setEnhancementWithConfigs(boolean enhancementWithConfigs) {
        isEnhancementWithConfigs = enhancementWithConfigs;
    }

    public boolean isEnhancementWithoutConfigs() {
        return isEnhancementWithoutConfigs;
    }

    public void setEnhancementWithoutConfigs(boolean enhancementWithoutConfigs) {
        isEnhancementWithoutConfigs = enhancementWithoutConfigs;
    }

    public List<PriorityDTO> getPriority() {
        return priority;
    }

    public void setPriority(List<PriorityDTO> priority) {
        this.priority = priority;
    }

    public List<ValueDTO> getValues() {
        return values;
    }

    public void setValues(List<ValueDTO> values) {
        this.values = values;
    }

    public String getDelayedReason() {
        return delayedReason;
    }

    public void setDelayedReason(String delayedReason) {
        this.delayedReason = delayedReason;
    }

    public String getTargetedSprintDelivery() {
        return targetedSprintDelivery;
    }

    public void setTargetedSprintDelivery(String targetedSprintDelivery) {
        this.targetedSprintDelivery = targetedSprintDelivery;
    }

    public String getActualSprintDelivery() {
        return actualSprintDelivery;
    }

    public void setActualSprintDelivery(String actualSprintDelivery) {
        this.actualSprintDelivery = actualSprintDelivery;
    }

    public String getFixVersion() {
        return fixVersion;
    }

    public void setFixVersion(String fixVersion) {
        this.fixVersion = fixVersion;
    }

}
