package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.SetAliasRequest;
import io.swagger.model.SetSmsCallerIdRequest;
import io.swagger.model.SmsCallerIdRequest;
import io.swagger.model.SmsCallerIdsResponse;
import io.swagger.model.SmsExtensionsResponse;
import io.swagger.model.VerifySmsCallerIdRequest;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface SmsApi {

	@POST
	@Path("/{userId}/sms/{smsId}/callerids")
	@Produces( {"application/json"})
	@ApiOperation(value = "Create a new caller ID for an existing short message service", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 402, message = "Insufficient funds", response = Void.class)})
	public void addCallerId(@PathParam("userId") String userId, @PathParam("smsId") String smsId,
			SmsCallerIdRequest body);

	@DELETE
	@Path("/{userId}/sms/{smsId}/callerids/{callerId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Delete an existing caller ID for a specific short message service", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void deleteSmsCallerId(@PathParam("userId") String userId, @PathParam("smsId") String smsId,
			@PathParam("callerId") Integer callerId);

	@PUT
	@Path("/{userId}/sms/{smsId}/callerids/{callerId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update the caller ID for an existing short message service", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void editCallerId(@PathParam("userId") String userId, @PathParam("smsId") String smsId,
			@PathParam("callerId") Integer callerId, SetSmsCallerIdRequest body);

	@GET
	@Path("/{userId}/sms/{smsId}/callerids")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all caller IDs for a specific short message service", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = SmsCallerIdsResponse.class)})
	public SmsCallerIdsResponse getSmsCallerIds(@PathParam("userId") String userId, @PathParam("smsId") String smsId);

	@GET
	@Path("/{userId}/sms")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all short message services", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = SmsExtensionsResponse.class)})
	public SmsExtensionsResponse getSmsExtensions(@PathParam("userId") String userId);

	@PUT
	@Path("/{userId}/sms/{smsId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update alias for an existing short message service", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "Short message service not found", response = Void.class)})
	public void setSmsAlias(@PathParam("userId") String userId, @PathParam("smsId") String smsId, SetAliasRequest body);

	@POST
	@Path("/{userId}/sms/{smsId}/callerids/{callerId}/verification")
	@Produces( {"application/json"})
	@ApiOperation(value = "Verify an existing caller ID for a specific short message service", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void verifyCallerId(@PathParam("userId") String userId, @PathParam("smsId") String smsId,
			@PathParam("callerId") Integer callerId, VerifySmsCallerIdRequest body);
}

