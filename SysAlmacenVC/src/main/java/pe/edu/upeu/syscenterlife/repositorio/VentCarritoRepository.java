package pe.edu.upeu.syscenterlife.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.syscenterlife.modelo.VentCarrito;

@Repository
public interface VentCarritoRepository extends JpaRepository<VentCarrito, Long> {
<<<<<<< HEAD

    @Query(value = "SELECT c.* FROM vent_carrito c WHERE c.dniruc=:dniruc", nativeQuery = true)
    List<VentCarrito> listaCarritoCliente(@Param("dniruc") String dniruc);
    
    void deleteByDniruc(/*@Param("dniruc")*/ String dniruc);
=======
   @Query(value = "SELECT c.* FROM vent_carrito c WHERE c.dniruc=:dniruc", nativeQuery = true)
List<VentCarrito> listaCarritoCliente(@Param("dniruc") String dniruc);

void deleteByDniruc(/*@Param("dniruc")*/ String dniruc);
>>>>>>> 5054c43ea48120286c83d8f35a7a551033d5a734

}
