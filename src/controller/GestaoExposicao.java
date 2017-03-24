package controller;

import java.util.ArrayList;

import model.Exposicao;

public class GestaoExposicao {
	
	public void addExposicao(ArrayList<Exposicao> listaExpo,String nome,String data_inicio,String data_fim,int quant_vis,float preco){ //Adicionar Exposicao
		int id = listaExpo.size()+1;
		
		listaExpo.add(new Exposicao(nome,data_inicio,data_fim,quant_vis,id,preco));
	}
	
	public void listarExposicoes(ArrayList<Exposicao> listaExpo){ //Listar Exposições
		for(Exposicao e : listaExpo)
		{
			System.out.println("ID: "+e.getId());
			System.out.println("Nome: "+e.getNome());
			System.out.println("Data Inicio: "+e.getData_inicio());
			System.out.println("Data Fim: : "+e.getData_fim());
			System.out.println("Visitantes: "+e.getQuant_vis());
			System.out.println("Número de Obras: "+e.getObras().size());
			System.out.println("Preço: "+e.getPreco()+"\n");
		}
	}
	
	public Exposicao calcLucro(ArrayList<Exposicao> listaExpo){ //Calcular qual a exposição mais rentavél
		int visitantes=0;
		float preco=0;
		Exposicao ExpoRent = new Exposicao();
		
		for(Exposicao e : listaExpo)
		{
			if(e.getQuant_vis()>visitantes){
				visitantes=e.getQuant_vis();
				preco=e.getPreco();
				ExpoRent = e;
			}
			else if(e.getQuant_vis()==visitantes && e.getPreco()<preco){ //Se a quantidade de visitantes for a mesma, verifica qual foi a mais barata
				preco=e.getPreco();
				ExpoRent = e;
			}
		}
		
		return ExpoRent;
	}
	
	public void addVisitante(ArrayList<Exposicao> listaExpo,int idExpo){ //Adicionar Cliente 1 a 1
		listaExpo.get(idExpo-1).setQuant_vis(listaExpo.get(idExpo-1).getQuant_vis()+1);
	}
	
}
