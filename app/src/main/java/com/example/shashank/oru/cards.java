package com.example.shashank.oru;

/**
 * Created by shashank on 7/14/2018.
 */

public class cards {
    private String userId;
    private String name;
    private String profileImageUrl;
    public cards (String userId, String name, String profileImageUrl) {
        this.userId = userId;
        this.name = name;
        this.profileImageUrl = name;
    }

    public String getUserId() {

        return userId;
    }

    public void setUserId(String userId){

        this.userId = userId;
    }

    public String getName(){

        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getProfileImageUrl(){

        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl){
        this.name = profileImageUrl;
    }
}
