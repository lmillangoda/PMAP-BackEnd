// Generated with g9.

package com.sliit.pmap.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="readings")
public class Readings implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

    @Id
    @Column(unique=true, nullable=false, precision=19)
    private long id;
    @Column(nullable=false, precision=22)
    private double current;
    @Column(nullable=false, precision=22)
    private double voltage;
    @Column(nullable=false, precision=22)
    private double frequency;
    @Column(nullable=false, precision=22)
    private double power;
    @Column(name="read_at", nullable=false)
    private Date readAt;

    /** Default constructor. */
    public Readings() {
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
     * Access method for power.
     *
     * @return the current value of power
     */
    public double getPower() {
        return power;
    }

    /**
     * Setter method for power.
     *
     * @param aPower the new value for power
     */
    public void setPower(double aPower) {
        power = aPower;
    }

    /**
     * Access method for readAt.
     *
     * @return the current value of readAt
     */
    public Date getReadAt() {
        return readAt;
    }

    /**
     * Setter method for readAt.
     *
     * @param aReadAt the new value for readAt
     */
    public void setReadAt(Date aReadAt) {
        readAt = aReadAt;
    }

    /**
     * Compares the key for this instance with another Readings.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Readings and the key objects are equal
     */

}
