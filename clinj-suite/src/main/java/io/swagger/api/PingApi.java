package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.Pong;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface PingApi {

	@GET
	@Path("/ping")
	@Consumes( {"application/json"})
	@Produces( {"application/json"})
	@ApiOperation(value = "Check if API is reachable", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success", response = Pong.class)})
	public Pong ping1();
}

