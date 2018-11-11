package rocks.process.orderPlacement.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import rocks.process.orderPlacement.model.OrderRequest;
import rocks.process.orderPlacement.model.OrderResponse;

/**
 * orderPlacement-api
 *
 * <p>APIML Example
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface DefaultApi  {

    @POST
    @Path("/orderPlacement")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderResponse.class) })
    public OrderResponse createOrder(@QueryParam("shampooId") @NotNull String shampooId, @QueryParam("quantity") @NotNull String quantity, @Valid OrderRequest orderrequest);

    @DELETE
    @Path("/orderPlacement/{orderId}")
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    public void deleteOrder(@PathParam("orderId") String orderId);

    @GET
    @Path("/orderPlacement")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderResponse.class, responseContainer = "List") })
    public List<OrderResponse> findOrder(@QueryParam("orderId") String orderId);

    @PUT
    @Path("/orderPlacement/{orderId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = OrderResponse.class) })
    public OrderResponse updateOrder(@PathParam("orderId") String orderId, @Valid OrderRequest orderrequest);
}

