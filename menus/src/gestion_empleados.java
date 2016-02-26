import java.io.BufferedReader;
import java.io.InputStreamReader;


public class gestion_empleados/*classe principal del ejercicio*/
{
public static void main (String[] args)//funcion principal del programa
{
	
	try{
	
		InputStreamReader isr=new  InputStreamReader(System.in);
		BufferedReader br=new BufferedReader (isr);
	/***************************************************/	
	
		int N;
		do{
		System.out.print("Numero de empleados:");
		N=Integer.parseInt(br.readLine());
		}while(N<2);
		
		
		
		String []nombre=new String[N];
		
		int []edades=new int[N];
		
		double []sueldo=new double[N];
		
		
		for(int i=0;i<N;i++)  //repetir N veces
		{
			
			
			System.out.print("Nombre empleado : ");
		nombre[i]=br.readLine();
		
		do{
		System.out.print("Edad empleado : ");
		edades[i]=Integer.parseInt(br.readLine());
		}while((edades[i]<16)||(edades[i]>67));
		do{
		System.out.print("Sueldo empleado : ");
		sueldo[i]=Double.parseDouble(br.readLine());
		}while((sueldo[i]<10000)||(sueldo[i]>3000000));
		}
	
		int op;
		do{
		
		System.out.println("0.-Salir");
		System.out.println("1.-Visualizar datos");
		System.out.println("2.-Media de edades");
		System.out.println("3.-Media de sueldos");
		System.out.println("4.-Suma de sueldos");
		System.out.println("5.-Datos del empleadoque cobra m�s");
		System.out.println("6.-Datos del empleado m�s viejo");
		System.out.println("7.-Buscar los empleados que tengan edad entre 2 valores");
		System.out.println("8.-Buscar los empleados con sueldo entre 2 valores");
		do{
			System.out.print("Opcion:");
			 op=Integer.parseInt(br.readLine());
		}while ((op<0)||(op>8));
		switch(op){
		
		case 1:
			
			for (int i=0;i<N;i++){
			
				System.out.println("El nombre del empleado "+(i+1)+ " es : "+nombre[i]);
				System.out.println("La edad del empleado "+(i+1)+  "  es : "+edades[i]);
				System.out.println("El aueldo del empleado "+(i+1)+  "  es : "+sueldo[i]);
			}
			break;
		case 2:
			//Media de edades
		
			double suma=0;
			double mediae=0;
			for (int i=0;i<N;i++)
			{
			
				suma=suma+edades[i];
			}	
			mediae=suma/N;
			
			System.out.println("La media de las edades es : "+mediae);
			break;
		case 3:
			//Media de sueldos
			double suma1=0;
			for (int i=0;i<N;i++)
			{
			
				suma1=suma1+sueldo[i];
			}	
			mediae=suma1/N;
			
			System.out.println("La media de sueldos es : "+mediae);
			
			break;
		case 4:
			//Suma de sueldos
			 suma=0;
			for (int i=0;i<N;i++){
			
			suma=suma+sueldo[i];
			
			}
			System.out.println("La suma de los sueldos es : "+suma);
			break;
			
		case 5:
			//Datos del empleadoque cobra m�s
			
			int emple=0;
			double max=0;
			for (int i=0;i<N;i++){
				
				if(sueldo[i]>=max)
				{
				max=sueldo[i];
				emple=i;
				}
			
			}
			System.out.println("El sueldo maximo es :"+max+" i es percibido por :"+nombre [emple] );
			
			
			break;
		case 6:
			//Datos del empleado m�s viejo
			
			int viejo=0;
			int max1=0;
			for (int i=0;i<N;i++){
				
				if(edades[i]>=max1)
				{
				max1=edades[i];
				viejo=i;
				}
			
			}
			System.out.println("La edad maxima es :"+max1+" del empleado llamado :"+nombre [viejo] );
			
		
			break;
			
		case 7:
			//buscar rango de edad
		
			int minedad;
			int maxedad;
			
			System.out.print("Edad minima : ");
			minedad=Integer.parseInt(br.readLine());
			
			System.out.print("Edad maxima : ");
			maxedad=Integer.parseInt(br.readLine());
			
			if (edades[i] >= minedad && (edad[i]<=maxedad)
			
			System.out.print("................................. : ");
					
			break;
		}
			
		
		}while (op!=0);
	/**************************************************************/
		
	}catch(Exception e){}
}// final de main
}// final de class