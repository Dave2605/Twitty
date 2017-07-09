package core.model;

import lombok.EqualsAndHashCode;
import java.util.Date;

@EqualsAndHashCode(exclude={"id", "time"})
public class Twitty {
    private final Long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longitude;

    public Twitty(String message, Date time) {
        this(message, time, null, null);
    }

    public Twitty(String message, Date time, Double latitude, Double longitude) {
        this.id = null;
        this.message = message;
        this.time = time;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }
}
