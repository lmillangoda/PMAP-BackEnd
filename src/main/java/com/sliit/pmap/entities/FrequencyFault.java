// Generated with g9.

package com.sliit.pmap.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="frequency_fault")
public class FrequencyFault implements Serializable {
	@Id
    @Column(unique=true, nullable=false, precision=19)
    private long id;
    @Column(nullable=false, precision=22)
    private double frequency;
    @Column(name="fault_at", nullable=false)
    private Date faultAt;

    /** Default constructor. */
    public FrequencyFault() {
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
     * Access method for frequency.
     *
     * @return the current value of frequency
     */
    public double getFrequency() {
        return frequency;
    }

    /**
     * Setter method for frequency.
     *
     * @param aFrequency the new value for frequency
     */
    public void setFrequency(double aFrequency) {
        frequency = aFrequency;
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
