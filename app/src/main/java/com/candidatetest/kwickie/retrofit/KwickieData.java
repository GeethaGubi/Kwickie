package com.candidatetest.kwickie.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KwickieData {

    @SerializedName("questionUserId")
    @Expose
    private Integer questionUserId;
    @SerializedName("questionVideoId")
    @Expose
    private Integer questionVideoId;
    @SerializedName("q_video_avail")
    @Expose
    private Boolean qVideoAvail;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("answerUserId")
    @Expose
    private Integer answerUserId;
    @SerializedName("answerVideoId")
    @Expose
    private Integer answerVideoId;
    @SerializedName("a_video_avail")
    @Expose
    private Boolean aVideoAvail;
    @SerializedName("kwickieVideoId")
    @Expose
    private Integer kwickieVideoId;
    @SerializedName("k_video_avail")
    @Expose
    private Boolean kVideoAvail;
    @SerializedName("topicId")
    @Expose
    private Integer topicId;
    @SerializedName("answered")
    @Expose
    private Boolean answered;
    @SerializedName("publishDate")
    @Expose
    private String publishDate;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("seen")
    @Expose
    private Boolean seen;
    @SerializedName("featured")
    @Expose
    private Object featured;
    @SerializedName("shareUrl")
    @Expose
    private String shareUrl;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("celebsVerified")
    @Expose
    private Boolean celebsVerified;
    @SerializedName("topicDefault")
    @Expose
    private Boolean topicDefault;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("likesCount")
    @Expose
    private Integer likesCount;
    @SerializedName("liked")
    @Expose
    private Boolean liked;
    @SerializedName("questionUser")
    @Expose
    private QuestionUser questionUser;
    @SerializedName("kwickieVideo")
    @Expose
    private KwickieVideo kwickieVideo;
    @SerializedName("answerUser")
    @Expose
    private AnswerUser answerUser;
    @SerializedName("topics")
    @Expose
    private Topics topics;

    /**
     *
     * @return
     * The questionUserId
     */
    public Integer getQuestionUserId() {
        return questionUserId;
    }

    /**
     *
     * @param questionUserId
     * The questionUserId
     */
    public void setQuestionUserId(Integer questionUserId) {
        this.questionUserId = questionUserId;
    }

    /**
     *
     * @return
     * The questionVideoId
     */
    public Integer getQuestionVideoId() {
        return questionVideoId;
    }

    /**
     *
     * @param questionVideoId
     * The questionVideoId
     */
    public void setQuestionVideoId(Integer questionVideoId) {
        this.questionVideoId = questionVideoId;
    }

    /**
     *
     * @return
     * The qVideoAvail
     */
    public Boolean getQVideoAvail() {
        return qVideoAvail;
    }

    /**
     *
     * @param qVideoAvail
     * The q_video_avail
     */
    public void setQVideoAvail(Boolean qVideoAvail) {
        this.qVideoAvail = qVideoAvail;
    }

    /**
     *
     * @return
     * The status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The answerUserId
     */
    public Integer getAnswerUserId() {
        return answerUserId;
    }

    /**
     *
     * @param answerUserId
     * The answerUserId
     */
    public void setAnswerUserId(Integer answerUserId) {
        this.answerUserId = answerUserId;
    }

    /**
     *
     * @return
     * The answerVideoId
     */
    public Integer getAnswerVideoId() {
        return answerVideoId;
    }

    /**
     *
     * @param answerVideoId
     * The answerVideoId
     */
    public void setAnswerVideoId(Integer answerVideoId) {
        this.answerVideoId = answerVideoId;
    }

    /**
     *
     * @return
     * The aVideoAvail
     */
    public Boolean getAVideoAvail() {
        return aVideoAvail;
    }

    /**
     *
     * @param aVideoAvail
     * The a_video_avail
     */
    public void setAVideoAvail(Boolean aVideoAvail) {
        this.aVideoAvail = aVideoAvail;
    }

    /**
     *
     * @return
     * The kwickieVideoId
     */
    public Integer getKwickieVideoId() {
        return kwickieVideoId;
    }

    /**
     *
     * @param kwickieVideoId
     * The kwickieVideoId
     */
    public void setKwickieVideoId(Integer kwickieVideoId) {
        this.kwickieVideoId = kwickieVideoId;
    }

    /**
     *
     * @return
     * The kVideoAvail
     */
    public Boolean getKVideoAvail() {
        return kVideoAvail;
    }

    /**
     *
     * @param kVideoAvail
     * The k_video_avail
     */
    public void setKVideoAvail(Boolean kVideoAvail) {
        this.kVideoAvail = kVideoAvail;
    }

    /**
     *
     * @return
     * The topicId
     */
    public Integer getTopicId() {
        return topicId;
    }

    /**
     *
     * @param topicId
     * The topicId
     */
    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    /**
     *
     * @return
     * The answered
     */
    public Boolean getAnswered() {
        return answered;
    }

    /**
     *
     * @param answered
     * The answered
     */
    public void setAnswered(Boolean answered) {
        this.answered = answered;
    }

    /**
     *
     * @return
     * The publishDate
     */
    public String getPublishDate() {
        return publishDate;
    }

    /**
     *
     * @param publishDate
     * The publishDate
     */
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
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
     * The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     *
     * @param updatedAt
     * The updatedAt
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     *
     * @return
     * The seen
     */
    public Boolean getSeen() {
        return seen;
    }

    /**
     *
     * @param seen
     * The seen
     */
    public void setSeen(Boolean seen) {
        this.seen = seen;
    }

    /**
     *
     * @return
     * The featured
     */
    public Object getFeatured() {
        return featured;
    }

    /**
     *
     * @param featured
     * The featured
     */
    public void setFeatured(Object featured) {
        this.featured = featured;
    }

    /**
     *
     * @return
     * The shareUrl
     */
    public String getShareUrl() {
        return shareUrl;
    }

    /**
     *
     * @param shareUrl
     * The shareUrl
     */
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    /**
     *
     * @return
     * The _private
     */
    public Boolean getPrivate() {
        return _private;
    }

    /**
     *
     * @param _private
     * The private
     */
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    /**
     *
     * @return
     * The celebsVerified
     */
    public Boolean getCelebsVerified() {
        return celebsVerified;
    }

    /**
     *
     * @param celebsVerified
     * The celebsVerified
     */
    public void setCelebsVerified(Boolean celebsVerified) {
        this.celebsVerified = celebsVerified;
    }

    /**
     *
     * @return
     * The topicDefault
     */
    public Boolean getTopicDefault() {
        return topicDefault;
    }

    /**
     *
     * @param topicDefault
     * The topicDefault
     */
    public void setTopicDefault(Boolean topicDefault) {
        this.topicDefault = topicDefault;
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
     * The likesCount
     */
    public Integer getLikesCount() {
        return likesCount;
    }

    /**
     *
     * @param likesCount
     * The likesCount
     */
    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    /**
     *
     * @return
     * The liked
     */
    public Boolean getLiked() {
        return liked;
    }

    /**
     *
     * @param liked
     * The liked
     */
    public void setLiked(Boolean liked) {
        this.liked = liked;
    }

    /**
     *
     * @return
     * The questionUser
     */
    public QuestionUser getQuestionUser() {
        return questionUser;
    }

    /**
     *
     * @param questionUser
     * The questionUser
     */
    public void setQuestionUser(QuestionUser questionUser) {
        this.questionUser = questionUser;
    }

    /**
     *
     * @return
     * The kwickieVideo
     */
    public KwickieVideo getKwickieVideo() {
        return kwickieVideo;
    }

    /**
     *
     * @param kwickieVideo
     * The kwickieVideo
     */
    public void setKwickieVideo(KwickieVideo kwickieVideo) {
        this.kwickieVideo = kwickieVideo;
    }

    /**
     *
     * @return
     * The answerUser
     */
    public AnswerUser getAnswerUser() {
        return answerUser;
    }

    /**
     *
     * @param answerUser
     * The answerUser
     */
    public void setAnswerUser(AnswerUser answerUser) {
        this.answerUser = answerUser;
    }

    /**
     *
     * @return
     * The topics
     */
    public Topics getTopics() {
        return topics;
    }

    /**
     *
     * @param topics
     * The topics
     */
    public void setTopics(Topics topics) {
        this.topics = topics;
    }

}
