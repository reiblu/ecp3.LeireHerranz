package models.DAO.mem;

import models.DAO.Interfaces.DAOFactory;
import models.DAO.Interfaces.RoundDAO;
import models.DAO.Interfaces.UserDAO;

public class MemDAOFactory extends DAOFactory {

    @Override
    public UserDAO getUserDAO() {
        return null;
    }

    @Override
    public RoundDAO gerRoundDAO() {
        return null;
    }

}
