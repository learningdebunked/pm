package com.yagc.pm.okr.pi.dto;

import java.util.List;

/**
 * @author Kapil
 * @created 26/01/2021 - 8:48 AM
 * @project pi
 */
public class DivisionDTO<T> {

    //Division can take any type scrum team(s)
    private List<T> t;

    private String rte; // name of the rte
    private String plt; // name of the plt

    private List<BlocksDTO> blocks; // The dependencies on this division could block multiple objectives

    //how do these map to the okr's , TODO ask some one
    //private OKR okr;

    public List<T> getT() {
        return t;
    }

    public void setT(List<T> t) {
        this.t = t;
    }

    public String getRte() {
        return rte;
    }

    public void setRte(String rte) {
        this.rte = rte;
    }

    public String getPlt() {
        return plt;
    }

    public void setPlt(String plt) {
        this.plt = plt;
    }


/*    public OKR getOkr() {
        return okr;
    }

    public void setOkr(OKR okr) {
        this.okr = okr;
    }*/
}
