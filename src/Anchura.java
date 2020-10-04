import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Anchura {

	static int[][] matriz =  {
			
			{0,1,0,1,0,0,1,0,0},
		    {1,0,1,0,0,0,1,0,0},
		    {0,1,0,0,0,1,0,0,1},
		    {1,0,0,0,1,0,1,0,0},
		    {0,0,0,1,0,1,1,0,0},
		    {0,0,0,0,1,0,0,1,1},
		    {1,1,0,1,1,0,0,0,0},
		    {0,0,1,0,0,1,0,0,1},
		    {0,0,1,0,0,1,0,1,0}
			
			};
	static int tam= matriz.length;
	
	public static void main(String[]args) throws NumberFormatException, IOException
	{
		BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));

		Cola_anchura cola=new Cola_anchura();
		
		int[] estado=new int[matriz.length];

		//inicializar estados en espera
			for(int i=0;i<matriz.length;i++)
			{
				estado[i]=0;
			}
			
		int op;
		do {
			for(int x=0;x<matriz.length;x++)
			{
				estado[x]=0;
			}
			
			int nodo;

			System.out.println("Introduzca el nodo donde desea empezar");
				int i=Integer.parseInt(leer.readLine());
				
				cola.Insertar(i-1);
				System.out.println("\n");
				while(cola.tamano!=0)
				{
					nodo=cola.Sacar();
					System.out.println(nodo+1);
					estado[nodo]=2;
					
					for(int j=0;j<matriz.length;j++)
					{
						if(matriz[nodo][j]==1 && estado[j]== 0)
						{
							cola.Insertar(j);
							estado[j]=1;
						}
					}
				}	
				System.out.println("\n¿Deseas continuar empezando desde otro nodo? (Sí=1, no=0)\n");
				op=Integer.parseInt(leer.readLine());
		}while(op!=0);
	}
}

