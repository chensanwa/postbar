package com.postbar.entity;

import java.util.Date;

//帖子类

public class Post {

    private int postId;         //帖子ID
    private int userId;          //发帖人
    private String title;       //帖子标题
    private String textContent;     //帖子正文内容
//    private List<Blob> picture;     //帖子图片
//    private List<CommentText> commentTexts;
    private Date postTime;      //发帖时间   //评论列表

    public Post() {
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

//    public void setPicture(List<Blob> picture) {
//        this.picture = picture;
//    }

//    public List<Blob> getPicture() {
//        return picture;
//    }

//    public List<CommentText> getCommentTexts() {
//        return commentTexts;
//    }

    public String getTextContent() {
        return textContent;
    }

    public String getTitle() {
        return title;
    }

//    public void setCommentTexts(List<CommentText> commentTexts) {
//        this.commentTexts = commentTexts;
//    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
