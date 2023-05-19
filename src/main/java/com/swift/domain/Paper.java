package com.swift.domain;

public class Paper {
    private Integer currentPaper;
    private Integer paperSize;
    private Integer totalCount;
    public Paper() {
    }

    public Paper(Integer currentPaper, Integer paperSize) {
        this.currentPaper = currentPaper;
        this.paperSize = paperSize;
    }

    public Paper(Integer currentPaper, Integer paperSize, Integer totalCount) {
        this.currentPaper = currentPaper;
        this.paperSize = paperSize;
        this.totalCount = totalCount;
    }

    public Integer getCurrentPaper() {
        return currentPaper;
    }

    public void setCurrentPaper(Integer currentPaper) {
        this.currentPaper = currentPaper;
    }

    public Integer getPaperSize() {
        return paperSize;
    }

    public void setPaperSize(Integer paperSize) {
        this.paperSize = paperSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "currentPaper=" + currentPaper +
                ", paperSize=" + paperSize +
                ", totalCount=" + totalCount +
                '}';
    }
}
