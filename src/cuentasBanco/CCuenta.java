package cuentasBanco;

/**
 * @author davidsaenz
 * @version 0.1
 */
public class CCuenta {

	/**
	 * @nombre Atributo que almacena el nombre
	 */
	private String nombre;
	/**
	 * Atributo que almacena la cuenta bancaria
	 */
	private String cuenta;
	/**
	 * Atributo que almacena el saldo de la cuenta
	 */
	private double saldo;
	/**
	 * Atributo que almacena el tipo de interés
	 */
	private double tipoInterés;

	
	/** El get nombre para obtener la información de nombre
	 * @return devuelve el valor de nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/** El set nombre sirve para introducir y modificar los valores de nombre
	 * @param nombre le da el valor específico a nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/** El get Cuenta para obtener la información de cuenta
	 * @return devuelve el valor de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/** El set Cuenta sirve para introducir y modificar los valores de cuenta
	 * @param cuenta le da el valor específico a cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/** El get Saldo para obtener la información de saldo
	 * @return devuelve el valor de saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/** El set Saldo sirve para introducir y modificar los valores de saldo
	 * @param cuenta le da el valor específico a saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/** El get TipoInteres para obtener la información de tipoInteres
	 * @return devuelve el valor de tipoInteres
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/** El set TipoInteres sirve para introducir y modificar los valores de tipoInteres
	 * @param cuenta le da el valor específico a tipoInteres
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/** Contructor vacío de la clase CCuenta que inicializa el objeto
	 * 
	 */
	public CCuenta() {
	}

	/** Constructor con los parámetros introducidos
	 * @param nom String para el nombre
	 * @param cue String para la cuenta
	 * @param sal double para el saldo
	 * @param tipo double para el tipo de interés
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	/** metodo para saber el estado del saldo de la cuenta
	 * @return devuelve el saldo
	 */
	public double estado() {
		return saldo;
	}

	/** Metodo para asegurarnos que no se puede introducir números negativos para ingresar saldo
	 * @param cantidad es el número a introducir para ingresar 
	 * @throws Exception excepcion por si falla el programa en esta parte y salta mensaje
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/** Metodo para retirar dinero y asegurarnos que no se introduce un número negativo
	 * @param cantidad es el número a introducir para retirar
	 * @throws Exception excepcion por si falla el programa en esta parte y salta mensaje
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
}
