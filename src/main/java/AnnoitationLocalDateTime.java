import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class AnnoitationLocalDateTime{
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd hh:mm:ss")
    public LocalDateTime localDateTime;

    public AnnoitationLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
