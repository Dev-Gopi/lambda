package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.example.entitys.Request;
import org.example.entitys.Response;

/**
 * mvn clean package shade:shade
 */
public class LambdaWelcome implements RequestHandler<Request, Response> {

    public Response handleRequest(Request request, Context context) {
        System.out.println("Welcome to lambda function");
        Response response = new Response();
        response.setMessage(String.format("Student Name: - "+ request.getName()+", Roll Number: - "+request.getRoll_number()+", Address: - "+request.getAddress()));
        return response;
    }
}
