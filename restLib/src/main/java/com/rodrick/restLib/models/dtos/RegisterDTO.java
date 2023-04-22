package com.rodrick.restLib.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterDTO {
	private String username;
	private String email;
	private String password;
}

//los dto Data Transfer Object es practicamente un POJO
// esto no implementa nada y para obtener la informacion que solamente queremos
//de nuestro modelo, en register no queremos saber su name, pero lo demas si
