package com.cursos.services;

import java.util.List;

import com.cursos.model.Contacto;

public interface AgendaServices {

    boolean agregarContacto(Contacto contacto);
	List<Contacto> recuperarContactos();
	void actualizarContacto(Contacto contacto);
	boolean eliminarContacto(int idContacto);
	Contacto buscarContacto(int idContacto);

}
