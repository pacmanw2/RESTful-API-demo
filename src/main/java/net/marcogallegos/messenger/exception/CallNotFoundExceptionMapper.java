package net.marcogallegos.messenger.exception;

import net.marcogallegos.messenger.model.ErrorMessage;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider

public class CallNotFoundExceptionMapper implements ExceptionMapper<CallNotFoundException>{


    @Override
    public Response toResponse(CallNotFoundException e) {
        ErrorMessage errorMessage = new ErrorMessage(e.getMessage(),404, "call not valid");
        return Response.status(Status.NOT_FOUND)
                .entity(errorMessage)
                .build();
    }


}
