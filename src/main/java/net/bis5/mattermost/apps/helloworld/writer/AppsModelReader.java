package net.bis5.mattermost.apps.helloworld.writer;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.SerializationFeature;

import net.bis5.mattermost.apps.helloworld.model.MattermostAppsModel;

@Provider
public class AppsModelReader implements MessageBodyReader<MattermostAppsModel> {

    private final ObjectMapper mapper = createObjectMapper();

    private ObjectMapper createObjectMapper() {
        var objectMapper = new ObjectMapper();
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        return objectMapper;
    }

    @Override
    public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return MattermostAppsModel.class.isAssignableFrom(type);
    }

    @Override
    public MattermostAppsModel readFrom(Class<MattermostAppsModel> type, Type genericType, Annotation[] annotations,
            MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
            throws IOException, WebApplicationException {
        return mapper.readValue(entityStream, type);
    }
    
}