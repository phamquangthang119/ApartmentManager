package swp391.dsct_server.security.authModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginResponse implements Serializable {
    private String type;
    private String accessToken;
    private String refreshToken;
}
