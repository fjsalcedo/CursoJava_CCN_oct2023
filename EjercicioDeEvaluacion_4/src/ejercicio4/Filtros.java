package ejercicio4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Clase que implementa filtros sobre listas de ciudadanos.
 * 
 * @author Miguel
 *
 */
public class Filtros {
	/**
	 * Campos de registro.
	 * @author FJSS
	 */
	//Entradas y salidas del registro (campos static; se pueden repetir en diferentes ciudadanos
	//para no hacer m�s pesada la clase)
	//Cada expediente tendr� entradas y salidas por registro (p.ej. documentaci�n del ciudadano)
	public static List<EntradaRegistro> entradasA = new ArrayList<>();
    public static List<SalidaRegistro> salidasA = new ArrayList<>();
    public static List<EntradaRegistro> entradasB = new ArrayList<>();
    public static List<SalidaRegistro> salidasB = new ArrayList<>();
    public static List<EntradaRegistro> entradasC = new ArrayList<>();
    public static List<SalidaRegistro> salidasC = new ArrayList<>();

    static {
        //A
        entradasA.add(new EntradaRegistro("E20230901", "Apertura_A"));
        entradasA.add(new EntradaRegistro("E20230905", "Documentaci�n_A"));
        entradasA.add(new EntradaRegistro("E20230910", "Alegaciones_A"));

        salidasA.add(new SalidaRegistro("S20231002", "Resoluci�n_1A", false));
        salidasA.add(new SalidaRegistro("S20231012", "Resoluci�n_DA", true));

        //B
        entradasB.add(new EntradaRegistro("E20221101", "Apertura_B"));
        entradasB.add(new EntradaRegistro("E20221105", "Documentaci�n_B"));
        entradasB.add(new EntradaRegistro("E20221112", "Alegaciones_B"));

        salidasB.add(new SalidaRegistro("S20221202", "Resoluci�n_1B", false));
        salidasB.add(new SalidaRegistro("S20221222", "Resoluci�n_DB", false));

        //C
        entradasC.add(new EntradaRegistro("E20210201", "Apertura_C"));
        entradasC.add(new EntradaRegistro("E20210215", "Documentaci�n_C"));
        entradasC.add(new EntradaRegistro("E20210222", "Alegaciones_C"));

        salidasC.add(new SalidaRegistro("S20210302", "Resoluci�n_1C", true));
        salidasC.add(new SalidaRegistro("S20210322", "Resoluci�n_DC", false));
    }
    
    //Expedientes
    public static List<Expediente> expedientes1 = new ArrayList<>();
    public static List<Expediente> expedientes2 = new ArrayList<>();
    public static List<Expediente> expedientes3 = new ArrayList<>();

    static {
        // Inicializaci�n de expedientes1
        Expediente expedienteA = new Expediente("EXP_01");
        expedienteA.getEntradasRegistro().addAll(entradasA);
        expedienteA.getSalidasRegistro().addAll(salidasA);
        expedientes1.add(expedienteA);

        Expediente expedienteB = new Expediente("EXP_03");
        expedienteB.getEntradasRegistro().addAll(entradasB);
        expedienteB.getSalidasRegistro().addAll(salidasB);
        expedientes1.add(expedienteB);

        Expediente expedienteC = new Expediente("EXP_13");
        expedienteC.getEntradasRegistro().addAll(entradasC);
        expedienteC.getSalidasRegistro().addAll(salidasC);
        expedientes1.add(expedienteC);

        // Inicializaci�n de expedientes2
        Expediente expedienteD = new Expediente("EXP_04");
        expedienteD.getEntradasRegistro().addAll(entradasB);
        expedienteD.getSalidasRegistro().addAll(salidasB);
        expedientes2.add(expedienteD);

        Expediente expedienteE = new Expediente("EXP_25");
        expedienteE.getEntradasRegistro().addAll(entradasA);
        expedienteE.getSalidasRegistro().addAll(salidasA);
        expedientes2.add(expedienteE);

        Expediente expedienteF = new Expediente("EXP_16");
        expedienteF.getEntradasRegistro().addAll(entradasC);
        expedienteF.getSalidasRegistro().addAll(salidasC);
        expedientes2.add(expedienteF);

        // Inicializaci�n de expedientes3
        Expediente expedienteG = new Expediente("EXP_17");
        expedienteG.getEntradasRegistro().addAll(entradasA);
        expedienteG.getSalidasRegistro().addAll(salidasA);
        expedientes3.add(expedienteG);

        Expediente expedienteH = new Expediente("EXP_08");
        expedienteH.getEntradasRegistro().addAll(entradasB);
        expedienteH.getSalidasRegistro().addAll(salidasB);
        expedientes3.add(expedienteH);
    }
	

	public static List<Ciudadano> listaCiudadanos(){
		/**
		 * M�todo que devuelve la lista de ciudadanos completa.
		 * @author FJSS
		 */
		//Los filtros trabajan s�lo con una lista de ciudadanos.
		//Este m�todo devolver� dicha lista para los stream() de los m�todos que har�n el filtrado.
		//Tendremos en cuenta la configuraci�n de las clases relevantes a la hora de conformar la lista.
		
		//Ciudadanos
		List<Ciudadano> ciudadanos = new ArrayList<Ciudadano>();
		
		//Utilizaremos el m�todo addAll() de List para a�adirles
		//los expedientes, ya que no tenemos setters en la clase Cliente.
		//Creamos el ciudadano1
		Ciudadano ciudadano1 = new Ciudadano("1384739A", "Leopold Poldis Poldis");
		//Le a�adimos sus expedientes
		ciudadano1.getExpedientes().addAll(expedientes1);
		//Y lo a�adimos a la lista de ciudadanos
		ciudadanos.add(ciudadano1);
		
		Ciudadano ciudadano2 = new Ciudadano("8438654B", "Leopold�n Poldis Od�n");
		ciudadano2.getExpedientes().addAll(expedientes2);
		ciudadanos.add(ciudadano2);
		
		Ciudadano ciudadano3 = new Ciudadano("3497236D", "Meond�n Od�n y los Od�nicos");
		ciudadano3.getExpedientes().addAll(expedientes3);
		ciudadanos.add(ciudadano3);
		
		//Ciudadanos con expedientes completos.
		return ciudadanos;
	}
	
	
	/**
	 * Obtiene una lista con los NIF de los ciudadanos, ordenados ascendentemente
	 * 
	 * @param listaCiudadanos la lista de ciudadanos 

	 * @return la lista de NIF
	 */
	public static List<String> obtenerNifsCiudadanos(List<Ciudadano> listaCiudadanos) {
		//TODO: a implementar por el alumno
		List<Ciudadano> ciudadanos = listaCiudadanos();
		
		//Lista de NIF de los ciudadanos
		List<String> nifs = ciudadanos.stream().map(Ciudadano::getNIF).sorted().
				peek(System.out::println).collect(Collectors.toList());
		
		return nifs;
	}


	/**
	 * Obtiene una lista con los id de expediente de todos los expedientes de la lista de ciudadanos,
	 * ordenados ascendentemente.
	 * 
	 * @param listaCiudadanos la lista de ciudadanos
	 * @return la lista de ids de expediente
	 */
	public static List<String> obtenerIdsExpedientes(List<Ciudadano> listaCiudadanos) {
		//TODO: a implementar por el alumno
		List<Ciudadano> ciudadanos = listaCiudadanos();
		
		//Lista de los id de los expedientes ordenados.
		List<String> expedientesID = ciudadanos.stream().
				flatMap(ciudadano -> ciudadano.getExpedientes().stream()).
				map(Expediente::getIdExpediente).sorted().
				peek(System.out::println).collect(Collectors.toList());
		
		return expedientesID;
	}
	
	
	/**
	 * Obtiene una lista con las salidas no le�das, ordenadas por titulo
	 * 
	 * @param listaCiudadanos la lista de ciudadanos
	 * @return la lista de salidas
	 */
	public static List<SalidaRegistro> obtenerSalidasNoLeidas(List<Ciudadano> listaCiudadanos) {
		//TODO: a implementar por el alumno
		List<Ciudadano> ciudadanos = listaCiudadanos();
		
		//LIsta de las anotaciones de salida del registro no le�das (campo "leida" a false)
		List<SalidaRegistro> salidasNoLeidas = ciudadanos.stream().
				flatMap(ciudadano -> ciudadano.getExpedientes().stream()).
				flatMap(expediente -> expediente.getSalidasRegistro().stream()).
				filter(leida -> !leida.isLeida()).
				sorted(Comparator.comparing(SalidaRegistro::getTitulo)).
				peek(leida -> System.out.println(leida)).
				collect(Collectors.toList());
		
		return salidasNoLeidas;
	}
	
	
	/**
	 * Obtiene una lista con los c�digos de registro de las salidas no le�das, ordenados descendentemente
	 * 
	 * @param listaCiudadanos la lista de ciudadanos
	 * @return la lista con los c�digos de registro
	 */
	public static List<String> obtenerCodigosRegistroSalidasNoLeidas(List<Ciudadano> listaCiudadanos) {
		//TODO: a implementar por el alumno
		List<Ciudadano> ciudadanos = listaCiudadanos();
		
		//Listado de los c�digos de registro de salida no le�dos en orden descendente.
		List<String> codigosNoLeidosDescendente = ciudadanos.stream().
				flatMap(ciudadano -> ciudadano.getExpedientes().stream()).
				flatMap(expediente -> expediente.getSalidasRegistro().stream()).
				filter(leida -> !leida.isLeida()).
				map(SalidaRegistro::getCodRegistro).
				sorted(Comparator.reverseOrder()).
				peek(System.out::println).
				collect(Collectors.toList());
		
		return codigosNoLeidosDescendente;
	}

	public static void main(String[] args) {
		//Como las instrucciones del ejercicio indican que no se debe utilizar otra cosa que
		//expresiones lambda y streams, hemos empleado peek() para imprimir los objetos de las listas.
		//En todo caso, quitando los peek() podr�amos utilizar bucles foreach para recorrerlas
		//e imprimir cada elemento, por ejemplo:
		//List<String> salidasNoLeidas = obtenerSalidasNoLeidas(listaCiudadanos());
		//for (String salida : salidasNoLeidas) {
		//System.out.println(salida);
		//}
		System.out.println("Listado de NIF ordenados");
		obtenerNifsCiudadanos(listaCiudadanos());
		System.out.println();
		System.out.println("Listado de expedientes ordenados por ID");
		obtenerIdsExpedientes(listaCiudadanos());
		System.out.println();
		System.out.println("Listado de salidas no le�das");
		obtenerSalidasNoLeidas(listaCiudadanos());
		System.out.println();
		System.out.println("Listado de c�digos de registro de salidas no le�das");
		obtenerCodigosRegistroSalidasNoLeidas(listaCiudadanos());
		System.out.println();
	}

}






















