package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.ApiUrlsResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface UrlsApi {

	@GET
	@Path("/")
	@Produces( {"application/json"})
	@ApiOperation(value = "Get all top level API URLs", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = ApiUrlsResponse.class)})
	public ApiUrlsResponse getUrls();
}

