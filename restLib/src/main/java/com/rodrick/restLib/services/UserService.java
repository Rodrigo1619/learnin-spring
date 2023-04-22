package com.rodrick.restLib.services;

import com.rodrick.restLib.models.dtos.RegisterDTO;
import com.rodrick.restLib.models.entities.User;

public interface UserService {
	void register(RegisterDTO info);
	User findOneById(String identifier);
}
//se usa identifier debido a que no amarramos el id a solo username o el correo
