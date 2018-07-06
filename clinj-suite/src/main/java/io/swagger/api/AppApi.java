package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.EventsResponse;
import io.swagger.model.LinksResponse;
import io.swagger.model.PropertiesResponse;
import io.swagger.model.TacRequest;
import io.swagger.model.TacResponse;
import io.swagger.model.WelcomeRequest;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface AppApi {

	@PUT
	@Path("/app/tacs")
	@Produces( {"application/json"})
	@ApiOperation(value = "Accept/Revoke terms and conditions", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void acceptTac(TacRequest body);

	@PUT
	@Path("/app/properties/welcome")
	@Produces( {"application/json"})
	@ApiOperation(value = "Enable/Disable welcome screen", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void changeWelcomeScreen(WelcomeRequest body);

	@DELETE
	@Path("/app/events/{id}")
	@ApiOperation(value = "Delete a specific event", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void deleteEvent(@PathParam("id") Integer id);

	@GET
	@Path("/app/events")
	@ApiOperation(value = "List all active events for this account", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = EventsResponse.class)})
	public EventsResponse getEvents();

	@GET
	@Path("/translations/{language}")
	@Produces( {"application/json"})
	@ApiOperation(value = "List sipgate translations for a specific language", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void getLanguage(@PathParam("language") String language);

	@GET
	@Path("/app/links")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all external URLs of app.sipgate.com", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = LinksResponse.class)})
	public LinksResponse getLinks();

	@GET
	@Path("/app/properties")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all properties of app.sipgate.com", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = PropertiesResponse.class)})
	public PropertiesResponse getProperties();

	@GET
	@Path("/app/tacs")
	@Produces( {"application/json"})
	@ApiOperation(value = "Check if terms and conditions have been accepted", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = TacResponse.class)})
	public TacResponse getTac();
}

