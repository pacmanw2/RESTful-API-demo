package net.marcogallegos.messenger.exception;

import net.marcogallegos.messenger.model.ErrorMessage;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

//registers this to Jax-RS
//kinda like declaring a class
@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {

    @Override
    public Response toResponse(DataNotFoundException e) {
        ErrorMessage errorMessage = new ErrorMessage(e.getMessage(),404, "newgrounds.com");
        return Response.status(Status.NOT_FOUND)
                .entity(errorMessage)
                .build();
    }
}
