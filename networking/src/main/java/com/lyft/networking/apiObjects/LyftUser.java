package com.lyft.networking.apiObjects;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a user object model on the Lyft API.
 * This object model can be used to represent the base line
 * information for a driver or a passenger on the Lyft platform
 */
public class LyftUser
{
    /**
     * Rating of the user; current rating (0.0 – 5.0).
     */
    @SerializedName("rating")
    public String rating;
    /**
     * Id of the user
     */
    @SerializedName("user_id")
    public String user_id;
    /**
     * First Name
     */
    @SerializedName("first_name")
    public String first_name;
    /**
     * Last Name
     */
    @SerializedName("last_name")
    public String last_name;
    /**
     * Profile picture image
     */
    @SerializedName("image_url")
    public String image_url;

}
