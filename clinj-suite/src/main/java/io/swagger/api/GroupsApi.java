package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.EndpointNumbersResponse;
import io.swagger.model.FaxlineCallerIdResponse;
import io.swagger.model.FaxlinesResponse;
import io.swagger.model.GroupNumbersResponse;
import io.swagger.model.GroupUsersResponse;
import io.swagger.model.GroupsResponse;
import io.swagger.model.RouteDeviceRequest;
import io.swagger.model.VoicemailsResponse;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/")
@Api(value = "/", description = "")
public interface GroupsApi {

	@POST
	@Path("/groups/{groupId}/devices")
	@Produces( {"application/json"})
	@ApiOperation(value = "Add device to group", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void addDeviceToGroup(@PathParam("groupId") String groupId, RouteDeviceRequest body);

	@GET
	@Path("/groupfaxlines/{faxlineId}/callerid")
	@Produces( {"application/json"})
	@ApiOperation(value = "Get the caller ID of a specific group fax", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = FaxlineCallerIdResponse.class)})
	public FaxlineCallerIdResponse getGroupFaxlineCallerId(@PathParam("faxlineId") String faxlineId);

	@GET
	@Path("/groupfaxlines/{faxlineId}/numbers")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all phone numbers routed to group fax line", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = EndpointNumbersResponse.class)})
	public EndpointNumbersResponse getGroupFaxlineNumbers(@PathParam("faxlineId") String faxlineId);

	@GET
	@Path("/groups/{groupId}/faxlines")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all fax lines for a specific group", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = FaxlinesResponse.class)})
	public FaxlinesResponse getGroupFaxlines(@PathParam("groupId") String groupId);

	@GET
	@Path("/groupfaxlines")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all group fax lines", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = FaxlinesResponse.class)})
	public FaxlinesResponse getGroupFaxlinesForUser(@QueryParam("userId") String userId);

	@GET
	@Path("/groups/{groupId}/numbers")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all phone numbers routed to group", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = GroupNumbersResponse.class)})
	public GroupNumbersResponse getGroupNumbers(@PathParam("groupId") String groupId);

	@GET
	@Path("/groups/{groupId}/users")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all group members", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = GroupUsersResponse.class)})
	public GroupUsersResponse getGroupUsers(@PathParam("groupId") String groupId);

	@GET
	@Path("/groups/{groupId}/voicemail")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all voicemails for a specific group", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = VoicemailsResponse.class)})
	public VoicemailsResponse getGroupVoicemail(@PathParam("groupId") String groupId);

	@GET
	@Path("/groups")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all groups", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = GroupsResponse.class)})
	public GroupsResponse getGroups(@QueryParam("userId") String userId);

	@DELETE
	@Path("/groups/{groupId}/devices/{deviceId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Remove device from group", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void removeDeviceFromGroup(@PathParam("groupId") String groupId, @PathParam("deviceId") String deviceId);
}

