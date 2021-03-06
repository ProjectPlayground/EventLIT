package com.cse110.eventlit.db;

import org.json.JSONObject;

public class Rsvp {
    public int orgid;
    public String eventid;
    public Event.RSVPStatus rsvpStatus;

    public Rsvp() {}

    public Rsvp(int orgid, String eventid, Event.RSVPStatus rsvpStatus) {
        this.orgid = orgid;
        this.eventid = eventid;
        this.rsvpStatus = rsvpStatus;
    }

    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        try {
            json.put("orgid", orgid);
            json.put("eventid", eventid);
            json.put("rsvpStatus", rsvpStatus.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }

    @Override
    public String toString() {
        return toJSON().toString();
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Rsvp) {
            Rsvp rsvpOther = (Rsvp) other;
            return this.orgid == rsvpOther.orgid
                    && this.eventid.equals(rsvpOther.eventid)
                    && this.rsvpStatus == rsvpOther.rsvpStatus;
        }
        return false;
    }

    public int getOrgid() {
        return orgid;
    }

    public void setOrgid(int orgid) {
        this.orgid = orgid;
    }

    public String getEventid() {
        return eventid;
    }

    public void setEventid(String eventid) {
        this.eventid = eventid;
    }

    public Event.RSVPStatus getRsvpStatus() {
        return rsvpStatus;
    }

    public void setRsvpStatus(Event.RSVPStatus rsvpStatus) {
        this.rsvpStatus = rsvpStatus;
    }
}
