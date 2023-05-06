/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajero;

public class Cajero {
	
	   int saldoEnCuenta = 0;
	   String clave = "123";
	  
	  
	  public Cajero() {  
		}
			
	    
	    
		public Cajero(int saldoEnCuenta, String clave) { 
		this.saldoEnCuenta = saldoEnCuenta;
		this.clave = clave;
                }
		
		
		public int getSaldoEnCuenta() {
			return saldoEnCuenta;
		}
		public void setSaldoEnCuenta(int saldoEnCuenta) {
			this.saldoEnCuenta = saldoEnCuenta;
		}
		public String getClave() {
			return clave;
		}
		public void setClave(String clave) {
			this.clave = clave;
		}
	 
	    
	    
	    
	    
	    

}
