package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Empleado {

	private int codigo;
	private String nombre;
	private String email;
	private int edad;
	//Construcdor
	//hay que soltar Patch(cmd-java -lombok.jar), para reconocer LOMBOK(via eclipse), SOLO HAY QUE HACER UNA VEZ

}
