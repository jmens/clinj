package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.RestrictionsResponse;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/")
@Api(value = "/", description = "")
public interface RestrictionsApi {

	@GET
	@Path("/restrictions")
	@Consumes( {"application/json"})
	@Produces( {"application/json"})
	@ApiOperation(value = "List all restrictions based on the users product", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = RestrictionsResponse.class)})
	public RestrictionsResponse getRestrictions(@QueryParam("userId") String userId,
			@QueryParam("restriction") List<String> restriction);
}

