package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.ActivateSimRequest;
import io.swagger.model.CallerIdRequest;
import io.swagger.model.CallerIdResponse;
import io.swagger.model.ChangeDeviceRequest;
import io.swagger.model.ChangeExternalDeviceIncomingCallDisplayRequest;
import io.swagger.model.ChangeExternalDeviceTargetNumberRequest;
import io.swagger.model.CreateDeviceRequest;
import io.swagger.model.CreateExternalDeviceRequest;
import io.swagger.model.CreateMobileDeviceRequest;
import io.swagger.model.CreateRegisterDeviceRequest;
import io.swagger.model.DeviceContingentsResponse;
import io.swagger.model.DeviceResponse;
import io.swagger.model.DevicesResponse;
import io.swagger.model.ExternalDeviceResponse;
import io.swagger.model.LocalprefixRequest;
import io.swagger.model.LocalprefixResponse;
import io.swagger.model.MobileDeviceResponse;
import io.swagger.model.OrderSimRequest;
import io.swagger.model.RegisterDeviceResponse;
import io.swagger.model.SetDeviceAliasRequest;
import io.swagger.model.SingleRowDisplayRequest;
import io.swagger.model.SingleRowDisplayResponse;
import io.swagger.model.TariffAnnouncementRequest;
import io.swagger.model.TariffAnnouncementResponse;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface DevicesApi {

	@POST
	@Path("/{userId}/devices/{deviceId}/sim")
	@Produces( {"application/json"})
	@ApiOperation(value = "Activate a SIM card for a specific device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void activateSim(@PathParam("userId") String userId, @PathParam("deviceId") String deviceId,
			ActivateSimRequest body);

	@PUT
	@Path("/devices/{deviceId}/external/incomingcalldisplay")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update the incoming startSynchronous display for an existing external device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void changeCallerDisplayOfDevice(@PathParam("deviceId") String deviceId,
			ChangeExternalDeviceIncomingCallDisplayRequest body);

	@PUT
	@Path("/devices/{deviceId}/callerid")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update the caller ID for an existing device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "Feature not booked", response = Void.class)})
	public void changeCallerIdSettings(@PathParam("deviceId") String deviceId, CallerIdRequest body);

	@PUT
	@Path("/devices/{deviceId}/alias")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update alias for an existing device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "Device not found", response = Void.class)})
	public void changeDeviceAlias(@PathParam("deviceId") String deviceId, SetDeviceAliasRequest body);

	@POST
	@Path("/devices/{deviceId}/credentials/password")
	@Produces( {"application/json"})
	@ApiOperation(value = "Change password for an existing device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void changeDevicePassword(@PathParam("deviceId") String deviceId);

	@PUT
	@Path("/devices/{deviceId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update settings for an existing device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void changeDeviceSettings(@PathParam("deviceId") String deviceId, ChangeDeviceRequest body);

	@PUT
	@Path("/devices/{deviceId}/localprefix")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update the local prefix setting for an existing device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void changeLocalprefixSettings(@PathParam("deviceId") String deviceId, LocalprefixRequest body);

	@PUT
	@Path("/devices/{deviceId}/singlerowdisplay")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update single row display setting for an existing device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void changeSingleRowDisplay(@PathParam("deviceId") String deviceId, SingleRowDisplayRequest body);

	@PUT
	@Path("/devices/{deviceId}/external/targetnumber")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update the target phone number for an existing external device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void changeTargetNumberOfDevice(@PathParam("deviceId") String deviceId,
			ChangeExternalDeviceTargetNumberRequest body);

	@PUT
	@Path("/devices/{deviceId}/tariffannouncement")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update tariff announcement setting for an existing device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "Feature not booked", response = Void.class)})
	public void changeTariffAnnouncement(@PathParam("deviceId") String deviceId, TariffAnnouncementRequest body);

	@POST
	@Path("/{userId}/devices")
	@Produces( {"application/json"})
	@ApiOperation(value = "Create a new device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = DeviceResponse.class)})
	public DeviceResponse createDevice(@PathParam("userId") String userId, CreateDeviceRequest body);

	@POST
	@Path("/{userId}/devices/external")
	@Produces( {"application/json"})
	@ApiOperation(value = "Create a new external device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = ExternalDeviceResponse.class)})
	public ExternalDeviceResponse createExternalDevice(@PathParam("userId") String userId,
			CreateExternalDeviceRequest body);

	@POST
	@Path("/{userId}/devices/mobile")
	@Produces( {"application/json"})
	@ApiOperation(value = "Create a new mobile device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = MobileDeviceResponse.class)})
	public MobileDeviceResponse createMobileDevice(@PathParam("userId") String userId, CreateMobileDeviceRequest body);

	@POST
	@Path("/{userId}/devices/register")
	@Produces( {"application/json"})
	@ApiOperation(value = "Create a new register device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = RegisterDeviceResponse.class)})
	public RegisterDeviceResponse createRegisterDevice(@PathParam("userId") String userId,
			CreateRegisterDeviceRequest body);

	@DELETE
	@Path("/{userId}/devices/{deviceId}/sim")
	@Produces( {"application/json"})
	@ApiOperation(value = "Deactivate the SIM card for a specific device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void deactivateSim(@PathParam("userId") String userId, @PathParam("deviceId") String deviceId);

	@DELETE
	@Path("/devices/{deviceId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Delete an existing device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void deleteDevice(@PathParam("deviceId") String deviceId);

	@GET
	@Path("/devices/{deviceId}/callerid")
	@Produces( {"application/json"})
	@ApiOperation(value = "Get the caller ID of a specific device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = CallerIdResponse.class),
			@ApiResponse(code = 403, message = "Feature not booked", response = Void.class)})
	public CallerIdResponse getCallerId(@PathParam("deviceId") String deviceId);

	@GET
	@Path("/devices/{deviceId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Get a specific device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = DeviceResponse.class)})
	public DeviceResponse getDevice(@PathParam("deviceId") String deviceId);

	@GET
	@Path("/{userId}/devices/{deviceId}/contingents")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all device contingents", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = DeviceContingentsResponse.class)})
	public DeviceContingentsResponse getDeviceContingents(@PathParam("userId") String userId,
			@PathParam("deviceId") String deviceId);

	@GET
	@Path("/{userId}/devices")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all devices", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = DevicesResponse.class)})
	public DevicesResponse getDevices(@PathParam("userId") String userId);

	@GET
	@Path("/devices/{deviceId}/localprefix")
	@Produces( {"application/json"})
	@ApiOperation(value = "Get the local prefix setting of a specific device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = LocalprefixResponse.class)})
	public LocalprefixResponse getLocalprefix(@PathParam("deviceId") String deviceId);

	@GET
	@Path("/devices/{deviceId}/singlerowdisplay")
	@Produces( {"application/json"})
	@ApiOperation(value = "Get single row display setting of a specific device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = SingleRowDisplayResponse.class)})
	public SingleRowDisplayResponse getSingleRowDisplay(@PathParam("deviceId") String deviceId);

	@GET
	@Path("/devices/{deviceId}/tariffannouncement")
	@Produces( {"application/json"})
	@ApiOperation(value = "Get tariff announcement setting of a specific device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = TariffAnnouncementResponse.class),
			@ApiResponse(code = 403, message = "Feature not booked", response = Void.class)})
	public TariffAnnouncementResponse getTariffAnnouncement(@PathParam("deviceId") String deviceId);

	@POST
	@Path("/{userId}/devices/{deviceId}/sim/orders")
	@Produces( {"application/json"})
	@ApiOperation(value = "Order a new SIM card for a specific device", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "User or device not found", response = Void.class)})
	public void orderSim(@PathParam("userId") String userId, @PathParam("deviceId") String deviceId,
			OrderSimRequest body);
}

