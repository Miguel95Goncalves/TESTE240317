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
			System.out.println("1 - Exposições\n2 - Obras\n0 - Sair\nInsira a opção: ");
			try{
				opc = read.nextInt();
			}
			catch(Exception e){
				System.out.println("Opção Inválida!");
				opc=666;
				read.nextLine();
			}
			
			switch(opc)
			{
			case 1: //Menu Exposições
				new MenuExposicao().menuExposicao(listaExpo);
				break;
				
			case 2: //Menu Obras
				if(listaExpo.size()!=0)
				{
					new MenuObra().menuObra(listaExpo);
				}
				else System.out.println("Insira primeiro uma exposição!");
				break;
			}
			
		}while(opc!=0);
		
	}
	
}
