package swp391.dsct_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import swp391.dsct_server.constant.URLConstant;
import swp391.dsct_server.security.authModel.LoginRequest;
import swp391.dsct_server.security.authModel.LoginResponse;
import swp391.dsct_server.security.jwt.JwtUtils;

@RestController
@CrossOrigin("*")
@RequestMapping(URLConstant.API_AUTH_PREFIX)
public class AuthController {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping(URLConstant.LOGIN)
    public ResponseEntity<LoginResponse> authenticate(@RequestBody LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken(authentication);
        return new ResponseEntity<>(new LoginResponse("Bearer", jwt, null), HttpStatus.OK);
    }
}
