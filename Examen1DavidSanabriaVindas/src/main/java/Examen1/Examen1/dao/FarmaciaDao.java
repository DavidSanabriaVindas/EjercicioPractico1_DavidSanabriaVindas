package Examen1.Examen1.dao;
//Imports a utilizar
import Examen1.Examen1.domain.Farmacia; 
import org.springframework.data.jpa.repository.JpaRepository; 
import java.util.List; 

public interface FarmaciaDao extends JpaRepository<Farmacia, Long> {
 
}
