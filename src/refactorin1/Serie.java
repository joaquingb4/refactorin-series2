package refactorin1;

import java.util.ArrayList;

public class Serie {
	private String titulo;
	private ArrayList <Temporada> temporadas;
	//constructores
	public Serie(String titulo, ArrayList<Temporada> temporadas) {
		//super();
		this.titulo = titulo;
		this.temporadas = temporadas;
	}
	public Serie(String titulo) {
		this.titulo = titulo;
		this.temporadas = new ArrayList<Temporada>();
	}
	public Serie() {
		this.temporadas = new ArrayList<Temporada>();
	}
	//Funciones
	public boolean addTemporada(Temporada temporada) {
		temporadas.add(temporada);
		temporada.setSerie(this);
		return true;
	}
	
	
	
}
