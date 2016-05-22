package com.candidatetest.kwickie.retrofit;

import com.candidatetest.kwickie.retrofit.Brands;
import com.candidatetest.kwickie.retrofit.Member;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by geetha on 19/05/2016.
 */
public class Topics {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("brandId")
    @Expose
    private Integer brandId;
    @SerializedName("questionAutoApproved")
    @Expose
    private Boolean questionAutoApproved;
    @SerializedName("answerAutoApproved")
    @Expose
    private Boolean answerAutoApproved;
    @SerializedName("featured")
    @Expose
    private Integer featured;
    @SerializedName("default")
    @Expose
    private Boolean _default;
    @SerializedName("closed")
    @Expose
    private Boolean closed;
    @SerializedName("videoLogo")
    @Expose
    private Object videoLogo;
    @SerializedName("promotionalImageUrl")
    @Expose
    private Object promotionalImageUrl;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("ended")
    @Expose
    private Boolean ended;
    @SerializedName("brands")
    @Expose
    private Brands brands;
    @SerializedName("members")
    @Expose
    private List<Member> members = new ArrayList<Member>();

    /**
     *
     * @return
     * The text
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     * The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The image
     */
    public String getImage() {
        return image;
    }

    /**
     *
     * @param image
     * The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     *
     * @return
     * The startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     *
     * @param startDate
     * The startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     *
     * @return
     * The endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     *
     * @param endDate
     * The endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     *
     * @return
     * The brandId
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     *
     * @param brandId
     * The brandId
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     *
     * @return
     * The questionAutoApproved
     */
    public Boolean getQuestionAutoApproved() {
        return questionAutoApproved;
    }

    /**
     *
     * @param questionAutoApproved
     * The questionAutoApproved
     */
    public void setQuestionAutoApproved(Boolean questionAutoApproved) {
        this.questionAutoApproved = questionAutoApproved;
    }

    /**
     *
     * @return
     * The answerAutoApproved
     */
    public Boolean getAnswerAutoApproved() {
        return answerAutoApproved;
    }

    /**
     *
     * @param answerAutoApproved
     * The answerAutoApproved
     */
    public void setAnswerAutoApproved(Boolean answerAutoApproved) {
        this.answerAutoApproved = answerAutoApproved;
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
     * The _default
     */
    public Boolean getDefault() {
        return _default;
    }

    /**
     *
     * @param _default
     * The default
     */
    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    /**
     *
     * @return
     * The closed
     */
    public Boolean getClosed() {
        return closed;
    }

    /**
     *
     * @param closed
     * The closed
     */
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    /**
     *
     * @return
     * The videoLogo
     */
    public Object getVideoLogo() {
        return videoLogo;
    }

    /**
     *
     * @param videoLogo
     * The videoLogo
     */
    public void setVideoLogo(Object videoLogo) {
        this.videoLogo = videoLogo;
    }

    /**
     *
     * @return
     * The promotionalImageUrl
     */
    public Object getPromotionalImageUrl() {
        return promotionalImageUrl;
    }

    /**
     *
     * @param promotionalImageUrl
     * The promotionalImageUrl
     */
    public void setPromotionalImageUrl(Object promotionalImageUrl) {
        this.promotionalImageUrl = promotionalImageUrl;
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
     * The ended
     */
    public Boolean getEnded() {
        return ended;
    }

    /**
     *
     * @param ended
     * The ended
     */
    public void setEnded(Boolean ended) {
        this.ended = ended;
    }

    /**
     *
     * @return
     * The brands
     */
    public Brands getBrands() {
        return brands;
    }

    /**
     *
     * @param brands
     * The brands
     */
    public void setBrands(Brands brands) {
        this.brands = brands;
    }

    /**
     *
     * @return
     * The members
     */
    public List<Member> getMembers() {
        return members;
    }

    /**
     *
     * @param members
     * The members
     */
    public void setMembers(List<Member> members) {
        this.members = members;
    }

}

