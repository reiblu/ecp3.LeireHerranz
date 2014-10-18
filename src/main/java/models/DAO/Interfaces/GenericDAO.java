package models.DAO.Interfaces;

import java.util.List;

public abstract interface GenericDAO<T, ID> {

    public abstract void create(T crear);

    public abstract T read(ID leer);

    public abstract void update(T actualizar);

    public abstract void delete(T borrar);

    public abstract void deleteByID(ID borrarID);

    public abstract List<T> findAll();

    public abstract List<T> findAll(int index, int size);

}
