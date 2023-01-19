package es.studium.ejemplo2;

public class TestEscuela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aula aula1 = new Aula("aula1", 20);
		Alumno alumno1 = new Alumno("Abraham", "Gomez", 20, true, aula1);
		
		System.out.println(alumno1.getNombre()+" "+ alumno1.getApellido()+" "+ alumno1.getEdad()+" "+ alumno1.isHaPagado()+" "+ alumno1.getAula().getNombre()+" "+ alumno1.getAula().getNumeroalumnos() );
		
		
		
	}

}
