package swp391.dsct_server.security.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import swp391.dsct_server.security.userDetails.UserDetailsImpl;

import java.util.Date;

@Component
public class JwtUtils {

    @Value("${dsct.jwtSecret}")
    private String jwtSecret;

    @Value("${dsct.jwtExpirationMs}")
    private int jwtExpirationMs;

    public String generateJwtToken(Authentication authentication){
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

        return Jwts.builder()
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime() + jwtExpirationMs))
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }

    public String getUsernameFromJwtToken(String jwt){
        Claims claims = Jwts.parser()
                .setSigningKey(jwtSecret)
                .parseClaimsJws(jwt).getBody();
        return claims.getSubject();
    }

    public boolean validateJwtToken(String jwt){
        try{
            Claims claims = Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(jwt).getBody();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
