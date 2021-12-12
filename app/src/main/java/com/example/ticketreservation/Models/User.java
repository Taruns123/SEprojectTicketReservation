package com.example.ticketreservation.Models;



public class User {

    String profilepic , userName, mail, password,adharNum, DOB, userId, lastMessage, status;

    public User(){

    }

//    SignUp Constructor


    public User(String userName, String mail, String password,String adharNum,String DOB) {
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.adharNum = adharNum;
        this.DOB = DOB;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User(String profilepic, String userName, String mail, String password, String userId, String lastMessageString ,String adharNum,String DOB) {
        this.profilepic = profilepic;
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.userId = userId;
        this.adharNum = adharNum;
        this.DOB = DOB;
        this.lastMessage = lastMessage;
    }

    public String getAdharNum() {
        return adharNum;
    }

    public void setAdharNum(String adharNum) {
        this.adharNum = adharNum;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
