package com.uns.proyectspring2.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.uns.proyectspring2.entidades.Contacto;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto,Integer>{
    
}
