package br.com.fiap.seriesapi.service;

import java.util.List;

import br.com.fiap.seriesapi.data.SerieDao;
import br.com.fiap.seriesapi.model.Serie;

public class SerieService {
	
	SerieDao dao = new SerieDao();

	public List<Serie> findAll() {
		return dao.findAll();
	}

}
