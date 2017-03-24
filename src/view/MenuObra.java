package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestaoObra;
import model.*;

public class MenuObra {
	
	Scanner read = (new Scanner(System.in));
	
	public void menuObra(ArrayList<Exposicao> listaExpo){
		int opc,idExp;
		String nome,titulo,categoria,tipo,data;
		
		do
		{
			System.out.println("1 - Inserir Obra\n2 - Listar Obra\n3 - Listar Obras(TODAS)\n0 - Voltar\nInsira a opção: ");
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
			case 1: //Inserir Obra
				read.nextLine();
				
				System.out.print("Nome: ");
				nome = read.nextLine();
				
				System.out.print("Titulo: ");
				titulo = read.nextLine();
				
				System.out.print("Categoria: ");
				categoria = read.nextLine();
				
				System.out.print("Tipo: ");
				tipo = read.nextLine();
				
				System.out.print("Data: ");
				data = read.nextLine();
				
				do
				{
					System.out.println("Insira o ID da Exposição a que pertence a obra: ");
					idExp = read.nextInt();
				}while(idExp<1 || idExp>listaExpo.size());
				
				new GestaoObra().addObra(listaExpo, idExp, nome, titulo, categoria, tipo, data);
				break;
				
			case 2: //Listar Obras de Uma Exposição
				do
				{
					System.out.println("Insira o ID da Exposição: ");
					idExp = read.nextInt();
				}while(idExp<1 || idExp>listaExpo.size());
				
				new GestaoObra().listar(listaExpo, idExp);
				break;
				
			case 3: //Listar Todas as Obras
				new GestaoObra().listar(listaExpo);
				break;
			}
			
		}while(opc!=0);
		
	}
	
}
