import java.io.*;


public class Menu/*classe principal del ejercicio*/

{
public static void main (String[] args)//funcion principal del programa
{
	
	try{
	
	int op;
	
		InputStremReader isr=new  InputStremReader(System.in);
		BuffeReader br=new BuffeReader (isr);
		
		
		do{
		System.out.print("Numero de alumnos");
		N=Integrer.parseInt(br.readLine());
		}wile(N<=0);)
		int []notas=new int[N];
		for(int i=0;<N;i++)
		{
		notas[i]=integrer.parseInt(br.readLine());
		}
		
		do{
		
		System.out.printIn("0.-Salir");
		System.out.printIn("1.-Suma de Notas");
		System.out.printIn("2.-Media de notas");
		System.out.printIn("3.-Numero de aprovados");
		System.out.printIn("4.-N suspensos");
		System.out.printIn("5.-Nota mas alta");
		System.out.printIn("6.-Nota mas baja");
		System.out.printIn("7.-Ver datos");
		
		
		do{
		
		System.out.print("Opcion :");
		op=Integrer.parseInt(br.readLine());
		
		}while ((op <=0) || (op>6));
		
		}cach(Exeption e){}
		
		swich(op)//agrupa varios if de op
		{
		case 1:
		//suma
			int suma=0;
			for (int i=0;i<N;i++){
			
			suma=suma+notas[i];
			
			}
			System.out.println(suma);
			break;
			
			
		case 2:
		//media
			int suma2=0;
			for (int i=0;i<N;i++){
			
			
			}
			
			media=suma/N;
			System.out.println(media);
			break;
		case 3:
			//aprovados
			int ca=0;
			for (int i=0;i<N;i++){
			
			ca++;
			}
			System.out.println(aprovados);
			break;
		case 4:
			//suspensos
			int cs=0;
			for (int i=0;i<N;i++){
			
			cs++;
			}
			System.out.println(suspensos);
			break;
		case 5:
		// mas alta
			int max=0;
			for (int i=0;i<N;i++){
				
				if(notas)[i]>=max)
				{
				
				max=notas[i];
				
				}
			
			}
			System.out.println(max);
			break;
		case 6:
		//mas baja
			int min=0;
			for (int i=0;i<N;i++){
			
			if(notas)[i]>=min)
				{
				
				min=notas[i];
				
				}
			}
			break;
		default:
			break;
		}
	}
	}
	