
package dawspack.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dawspack.services package. 
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

    private final static QName _DeleteProductById_QNAME = new QName("http://services.dawspack/", "deleteProductById");
    private final static QName _UpdateProduct_QNAME = new QName("http://services.dawspack/", "updateProduct");
    private final static QName _AddProductResponse_QNAME = new QName("http://services.dawspack/", "addProductResponse");
    private final static QName _UpdateProductResponse_QNAME = new QName("http://services.dawspack/", "updateProductResponse");
    private final static QName _GetProductlById_QNAME = new QName("http://services.dawspack/", "getProductlById");
    private final static QName _GetProductlByIdResponse_QNAME = new QName("http://services.dawspack/", "getProductlByIdResponse");
    private final static QName _AddProduct_QNAME = new QName("http://services.dawspack/", "addProduct");
    private final static QName _GetProducts_QNAME = new QName("http://services.dawspack/", "getProducts");
    private final static QName _DeleteProductByIdResponse_QNAME = new QName("http://services.dawspack/", "deleteProductByIdResponse");
    private final static QName _GetProductsResponse_QNAME = new QName("http://services.dawspack/", "getProductsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dawspack.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link DeleteProductByIdResponse }
     * 
     */
    public DeleteProductByIdResponse createDeleteProductByIdResponse() {
        return new DeleteProductByIdResponse();
    }

    /**
     * Create an instance of {@link GetProductlById }
     * 
     */
    public GetProductlById createGetProductlById() {
        return new GetProductlById();
    }

    /**
     * Create an instance of {@link GetProductlByIdResponse }
     * 
     */
    public GetProductlByIdResponse createGetProductlByIdResponse() {
        return new GetProductlByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteProductById }
     * 
     */
    public DeleteProductById createDeleteProductById() {
        return new DeleteProductById();
    }

    /**
     * Create an instance of {@link UpdateProduct }
     * 
     */
    public UpdateProduct createUpdateProduct() {
        return new UpdateProduct();
    }

    /**
     * Create an instance of {@link UpdateProductResponse }
     * 
     */
    public UpdateProductResponse createUpdateProductResponse() {
        return new UpdateProductResponse();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dawspack/", name = "deleteProductById")
    public JAXBElement<DeleteProductById> createDeleteProductById(DeleteProductById value) {
        return new JAXBElement<DeleteProductById>(_DeleteProductById_QNAME, DeleteProductById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dawspack/", name = "updateProduct")
    public JAXBElement<UpdateProduct> createUpdateProduct(UpdateProduct value) {
        return new JAXBElement<UpdateProduct>(_UpdateProduct_QNAME, UpdateProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dawspack/", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dawspack/", name = "updateProductResponse")
    public JAXBElement<UpdateProductResponse> createUpdateProductResponse(UpdateProductResponse value) {
        return new JAXBElement<UpdateProductResponse>(_UpdateProductResponse_QNAME, UpdateProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductlById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dawspack/", name = "getProductlById")
    public JAXBElement<GetProductlById> createGetProductlById(GetProductlById value) {
        return new JAXBElement<GetProductlById>(_GetProductlById_QNAME, GetProductlById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductlByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dawspack/", name = "getProductlByIdResponse")
    public JAXBElement<GetProductlByIdResponse> createGetProductlByIdResponse(GetProductlByIdResponse value) {
        return new JAXBElement<GetProductlByIdResponse>(_GetProductlByIdResponse_QNAME, GetProductlByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dawspack/", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dawspack/", name = "getProducts")
    public JAXBElement<GetProducts> createGetProducts(GetProducts value) {
        return new JAXBElement<GetProducts>(_GetProducts_QNAME, GetProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dawspack/", name = "deleteProductByIdResponse")
    public JAXBElement<DeleteProductByIdResponse> createDeleteProductByIdResponse(DeleteProductByIdResponse value) {
        return new JAXBElement<DeleteProductByIdResponse>(_DeleteProductByIdResponse_QNAME, DeleteProductByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.dawspack/", name = "getProductsResponse")
    public JAXBElement<GetProductsResponse> createGetProductsResponse(GetProductsResponse value) {
        return new JAXBElement<GetProductsResponse>(_GetProductsResponse_QNAME, GetProductsResponse.class, null, value);
    }

}
