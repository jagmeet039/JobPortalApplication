package com.example.jobportalapplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice //this will api will connect to other api's
@ResponseBody
public class ExceptionHandling extends ResponseEntityExceptionHandler {

    @ExceptionHandler(JobApplicationException.class)
    public ResponseEntity<ErrorMessage> jobApplicationNotCompleted(){

        var errorMessage = new ErrorMessage(400,
                "Please upload either Resume or CoverLetter to apply ",
                new Date());
        return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.BAD_REQUEST);

    }
}
