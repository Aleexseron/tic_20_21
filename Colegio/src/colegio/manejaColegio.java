package colegio;
public class manejaColegio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		ALUMNOS
		//String nombre, String apellido1, String apellido2, int edad, int genero
		alumno a0= new alumno("Alejandro", "Ser�n", "Bruno", 18, 0);
		System.out.println("Estos son los alumnos del colegio: ");
		a0.getTodo();
		//Input alumnos
		alumno a1 = new alumno("Roque", "Fern�ndez", "Maldonado", 17, 0);
		alumno a2 = new alumno("Luc�a", "Bosqued", "Gurierrez", 14, 1);
		alumno a3 = new alumno("Guillermo", "Mart�nez", "Melendez", 16, 0);
		alumno a4 = new alumno("Paula", "Rueda", "Barco", 15, 1);
		alumno a5 = new alumno("Leo", "Messi", "Ronaldo", 20, 0);
		alumno a6 = new alumno("Marte", "Junior", "Da Silva", 18, 1);
		alumno a7 = new alumno("Paco", "Jones", "Gordo", 17, 0);
		//Output alumnos
		a1.getTodo();a2.getTodo();a3.getTodo();a4.getTodo();a5.getTodo();a6.getTodo();a7.getTodo();
		//		ALUMNOS CON DISCAPACIDAD
		//String nombre, String apellido1, String apellido2, int edad, int genero,String discapacidad, int gradoDiscapacidad
		alumnodiscapacitado ad0 = new alumnodiscapacitado("Mar�a","S�nchez","Rodr�guez",17,1,"TDA",3);
		ad0.getTodo();
		//Input alumnos con discapacidad
		alumnodiscapacitado ad1 = new alumnodiscapacitado("Guillermo", "Torres", "P�rez", 17, 0, "S�ndrome de Down", 2);
		alumnodiscapacitado ad2 = new alumnodiscapacitado("Sergio", "Aylagas", "Berrojo", 12, 0, "Ceguera",1);
		alumnodiscapacitado ad3 = new alumnodiscapacitado("Manuel", "Mu�oz", "G�mez", 20, 0, "Asperger",9);
		//Output alumnos con dicapacidad
		ad1.getTodo();ad2.getTodo();ad3.getTodo();
		//		PROFESORES
		//Input profesores
		profesor p0=new profesor("Antonio", "L�pez", "Polo", 51, 0, "F�sica");
		profesor p1=new profesor("Miguel �ngel", "L�pez", "Garc�a", 54, 0 , "Lengua");
		profesor p2=new profesor("Natalia", "Gonz�lez", "Rond�n", 50, 1, "Matem�ticas");
		//Output profesores
		p0.getTodo();p1.getTodo();p2.getTodo();
		
	}

}