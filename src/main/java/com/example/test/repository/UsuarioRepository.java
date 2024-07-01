// package com.test.demo.repository;

// import com.test.demo.model.Usuario;

// import java.util.List;

// public interface UsuarioRepository {
    
//     // Método para guardar un usuario
//     void save(Usuario usuario);

//     // Método para actualizar un usuario
//     void update(Usuario usuario);

//     // Método para borrar un usuario
//     void deleteById(long id);

//     // Método para buscar un usuario por su ID
//     Usuario findById(long id);

//     // Método para obtener todos los usuarios
//     List<Usuario> findAll();
// }



package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.test.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}