package models.DAO.mem;

import models.DAO.Interfaces.DAOFactory;
import models.DAO.Interfaces.RoundDAO;
import models.DAO.Interfaces.UserDAO;

public class MemDAOFactory extends DAOFactory {
    
    public MemDAOFactory(){
        DAOFactory.setIntancia(this);
    }

    @Override
    public UserDAO getUserDAO() {
        return new MemUserDAO();
    }

    @Override
    public RoundDAO gerRoundDAO() {
        return new MemRoundDAO();
    }

}
