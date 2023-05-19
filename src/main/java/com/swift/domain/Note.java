package com.swift.domain;

public class Note {
    private Integer cardId;
    private String cardTitle;
    private String cardBody;
    private String publicationDate;
    private Integer visible;
    private String expirationDate;

    public Note(Integer id, String title, String body, String createTime, Integer visible, String deadline) {
        this.cardId = id;
        this.cardTitle = title;
        this.cardBody = body;
        this.publicationDate = createTime;
        this.visible = visible;
        this.expirationDate = deadline;
    }

    public Note(){}
    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardTitle() {
        return cardTitle;
    }

    public void setCardTitle(String cardTitle) {
        this.cardTitle = cardTitle;
    }

    public String getCardBody() {
        return cardBody;
    }

    public void setCardBody(String cardBody) {
        this.cardBody = cardBody;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Note{" +
                "cardId=" + cardId +
                ", cardTitle='" + cardTitle + '\'' +
                ", cardBody='" + cardBody + '\'' +
                ", publicationDate=" + publicationDate +
                ", visible=" + visible +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
