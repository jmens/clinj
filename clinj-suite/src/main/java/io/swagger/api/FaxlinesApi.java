package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.EndpointNumbersResponse;
import io.swagger.model.FaxlineCallerIdRequest;
import io.swagger.model.FaxlineCallerIdResponse;
import io.swagger.model.FaxlineResponse;
import io.swagger.model.FaxlineTaglineRequest;
import io.swagger.model.FaxlinesResponse;
import io.swagger.model.SetAliasRequest;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface FaxlinesApi {

	@PUT
	@Path("/{userId}/faxlines/{faxlineId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update alias for an existing fax line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "Faxline not found", response = Void.class)})
	public void changeFaxlineAlias(@PathParam("userId") String userId, @PathParam("faxlineId") String faxlineId,
			SetAliasRequest body);

	@PUT
	@Path("/{userId}/faxlines/{faxlineId}/callerid")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update the caller ID for an existing fax line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "Feature not booked", response = Void.class)})
	public void changeFaxlineCallerIdSettings(@PathParam("userId") String userId,
			@PathParam("faxlineId") String faxlineId, FaxlineCallerIdRequest body);

	@PUT
	@Path("/{userId}/faxlines/{faxlineId}/tagline")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update tagline of an existing fax line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "Feature not booked", response = Void.class)})
	public void changeTagline(@PathParam("userId") String userId, @PathParam("faxlineId") String faxlineId,
			FaxlineTaglineRequest body);

	@POST
	@Path("/{userId}/faxlines")
	@Produces( {"application/json"})
	@ApiOperation(value = "Create a new fax line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = FaxlineResponse.class)})
	public FaxlineResponse createFaxline(@PathParam("userId") String userId);

	@DELETE
	@Path("/{userId}/faxlines/{faxlineId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Delete an existing fax line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void deleteFaxline(@PathParam("userId") String userId, @PathParam("faxlineId") String faxlineId);

	@GET
	@Path("/{userId}/faxlines/{faxlineId}/callerid")
	@Produces( {"application/json"})
	@ApiOperation(value = "Get the caller ID of a specific fax line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = FaxlineCallerIdResponse.class),
			@ApiResponse(code = 403, message = "Feature not booked", response = Void.class)})
	public FaxlineCallerIdResponse getFaxlineCallerId(@PathParam("userId") String userId,
			@PathParam("faxlineId") String faxlineId);

	@GET
	@Path("/{userId}/faxlines/{faxlineId}/numbers")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all phone numbers routed to fax line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = EndpointNumbersResponse.class)})
	public EndpointNumbersResponse getFaxlineNumbers(@PathParam("userId") String userId,
			@PathParam("faxlineId") String faxlineId);

	@GET
	@Path("/{userId}/faxlines")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all fax lines", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = FaxlinesResponse.class),
			@ApiResponse(code = 403, message = "Feature not booked", response = Void.class)})
	public FaxlinesResponse getUserFaxlines(@PathParam("userId") String userId);
}

