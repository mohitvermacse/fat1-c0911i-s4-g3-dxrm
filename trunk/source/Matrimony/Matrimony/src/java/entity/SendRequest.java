/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author nvc
 */
public class SendRequest {
    private int sendId;
    private int userId;
    private String content;
    private Date dates;
    private String status;

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
     * @return the dates
     */
    public Date getDates() {
        return dates;
    }

    /**
     * @param dates the dates to set
     */
    public void setDates(Date dates) {
        this.dates = dates;
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
    
}
