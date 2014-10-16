package models.DAO.Interfaces;

import java.util.Collection;

public abstract interface GenericDAO<T, ID> {

    public abstract void create(T crear);

    public abstract T read(ID leer);

    public abstract void update(T actualizar);

    public abstract void delete(T borrar);

    public abstract void deleteByID(ID borrarID);

    public abstract Collection<Integer> findAll();

    public abstract void findAll(int index, int size);

}
