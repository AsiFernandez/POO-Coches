
public class Coche {

	private String matricula;
	private String marca;
	private String modelo;
	private int km;
	
	
	/*
	 * CONSTRUCTOR
	 */
	
	
	
	
	/*
	 * GETTERS Y SETTERS
	 */
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	
	/*
	 * METO2
	 */
	
	public String toString() {
		String Mostrar = "Matricula: " + this.matricula + "\nMarca: " + this.marca + "\n Modelo: " + this.modelo + "\n Km: " + this.km;
		return Mostrar;
	}







}

