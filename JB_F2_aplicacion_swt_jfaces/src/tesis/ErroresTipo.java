package tesis;

import errors.impl.ErrorImpl;

public class ErroresTipo {
	private Boolean estado;
	private String nombreConstraint;
	private String tipo;
	private errors.Error error;

	public ErroresTipo(Boolean estado, String nombre, String tipo, errors.Error error) {
		this.nombreConstraint = nombre;
		this.estado = true;
		this.tipo = tipo;
		this.error = error;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	} 

	public String getNombreConstraint() {
		return nombreConstraint;
	}

	public void setNombreConstraint(String nombreConstraint) {
		this.nombreConstraint = nombreConstraint;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public errors.Error getError() {
		return error;
	}

	public void setError(errors.Error error) {
		this.error = error;
	}
	
	public static String desRestriccion(String res) {
		if (res.equals("F")){
			return "FOREIGN KEY";
		} else if (res.equals("C")){
			return "CHECK";
		} else {
			return "ERROR";
		}
	}
	
}	 