// Generated with g9.

package com.sliit.pmap.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="voltage_fault")
public class VoltageFault implements Serializable {
	@Id
    @Column(unique=true, nullable=false, precision=19)
    private long id;
    @Column(nullable=false, precision=22)
    private double voltage;
    @Column(name="fault_at", nullable=false)
    private Date faultAt;

    /** Default constructor. */
    public VoltageFault() {
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
     * Access method for voltage.
     *
     * @return the current value of voltage
     */
    public double getVoltage() {
        return voltage;
    }

    /**
     * Setter method for voltage.
     *
     * @param aVoltage the new value for voltage
     */
    public void setVoltage(double aVoltage) {
        voltage = aVoltage;
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
