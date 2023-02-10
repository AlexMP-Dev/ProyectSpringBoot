package com.uns.proyectspring2.seguridad;
import com.uns.proyectspring2.entidades.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.uns.proyectspring2.repositorios.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findOneByEmail(email)
        .orElseThrow(() -> new UsernameNotFoundException("el usuario con email " + email + " no existe."));
        return new UserDetailsImpl(usuario);
    }

    
}
