package jaxrs.resources;

import jaxrs.data.CrudFilme;
import jaxrs.data.Filme;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @author Ricardo A. Silveira
 *         Classe de recursos da API
 *         Java API para RESTful Web Services (JAX-RS) JakartaEE 10.0
 */
@Path("api")
public class JakartaEEResource {
    Filme filme;

    public JakartaEEResource() {
        filme = new Filme();
    }

    @GET
    public Response ping() {
        return Response
                .ok("Bem vindo ao Jakarta EE")
                .build();
    }

    /**
     * Obter uma lista de filmes
     * 
     * @return
     */
    @GET
    @Path("filmes")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Filme> getAllFilmes() {
        ArrayList<Filme> listaFilmes = new CrudFilme().getAll();
        return listaFilmes;
    }

    /**
     * Obter um filme selecionado
     * 
     * @param id
     * @return
     */
    @GET
    @Path("filme/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Filme getFilme(@PathParam("id") long id) {
        return new CrudFilme().getCliente(id);
    }

    /**
     * Adicionar um filme
     * 
     * @param film
     */
    @POST
    @Path("filme")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addObject(Filme film) {
        final var createdAt = LocalDateTime.now();
        film.setCreatedAt(createdAt);
        new CrudFilme().add(film);
    }

    /**
     * Atualizar um filme
     * 
     * @param id
     * @param film
     */
    @PUT
    @Path("filme/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void updateFilme(@PathParam("id") long id, Filme film) {
        filme = new CrudFilme().getCliente(id);
        final var updatedAt = LocalDateTime.now();
        filme.setTitulo(film.getTitulo());
        filme.setIsAssistido(film.isIsAssistido());
        filme.setAno(film.getAno());
        filme.setSinopse(film.getSinopse());
        filme.setGenero(film.getGenero());
        filme.setClassificacao(film.getClassificacao());
        filme.setPais(film.getPais());
        filme.setImagePath(film.getImagePath());
        filme.setUpdatedAt(updatedAt);
    }

    /**
     * Deletar um filme
     * 
     * @param id
     */
    @DELETE
    @Path("filme/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void delFilme(@PathParam("id") long id) {
        filme = new CrudFilme().getCliente(id);
        new CrudFilme().remove(filme);
    }
}
