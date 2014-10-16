package models.DAO.Interfaces;

public abstract interface GenericDAO<T, ID> {

    public abstract void create(T crear);

    public abstract void read(ID leer);

    public abstract void update(T actualizar);

    public abstract void delete(T borrar);

    public abstract void deleteByID(ID borrarID);

    public abstract void findAll();

    public abstract void findAll(int index, int size);

}
