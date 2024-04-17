
package es.ccn.cursodejavaavanzado.proyectowebservice.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numPedidos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="strFechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cliente", propOrder = {
    "apellidos",
    "id",
    "nombre",
    "numPedidos",
    "strFechaNacimiento"
})
public class Cliente {

    protected String apellidos;
    protected int id;
    protected String nombre;
    protected int numPedidos;
    protected String strFechaNacimiento;

    /**
     * Obtiene el valor de la propiedad apellidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Define el valor de la propiedad apellidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidos(String value) {
        this.apellidos = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad numPedidos.
     * 
     */
    public int getNumPedidos() {
        return numPedidos;
    }

    /**
     * Define el valor de la propiedad numPedidos.
     * 
     */
    public void setNumPedidos(int value) {
        this.numPedidos = value;
    }

    /**
     * Obtiene el valor de la propiedad strFechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrFechaNacimiento() {
        return strFechaNacimiento;
    }

    /**
     * Define el valor de la propiedad strFechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrFechaNacimiento(String value) {
        this.strFechaNacimiento = value;
    }

}
