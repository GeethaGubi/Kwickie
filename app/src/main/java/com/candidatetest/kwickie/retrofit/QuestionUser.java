package com.candidatetest.kwickie.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuestionUser {

    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("profilePicturePath")
    @Expose
    private String profilePicturePath;
    @SerializedName("bioText")
    @Expose
    private String bioText;
    @SerializedName("mixpanelId")
    @Expose
    private Object mixpanelId;
    @SerializedName("jobTitle")
    @Expose
    private String jobTitle;
    @SerializedName("coverImage")
    @Expose
    private String coverImage;
    @SerializedName("celebVerified")
    @Expose
    private Boolean celebVerified;
    @SerializedName("autogenerated")
    @Expose
    private Boolean autogenerated;
    @SerializedName("featured")
    @Expose
    private Integer featured;
    @SerializedName("directKwickieBlocked")
    @Expose
    private Boolean directKwickieBlocked;
    @SerializedName("appLoginBlocked")
    @Expose
    private Boolean appLoginBlocked;
    @SerializedName("realm")
    @Expose
    private Object realm;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("challenges")
    @Expose
    private Object challenges;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("emailVerified")
    @Expose
    private Boolean emailVerified;
    @SerializedName("status")
    @Expose
    private Object status;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("lastUpdated")
    @Expose
    private String lastUpdated;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("credentials")
    @Expose
    private Object credentials;

    /**
     *
     * @return
     * The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     * The firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     * The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     * The lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     * The profilePicturePath
     */
    public String getProfilePicturePath() {
        return profilePicturePath;
    }

    /**
     *
     * @param profilePicturePath
     * The profilePicturePath
     */
    public void setProfilePicturePath(String profilePicturePath) {
        this.profilePicturePath = profilePicturePath;
    }

    /**
     *
     * @return
     * The bioText
     */
    public String getBioText() {
        return bioText;
    }

    /**
     *
     * @param bioText
     * The bioText
     */
    public void setBioText(String bioText) {
        this.bioText = bioText;
    }

    /**
     *
     * @return
     * The mixpanelId
     */
    public Object getMixpanelId() {
        return mixpanelId;
    }

    /**
     *
     * @param mixpanelId
     * The mixpanelId
     */
    public void setMixpanelId(Object mixpanelId) {
        this.mixpanelId = mixpanelId;
    }

    /**
     *
     * @return
     * The jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     *
     * @param jobTitle
     * The jobTitle
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     *
     * @return
     * The coverImage
     */
    public String getCoverImage() {
        return coverImage;
    }

    /**
     *
     * @param coverImage
     * The coverImage
     */
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    /**
     *
     * @return
     * The celebVerified
     */
    public Boolean getCelebVerified() {
        return celebVerified;
    }

    /**
     *
     * @param celebVerified
     * The celebVerified
     */
    public void setCelebVerified(Boolean celebVerified) {
        this.celebVerified = celebVerified;
    }

    /**
     *
     * @return
     * The autogenerated
     */
    public Boolean getAutogenerated() {
        return autogenerated;
    }

    /**
     *
     * @param autogenerated
     * The autogenerated
     */
    public void setAutogenerated(Boolean autogenerated) {
        this.autogenerated = autogenerated;
    }

    /**
     *
     * @return
     * The featured
     */
    public Integer getFeatured() {
        return featured;
    }

    /**
     *
     * @param featured
     * The featured
     */
    public void setFeatured(Integer featured) {
        this.featured = featured;
    }

    /**
     *
     * @return
     * The directKwickieBlocked
     */
    public Boolean getDirectKwickieBlocked() {
        return directKwickieBlocked;
    }

    /**
     *
     * @param directKwickieBlocked
     * The directKwickieBlocked
     */
    public void setDirectKwickieBlocked(Boolean directKwickieBlocked) {
        this.directKwickieBlocked = directKwickieBlocked;
    }

    /**
     *
     * @return
     * The appLoginBlocked
     */
    public Boolean getAppLoginBlocked() {
        return appLoginBlocked;
    }

    /**
     *
     * @param appLoginBlocked
     * The appLoginBlocked
     */
    public void setAppLoginBlocked(Boolean appLoginBlocked) {
        this.appLoginBlocked = appLoginBlocked;
    }

    /**
     *
     * @return
     * The realm
     */
    public Object getRealm() {
        return realm;
    }

    /**
     *
     * @param realm
     * The realm
     */
    public void setRealm(Object realm) {
        this.realm = realm;
    }

    /**
     *
     * @return
     * The username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     * The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     * The challenges
     */
    public Object getChallenges() {
        return challenges;
    }

    /**
     *
     * @param challenges
     * The challenges
     */
    public void setChallenges(Object challenges) {
        this.challenges = challenges;
    }

    /**
     *
     * @return
     * The email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     * The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     * The emailVerified
     */
    public Boolean getEmailVerified() {
        return emailVerified;
    }

    /**
     *
     * @param emailVerified
     * The emailVerified
     */
    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    /**
     *
     * @return
     * The status
     */
    public Object getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(Object status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The created
     */
    public String getCreated() {
        return created;
    }

    /**
     *
     * @param created
     * The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     *
     * @return
     * The lastUpdated
     */
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     *
     * @param lastUpdated
     * The lastUpdated
     */
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The credentials
     */
    public Object getCredentials() {
        return credentials;
    }

    /**
     *
     * @param credentials
     * The credentials
     */
    public void setCredentials(Object credentials) {
        this.credentials = credentials;
    }

}

