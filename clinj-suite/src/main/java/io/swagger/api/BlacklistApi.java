package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.IncomingEntries;
import io.swagger.model.IncomingEntry;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface BlacklistApi {

	@POST
	@Path("/blacklist/incoming")
	@Consumes( {"application/json"})
	@Produces( {"application/json"})
	@ApiOperation(value = "Create a new incoming blacklist entry", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = IncomingEntry.class),
			@ApiResponse(code = 201, message = "successful operation", response = IncomingEntry.class),
			@ApiResponse(code = 400, message = "Invalid phoneNumber supplied", response = IncomingEntry.class),
			@ApiResponse(code = 409, message = "IncomingEntry already exists", response = IncomingEntry.class)})
	public IncomingEntry addIncomingEntry(IncomingEntry body);

	@GET
	@Path("/blacklist/incoming")
	@Consumes( {"application/json"})
	@Produces( {"application/json"})
	@ApiOperation(value = "Get your incoming blacklist entries", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = IncomingEntries.class)})
	public IncomingEntries getIncomingEntries();

	@DELETE
	@Path("/blacklist/incoming/{phoneNumber}")
	@Consumes( {"application/json"})
	@Produces( {"application/json"})
	@ApiOperation(value = "Delete an incoming blacklist entry", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 204, message = "successful operation", response = Void.class),
			@ApiResponse(code = 400, message = "Invalid phoneNumber supplied", response = Void.class),
			@ApiResponse(code = 404, message = "IncomingEntry not found", response = Void.class)})
	public void removeIncomingEntry(@PathParam("phoneNumber") String phoneNumber);
}

