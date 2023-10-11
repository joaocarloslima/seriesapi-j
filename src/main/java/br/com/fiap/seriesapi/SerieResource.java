package br.com.fiap.seriesapi;

import java.util.List;

import br.com.fiap.seriesapi.model.Serie;
import br.com.fiap.seriesapi.service.SerieService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("serie")
public class SerieResource {
	
	private SerieService service = new SerieService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Serie> index() {
		return service.findAll();
	}

}
