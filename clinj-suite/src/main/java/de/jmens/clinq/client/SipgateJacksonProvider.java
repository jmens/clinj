package de.jmens.clinq.client;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.jaxrs.base.ProviderBase;
import com.fasterxml.jackson.jaxrs.cfg.Annotations;
import com.fasterxml.jackson.jaxrs.json.JsonEndpointConfig;
import com.fasterxml.jackson.jaxrs.json.JsonMapperConfigurator;
import com.fasterxml.jackson.jaxrs.json.PackageVersion;
import java.lang.annotation.Annotation;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.Providers;

@Provider
@Consumes({"*/*"})
@Produces({"*/*"})
public class SipgateJacksonProvider extends
		ProviderBase<com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider, ObjectMapper, JsonEndpointConfig, JsonMapperConfigurator> {


	public static final String MIME_JAVASCRIPT = "application/javascript";
	public static final String MIME_JAVASCRIPT_MS = "application/x-javascript";
	public static final Annotations[] BASIC_ANNOTATIONS;
	protected String _jsonpFunctionName;

	@Context
	protected Providers _providers;

	public SipgateJacksonProvider() {
		this((ObjectMapper) null, BASIC_ANNOTATIONS);
	}

	public SipgateJacksonProvider(Annotations... annotationsToUse) {
		this((ObjectMapper) null, annotationsToUse);
	}

	public SipgateJacksonProvider(ObjectMapper mapper) {
		this(mapper, BASIC_ANNOTATIONS);
	}

	public SipgateJacksonProvider(ObjectMapper mapper, Annotations[] annotationsToUse) {
		super(new JsonMapperConfigurator(mapper, annotationsToUse));
	}

	public Version version() {
		return PackageVersion.VERSION;
	}

	public void setJSONPFunctionName(String fname) {
		this._jsonpFunctionName = fname;
	}

	protected boolean hasMatchingMediaType(MediaType mediaType) {
		if (mediaType == null) {
			return true;
		} else {
			String subtype = mediaType.getSubtype();
			return true;
		}
	}

	protected ObjectMapper _locateMapperViaProvider(Class<?> type, MediaType mediaType) {
		if (this._providers != null) {
			ContextResolver<ObjectMapper> resolver = this._providers.getContextResolver(ObjectMapper.class, mediaType);
			if (resolver == null) {
				resolver = this._providers.getContextResolver(ObjectMapper.class, (MediaType) null);
			}

			if (resolver != null) {
				return (ObjectMapper) resolver.getContext(type);
			}
		}

		return null;
	}

	protected JsonEndpointConfig _configForReading(ObjectReader reader, Annotation[] annotations) {
		return JsonEndpointConfig.forReading(reader, annotations);
	}

	protected JsonEndpointConfig _configForWriting(ObjectWriter writer, Annotation[] annotations) {
		return JsonEndpointConfig.forWriting(writer, annotations, this._jsonpFunctionName);
	}

	/**
	 * @deprecated
	 */
	@Deprecated
	protected boolean isJsonType(MediaType mediaType) {
		return this.hasMatchingMediaType(mediaType);
	}

	static {
		BASIC_ANNOTATIONS = new Annotations[]{Annotations.JACKSON};
	}
}

