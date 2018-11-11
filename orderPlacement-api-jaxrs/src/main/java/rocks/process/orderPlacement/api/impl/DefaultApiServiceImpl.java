package rocks.process.orderPlacement.api.impl;

import java.util.List;

import rocks.process.orderPlacement.api.DefaultApi;
import rocks.process.orderPlacement.model.OrderRequest;
import rocks.process.orderPlacement.model.OrderResponse;

/**
 * orderPlacement-api
 *
 * <p>APIML Example
 *
 */
public class DefaultApiServiceImpl implements DefaultApi {
    public OrderResponse createOrder(String shampooId, String quantity, OrderRequest orderrequest) {
        // TODO: Implement...
        
        return null;
    }
    
    public void deleteOrder(String orderId) {
        // TODO: Implement...
        
        
    }
    
    public List<OrderResponse> findOrder(String orderId) {
        // TODO: Implement...
        
        return null;
    }
    
    public OrderResponse updateOrder(String orderId, OrderRequest orderrequest) {
        // TODO: Implement...
        
        return null;
    }
    
}

