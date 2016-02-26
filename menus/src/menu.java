import java.io.*;


public class menu/*classe principal del ejercicio*/

{
public static void main (String[] args)//funcion principal del programa
{
	
	try{
	
	int op,N;
	
		InputStreamReader isr=new  InputStreamReader(System.in);
		BufferedReader br=new BufferedReader (isr);
		
		
		do{
		System.out.print("Numero de alumnos");
		N=Integer.parseInt(br.readLine());
		}while(N<=0);
		int []notas=new int[N];
		for(int i=0;i<N;i++)
		{
			
		notas[i]=Integer.parseInt(br.readLine());
		}
		String con="Aprovados";
		do{
		
		System.out.println("0.-Salir");
		System.out.println("1.-Suma de Notas");
		System.out.println("2.-Media de notas");
		System.out.println("3.-Numero de aprovados");
		System.out.println("4.-N suspensos");
		System.out.println("5.-Nota mas alta");
		System.out.println("6.-Nota mas baja");
		System.out.println("7.-Ver datos");
		
		
		do{
		
		System.out.print("Opcion :");
		op=Integer.parseInt(br.readLine());
		
		}while ((op <0) || (op>7));
		
		
		
		switch(op)//agrupa varios if de op
		{
		case 1:
		//suma
			int suma=0;
			for (int i=0;i<N;i++){
			
			suma=suma+notas[i];
			
			}
			System.out.println("La suma de las notas es"+suma);
			break;
			
			
		case 2:
		//media
			float media;
			int suma2=0;
			for (int i=0;i<N;i++){
			
				suma2=suma2+notas[i];
			}
			
			media=suma2/N;
			System.out.println("La media de las notas es:"+String.format("%.2f",media));
			break;
		case 3:
			//aprovados
			//int ca=0;
			/*for (int i=0;i<N;i++){
			
			ca++;
			}*/
			//System.out.println("la cantidad de aprovados es:"+ca);
			//break;
		case 4:
			//suspensos
			int cs=0;
			int ca=0;
			for (int i=0;i<N;i++)
			{
				if (notas[i]<5)
				{
					cs++;
				}
				else { ca++;
				
				}
			}
			
			if (op==3)
			{
				System.out.println("3.-Alumnos Aprovados : "+ca);
				break;
			}
			
		
				System.out.println("4.-Alumnos Suspendidos : "+cs);
		
			break;
		case 5:
		// mas alta
			int max=0;
			for (int i=0;i<N;i++){
				
				if(notas[i]>=max)
				{
				max=notas[i];
				
				}
			
			}
			System.out.println("La nota maxima es:"+max);
			break;
		case 6:
		//mas baja
			int min=0;
			for (int i=0;i<N;i++){
			
			if(notas[i]>=min)
				{
				
				min=notas[i];
				
				}
			}
			break;
		default:
			break;
		}
		}while(op!=0);
	}catch(Exception e){}
	}
}