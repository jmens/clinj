package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.HistoryEntryResponse;
import io.swagger.model.HistoryResponse;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/")
@Api(value = "/", description = "")
public interface HistoryApi {

	@DELETE
	@Path("/history/{entryId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Delete a startSynchronous, fax, SMS or voicemail", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void deleteHistoryEntry(@PathParam("entryId") String entryId);

	@GET
	@Path("/history")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all calls, faxes, SMS and voicemails", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = HistoryResponse.class)})
	public HistoryResponse getHistory(@QueryParam("connectionIds") List<String> connectionIds,
			@QueryParam("types") List<String> types, @QueryParam("directions") List<String> directions,
			@QueryParam("offset") @DefaultValue("0") Integer offset,
			@QueryParam("limit") @DefaultValue("10") Integer limit);

	@GET
	@Path("/history/{entryId}")
	@Produces( {"application/json"})
	@ApiOperation(value = "Get a specific startSynchronous, fax, SMS or voicemail", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = HistoryEntryResponse.class)})
	public HistoryEntryResponse getHistoryById(@PathParam("entryId") String entryId);
}

