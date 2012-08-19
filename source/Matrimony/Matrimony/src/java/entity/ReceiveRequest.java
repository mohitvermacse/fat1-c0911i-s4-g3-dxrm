/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author nvc
 */
public class ReceiveRequest{
    private int receiverId;
    private int userId;
    private int sendId;
    private String action;
    private String status;
    private String content;
    private int sendUserId;
    private String images;
    private String fullName;
    
    public ReceiveRequest(){}

    /**
     * @return the receiverId
     */
    public int getReceiverId() {
        return receiverId;
    }

    /**
     * @param receiverId the receiverId to set
     */
    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the sendId
     */
    public int getSendId() {
        return sendId;
    }

    /**
     * @param sendId the sendId to set
     */
    public void setSendId(int sendId) {
        this.sendId = sendId;
    }

    /**
     * @return the action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the sendUserId
     */
    public int getSendUserId() {
        return sendUserId;
    }

    /**
     * @param sendUserId the sendUserId to set
     */
    public void setSendUserId(int sendUserId) {
        this.sendUserId = sendUserId;
    }

    /**
     * @return the images
     */
    public String getImages() {
        return images;
    }

    /**
     * @param images the images to set
     */
    public void setImages(String images) {
        this.images = images;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    
}
