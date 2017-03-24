package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GestaoExposicao;
import model.Exposicao;

public class MenuExposicao {
	
	Scanner read = (new Scanner(System.in));
	
	public void menuExposicao(ArrayList<Exposicao> listaExpo){
		char tecla;
		int opc,idExpo;
		String nome,data_inicio,data_fim;
		int quant_vis;
		float preco;
		
		do
		{
			System.out.println("1 - Inserir Exposi��o\n2 - Listar Exposi��es\n3 - Exposi��o Mais Rentav�l\n4 - Inserir Cliente\n0 - Voltar\nInsira a op��o: ");
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
			case 1: //Inserir Exposi��o
				
				read.nextLine();
				
				System.out.print("Nome: ");
				nome = read.nextLine();
				
				System.out.print("Data de Inicio: ");
				data_inicio = read.nextLine();
				
				System.out.print("Data de Fim: ");
				data_fim = read.nextLine();
				
				System.out.print("Visitantes: ");
				quant_vis = read.nextInt();
				
				System.out.print("Pre�o: ");
				preco = read.nextFloat();
				
				new GestaoExposicao().addExposicao(listaExpo, nome, data_inicio, data_fim, quant_vis, preco);
				break;
				
			case 2: //Listar Exposi��es
				new GestaoExposicao().listarExposicoes(listaExpo);
				break;
				
			case 3: //Calcular Exposi��o mais Rentav�l
				if(listaExpo.size()!=0)
				{
					System.out.println("Nome: "+new GestaoExposicao().calcLucro(listaExpo).getNome());
					System.out.println("Visitantes: "+new GestaoExposicao().calcLucro(listaExpo).getQuant_vis());
					System.out.println("Pre�o: "+new GestaoExposicao().calcLucro(listaExpo).getPreco());
				}
				else System.out.println("Insira Exposi��es em Primeiro!");
				break;
				
			case 4: //Adicionar Cliente 1 a 1
				if(listaExpo.size()!=0)
				{
					do
					{
						System.out.println("Insira o ID da exposi��o: ");
						idExpo = read.nextInt();
					}while(idExpo<1 || idExpo>listaExpo.size());
					
					do
					{
						System.out.println("Insira qualquer tecla para adicionar cliente, ou, 1 para SAIR!");
						new GestaoExposicao().addVisitante(listaExpo, idExpo);
						tecla = read.next().charAt(0);
					}while(tecla!='1');
					
				}
				else System.out.println("Insira Exposi��es em Primeiro!");
				break;
			}
			
		}while(opc!=0);
		
	}
	
}
