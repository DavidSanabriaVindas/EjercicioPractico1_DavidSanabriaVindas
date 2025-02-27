package Examen1.Examen1.service.impl;

import Examen1.Examen1.dao.FarmaciaDao;
import Examen1.Examen1.domain.Farmacia; 
import Examen1.Examen1.service.FarmaciaService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional; 
import java.util.List; 
import java.util.Optional; 

@Service 
public class FarmaciaServiceImpl implements FarmaciaService{

    @Autowired 
    //Declara una variable de instancia para FarmaciaDao.
    private FarmaciaDao farmaciaDao;

    @Override 
    @Transactional(readOnly = true) 
    
    //Define el método getFarmacias que recibe un boolean.
    public List<Farmacia> getFarmacias(boolean activos) { 
        List<Farmacia> lista = farmaciaDao.findAll(); 
    return lista; 
}

    @Override 
    @Transactional(readOnly = true) 
    
    //Define el método getArbol que recibe un objeto Arbol.
    public Farmacia getFarmacias(Farmacia farmacia) { 
        
        Optional<Farmacia> optionalFarmacia = farmaciaDao.findById(farmacia.getId()); 
        return optionalFarmacia.orElse(null); 
    }

   
}
