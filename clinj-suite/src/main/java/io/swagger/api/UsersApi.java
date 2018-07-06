package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.SetDefaultDeviceRequest;
import io.swagger.model.UserResponse;
import io.swagger.model.UsersResponse;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface UsersApi {

	@GET
	@Path("/users")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all users", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = UsersResponse.class)})
	public UsersResponse getAllUsers();

	@GET
	@Path("/users/{userId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Get a specific user", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = UserResponse.class),
			@ApiResponse(code = 404, message = "User not found", response = Void.class)})
	public UserResponse getUser(@PathParam("userId") String userId);

	@PUT
	@Path("/users/{userId}/defaultdevice")
	@Produces( {"application/json"})
	@ApiOperation(value = "Update default device for an existing user", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void setDefaultDevice(@PathParam("userId") String userId, SetDefaultDeviceRequest body);
}

