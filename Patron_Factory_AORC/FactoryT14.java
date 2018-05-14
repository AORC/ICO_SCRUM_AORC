/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryt14;

/**
 *
 * @author Oswaldo
 */
public class FactoryT14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobile mobile = MobileFactory.createMobile(Mobile.IPHONE);
        Mobile mobile1 = MobileFactory.createMobile(Mobile.LG);
        Mobile mobile2 = MobileFactory.createMobile(Mobile.MOTOROLA);
        Mobile mobile3 = MobileFactory.createMobile(Mobile.NOKIA);
        Mobile mobile4 = MobileFactory.createMobile(Mobile.SAMSUNG);
        Mobile mobile5 = MobileFactory.createMobile(Mobile.SONY);
        
    }
    
}
