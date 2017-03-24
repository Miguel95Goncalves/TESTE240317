package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Exposicao;

public class Menu {
	
	Scanner read = (new Scanner(System.in));
	ArrayList<Exposicao> listaExpo = new ArrayList<Exposicao>();
	
	public void menuPrincipal(){
		int opc;
		
		do
		{
			System.out.println("1 - Exposi��es\n2 - Obras\n0 - Sair\nInsira a op��o: ");
			try{
				opc = read.nextInt();
			}
			catch(Exception e){
				System.out.println("Op��o Inv�lida!");
				opc=666;
				read.nextLine();
			}
			
			switch(opc)
			{
			case 1: //Menu Exposi��es
				new MenuExposicao().menuExposicao(listaExpo);
				break;
				
			case 2: //Menu Obras
				if(listaExpo.size()!=0)
				{
					new MenuObra().menuObra(listaExpo);
				}
				else System.out.println("Insira primeiro uma exposi��o!");
				break;
			}
			
		}while(opc!=0);
		
	}
	
}
