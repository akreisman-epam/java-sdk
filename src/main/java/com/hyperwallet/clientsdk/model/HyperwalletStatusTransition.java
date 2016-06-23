package com.hyperwallet.clientsdk.model;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.hyperwallet.clientsdk.HyperwalletJsonConfiguration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@JsonFilter(HyperwalletJsonConfiguration.INCLUSION_FILTER)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class HyperwalletStatusTransition extends HyperwalletBaseMonitor {

    public static enum Status {ACTIVATED, DE_ACTIVATED, SUSPENDED, UNSUSPENDED, LOST_OR_STOLEN, LOCKED, UNLLOCKED}

    private String token;

    private Status transition;
    private Status fromStatus;
    private Status toStatus;

    private Date createdOn;

    private String notes;

    public String getToken() {
        return token;
    }

    public HyperwalletStatusTransition() {}

    public HyperwalletStatusTransition(Status status) {
        addField("transition", transition);
        this.transition = status;
    }

    public void setToken(String token) {
        addField("token", token);
        this.token = token;
    }

    public HyperwalletStatusTransition token(String token) {
        addField("token", token);
        this.token = token;
        return this;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        addField("createdOn", createdOn);
        this.createdOn = createdOn;
    }

    public HyperwalletStatusTransition createdOn(Date createdOn) {
        addField("createdOn", createdOn);
        this.createdOn = createdOn;
        return this;
    }

    public Status getTransition() {
        return transition;
    }

    public void setTransition(Status transition) {
        addField("transition", transition);
        this.transition = transition;
    }

    public HyperwalletStatusTransition transition(Status transition) {
        addField("transition", transition);
        this.transition = transition;
        return this;
    }

    public Status getFromStatus() {
        return fromStatus;
    }

    public void setFromStatus(Status fromStatus) {
        addField("fromStatus", fromStatus);
        this.fromStatus = fromStatus;
    }

    public HyperwalletStatusTransition fromStatus(Status fromStatus) {
        addField("fromStatus", fromStatus);
        this.fromStatus = fromStatus;
        return this;
    }

    public Status getToStatus() {
        return toStatus;
    }

    public void setToStatus(Status toStatus) {
        addField("toStatus", toStatus);
        this.toStatus = toStatus;
    }

    public HyperwalletStatusTransition toStatus(Status toStatus) {
        addField("toStatus", toStatus);
        this.toStatus = toStatus;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        addField("notes", notes);
        this.notes = notes;
    }

    public HyperwalletStatusTransition notes(String notes) {
        addField("notes", notes);
        this.notes = notes;
        return this;
    }
}