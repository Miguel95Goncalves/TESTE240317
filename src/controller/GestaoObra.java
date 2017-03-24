package controller;

import java.util.ArrayList;

import model.*;

public class GestaoObra {
	
	public void addObra(ArrayList<Exposicao> listaExpo, int idExp,String nome,String titulo,String categoria,String tipo,String data){ //Adicionar Obra
		listaExpo.get(idExp-1).getObras().add(new Obra(nome,titulo,categoria,tipo,data));
	}
	
	public void listar(ArrayList<Exposicao> listaExpo, int idExp){ //Listar Obras de Uma Exposição
		for(Obra o : listaExpo.get(idExp-1).getObras())
		{
			System.out.println("Nome: "+o.getNome());
			System.out.println("Titulo: "+o.getTitulo());
			System.out.println("Categoria: "+o.getCategoria());
			System.out.println("Tipo: "+o.getTipo());
			System.out.println("Data: "+o.getData()+"\n");
		}
	}
	
	public void listar(ArrayList<Exposicao> listaExpo){ //Listar Obras (TODAS)
		for(int i=0;i<listaExpo.size();i++)
		{
			System.out.println("<--- Exposição "+listaExpo.get(i).getNome()+" --->");
			for(Obra o : listaExpo.get(i).getObras())
			{
				System.out.println("Nome: "+o.getNome());
				System.out.println("Titulo: "+o.getTitulo());
				System.out.println("Categoria: "+o.getCategoria());
				System.out.println("Tipo: "+o.getTipo());
				System.out.println("Data: "+o.getData()+"\n");
			}
		}
		
	}
	
}
