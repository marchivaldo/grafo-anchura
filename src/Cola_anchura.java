
	import java.io.*;
	import java.util.*;
	import java.util.ArrayList;

	public class Cola_anchura {

private Nodo primero,ultimo;
public int tamano;

public Cola_anchura()
{
	primero=null;
	ultimo=null;
	tamano=0;
}

		public void Mostrar()throws NumberFormatException, IOException
		{
			if(primero==null) { System.out.println("\nCola vacía");
			}
		else
		{
			Nodo aux = new Nodo(0,null);
			aux=primero;
			System.out.print("\nElementos: \n");
			
			for(int i=0;i<tamano;i++)
			{
				if(aux.siguiente==ultimo)
				{
					System.out.print(aux);
					System.out.println(ultimo);
				}else {
					System.out.println(aux);
					aux=aux.siguiente;
				}
			}
		}
		}
		
		public int Sacar() {

		int dato;
			if(primero==null) { System.out.println("\nCola vacía");
			return(1000000);
				}
			else
			{
				if(tamano>1) {
					Nodo aux=new Nodo(0,null);
					dato=primero.elemento;
					aux=primero.siguiente;
					primero=null;
					primero=aux;
					tamano--;
				}else 
					{				
					dato=primero.elemento;
					primero=null;
					ultimo=null;
					tamano=0;
				}
				return dato;
			}	
		}
		
		public void Insertar(int elemento){

			Nodo aux = new Nodo(elemento, null);
			if(tamano==0)
			{
				primero=aux;
				ultimo=aux;
			}else {
				if(tamano==1)
				{
					primero.setSiguiente(aux);
				}else {
					ultimo.setSiguiente(aux);
				}
				ultimo=aux;
			}
				tamano++;
		}
		
	}
