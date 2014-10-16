package models.DAO.mem;

import models.DAO.Interfaces.RoundDAO;
import models.entity.Round;


public class MemRoundDAO extends MemGenericDAO <Round,Integer> implements RoundDAO {

    @Override
    public Integer getid(Round entidad) {
        return entidad.getid();
    }

   

}
