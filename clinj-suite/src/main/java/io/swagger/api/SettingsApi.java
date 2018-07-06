package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.SetSipgateIoAccountSettingsRequest;
import io.swagger.model.SipgateIoUrlResponse;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface SettingsApi {

	@GET
	@Path("/settings/sipgateio")
	@Produces( {"application/json"})
	@ApiOperation(value = "List sipgate.io global settings", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = SipgateIoUrlResponse.class),
			@ApiResponse(code = 403, message = "sipgate.io feature not booked", response = Void.class)})
	public SipgateIoUrlResponse getSipgateIoUrls();

	@PUT
	@Path("/settings/sipgateio")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update sipgate.io global settings", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "sipgate.io feature not booked", response = Void.class)})
	public void setSipgateIoUrls(SetSipgateIoAccountSettingsRequest body);
}

