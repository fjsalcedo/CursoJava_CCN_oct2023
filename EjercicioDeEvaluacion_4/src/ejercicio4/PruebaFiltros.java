package ejercicio4;

/////////////////////////////////////////////////////
//
// ESTA CLASE NO DEBE SER MODIFICADA POR EL ALUMNO
//
/////////////////////////////////////////////////////

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que prueba los filtros.
 * 
 * @author Miguel
 *
 */
public class PruebaFiltros  {
	

	public static void main(String[] args) {

		List<Ciudadano> listaCiudadanos = creaListaCiudadanos();
		
		////////////////////////////////////////////////////////////////////
		
		List<String> nifs = Filtros.obtenerNifsCiudadanos(listaCiudadanos);
		
		System.out.println("listado NIFs ordenados:");
		nifs.stream().forEach(nif -> System.out.println(nif));
		System.out.println();
		
		////////////////////////////////////////////////////////////////////
				
		List<String> ids = Filtros.obtenerIdsExpedientes(listaCiudadanos);
		
		System.out.println("listado ids expedientes ordenados:");		
		ids.stream().forEach(id -> System.out.println(id));
		System.out.println();
		
		////////////////////////////////////////////////////////////////////
		List<SalidaRegistro> salidas = Filtros.obtenerSalidasNoLeidas(listaCiudadanos);
		
		System.out.println("listado salidas no le�das ordenadas por t�tulo:");		
		salidas.stream().forEach(salida -> System.out.println(salida));
		System.out.println();
		
		////////////////////////////////////////////////////////////////////
		List<String> codigosRegistro = Filtros.obtenerCodigosRegistroSalidasNoLeidas(listaCiudadanos);
		
		System.out.println("listado c�digos registro salidas no le�das ordenados descendentemente:");
		codigosRegistro.stream().forEach(codRegistro -> System.out.println(codRegistro));
		System.out.println();
	}



	/**
	 * Crea la lista de ciudadanos y la rellena
	 * 
	 * @return la lista de ciudadanos
	 */
	private static List<Ciudadano> creaListaCiudadanos() {
		
		List<Ciudadano> listaCiudadanos = new ArrayList<Ciudadano>();
		
		Ciudadano c = null;
		Expediente e = null;
		
		c = new Ciudadano("11111111H", "JUAN ESPA�OL ESPA�OL");
		e = new Expediente("EXP5");
		e.getSalidasRegistro().add(new SalidaRegistro("S000202200001","SALIDA NO LE�DA",false));
		e.getSalidasRegistro().add(new SalidaRegistro("S000202200002","OTRA SALIDA NO LE�DA",false));
		e.getEntradasRegistro().add(new EntradaRegistro("E000202200001","UNA ENTRADA"));
		e.getEntradasRegistro().add(new EntradaRegistro("E000202200002","OTRA ENTRADA"));
		c.getExpedientes().add(e);
		
		
		e = new Expediente("EXP3");
		e.getSalidasRegistro().add(new SalidaRegistro("S000202200003","UNA SALIDA LE�DA",true));
		e.getEntradasRegistro().add(new EntradaRegistro("E000202200005","OTRA ENTRADA M�S"));
		c.getExpedientes().add(e);
		listaCiudadanos.add(c);
		
		c = new Ciudadano("33333333P", "FRANCISCO LOPEZ LOPEZ");
		e = new Expediente("EXP1");
		e.getEntradasRegistro().add(new EntradaRegistro("E000202200003","ENTRADA DE EJEMPLO"));
		c.getExpedientes().add(e);
		listaCiudadanos.add(c);
		
		c = new Ciudadano("22222222J", "MARIA GARCIA GARCIA");
		e = new Expediente("EXP2");
		e.getSalidasRegistro().add(new SalidaRegistro("S000202200004","OTRA SALIDA LE�DA",true));
		e.getSalidasRegistro().add(new SalidaRegistro("S000202200005","OTRA SALIDA NO LE�DA M�S",false));
		e.getEntradasRegistro().add(new EntradaRegistro("E000202200006","ZZZZZZZZZZZZZZZZZZZ"));
		c.getExpedientes().add(e);
		e = new Expediente("EXP8");
		e.getEntradasRegistro().add(new EntradaRegistro("E000202200004","ENTRADA DE EJEMPLO"));
		c.getExpedientes().add(e);
		listaCiudadanos.add(c);
		
		return listaCiudadanos;
	}

}
