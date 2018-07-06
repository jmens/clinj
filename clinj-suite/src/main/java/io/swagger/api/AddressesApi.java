package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.AddressResponse;
import io.swagger.model.AddressesResponse;
import io.swagger.model.ModifyAddressRequest;
import io.swagger.model.NumbersResponse;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface AddressesApi {

	@GET
	@Path("/addresses/{addressId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Get a specific address", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = AddressResponse.class)})
	public AddressResponse getAddress(@PathParam("addressId") String addressId);

	@GET
	@Path("/addresses/{addressId}/numbers")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all phone numbers of a specific address", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = NumbersResponse.class)})
	public NumbersResponse getAddressNumbers(@PathParam("addressId") Integer addressId);

	@GET
	@Path("/addresses")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all addresses", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = AddressesResponse.class)})
	public AddressesResponse getAddresses();

	@PUT
	@Path("/addresses/{addressId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update an existing address", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 400, message = "Bad request", response = Void.class)})
	public void modifyAddress(@PathParam("addressId") String addressId, ModifyAddressRequest body);
}

