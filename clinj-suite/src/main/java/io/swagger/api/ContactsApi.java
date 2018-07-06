package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.ContactsResponse;
import io.swagger.model.ImportCSVRequest;
import io.swagger.model.ImportGoogleRequest;
import io.swagger.model.InternalContactsResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
@Api(value = "/", description = "")
public interface ContactsApi {

	@DELETE
	@Path("/contacts/{contactid}")
	@Consumes( {"application/json"})
	@Produces( {"application/json"})
	@ApiOperation(value = "Delete a single contact", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void deleteAllContacts(@PathParam("contactid") String contactid);

	@DELETE
	@Path("/contacts")
	@Produces( {"application/json"})
	@ApiOperation(value = "Delete all contacts", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void deleteContacts();

	@GET
	@Path("/contacts/internal")
	@Produces( {"application/json"})
	@ApiOperation(value = "List all account contacts", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = InternalContactsResponse.class)})
	public InternalContactsResponse getAllContacts();

	@GET
	@Path("/contacts")
	@Produces( {"application/json"})
	@ApiOperation(value = "Get all contacts", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "successful operation", response = ContactsResponse.class)})
	public ContactsResponse getContacts();

	@POST
	@Path("/contacts/import/csv")
	@Consumes( {"application/json"})
	@Produces( {"application/json"})
	@ApiOperation(value = "Import contacts from CSV file", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void importFromCSV(ImportCSVRequest body);

	@POST
	@Path("/contacts/import/google")
	@Consumes( {"application/json"})
	@Produces( {"application/json"})
	@ApiOperation(value = "Import contacts from Google", tags = {})
	@ApiResponses(value = {
			@ApiResponse(code = 0, message = "successful operation", response = Void.class)})
	public void importFromGoogle(ImportGoogleRequest body);
}

