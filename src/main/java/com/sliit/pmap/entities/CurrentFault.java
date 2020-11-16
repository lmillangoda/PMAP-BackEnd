// Generated with g9.

package com.sliit.pmap.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="current_fault")
public class CurrentFault implements Serializable {
	@Id
    @Column(unique=true, nullable=false, precision=19)
    private long id;
    @Column(nullable=false, precision=22)
    private double current;
    @Column(name="fault_at", nullable=false)
    private Date faultAt;

    /** Default constructor. */
    public CurrentFault() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public long getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(long aId) {
        id = aId;
    }

    /**
     * Access method for current.
     *
     * @return the current value of current
     */
    public double getCurrent() {
        return current;
    }

    /**
     * Setter method for current.
     *
     * @param aCurrent the new value for current
     */
    public void setCurrent(double aCurrent) {
        current = aCurrent;
    }

    /**
     * Access method for faultAt.
     *
     * @return the current value of faultAt
     */
    public Date getFaultAt() {
        return faultAt;
    }

    /**
     * Setter method for faultAt.
     *
     * @param aFaultAt the new value for faultAt
     */
    public void setFaultAt(Date aFaultAt) {
        faultAt = aFaultAt;
    }

}
