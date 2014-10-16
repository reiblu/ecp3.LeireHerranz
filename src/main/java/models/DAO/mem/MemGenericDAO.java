package models.DAO.mem;

import java.util.HashMap;
import java.util.Map;

import models.DAO.Interfaces.GenericDAO;

public class MemGenericDAO<T,ID> implements GenericDAO <T,ID>{
    
    private Map<T,Integer> conjuntos = new HashMap<T,Integer>();
    
    @Override
    public void create(T crear) {
        
        
        
    }

    @Override
    public void read(ID leer) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(T actualizar) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(T borrar) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteByID(ID borrarID) {
        // TODO Auto-generated method stub
        
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
