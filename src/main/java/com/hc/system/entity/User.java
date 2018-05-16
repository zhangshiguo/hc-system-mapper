package com.hc.system.entity;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String loweredusername;

    private String password;

    private Integer isapproved;

    private Integer islockedout;

    private Date createdate;

    private Date lastlogindate;

    private Date lastpasswordchangeddate;

    private Date lastlockoutdate;

    private Integer failedpasswordattemptcount;

    private Date failedpasswordattemptwindowstart;

    private String securitycode;

    private String accesstoken;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getLoweredusername() {
        return loweredusername;
    }

    public void setLoweredusername(String loweredusername) {
        this.loweredusername = loweredusername == null ? null : loweredusername.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getIsapproved() {
        return isapproved;
    }

    public void setIsapproved(Integer isapproved) {
        this.isapproved = isapproved;
    }

    public Integer getIslockedout() {
        return islockedout;
    }

    public void setIslockedout(Integer islockedout) {
        this.islockedout = islockedout;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getLastlogindate() {
        return lastlogindate;
    }

    public void setLastlogindate(Date lastlogindate) {
        this.lastlogindate = lastlogindate;
    }

    public Date getLastpasswordchangeddate() {
        return lastpasswordchangeddate;
    }

    public void setLastpasswordchangeddate(Date lastpasswordchangeddate) {
        this.lastpasswordchangeddate = lastpasswordchangeddate;
    }

    public Date getLastlockoutdate() {
        return lastlockoutdate;
    }

    public void setLastlockoutdate(Date lastlockoutdate) {
        this.lastlockoutdate = lastlockoutdate;
    }

    public Integer getFailedpasswordattemptcount() {
        return failedpasswordattemptcount;
    }

    public void setFailedpasswordattemptcount(Integer failedpasswordattemptcount) {
        this.failedpasswordattemptcount = failedpasswordattemptcount;
    }

    public Date getFailedpasswordattemptwindowstart() {
        return failedpasswordattemptwindowstart;
    }

    public void setFailedpasswordattemptwindowstart(Date failedpasswordattemptwindowstart) {
        this.failedpasswordattemptwindowstart = failedpasswordattemptwindowstart;
    }

    public String getSecuritycode() {
        return securitycode;
    }

    public void setSecuritycode(String securitycode) {
        this.securitycode = securitycode == null ? null : securitycode.trim();
    }

    public String getAccesstoken() {
        return accesstoken;
    }

    public void setAccesstoken(String accesstoken) {
        this.accesstoken = accesstoken == null ? null : accesstoken.trim();
    }
}