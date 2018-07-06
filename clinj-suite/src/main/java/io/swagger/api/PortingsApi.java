package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.PortingsResponse;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface PortingsApi {

	@GET
	@Path("/portings")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all phone number portings", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = PortingsResponse.class)})
	public PortingsResponse getPortings();

	@DELETE
	@Path("/portings/{portingId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Delete/revoke an existing porting", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = PortingsResponse.class)})
	public PortingsResponse revokePorting(@PathParam("portingId") Integer portingId);
}

