package edu.ucjc.javagrado.alumno;

public class alumno {

		private String nombre;
		private String apellidos;
		private Asignatura [] asignaturas;
		
		public alumno(String nombre, String apellidos, 
				Asignatura [] asignaturas) {
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.asignaturas = asignaturas;
		}

		public alumno(String nombre, String apellidos) {
			this.nombre = nombre;
			this.apellidos = apellidos;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public Asignatura[] getAsignaturas() {
			return asignaturas;
		}

		public void setAsignaturas(Asignatura[] asignaturas) {
			this.asignaturas = asignaturas;
		}
		
	}
