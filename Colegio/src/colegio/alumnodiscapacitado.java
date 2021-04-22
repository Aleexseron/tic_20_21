package colegio;

public class alumnodiscapacitado extends alumno{
	private String discapacidad;
	private int gradoDiscapacidad;
	public alumnodiscapacitado(String nombre, String apellido1, String apellido2, int edad, int genero,
			String discapacidad, int gradoDiscapacidad) {
		super(nombre, apellido1, apellido2, edad, genero);
		this.discapacidad = discapacidad;
		this.gradoDiscapacidad = gradoDiscapacidad;
	}
	public String getDiscapacidad() {
		return discapacidad;
	}
	public void setDiscapacidad(String discapacidad) {
		this.discapacidad = discapacidad;
	}
	public int getGradoDiscapacidad() {
		return gradoDiscapacidad;
	}
	public void setGradoDiscapacidad(int gradoDiscapacidad) {
		this.gradoDiscapacidad = gradoDiscapacidad;
	}
	public String getTodo() {
		String todo=getNombre()+" "+getApellido1()+" "+getApellido2()+", "+getEdad()+" años; "+genero()+"; Discapacidad de grado "+getGradoDiscapacidad()+": "+getDiscapacidad();
		System.out.println(todo);
		return todo;
	}
}
