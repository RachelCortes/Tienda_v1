//Capa Negocio - Obtiene la lista de las categorias

package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    //Se obtiene un listado de categorias de un List
    public List<Categoria> getCategorias(boolean activos);
    
}
