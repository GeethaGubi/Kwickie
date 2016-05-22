package com.candidatetest.kwickie.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Brands {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("coverImage")
    @Expose
    private String coverImage;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("BioText")
    @Expose
    private String BioText;
    @SerializedName("videoLogo")
    @Expose
    private Object videoLogo;
    @SerializedName("id")
    @Expose
    private Integer id;

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     *
     * @param logo
     * The logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
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
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The color
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     * The color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     * The BioText
     */
    public String getBioText() {
        return BioText;
    }

    /**
     *
     * @param BioText
     * The BioText
     */
    public void setBioText(String BioText) {
        this.BioText = BioText;
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

