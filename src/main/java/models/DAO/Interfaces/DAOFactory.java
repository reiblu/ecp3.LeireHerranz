package models.DAO.Interfaces;

public abstract class DAOFactory {
    
    private static DAOFactory factoria;
    
    public DAOFactory(){
        
    }
    
    public static DAOFactory getFactoria(){
        if(DAOFactory.factoria==null){
            DAOFactory.factoria = DAOFactory.setIntancia(factoria);
        }
        
        return DAOFactory.factoria;
    }
    
    private static DAOFactory setIntancia(DAOFactory factoria) {
        return DAOFactory.factoria= factoria;
    }

    public abstract UserDAO getUserDAO();
    
    public abstract RoundDAO gerRoundDAO();

}
