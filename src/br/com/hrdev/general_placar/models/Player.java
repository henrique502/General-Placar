package br.com.hrdev.general_placar.models;


import br.com.hrdev.general_placar.points.Point;

public class Player {
	
	private String nome;
	private Point[] points; 
	
	public Player(String nome, Point[] points){
		this.nome = nome;
		this.points = points;
	}
	
	public Point getPoint(int index){
		if(index >= 0 && index < points.length)
			return points[index];
		
		return null;
	}
	
	public String toString(){
		return this.nome;
	}
	
}
