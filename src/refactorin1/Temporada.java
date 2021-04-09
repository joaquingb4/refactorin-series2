package refactorin1;

import java.util.ArrayList;

public class Temporada {
	private int numero;
	private Serie serie;
	private ArrayList<Capitulo> capitulos;
	
	//Funciones
	public boolean addCapitulo(Capitulo capitulo) {
		capitulos.add(capitulo);
		capitulo.setTemporada(this);
		return false;
	}
	
	public String ListaCapitulos() {
		String res="";
		for	(int i = 0; i<this.capitulos.size(); i++) {
			res += capitulos.get(i);
		}
		return res;
	}
	//Forma de Eduard
	/*
	public String ListaCapitulos() {
		String res="";
		for	(Capitulo capitulo:capitulos) {
			res = res +capitulo;//Se debe implementar la calse toString
		}
		return res;
	}
	*/
	
	
	//Constructores
	public Temporada(int numero, Serie serie) {
		//super();
		this.numero = numero;
		this.serie = serie;
		this.capitulos = new ArrayList<Capitulo>();
	}
	public Temporada() {
		this.capitulos = new ArrayList<Capitulo>();
	}
	//Getters Y Setters
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	

	
}
