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
			System.out.println("Ingrese la edad " + (i+1));
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
			System.out.println("El nuevo tamaño no puede ser igual al tamaño actual");
		}else if(nuevoTamanio>edades.length) {
			edades = new int[nuevoTamanio];
			for (int i = 0; i < aux.length; i++) {
				edades[i] = aux[i];
			}
			System.out.println("\nEl tamaño ha sido aumentado con éxito.");
		}else if(nuevoTamanio<edades.length && nuevoTamanio>0) {
			edades = new int[nuevoTamanio];
			for (int i = 0; i < edades.length; i++) {
				edades[i] = aux[i];
			}
			System.out.println("\nEl tamaño ha sido disminuido con éxito.");
		}else {
			System.out.println("\nERROR   El nuevo tamaño debe ser un número positivo.");
		}
	}
	public void insertarElemento(int posicion, int elemento) {
		edades[posicion] = elemento;
	}
	public void eliminarElemento(int posicion){
		edades[posicion] = 0;
	}
	public void invertirVector() {
		int aux[] = new int[edades.length];
		for (int i = 0; i < edades.length; i++) {
			aux[i] = edades[i]; 
		}
		for (int i = 0; i < edades.length; i++) {
			edades[i] = aux[edades.length-(i-1)]; 
		}
	}
	
}//class VectorEspecial
public class Vectores {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);	
		System.out.println("\n\nPROGRAMA VECTOR ESPECIAL");
		System.out.println("\nIngrese el tamaño de su vector:");
		int taman = x.nextInt();
		VectorEspecial vector = new VectorEspecial(taman);
		System.out.println("\nPor favor, rellene el vector con edades:");
		vector.llenar();
		int elec = 0;
		while(elec!=9) {
		System.out.println("\n\nQué desea hacer?\n1.- Obtener cantidad de elementos\n2.- Mostrar todos los elementos\n3.- Mostrar primer elemento\n4.- Mostrar último elemento\n5.- Cambiar tamaño del vector\n6.- Insertar elemento en posicion especifica\n7.- Eliminar elemento en posicion especifica\n8.- Invertir vector\n9.- Finalizar ejecucion");
		elec = x.nextInt();
		switch(elec) {
		case 1:
			System.out.println("\nEl vector tiene "+vector.obtenerNumElementos()+" elementos");
			break;
		case 2:
			vector.mostarElementos();
			break;
		case 3:
			vector.mostrarElementoInicio();
			break;
		case 4:
			vector.mostrarElementoFinal();
			break;
		case 5:
			System.out.println("\nIngrese un nuevo tamaño para el vector:");
			int nt = x.nextInt();
			vector.cambiarTamanio(nt);
			break;
		case 6:
			System.out.println("\nIngrese el elemento:");
			int elemento = x.nextInt();
			System.out.println("Ingrese la posicion en la que se ingresará:");
			int pos = x.nextInt();
			vector.insertarElemento(pos, elemento);
			break;
		case 7:
			System.out.println("Ingrese la posicion:");
			int pos2 = x.nextInt();
			vector.eliminarElemento(pos2);
			break;
		case 8:
			vector.invertirVector();
			break;
		default:
			System.out.println("\nOpcion no valida");
			break;
		}
		}

	}
}
