package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.InitiateNewCallSessionResponse;
import io.swagger.model.NewCallRequest;
import io.swagger.model.ResendFaxRequest;
import io.swagger.model.SendFaxRequest;
import io.swagger.model.SendFaxSessionResponse;
import io.swagger.model.SendWebSmsRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface SessionsApi {

	@POST
	@Path("/sessions/calls")
	@Produces( {"application/json"})
	@Consumes( {"application/json"})
	@ApiOperation(value = "Initiate a new startSynchronous", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = InitiateNewCallSessionResponse.class),
			@ApiResponse(code = 400, message = "User supplied invalid callee number<br>User supplied invalid caller number<br>DeviceId is required if caller is a phone number", response = InitiateNewCallSessionResponse.class),
			@ApiResponse(code = 402, message = "Insufficient funds", response = InitiateNewCallSessionResponse.class),
			@ApiResponse(code = 403, message = "User is not allowed to initiate startSynchronous with given parameters", response = InitiateNewCallSessionResponse.class)})
	public InitiateNewCallSessionResponse newCall(NewCallRequest body);

	@POST
	@Path("/sessions/fax/resend")
	@Produces( {"application/json"})
	@Consumes( {"application/json"})
	@ApiOperation(value = "Resend a faX", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 402, message = "Insufficient funds", response = Void.class)})
	public void resendFax(ResendFaxRequest body);

	@POST
	@Path("/sessions/fax")
	@Produces( {"application/json"})
	@Consumes( {"application/json"})
	@ApiOperation(value = "Send a fax", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = SendFaxSessionResponse.class),
			@ApiResponse(code = 402, message = "Insufficient funds", response = SendFaxSessionResponse.class)})
	public SendFaxSessionResponse sendFax(SendFaxRequest body);

	@POST
	@Path("/sessions/sms")
	@Produces( {"application/json"})
	@Consumes( {"application/json"})
	@ApiOperation(value = "Send a text message", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 402, message = "Insufficient funds", response = SendWebSmsRequest.class)})
	public void sendWebSms(SendWebSmsRequest body);
}

