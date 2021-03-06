package net.marcogallegos.messenger.model;

import javax.xml.bind.annotation.XmlTransient;
import java.util.*;

//@XmlRootElement

public class Message {

    private long id;
    private String message;
    private Date created;
    private String author;
    private Map<Long, Comment> comments = new HashMap<>();
    private List<Link> links = new ArrayList<>();

    public Message() {}

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public Message(long id, String message, String author) {
        this.id = id;

        this.message = message;
        this.created = new Date();
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Map<Long, Comment> getComments() {
        return comments;
    }

    /*Don't want comment data to show up when the message instance is pulled up in api.
    * Don't want a list of comments when we access a message.
    * We want comment list to be ignored when message
    * instance is being converted to JSON or XML*/
    @XmlTransient //Ignore for XML conversion, JSON also honors this.
    public void setComments(Map<Long, Comment> comments) {
        this.comments = comments;
    }

    public void addLink(String url, String rel) {
        Link link = new Link();
        link.setLink(url);
        link.setRel(rel);
        links.add(link);
    }
}
