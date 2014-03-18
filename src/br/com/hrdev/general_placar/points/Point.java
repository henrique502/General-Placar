package br.com.hrdev.general_placar.points;

public class Point {
	
	protected String nome;
	protected int points;
	protected boolean number;
	private byte status = 1;
	private final int first_point = 5;
	private int total = 0;
	
	public boolean is_number() {
		return this.number;
	}
	
	public boolean is_discarded(){
		return this.status == 0;
	}
	
	public boolean is_done(){
		return (this.status == 2 || this.status == 3);
	}
	
	public void discard(){
		this.status = 0;
	}
	
	public void make(int dices, boolean first){
		total = 0;
		this.status = 2;
		
		if(is_number()){
			for (int i = 0; i < dices; i++) {
				total += this.points;
			}
		} else {
			total = this.points;
			if(first){
				this.status = 3;
				total += this.first_point;
			}
		}
	}
	
	public String getNome() {
		return this.nome;
	}

	public int getPoints() {
		return this.points;
	}
	
	public int getTotal() {
		return this.total;
	}
	
	public String toString(){
		return this.nome;
	}
}
