import java.util.ArrayList;
import java.util.Arrays;

public class BranchBound {
	
		
	private int n; // numero de pasteleros
	private int m; // tipos de pasteles
	private int pasteleros[]; // [1,2,3,4,5]  de 1 a n pasteleros
	private int pedidos[];    // [1,1,3,2,1]  n pedidos, tantos pedidos como pasteleros
	private int costes[][];   //  el valor cij corresponde al coste de que el pastelero i realice el pastel j
	//private int coste;        //  tiene tantas filas como pasteleros (n rows) y tantas columnas como pasteles (m cols)
	

    public BranchBound(int n, int m, int pasteleros[], int pedidos[], int costes[][]){
    	
    	this.n = n;
    	this.m = m;
    	this.pasteleros = pasteleros;
    	this.pedidos = pedidos;
    	this.costes = costes;		
	}       
    
    
  
    

    /* Ejecuta el algoritmo de Ramificacion y Poda "pasteleria" sobre los datos de entrada. Si
     * trazaOn es true, muestra la traza del algoritmo */
    public String pasteleria(boolean trazaOn){  

        String resultado = "";
        String traza = "";
       
        
        
        
        
//        String aux = Arrays.toString(pasteleros);
//        System.out.println(aux);        
        
        // Si la traza esta activa, la muestra. En otro caso solo muestra el resultado
        if(trazaOn){return traza;}
        return resultado;        
    }
    
    
    
    
    @Override
    public String toString() {
    	String c = "";
    	for(int i = 0; i<this.costes.length; i++) {
    		for(int j = 0; j< this.costes[0].length; j++) {
    			c += this.costes[i][j];
    		}
    		c+="\n";
    	}
        return "n: " + this.n + ", m: " + this.m + "\npasteleros: " + Arrays.toString(pasteleros) + "\npedidos: " + Arrays.toString(pedidos) + "\ncostes: \n"+c;
    }

}
