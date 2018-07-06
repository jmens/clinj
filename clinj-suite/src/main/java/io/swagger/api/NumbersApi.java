package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.AddDirectDialRequest;
import io.swagger.model.ChangeDirectDialRequest;
import io.swagger.model.ChangeNumberSettingsRequest;
import io.swagger.model.NumbersResponse;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface NumbersApi {

	@POST
	@Path("/numbers/quickdial")
	@Produces( {"application/json"})
	@ApiOperation(value = "Add a new quick start number", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void addQuickDialNumber(AddDirectDialRequest body);

	@PUT
	@Path("/numbers/{numberId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Change phone number settings, e.g. route to endpoint", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "Number not found", response = Void.class)})
	public void changeNumberSettings(@PathParam("numberId") String numberId, ChangeNumberSettingsRequest body);

	@PUT
	@Path("/numbers/quickdial/{quickdialId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update an existing quick start number", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void changeQuickDialNumber(@PathParam("quickdialId") String quickdialId, ChangeDirectDialRequest body);

	@DELETE
	@Path("/numbers/quickdial/{numberId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Delete an existing quick start number", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void deleteQuickDialNumber(@PathParam("numberId") String numberId);

	@GET
	@Path("/numbers")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all phone numbers", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = NumbersResponse.class)})
	public NumbersResponse getNumbers();

	@GET
	@Path("/{userId}/numbers")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all user phone numbers of a specific user", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = NumbersResponse.class)})
	public NumbersResponse getUserNumbers(@PathParam("userId") String userId);

	@GET
	@Path("/numbers/quickdial/validation/{quickDialNumber}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Check if quick start number is already taken", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void validateQuickDialNumber(@PathParam("quickDialNumber") String quickDialNumber);
}

