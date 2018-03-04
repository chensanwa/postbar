package com.postbar.entity;

import java.util.Date;

//评论内容类
public class CommentText {

    private int commentId;      //评论ID
    private int postId;         //帖子ID
    private String commentText;     //评论具体内容
    private Date discussTime;       //评论时间
    private User user;          //评论人

    public CommentText() {
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getPostId() {
        return postId;
    }

    public Date getDiscussTime() {
        return discussTime;
    }

    public String getCommentText() {
        return commentText;
    }

    public User getUser() {
        return user;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public void setDiscussTime(Date discussTime) {
        this.discussTime = discussTime;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
