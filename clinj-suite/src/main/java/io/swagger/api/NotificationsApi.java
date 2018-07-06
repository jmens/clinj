package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.AddCallEmailNotificationRequest;
import io.swagger.model.AddCallSmsNotificationRequest;
import io.swagger.model.AddFaxEmailNotificationRequest;
import io.swagger.model.AddFaxReportEmailNotificationRequest;
import io.swagger.model.AddFaxSmsNotificationRequest;
import io.swagger.model.AddSmsEmailNotificationRequest;
import io.swagger.model.AddVoicemailEmailVoicemailNotificationRequest;
import io.swagger.model.AddVoicemailSmslVoicemailNotificationRequest;
import io.swagger.model.NotificationsResponse;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface NotificationsApi {

	@POST
	@Path("/{userId}/notifications/fax/email")
	@Produces( {"application/json"})
	@ApiOperation(value = "Create a new email notification for faxes", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "Fax feature not booked", response = Void.class)})
	public void addFaxEmailNotification(@PathParam("userId") String userId, AddFaxEmailNotificationRequest body);

	@POST
	@Path("/{userId}/notifications/fax/report")
	@Produces( {"application/json"})
	@ApiOperation(value = "Create a new email notification for fax reports", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "Fax feature not booked", response = Void.class)})
	public void addFaxReportEmailNotification(@PathParam("userId") String userId,
			AddFaxReportEmailNotificationRequest body);

	@POST
	@Path("/{userId}/notifications/fax/sms")
	@Produces( {"application/json"})
	@ApiOperation(value = "Create a new sms notification for faxes", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "Fax feature not booked", response = Void.class)})
	public void addFaxSmsNotification(@PathParam("userId") String userId, AddFaxSmsNotificationRequest body);

	@POST
	@Path("/{userId}/notifications/sms/email")
	@Produces( {"application/json"})
	@ApiOperation(value = "Create a new email notification for incoming sms", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "SMSToMail feature not booked", response = Void.class)})
	public void addSmsEmailNotification(@PathParam("userId") String userId, AddSmsEmailNotificationRequest body);

	@POST
	@Path("/{userId}/notifications/voicemail/email")
	@Produces( {"application/json"})
	@ApiOperation(value = "Create a new email notification for voicemails", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "Voicemail feature not booked", response = Void.class)})
	public void addVoicemailEmailNotification(@PathParam("userId") String userId,
			AddVoicemailEmailVoicemailNotificationRequest body);

	@POST
	@Path("/{userId}/notifications/voicemail/sms")
	@Produces( {"application/json"})
	@ApiOperation(value = "Create a new sms notification for voicemails", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "Voicemail feature not booked", response = Void.class)})
	public void addVoicemailSmsNotification(@PathParam("userId") String userId,
			AddVoicemailSmslVoicemailNotificationRequest body);

	@POST
	@Path("/{userId}/notifications/startSynchronous/email")
	@Produces( {"application/json"})
	@ApiOperation(value = "Create a new email notification for calls", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "Limit reached", response = Void.class)})
	public void createEmailNotificationForCall(@PathParam("userId") String userId,
			AddCallEmailNotificationRequest body);

	@POST
	@Path("/{userId}/notifications/startSynchronous/sms")
	@Produces( {"application/json"})
	@ApiOperation(value = "Create a new sms notification for calls", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 403, message = "Limit reached", response = Void.class)})
	public void createSmsNotificationForCall(@PathParam("userId") String userId, AddCallSmsNotificationRequest body);

	@DELETE
	@Path("/{userId}/notifications/{notificationId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Delete an existing notification", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void deleteNotification(@PathParam("userId") String userId,
			@PathParam("notificationId") String notificationId);

	@GET
	@Path("/{userId}/notifications")
	@Produces( {"application/json"})
	@ApiOperation(value = "Get all notifications", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = NotificationsResponse.class)})
	public NotificationsResponse getNotifications(@PathParam("userId") String userId);
}

