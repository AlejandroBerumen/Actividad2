import java.util.Arrays;
import java.util.Scanner;

class VectorEspecial{
	int edades[];
	Scanner x = new Scanner(System.in);	
	public int[] getEdades() {
		return edades;
	}
	public void setEdades(int e[]) {
		this.edades = e;
	}
	public VectorEspecial() {}
	public VectorEspecial(int tamanio) {
		this.edades = new int[tamanio];
	}
	public void llenar() {
		for (int i = 0; i < edades.length; i++) {
			System.out.print("Ingrese la edad " + (i+1));
			edades[i] = x.nextInt();
		}
	}
	public int obtenerInicio() {
		return 0;
	}
	public int obtenerFinal() {
		return edades.length-1;
	}
	public int obtenerNumElementos() {
		return edades.length;
	}
	public void mostarElementos() {
		System.out.println(Arrays.toString(edades));
	}
	public void mostrarElementoInicio() {
		System.out.println(edades[obtenerInicio()]);
	}
	public void mostrarElementoFinal() {
		System.out.println(edades[obtenerFinal()]);
	}
	public void cambiarTamanio(int nuevoTamanio) {
		int aux[] = new int[edades.length];
		for (int i = 0; i < edades.length; i++) {
			aux[i] = edades[i]; 
		}
		if(nuevoTamanio==edades.length) {
			System.out.println("El nuevo tama�o no puede ser igual al tama�o actual");
		}else if(nuevoTamanio>edades.length) {
			edades = new int[nuevoTamanio];
			for (int i = 0; i < aux.length; i++) {
				edades[i] = aux[i];
			}
			System.out.println("\nEl tama�o ha sido aumentado con �xito.");
		}else if(nuevoTamanio<edades.length && nuevoTamanio>0) {
			edades = new int[nuevoTamanio];
			for (int i = 0; i < edades.length; i++) {
				edades[i] = aux[i];
			}
			System.out.println("\nEl tama�o ha sido disminuido con �xito.");
		}else {
			System.out.println("\nERROR   El nuevo tama�o debe ser un n�mero positivo.");
		}
	}
	
}//class VectorEspecial
public class Vectores {
	public static void main(String[] args) {
		
		

	}
}
