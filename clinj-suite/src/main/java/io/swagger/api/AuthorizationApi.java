package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.ChangePasswordRequest;
import io.swagger.model.Client;
import io.swagger.model.Client1;
import io.swagger.model.CreateSessionRequest;
import io.swagger.model.OAuthClient;
import io.swagger.model.OAuthClients;
import io.swagger.model.RequestPasswordResetRequest;
import io.swagger.model.TokenCreateResponse;
import io.swagger.model.UserinfoResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface AuthorizationApi {

	@POST
	@Path("/passwordreset/{nonce}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Change the password", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void changePassword(@PathParam("nonce") String nonce, ChangePasswordRequest body);

	@POST
	@Path("/authorization/token")
	@ApiOperation(value = "Create a new session token", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = TokenCreateResponse.class),
			@ApiResponse(code = 401, message = "Invalid credentials supplied", response = Void.class)})
	public TokenCreateResponse create(CreateSessionRequest body);

	@POST
	@Path("/authorization/oauth2/clients")
	@ApiOperation(value = "Create a new OAuth 2.0 client", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success", response = OAuthClient.class)})
	public OAuthClient createClient(Client client);

	@DELETE
	@Path("/authorization/oauth2/clients/{clientId}")
	@ApiOperation(value = "Delete an existing OAuth 2.0 client", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success", response = Void.class)})
	public void deleteClient(@PathParam("clientId") String clientId);

	@DELETE
	@Path("/authorization/token")
	@ApiOperation(value = "Invalidate a session token", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 401, message = "Invalid token supplied", response = Void.class)})
	public void destroy(@HeaderParam("Authorization") String authorization);

	@GET
	@Path("/authorization/oauth2/clients/{clientId}")
	@ApiOperation(value = "Get a specific OAuth 2.0 client", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success", response = OAuthClient.class)})
	public OAuthClient getClient(@PathParam("clientId") String clientId);

	@GET
	@Path("/authorization/oauth2/clients")
	@ApiOperation(value = "List all OAuth 2.0 clients", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success", response = OAuthClients.class)})
	public OAuthClients getClients();

	@POST
	@Path("/passwordreset")
	@Produces( {"application/json"})
	@ApiOperation(value = "Request a password change", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void requestPasswordReset(RequestPasswordResetRequest body);

	@PUT
	@Path("/authorization/oauth2/clients/{clientId}")
	@ApiOperation(value = "Update an existing OAuth 2.0 client", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success", response = OAuthClient.class)})
	public OAuthClient updateClient(@PathParam("clientId") String clientId, Client1 client);

	@GET
	@Path("/authorization/userinfo")
	@ApiOperation(value = "Get information about the logged in user", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = UserinfoResponse.class),
			@ApiResponse(code = 401, message = "Invalid token supplied", response = Void.class)})
	@Produces("*/*")
	@Consumes("*/*")
	public UserinfoResponse userinfo(@HeaderParam("Authorization") String authorization);
}

