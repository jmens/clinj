package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.IdentityVerificationResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface IdentityVerificationApi {

	@GET
	@Path("/identityVerification")
	@Consumes( {"application/json"})
	@Produces( {"application/json"})
	@ApiOperation(value = "", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = IdentityVerificationResponse.class)})
	public IdentityVerificationResponse getVerification();
}

