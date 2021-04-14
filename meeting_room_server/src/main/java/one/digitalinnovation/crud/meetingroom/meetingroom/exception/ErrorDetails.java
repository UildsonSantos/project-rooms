package one.digitalinnovation.crud.meetingroom.meetingroom.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.Date;


@Getter
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;

    @Builder
    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}
