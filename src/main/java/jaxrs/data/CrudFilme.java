package jaxrs.data;

import java.util.ArrayList;


/**
 * @author Ricardo A. Silveira
 * Classe contendo o CRUD da API
 */
public class CrudFilme {
    private static final ArrayList<Filme> filmeDB = new ArrayList<>();
    
    public void add(Filme f) {
        filmeDB.add(f);
    }
    
    public void remove(Filme f) {
        filmeDB.remove(f);
    }
    
    public ArrayList<Filme> getAll() {
        return filmeDB;
    }
    
    public Filme getCliente(long id) {
        for (Filme f : filmeDB) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }    
}
