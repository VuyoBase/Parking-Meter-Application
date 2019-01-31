/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBServices;
//import.admin;

import parkingmeterapplication.admin.admin;

/**
 *
 * @author Gee
 */
public class CarsService {
    private parkingmeterapplication.admin.admin _admin = new  parkingmeterapplication.admin.admin();
    public java.util.List<DBEntities.Carstb> carstbList;
    public javax.persistence.EntityManager carstbEntityManager;
    public CarsService() {
        this.carstbList = parkingmeterapplication.admin.admin.carstbList ;
        this.carstbEntityManager = parkingmeterapplication.admin.admin.ParkingMeterApplicationPUEntityManager ;
    }

    public admin getAdmin() {
        return _admin;
    }
    
    
    
}
