package com.rodrick.restLib.models.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SearchBookDTO {
	@NotEmpty(message = "ISBN  required")
	@Size(min = 10, max = 10, message = "ISBN MUST HAVE ONLY 10 CHARS")
	private String isbn;
	
	@NotEmpty(message = "Identifier required")
	private String identifier;
}
