
package materialpack.services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "materialServiceImpl", targetNamespace = "http://services.materialpack/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MaterialServiceImpl {


    /**
     * 
     * @return
     *     returns java.util.List<materialpack.services.Product>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProducts", targetNamespace = "http://services.materialpack/", className = "materialpack.services.GetProducts")
    @ResponseWrapper(localName = "getProductsResponse", targetNamespace = "http://services.materialpack/", className = "materialpack.services.GetProductsResponse")
    @Action(input = "http://services.materialpack/materialServiceImpl/getProductsRequest", output = "http://services.materialpack/materialServiceImpl/getProductsResponse")
    public List<Product> getProducts();

    /**
     * 
     * @param arg0
     * @return
     *     returns materialpack.services.Product
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProductlById", targetNamespace = "http://services.materialpack/", className = "materialpack.services.GetProductlById")
    @ResponseWrapper(localName = "getProductlByIdResponse", targetNamespace = "http://services.materialpack/", className = "materialpack.services.GetProductlByIdResponse")
    @Action(input = "http://services.materialpack/materialServiceImpl/getProductlByIdRequest", output = "http://services.materialpack/materialServiceImpl/getProductlByIdResponse")
    public Product getProductlById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteProductById", targetNamespace = "http://services.materialpack/", className = "materialpack.services.DeleteProductById")
    @ResponseWrapper(localName = "deleteProductByIdResponse", targetNamespace = "http://services.materialpack/", className = "materialpack.services.DeleteProductByIdResponse")
    @Action(input = "http://services.materialpack/materialServiceImpl/deleteProductByIdRequest", output = "http://services.materialpack/materialServiceImpl/deleteProductByIdResponse")
    public boolean deleteProductById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateProduct", targetNamespace = "http://services.materialpack/", className = "materialpack.services.UpdateProduct")
    @ResponseWrapper(localName = "updateProductResponse", targetNamespace = "http://services.materialpack/", className = "materialpack.services.UpdateProductResponse")
    @Action(input = "http://services.materialpack/materialServiceImpl/updateProductRequest", output = "http://services.materialpack/materialServiceImpl/updateProductResponse")
    public boolean updateProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        Product arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addProduct", targetNamespace = "http://services.materialpack/", className = "materialpack.services.AddProduct")
    @ResponseWrapper(localName = "addProductResponse", targetNamespace = "http://services.materialpack/", className = "materialpack.services.AddProductResponse")
    @Action(input = "http://services.materialpack/materialServiceImpl/addProductRequest", output = "http://services.materialpack/materialServiceImpl/addProductResponse")
    public boolean addProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        Product arg0);

}
