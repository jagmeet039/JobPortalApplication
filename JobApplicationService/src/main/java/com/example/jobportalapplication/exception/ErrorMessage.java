package com.example.jobportalapplication.exception;

import java.util.Date;

public record ErrorMessage(Integer errorCode, String errorMessage, Date date) {
}
