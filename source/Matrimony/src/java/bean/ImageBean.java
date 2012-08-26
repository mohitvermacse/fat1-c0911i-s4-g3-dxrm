/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;
import java.util.*;
import entity.Image;
/**
 *
 * @author UTAN
 */
public class ImageBean {
    private ArrayList<Image> arImg = new ArrayList<Image>();

    /**
     * @return the arImg
     */
    public ArrayList<Image> getArImg() {
        return arImg;
    }

    /**
     * @param arImg the arImg to set
     */
    public void setArImg(ArrayList<Image> arImg) {
        this.arImg = arImg;
    }
}
