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
public class Iphone extends Mobile{
	private int ramSize;
	private String processor;
	private String GPU;
	public Iphone(int ramSize, String processor, String GPU){
		this.ramSize = ramSize;
		this.processor = processor;
		this.GPU = GPU;
                System.out.println("IPHONE");
                System.out.println("Procesador: " + processor);
                System.out.println("RAM: " + ramSize);
                System.out.println("GPU: " + GPU);
                System.out.println("--------------------");
        }
    
}
