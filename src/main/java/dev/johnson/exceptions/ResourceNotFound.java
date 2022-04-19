package dev.johnson.exceptions;

public class ResourceNotFound extends RuntimeException {

    public ResourceNotFound (int id){
        super("The resource with id "+id+" wan not found.");
    }
}