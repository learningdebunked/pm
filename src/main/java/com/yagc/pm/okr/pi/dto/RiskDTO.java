package com.yagc.pm.okr.pi.dto;

import java.util.List;
import java.util.Map;

/**
 * DTO to represent the risks associated with an objective
 *
 * @author Kapil
 * @created 26/01/2021 - 1:36 PM
 * @project pi
 */
public class RiskDTO {

    private List<Map<String, RiskTypes>> risks;

    public List<Map<String, RiskTypes>> getRisks() {
        return risks;
    }

    public void setRisks(List<Map<String, RiskTypes>> risks) {
        this.risks = risks;
    }
}
