package br.com.fiap.seriesapi.data;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.seriesapi.model.Serie;

public class SerieDao {
	
	List<Serie> lista = new ArrayList<>();
	
	public SerieDao() {
		lista.addAll(List.of(
				new Serie(1L, "Lost", "Todos morrem...", "http...", false, 0),
				new Serie(2L, "Treta", "Uma treta começa....", "http...", true, 4),
				new Serie(3L, "Loki", "Ao viajar no tempo...", "http...", true, 3)
		));
	}

	public List<Serie> findAll() {
		return lista;
	}

	public Serie findById(Long id) {
		//SELECT * FROM SERIES WHERE ID=?
		return lista
			.stream()
			.filter(serie -> serie.id() == id)
			.findFirst()
			.orElse(null);
	}

	public void delete(Long id) {
		var serie = findById(id);
		lista.remove(serie);
		System.out.println(lista);
	}

	public void create(Serie serie) {
		// INSERT INTO
		lista.add(serie);
	}

	public void update(Serie serie) {
		// UPDATE Series SET ....
		
	}

}
