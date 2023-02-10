package com.uns.proyectspring2.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uns.proyectspring2.repositorios.ContactoRepository;

import lombok.AllArgsConstructor;
import com.uns.proyectspring2.entidades.Contacto;
import java.util.List;

@RestController
@RequestMapping("contactos")
@AllArgsConstructor
public class ContactoController {
    
    private final ContactoRepository contactoRepository;

    @GetMapping
    public List<Contacto> listContactos(){
        return contactoRepository.findAll();
    }
}
