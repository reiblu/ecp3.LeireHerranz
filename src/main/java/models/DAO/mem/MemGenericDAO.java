package models.DAO.mem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.DAO.Interfaces.GenericDAO;

public abstract class MemGenericDAO<T, ID> implements GenericDAO<T, ID> {

    private Map<ID, T> conjuntos = new HashMap<ID, T>();

    @Override
    public void create(T crear) {
        if (!conjuntos.containsValue(crear)) {
            conjuntos.put(this.getid(crear), crear);
        }

    }

    @Override
    public T read(ID leer) {
        return conjuntos.get(leer);

    }

    @Override
    public void update(T actualizar) {
        conjuntos.put(this.getid(actualizar), actualizar);
    }

    @Override
    public void delete(T borrar) {
        conjuntos.remove(this.getid(borrar));

    }

    @Override
    public void deleteByID(ID borrarID) {
        conjuntos.remove(borrarID);

    }

    @Override
    public List<T> findAll() {
        List<T> lista = (List<T>) conjuntos.values();
        return lista;
    }

    @Override
    public List<T> findAll(int index, int size) {
        List<T> lista = (List<T>) conjuntos.values();
        List<T> auxiliar = new ArrayList<T>();
        for (int i = index; i < size; i++) {
            auxiliar.add(lista.get(i));
        }
        return auxiliar;
    }

    protected abstract ID getid(T entidad);

}
