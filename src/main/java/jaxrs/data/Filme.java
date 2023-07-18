package jaxrs.data;

import java.time.LocalDateTime;

/**
 * @author Ricardo A. Silveira
 *         Classe entidade Filme
 */
public class Filme {
    private long id = hashCode();
    private String titulo;
    private boolean isAssistido;
    private String sinopse;
    private Object genero;
    private long classificacao;
    private Object pais;
    private String ano;
    private String imagePath;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isIsAssistido() {
        return isAssistido;
    }

    public void setIsAssistido(boolean isAssistido) {
        this.isAssistido = isAssistido;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Object getGenero() {
        return genero;
    }

    public void setGenero(Object genero) {
        this.genero = genero;
    }

    public long getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(long classificacao) {
        this.classificacao = classificacao;
    }

    public Object getPais() {
        return pais;
    }

    public void setPais(Object pais) {
        this.pais = pais;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
