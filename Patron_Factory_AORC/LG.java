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
public class LG extends Mobile{
	private int ramSize;
	private String processor;
	
	public LG(int ramSize, String processor){
		this.ramSize = ramSize;
		this.processor = processor;
                System.out.println("LG");
                System.out.println("Procesador: " + processor);
                System.out.println("RAM: " + ramSize);
                System.out.println("--------------------");
        }
    
}
