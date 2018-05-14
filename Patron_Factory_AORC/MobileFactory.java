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
public class MobileFactory {
    public static Mobile createMobile(String type){
		if(type.equals(Mobile.IPHONE)){
			return new Iphone(3, "A9", "A9 GPu");
		}else if(type.equals(Mobile.SONY)){
			return new Sony(4,"Snapdragon");
		}else if(type.equals(Mobile.SAMSUNG)){
			return new Samsung("SamsungExynos");
		}else if (type.equals(Mobile.LG)){
                        return new LG(1,"MediaTek");
                }else if (type.equals(Mobile.MOTOROLA)){
                        return new Motorola(2, "Qualcomm");
                }else if (type.equals(Mobile.NOKIA)){
                        return new Nokia("Intel");
                }else
                {
			return null;
                }
    }
}
