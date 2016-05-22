package com.candidatetest.kwickie.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KwickieVideo {

    @SerializedName("processId")
    @Expose
    private String processId;
    @SerializedName("name")
    @Expose
    private Object name;
    @SerializedName("accountId")
    @Expose
    private Integer accountId;
    @SerializedName("complete")
    @Expose
    private Integer complete;
    @SerializedName("still")
    @Expose
    private Integer still;
    @SerializedName("stillSeconds")
    @Expose
    private Integer stillSeconds;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("lowQualityUrl")
    @Expose
    private String lowQualityUrl;
    @SerializedName("highQualityUrl")
    @Expose
    private String highQualityUrl;
    @SerializedName("playlistUrl")
    @Expose
    private String playlistUrl;
    @SerializedName("processPlaylistUrl")
    @Expose
    private String processPlaylistUrl;
    @SerializedName("thumbWidth")
    @Expose
    private Integer thumbWidth;
    @SerializedName("thumbHeight")
    @Expose
    private Integer thumbHeight;
    @SerializedName("thumbUrl")
    @Expose
    private String thumbUrl;
    @SerializedName("posterUrl")
    @Expose
    private String posterUrl;
    @SerializedName("alertThumbUrl")
    @Expose
    private Object alertThumbUrl;
    @SerializedName("alertThumbWidth")
    @Expose
    private Integer alertThumbWidth;
    @SerializedName("alertThumbHeight")
    @Expose
    private Integer alertThumbHeight;
    @SerializedName("id")
    @Expose
    private Integer id;

    /**
     *
     * @return
     * The processId
     */
    public String getProcessId() {
        return processId;
    }

    /**
     *
     * @param processId
     * The processId
     */
    public void setProcessId(String processId) {
        this.processId = processId;
    }

    /**
     *
     * @return
     * The name
     */
    public Object getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(Object name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The accountId
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     *
     * @param accountId
     * The accountId
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     *
     * @return
     * The complete
     */
    public Integer getComplete() {
        return complete;
    }

    /**
     *
     * @param complete
     * The complete
     */
    public void setComplete(Integer complete) {
        this.complete = complete;
    }

    /**
     *
     * @return
     * The still
     */
    public Integer getStill() {
        return still;
    }

    /**
     *
     * @param still
     * The still
     */
    public void setStill(Integer still) {
        this.still = still;
    }

    /**
     *
     * @return
     * The stillSeconds
     */
    public Integer getStillSeconds() {
        return stillSeconds;
    }

    /**
     *
     * @param stillSeconds
     * The stillSeconds
     */
    public void setStillSeconds(Integer stillSeconds) {
        this.stillSeconds = stillSeconds;
    }

    /**
     *
     * @return
     * The description
     */
    public Object getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(Object description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     *
     * @param duration
     * The duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     *
     * @return
     * The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     * The createdAt
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return
     * The lowQualityUrl
     */
    public String getLowQualityUrl() {
        return lowQualityUrl;
    }

    /**
     *
     * @param lowQualityUrl
     * The lowQualityUrl
     */
    public void setLowQualityUrl(String lowQualityUrl) {
        this.lowQualityUrl = lowQualityUrl;
    }

    /**
     *
     * @return
     * The highQualityUrl
     */
    public String getHighQualityUrl() {
        return highQualityUrl;
    }

    /**
     *
     * @param highQualityUrl
     * The highQualityUrl
     */
    public void setHighQualityUrl(String highQualityUrl) {
        this.highQualityUrl = highQualityUrl;
    }

    /**
     *
     * @return
     * The playlistUrl
     */
    public String getPlaylistUrl() {
        return playlistUrl;
    }

    /**
     *
     * @param playlistUrl
     * The playlistUrl
     */
    public void setPlaylistUrl(String playlistUrl) {
        this.playlistUrl = playlistUrl;
    }

    /**
     *
     * @return
     * The processPlaylistUrl
     */
    public String getProcessPlaylistUrl() {
        return processPlaylistUrl;
    }

    /**
     *
     * @param processPlaylistUrl
     * The processPlaylistUrl
     */
    public void setProcessPlaylistUrl(String processPlaylistUrl) {
        this.processPlaylistUrl = processPlaylistUrl;
    }

    /**
     *
     * @return
     * The thumbWidth
     */
    public Integer getThumbWidth() {
        return thumbWidth;
    }

    /**
     *
     * @param thumbWidth
     * The thumbWidth
     */
    public void setThumbWidth(Integer thumbWidth) {
        this.thumbWidth = thumbWidth;
    }

    /**
     *
     * @return
     * The thumbHeight
     */
    public Integer getThumbHeight() {
        return thumbHeight;
    }

    /**
     *
     * @param thumbHeight
     * The thumbHeight
     */
    public void setThumbHeight(Integer thumbHeight) {
        this.thumbHeight = thumbHeight;
    }

    /**
     *
     * @return
     * The thumbUrl
     */
    public String getThumbUrl() {
        return thumbUrl;
    }

    /**
     *
     * @param thumbUrl
     * The thumbUrl
     */
    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    /**
     *
     * @return
     * The posterUrl
     */
    public String getPosterUrl() {
        return posterUrl;
    }

    /**
     *
     * @param posterUrl
     * The posterUrl
     */
    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    /**
     *
     * @return
     * The alertThumbUrl
     */
    public Object getAlertThumbUrl() {
        return alertThumbUrl;
    }

    /**
     *
     * @param alertThumbUrl
     * The alertThumbUrl
     */
    public void setAlertThumbUrl(Object alertThumbUrl) {
        this.alertThumbUrl = alertThumbUrl;
    }

    /**
     *
     * @return
     * The alertThumbWidth
     */
    public Integer getAlertThumbWidth() {
        return alertThumbWidth;
    }

    /**
     *
     * @param alertThumbWidth
     * The alertThumbWidth
     */
    public void setAlertThumbWidth(Integer alertThumbWidth) {
        this.alertThumbWidth = alertThumbWidth;
    }

    /**
     *
     * @return
     * The alertThumbHeight
     */
    public Integer getAlertThumbHeight() {
        return alertThumbHeight;
    }

    /**
     *
     * @param alertThumbHeight
     * The alertThumbHeight
     */
    public void setAlertThumbHeight(Integer alertThumbHeight) {
        this.alertThumbHeight = alertThumbHeight;
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

}

