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
public class Nokia extends Mobile {
    private int ramSize;
	private String processor;
	public String name = Mobile.SAMSUNG;
	public Nokia(int ramSize){
		this.ramSize = ramSize;
	}
	
	public Nokia(String processor){
		this.processor = processor;
		this.ramSize =1;
                System.out.println("NOKIA");
                System.out.println("Procesador: " + processor);
                System.out.println("RAM: " + ramSize);
                System.out.println("--------------------");
                
 }
        
    
}
