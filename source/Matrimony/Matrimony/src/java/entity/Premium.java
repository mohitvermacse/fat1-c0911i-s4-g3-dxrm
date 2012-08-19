/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author nvc
 */
public class Premium {
    private int preId;
    private String preType;
    private float amount;

    public Premium() {
    }    

    /**
     * @return the preId
     */
    public int getPreId() {
        return preId;
    }

    /**
     * @param preId the preId to set
     */
    public void setPreId(int preId) {
        this.preId = preId;
    }

    /**
     * @return the preType
     */
    public String getPreType() {
        return preType;
    }

    /**
     * @param preType the preType to set
     */
    public void setPreType(String preType) {
        this.preType = preType;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }
    
}
