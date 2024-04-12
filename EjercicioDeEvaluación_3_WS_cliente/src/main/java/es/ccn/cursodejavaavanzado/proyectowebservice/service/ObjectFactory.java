
package es.ccn.cursodejavaavanzado.proyectowebservice.service;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.ccn.cursodejavaavanzado.proyectowebservice.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertarPedido_QNAME = new QName("localhost", "insertarPedido");
	private final static QName _InsertarPedidoResponse_QNAME = new QName("localhost", "insertarPedidoResponse");
	private final static QName _ObtenerListaPedidos_QNAME = new QName("localhost", "obtenerListaPedidos");
	private final static QName _ObtenerListaPedidosResponse_QNAME = new QName("localhost", "obtenerListaPedidosResponse");
	private final static QName _ActualizarCliente_QNAME = new QName("localhost", "actualizarCliente");
    private final static QName _ActualizarClienteResponse_QNAME = new QName("localhost", "actualizarClienteResponse");
    private final static QName _BorrarCliente_QNAME = new QName("localhost", "borrarCliente");
    private final static QName _BorrarClienteResponse_QNAME = new QName("localhost", "borrarClienteResponse");
    private final static QName _InsertarCliente_QNAME = new QName("localhost", "insertarCliente");
    private final static QName _InsertarClienteResponse_QNAME = new QName("localhost", "insertarClienteResponse");
    private final static QName _ObtenerClienteById_QNAME = new QName("localhost", "obtenerClienteById");
    private final static QName _ObtenerClienteByIdResponse_QNAME = new QName("localhost", "obtenerClienteByIdResponse");
    private final static QName _ObtenerClientes_QNAME = new QName("localhost", "obtenerClientes");
    private final static QName _ObtenerClientesResponse_QNAME = new QName("localhost", "obtenerClientesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.ccn.cursodejavaavanzado.proyectowebservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertarPedido }
     * 
     */
    public InsertarPedido createInsertarPedido() {
        return new InsertarPedido();
    }

	/**
     * Create an instance of {@link InsertarPedidoResponse }
     * 
     */
    public InsertarPedidoResponse createInsertarPedidoResponse() {
        return new InsertarPedidoResponse();
    }

	/**
     * Create an instance of {@link ObtenerListaPedidos }
     * 
     */
    public ObtenerListaPedidos createObtenerListaPedidos() {
        return new ObtenerListaPedidos();
    }

	/**
     * Create an instance of {@link ObtenerListaPedidosResponse }
     * 
     */
    public ObtenerListaPedidosResponse createObtenerListaPedidosResponse() {
        return new ObtenerListaPedidosResponse();
    }

	/**
     * Create an instance of {@link ActualizarCliente }
     * 
     */
    public ActualizarCliente createActualizarCliente() {
        return new ActualizarCliente();
    }

    /**
     * Create an instance of {@link ActualizarClienteResponse }
     * 
     */
    public ActualizarClienteResponse createActualizarClienteResponse() {
        return new ActualizarClienteResponse();
    }

    /**
     * Create an instance of {@link BorrarCliente }
     * 
     */
    public BorrarCliente createBorrarCliente() {
        return new BorrarCliente();
    }

    /**
     * Create an instance of {@link BorrarClienteResponse }
     * 
     */
    public BorrarClienteResponse createBorrarClienteResponse() {
        return new BorrarClienteResponse();
    }

    /**
     * Create an instance of {@link InsertarCliente }
     * 
     */
    public InsertarCliente createInsertarCliente() {
        return new InsertarCliente();
    }

    /**
     * Create an instance of {@link InsertarClienteResponse }
     * 
     */
    public InsertarClienteResponse createInsertarClienteResponse() {
        return new InsertarClienteResponse();
    }

    /**
     * Create an instance of {@link ObtenerClienteById }
     * 
     */
    public ObtenerClienteById createObtenerClienteById() {
        return new ObtenerClienteById();
    }

    /**
     * Create an instance of {@link ObtenerClienteByIdResponse }
     * 
     */
    public ObtenerClienteByIdResponse createObtenerClienteByIdResponse() {
        return new ObtenerClienteByIdResponse();
    }

    /**
     * Create an instance of {@link ObtenerClientes }
     * 
     */
    public ObtenerClientes createObtenerClientes() {
        return new ObtenerClientes();
    }

    /**
     * Create an instance of {@link ObtenerClientesResponse }
     * 
     */
    public ObtenerClientesResponse createObtenerClientesResponse() {
        return new ObtenerClientesResponse();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Pedido }
     * 
     */
    public Pedido createPedido() {
        return new Pedido();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarPedido }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertarPedido }{@code >}
     */
    @XmlElementDecl(namespace = "localhost", name = "insertarPedido")
    public JAXBElement<InsertarPedido> createInsertarPedido(InsertarPedido value) {
        return new JAXBElement<InsertarPedido>(_InsertarPedido_QNAME, InsertarPedido.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarPedidoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertarPedidoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "localhost", name = "insertarPedidoResponse")
    public JAXBElement<InsertarPedidoResponse> createInsertarPedidoResponse(InsertarPedidoResponse value) {
        return new JAXBElement<InsertarPedidoResponse>(_InsertarPedidoResponse_QNAME, InsertarPedidoResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaPedidos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerListaPedidos }{@code >}
     */
    @XmlElementDecl(namespace = "localhost", name = "obtenerListaPedidos")
    public JAXBElement<ObtenerListaPedidos> createObtenerListaPedidos(ObtenerListaPedidos value) {
        return new JAXBElement<ObtenerListaPedidos>(_ObtenerListaPedidos_QNAME, ObtenerListaPedidos.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaPedidosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerListaPedidosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "localhost", name = "obtenerListaPedidosResponse")
    public JAXBElement<ObtenerListaPedidosResponse> createObtenerListaPedidosResponse(ObtenerListaPedidosResponse value) {
        return new JAXBElement<ObtenerListaPedidosResponse>(_ObtenerListaPedidosResponse_QNAME, ObtenerListaPedidosResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarCliente }{@code >}
     */
//    @XmlElementDecl(namespace = "localhost", name = "actualizarCliente")
    public JAXBElement<ActualizarCliente> createActualizarCliente(ActualizarCliente value) {
        return new JAXBElement<ActualizarCliente>(_ActualizarCliente_QNAME, ActualizarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarClienteResponse }{@code >}
     */
//    @XmlElementDecl(namespace = "localhost", name = "actualizarClienteResponse")
    public JAXBElement<ActualizarClienteResponse> createActualizarClienteResponse(ActualizarClienteResponse value) {
        return new JAXBElement<ActualizarClienteResponse>(_ActualizarClienteResponse_QNAME, ActualizarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BorrarCliente }{@code >}
     */
//    @XmlElementDecl(namespace = "localhost", name = "borrarCliente")
    public JAXBElement<BorrarCliente> createBorrarCliente(BorrarCliente value) {
        return new JAXBElement<BorrarCliente>(_BorrarCliente_QNAME, BorrarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BorrarClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BorrarClienteResponse }{@code >}
     */
//    @XmlElementDecl(namespace = "localhost", name = "borrarClienteResponse")
    public JAXBElement<BorrarClienteResponse> createBorrarClienteResponse(BorrarClienteResponse value) {
        return new JAXBElement<BorrarClienteResponse>(_BorrarClienteResponse_QNAME, BorrarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertarCliente }{@code >}
     */
//    @XmlElementDecl(namespace = "localhost", name = "insertarCliente")
    public JAXBElement<InsertarCliente> createInsertarCliente(InsertarCliente value) {
        return new JAXBElement<InsertarCliente>(_InsertarCliente_QNAME, InsertarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertarClienteResponse }{@code >}
     */
//    @XmlElementDecl(namespace = "localhost", name = "insertarClienteResponse")
    public JAXBElement<InsertarClienteResponse> createInsertarClienteResponse(InsertarClienteResponse value) {
        return new JAXBElement<InsertarClienteResponse>(_InsertarClienteResponse_QNAME, InsertarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerClienteById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerClienteById }{@code >}
     */
//    @XmlElementDecl(namespace = "localhost", name = "obtenerClienteById")
    public JAXBElement<ObtenerClienteById> createObtenerClienteById(ObtenerClienteById value) {
        return new JAXBElement<ObtenerClienteById>(_ObtenerClienteById_QNAME, ObtenerClienteById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerClienteByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerClienteByIdResponse }{@code >}
     */
//    @XmlElementDecl(namespace = "localhost", name = "obtenerClienteByIdResponse")
    public JAXBElement<ObtenerClienteByIdResponse> createObtenerClienteByIdResponse(ObtenerClienteByIdResponse value) {
        return new JAXBElement<ObtenerClienteByIdResponse>(_ObtenerClienteByIdResponse_QNAME, ObtenerClienteByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerClientes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerClientes }{@code >}
     */
//    @XmlElementDecl(namespace = "localhost", name = "obtenerClientes")
    public JAXBElement<ObtenerClientes> createObtenerClientes(ObtenerClientes value) {
        return new JAXBElement<ObtenerClientes>(_ObtenerClientes_QNAME, ObtenerClientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerClientesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerClientesResponse }{@code >}
     */
//    @XmlElementDecl(namespace = "localhost", name = "obtenerClientesResponse")
    public JAXBElement<ObtenerClientesResponse> createObtenerClientesResponse(ObtenerClientesResponse value) {
        return new JAXBElement<ObtenerClientesResponse>(_ObtenerClientesResponse_QNAME, ObtenerClientesResponse.class, null, value);
    }

}
