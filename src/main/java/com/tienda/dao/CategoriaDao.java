
package com.tienda.dao;

import com.tienda.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    //TODO:Crear metodos ampliados
        List <Categoria> findByDescripcionContainingIgnoreCase (String descripcion);
        
        
}
