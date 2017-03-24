package model;

import java.util.ArrayList;

public class Exposicao {
	private String nome,data_inicio,data_fim;
	private int quant_vis,id;
	private float preco;
	private ArrayList<Obra> obras = new ArrayList<Obra>();
	
	public Exposicao() {
		super();
		this.obras = new ArrayList<Obra>();
	}
	
	public Exposicao(String nome, String data_inicio, String data_fim, int quant_vis, int id, float preco) {
		super();
		this.nome = nome;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.quant_vis = quant_vis;
		this.id = id;
		this.preco = preco;
	}
	
	public Exposicao(String nome, String data_inicio, String data_fim, int quant_vis, int id, float preco,
			ArrayList<Obra> obras) {
		super();
		this.nome = nome;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.quant_vis = quant_vis;
		this.id = id;
		this.preco = preco;
		this.obras = obras;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(String data_inicio) {
		this.data_inicio = data_inicio;
	}
	public String getData_fim() {
		return data_fim;
	}
	public void setData_fim(String data_fim) {
		this.data_fim = data_fim;
	}
	public int getQuant_vis() {
		return quant_vis;
	}
	public void setQuant_vis(int quant_vis) {
		this.quant_vis = quant_vis;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public ArrayList<Obra> getObras() {
		return obras;
	}
	public void setObras(ArrayList<Obra> obras) {
		this.obras = obras;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
