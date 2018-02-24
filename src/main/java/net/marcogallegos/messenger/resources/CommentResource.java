package net.marcogallegos.messenger.resources;

import net.marcogallegos.messenger.model.Comment;
import net.marcogallegos.messenger.service.CommentService;

import javax.ws.rs.*;
import java.util.List;

@Path("/")
public class CommentResource {

    private CommentService commentService = new CommentService();

    @GET
    public List<Comment> getAllComments(@PathParam("messageId") long messageId) {
        return commentService.getAllComments(messageId);
    }

    @GET
    @Path("/{commentId}")
    public Comment getComment(@PathParam("messageId") long messageId,
                              @PathParam("commentId") long commentId) {
        return commentService.getComment(messageId,commentId);
    }

    @POST
    public Comment addComment(@PathParam("messageId") long messageId, Comment comment) {
        return commentService.addComment(messageId, comment);
    }

    @PUT
    @Path("/{commentId}")
    public Comment updateComment(@PathParam("messageId") long messageId,
                                 @PathParam("commentId") long commentId, Comment comment) {
        comment.setId(messageId);
        return commentService.updateComment(messageId, comment);
    }

    @DELETE
    @Path("/{commentId}")
    public void removeComment(@PathParam("messageId") long messageId,
                                 @PathParam("commentId") long commentId) {
        commentService.removeComment(messageId, commentId);
    }
}
