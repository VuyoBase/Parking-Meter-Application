/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBEntities;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gee
 */
@Entity
@Table(name = "CARSTB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carstb.findAll", query = "SELECT c FROM Carstb c"),
    @NamedQuery(name = "Carstb.findByAmount", query = "SELECT c FROM Carstb c WHERE c.amount = :amount"),
    @NamedQuery(name = "Carstb.findByAmountentered", query = "SELECT c FROM Carstb c WHERE c.amountentered = :amountentered"),
    @NamedQuery(name = "Carstb.findByChange", query = "SELECT c FROM Carstb c WHERE c.change = :change"),
    @NamedQuery(name = "Carstb.findById", query = "SELECT c FROM Carstb c WHERE c.id = :id"),
    @NamedQuery(name = "Carstb.findByTimeenter", query = "SELECT c FROM Carstb c WHERE c.timeenter = :timeenter"),
    @NamedQuery(name = "Carstb.findByTimeexit", query = "SELECT c FROM Carstb c WHERE c.timeexit = :timeexit")})
public class Carstb implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private Double amount;
    @Column(name = "AMOUNTENTERED")
    private Double amountentered;
    @Column(name = "CHANGE")
    private Double change;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "TIMEENTER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeenter;
    @Column(name = "TIMEEXIT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeexit;

    public Carstb() {
    }

    public Carstb(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        Double oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    public Double getAmountentered() {
        return amountentered;
    }

    public void setAmountentered(Double amountentered) {
        Double oldAmountentered = this.amountentered;
        this.amountentered = amountentered;
        changeSupport.firePropertyChange("amountentered", oldAmountentered, amountentered);
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        Double oldChange = this.change;
        this.change = change;
        changeSupport.firePropertyChange("change", oldChange, change);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public Date getTimeenter() {
        return timeenter;
    }

    public void setTimeenter(Date timeenter) {
        Date oldTimeenter = this.timeenter;
        this.timeenter = timeenter;
        changeSupport.firePropertyChange("timeenter", oldTimeenter, timeenter);
    }

    public Date getTimeexit() {
        return timeexit;
    }

    public void setTimeexit(Date timeexit) {
        Date oldTimeexit = this.timeexit;
        this.timeexit = timeexit;
        changeSupport.firePropertyChange("timeexit", oldTimeexit, timeexit);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carstb)) {
            return false;
        }
        Carstb other = (Carstb) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "You entered:\n" + this.amountentered + "\nYour Change:\n" + this.change;
    }

    public void reset() {
        this.amount = 0.0;
        this.amountentered = 0.0;
        this.change = 0.0;
        this.id = 0;
        this.timeenter = new Date();
        this.timeexit = new Date();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
