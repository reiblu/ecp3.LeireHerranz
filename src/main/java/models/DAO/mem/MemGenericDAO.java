package models.DAO.mem;

import java.util.HashMap;
import java.util.Map;

import models.DAO.Interfaces.GenericDAO;

public class MemGenericDAO<T, ID> implements GenericDAO<T, ID> {

    private Map<T, Integer> conjuntos = new HashMap<T, Integer>();

    private static int indice;

    @Override
    public void create(T crear) {
        conjuntos.put(crear, indice);
        indice++;

    }

    @Override
    public void read(ID leer) {
        conjuntos.get(leer);

    }

    @Override
    public void update(T actualizar) {
        

    }

    @Override
    public void delete(T borrar) {
        conjuntos.remove(borrar);

    }

    @Override
    public void deleteByID(ID borrarID) {
        conjuntos.remove(borrarID);

    }

    @Override
    public void findAll() {
        // TODO Auto-generated method stub

    }

    @Override
    public void findAll(int index, int size) {
        // TODO Auto-generated method stub

    }

}
