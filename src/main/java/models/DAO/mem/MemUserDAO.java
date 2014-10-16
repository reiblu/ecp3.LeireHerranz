package models.DAO.mem;

import models.DAO.Interfaces.UserDAO;
import models.entity.User;


public class MemUserDAO extends MemGenericDAO<User,Integer> implements UserDAO {

    @Override
    protected Integer getid(User entidad) {
        return entidad.getid();
    }

 

   

}
