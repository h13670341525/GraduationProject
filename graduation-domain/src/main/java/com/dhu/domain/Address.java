package com.dhu.domain;

public class Address {
    private String addressid;

    private String addressprovince;

    private String addresscity;

    private String addressarea;

    private String addressdescription;

    private String userid;

    private String username;

    private String userphone;

    public String getAddressid() {
        return addressid;
    }

    public void setAddressid(String addressid) {
        this.addressid = addressid == null ? null : addressid.trim();
    }

    public String getAddressprovince() {
        return addressprovince;
    }

    public void setAddressprovince(String addressprovince) {
        this.addressprovince = addressprovince == null ? null : addressprovince.trim();
    }

    public String getAddresscity() {
        return addresscity;
    }

    public void setAddresscity(String addresscity) {
        this.addresscity = addresscity == null ? null : addresscity.trim();
    }

    public String getAddressarea() {
        return addressarea;
    }

    public void setAddressarea(String addressarea) {
        this.addressarea = addressarea == null ? null : addressarea.trim();
    }

    public String getAddressdescription() {
        return addressdescription;
    }

    public void setAddressdescription(String addressdescription) {
        this.addressdescription = addressdescription == null ? null : addressdescription.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }
}