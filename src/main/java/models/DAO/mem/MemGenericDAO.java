package models.DAO.mem;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import models.DAO.Interfaces.GenericDAO;

public abstract class MemGenericDAO<T, ID> implements GenericDAO<T, ID> {

    private Map<T, ID> conjuntos = new HashMap<T, ID>();

    @Override
    public void create(T crear) {
        if (!conjuntos.containsValue(crear)) {
            conjuntos.put(crear, this.getid(crear));
        }

    }

    @Override
    public ID read(ID leer) {
        return conjuntos.get(leer);

    }

    @Override
    public void update(T actualizar) {
        conjuntos.put(actualizar, this.getid(actualizar));
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
    public Collection<ID> findAll() {
        return conjuntos.values();

    }

    @Override
    public void findAll(int index, int size) {

    }

    protected abstract ID getid(T entidad);

}
