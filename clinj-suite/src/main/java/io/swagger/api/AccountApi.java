package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.AccountResponse;
import io.swagger.model.AccountVerificationRequest;
import io.swagger.model.BalanceResponse;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface AccountApi {

	@GET
	@Path("/account")
	@Produces( {"application/json"})
	@ApiOperation(value = "Get account data", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = AccountResponse.class),
			@ApiResponse(code = 404, message = "Account not found", response = Void.class)})
	public AccountResponse getAccount();

	@GET
	@Path("/balance")
	@Produces( {"application/json"})
	@ApiOperation(value = "Get the account balance", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = BalanceResponse.class)})
	public BalanceResponse getBalance();

	@PUT
	@Path("/account/verified")
	@Produces( {"application/json"})
	@ApiOperation(value = "Verify your account", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 404, message = "Verification code not found", response = Void.class)})
	public void verify(AccountVerificationRequest body);
}

