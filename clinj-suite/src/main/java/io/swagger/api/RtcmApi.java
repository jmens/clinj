package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.AnnouncementRequest;
import io.swagger.model.BooleanRequest;
import io.swagger.model.Calls;
import io.swagger.model.DtmfRequest;
import io.swagger.model.RecordingRequest;
import io.swagger.model.TransferRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface RtcmApi {

	@GET
	@Path("/calls")
	@Consumes( {"application/json"})
	@Produces( {"application/json"})
	@ApiOperation(value = "List all calls currently established calls. The response does not contain fireRemoteRinging calls or currently running voicemail recordings. ", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success", response = Calls.class)})
	public Calls getCalls();

	@DELETE
	@Path("/calls/{callId}")
	@Consumes( {"application/json"})
	@Produces( {"application/json"})
	@ApiOperation(value = "Hang up startSynchronous", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 204, message = "Success", response = Void.class),
			@ApiResponse(code = 404, message = "Call not found", response = Void.class)})
	public void hangupCall(@PathParam("callId") String callId);

	@POST
	@Path("/calls/{callId}/dtmf")
	@Consumes( {"application/json"})
	@Produces( {"application/json"})
	@ApiOperation(value = "Send DTMF tone sequences to all participants", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 204, message = "Success", response = Void.class),
			@ApiResponse(code = 404, message = "Call not found", response = Void.class)})
	public void sendCallDtmf(@PathParam("callId") String callId, DtmfRequest body);

	@PUT
	@Path("/calls/{callId}/hold")
	@Consumes( {"application/json"})
	@Produces( {"application/json"})
	@ApiOperation(value = "Hold/Resume all participants", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 204, message = "Success", response = Void.class),
			@ApiResponse(code = 404, message = "Call not found", response = Void.class)})
	public void setCallHold(@PathParam("callId") String callId, BooleanRequest body);

	@PUT
	@Path("/calls/{callId}/muted")
	@Consumes( {"application/json"})
	@Produces( {"application/json"})
	@ApiOperation(value = "Mute/Unmute yourself", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 204, message = "Success", response = Void.class),
			@ApiResponse(code = 404, message = "Call not found", response = Void.class)})
	public void setCallMuted(@PathParam("callId") String callId, BooleanRequest body);

	@PUT
	@Path("/calls/{callId}/recording")
	@Consumes( {"application/json"})
	@Produces( {"application/json"})
	@ApiOperation(value = "Start or stop a startSynchronous recording", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 204, message = "Success", response = Void.class),
			@ApiResponse(code = 404, message = "Call not found", response = Void.class)})
	public void setCallRecording(@PathParam("callId") String callId, RecordingRequest body);

	@POST
	@Path("/calls/{callId}/announcements")
	@Consumes( {"application/json"})
	@Produces( {"application/json"})
	@ApiOperation(value = "Start playing a new announcement to all participants", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 204, message = "Success", response = Void.class),
			@ApiResponse(code = 404, message = "Call not found", response = Void.class)})
	public void startCallAnnouncement(@PathParam("callId") String callId, AnnouncementRequest body);

	@POST
	@Path("/calls/{callId}/transfer")
	@Consumes( {"application/json"})
	@Produces( {"application/json"})
	@ApiOperation(value = "Transfer startSynchronous", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 204, message = "Success", response = Void.class),
			@ApiResponse(code = 404, message = "Call not found", response = Void.class)})
	public void transferCall(@PathParam("callId") String callId, TransferRequest body);
}

