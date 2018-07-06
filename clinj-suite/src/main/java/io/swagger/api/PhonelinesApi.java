package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.AddGreetingRequest;
import io.swagger.model.ChangeVoicemailGreetingRequest;
import io.swagger.model.ChangeVoicemailRequest;
import io.swagger.model.DevicesResponse;
import io.swagger.model.EndpointNumbersResponse;
import io.swagger.model.ForwardingsResponse;
import io.swagger.model.GreetingsResponse;
import io.swagger.model.ParallelForwardingsResponse;
import io.swagger.model.PhonelineBlockAnonymousResponse;
import io.swagger.model.PhonelineBusyOnBusyResponse;
import io.swagger.model.PhonelineResponse;
import io.swagger.model.PhonelineSipgateIoLogsResponse;
import io.swagger.model.PhonelineSipgateIoResponse;
import io.swagger.model.RouteDeviceRequest;
import io.swagger.model.SetAliasRequest;
import io.swagger.model.SetBlockAnonymousSettingsRequest;
import io.swagger.model.SetBusyOnBusySettingsRequest;
import io.swagger.model.SetForwardingsRequest;
import io.swagger.model.SetParallelForwardingRequest;
import io.swagger.model.SetSipgateIoPhonelineSettingsRequest;
import io.swagger.model.VoicemailsResponse;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface PhonelinesApi {

	@POST
	@Path("/{userId}/phonelines/{phonelineId}/devices")
	@Produces( {"application/json"})
	@ApiOperation(value = "Add device to phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void addDeviceToPhoneline(@PathParam("userId") String userId, @PathParam("phonelineId") String phonelineId,
			RouteDeviceRequest body);

	@POST
	@Path("/{userId}/phonelines/{phonelineId}/voicemails/{voicemailId}/greetings")
	@Produces( {"application/json"})
	@ApiOperation(value = "Create a new greeting for a specific phone line voicemail", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = GreetingsResponse.class)})
	public GreetingsResponse addGreeting(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId, @PathParam("voicemailId") String voicemailId,
			AddGreetingRequest body);

	@POST
	@Path("/{userId}/phonelines/{phonelineId}/parallelforwardings")
	@Produces( {"application/json"})
	@ApiOperation(value = "Create parallel forwarding for an existing phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void addParallelForwarding(@PathParam("userId") String userId, @PathParam("phonelineId") String phonelineId,
			SetParallelForwardingRequest body);

	@PUT
	@Path("/{userId}/phonelines/{phonelineId}/parallelforwardings/{parallelForwardingId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update an existing parallel forwarding", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "Parallel forwarding not found", response = Void.class)})
	public void changeParallelForwardingSettings(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId,
			@PathParam("parallelForwardingId") String parallelForwardingId, SetParallelForwardingRequest body);

	@PUT
	@Path("/{userId}/phonelines/{phonelineId}/voicemails/{voicemailId}/greetings/{greetingId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update an existing phone line voicemail greeting", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void changePhonelineVoicemailGreeting(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId, @PathParam("voicemailId") String voicemailId,
			@PathParam("greetingId") String greetingId, ChangeVoicemailGreetingRequest body);

	@PUT
	@Path("/{userId}/phonelines/{phonelineId}/voicemails/{voicemailId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update voicemail settings for a specific phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 400, message = "Voicemail settings could not be changed due to bad request", response = Void.class),
			@ApiResponse(code = 403, message = "Transcription not available", response = Void.class)})
	public void changeVoicemailSettings(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId, @PathParam("voicemailId") String voicemailId,
			ChangeVoicemailRequest body);

	@POST
	@Path("/{userId}/phonelines")
	@Produces( {"application/json"})
	@ApiOperation(value = "Create a new phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = PhonelineResponse.class)})
	public PhonelineResponse createPhoneline(@PathParam("userId") String userId);

	@DELETE
	@Path("/{userId}/phonelines/{phonelineId}/parallelforwardings/{parallelForwardingId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Delete parallel forwarding", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "Parallel forwarding not found", response = Void.class)})
	public void deleteParallelForwardingSettings(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId,
			@PathParam("parallelForwardingId") String parallelForwardingId);

	@DELETE
	@Path("/{userId}/phonelines/{phonelineId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Delete an existing phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "Phoneline not found", response = Void.class)})
	public void deletePhoneline(@PathParam("userId") String userId, @PathParam("phonelineId") String phonelineId);

	@DELETE
	@Path("/{userId}/phonelines/{phonelineId}/voicemails/{voicemailId}/greetings/{greetingId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Delete an existing phone line voicemail greeting", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void deletePhonlineVoicemailGreeting(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId, @PathParam("voicemailId") String voicemailId,
			@PathParam("greetingId") String greetingId);

	@GET
	@Path("/{userId}/phonelines/{phonelineId}/blockanonymous")
	@Produces( {"application/json"})
	@ApiOperation(value = "Get the block anonymous setting of a specific phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = PhonelineBlockAnonymousResponse.class)})
	public PhonelineBlockAnonymousResponse getBlockAnonymousSetting(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId);

	@GET
	@Path("/{userId}/phonelines/{phonelineId}/busyonbusy")
	@Produces( {"application/json"})
	@ApiOperation(value = "Get the busy on busy setting of a specific phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = PhonelineBusyOnBusyResponse.class)})
	public PhonelineBusyOnBusyResponse getBusyOnBusySetting(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId);

	@GET
	@Path("/{userId}/phonelines/{phonelineId}/devices")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all devices of a specific phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = DevicesResponse.class)})
	public DevicesResponse getDevicesForPhoneline(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId);

	@GET
	@Path("/{userId}/phonelines/{phonelineId}/forwardings")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all forwarding settings of a specific phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = ForwardingsResponse.class),
			@ApiResponse(code = 403, message = "Feature not booked", response = Void.class)})
	public ForwardingsResponse getPhonelineForwardings(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId);

	@GET
	@Path("/{userId}/phonelines/{phonelineId}/numbers")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all phone numbers routed to phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = EndpointNumbersResponse.class)})
	public EndpointNumbersResponse getPhonelineNumbers(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId);

	@GET
	@Path("/{userId}/phonelines/{phonelineId}/parallelforwardings")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all parallel forwardings of a specific phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = ParallelForwardingsResponse.class),
			@ApiResponse(code = 403, message = "Feature not booked", response = Void.class)})
	public ParallelForwardingsResponse getPhonelineParallelForwardings(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId);

	@GET
	@Path("/{userId}/phonelines/{phonelineId}/voicemails/{voicemailId}/greetings")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all greetings for a specific phone line voicemail", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = GreetingsResponse.class)})
	public GreetingsResponse getPhonelineVoicemailGreetings(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId, @PathParam("voicemailId") String voicemailId);

	@GET
	@Path("/{userId}/phonelines/{phonelineId}/sipgateio/log")
	@Produces( {"application/json"})
	@ApiOperation(value = "List sipgate.io debug log for a specific phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = PhonelineSipgateIoLogsResponse.class),
			@ApiResponse(code = 403, message = "sipgate.io feature not booked", response = Void.class)})
	public PhonelineSipgateIoLogsResponse getSipgateIoLogs(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId);

	@GET
	@Path("/{userId}/phonelines/{phonelineId}/sipgateio")
	@Produces( {"application/json"})
	@ApiOperation(value = "List sipgate.io settings of a specific phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = PhonelineSipgateIoResponse.class),
			@ApiResponse(code = 403, message = "sipgate.io feature not booked", response = Void.class)})
	public PhonelineSipgateIoResponse getSipgateIoSettings(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId);

	@GET
	@Path("/{userId}/phonelines/{phonelineId}/voicemails")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all voicemails of a specific phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = VoicemailsResponse.class),
			@ApiResponse(code = 403, message = "Voicemail feature not booked", response = Void.class)})
	public VoicemailsResponse getVoicemails(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId);

	@DELETE
	@Path("/{userId}/phonelines/{phonelineId}/devices/{deviceId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Remove device from phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void removeDeviceFromPhoneline(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId, @PathParam("deviceId") String deviceId);

	@PUT
	@Path("/{userId}/phonelines/{phonelineId}/blockanonymous")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update the block anonymous setting for an existing phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = PhonelineBlockAnonymousResponse.class)})
	public PhonelineBlockAnonymousResponse setBlockAnonymousSetting(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId, SetBlockAnonymousSettingsRequest body);

	@PUT
	@Path("/{userId}/phonelines/{phonelineId}/busyonbusy")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update the busy on busy setting for an existing phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void setBusyOnBusySetting(@PathParam("userId") String userId, @PathParam("phonelineId") String phonelineId,
			SetBusyOnBusySettingsRequest body);

	@PUT
	@Path("/{userId}/phonelines/{phonelineId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update alias for an existing phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "Phoneline not found", response = Void.class)})
	public void setPhonelineAlias(@PathParam("userId") String userId, @PathParam("phonelineId") String phonelineId,
			SetAliasRequest body);

	@PUT
	@Path("/{userId}/phonelines/{phonelineId}/forwardings")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update forwarding settings for an existing phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 400, message = "Forwarding settings could not be changed due to bad request", response = Void.class),
			@ApiResponse(code = 403, message = "Feature not booked", response = Void.class)})
	public void setPhonelineForwardingSettings(@PathParam("userId") String userId,
			@PathParam("phonelineId") String phonelineId, SetForwardingsRequest body);

	@PUT
	@Path("/{userId}/phonelines/{phonelineId}/sipgateio")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update sipgate.io settings for an existing phone line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "sipgate.io feature not booked", response = Void.class)})
	public void setSipgateIoSettings(@PathParam("userId") String userId, @PathParam("phonelineId") String phonelineId,
			SetSipgateIoPhonelineSettingsRequest body);
}

