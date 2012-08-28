/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankEntityBean;

/**
 *
 * @author SENJURO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankBean bb = new BankBean();
        boolean flag = bb.makeTransaction("08282012001", "08282012100", 10000);
        System.out.println("result: " + flag);
    }
}
