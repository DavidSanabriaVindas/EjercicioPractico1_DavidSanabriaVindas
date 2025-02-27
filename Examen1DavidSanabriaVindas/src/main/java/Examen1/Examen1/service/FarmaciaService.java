package Examen1.Examen1.service;

import Examen1.Examen1.domain.Farmacia; 
import java.util.List;

public interface FarmaciaService {

   // Se obtiene un listado de categorias en un List
    public List<Farmacia> getFarmacias(boolean activos);
    public Farmacia getFarmacias(Farmacia farmacia); 

    
}
