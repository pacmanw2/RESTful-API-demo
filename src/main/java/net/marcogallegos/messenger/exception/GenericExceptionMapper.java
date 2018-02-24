package net.marcogallegos.messenger.exception;

import net.marcogallegos.messenger.model.ErrorMessage;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;



//@Provider
//catches everything, not good
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

    @Override
    public Response toResponse(Throwable e) {
        ErrorMessage errorMessage = new ErrorMessage(e.getMessage(),500, "newgrounds.com");
        return Response.status(Status.INTERNAL_SERVER_ERROR)
                .entity(errorMessage)
                .build();
    }

}
