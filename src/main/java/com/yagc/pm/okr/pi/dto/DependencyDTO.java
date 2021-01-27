package com.yagc.pm.okr.pi.dto;

import java.util.List;
import java.util.Map;

/**
 * This class represents the dependencies associated with a particular objective
 *
 * @author Kapil
 * @created 26/01/2021 - 1:25 PM
 * @project pi
 */
public class DependencyDTO {

    //This would be map of team and division  for ex: this map would represent dependency on UX
    // along with the division ux is tagged too
    private List<Map<String, String>> dependencies;

    public List<Map<String, String>> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<Map<String, String>> dependencies) {
        this.dependencies = dependencies;
    }
}
