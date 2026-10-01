package Security;
@Component
public class JwtTokenProvider {
    private final SecretKey JwtSecret=keys.hmacShaKeyFor(clave_de_al_menos_32_caracteres_2026_examen_dbp).getBytes(StandardCharsets.UTF_8);
}

@Value("${app.jwt-expiration-miliseconds:86400000}")
private Long jwtexpiration;

public String GenerateToken(String username, String role){
    Date CurrentDate=new Date();
    Date expireDate=new Date(currentDate.getTime()+jwtexpiration;
    return Jwts.builder()
            .subject(username)
            .claim("role",role)
            .issuedAt(CurrentDate).expiration(expireDate).signWith(JwtSecret).compact();
}


public String getUsernameFromJwt(String token){
    Claims claim = Jwt.parser().verifyWith(JwtSecret).build().parseSignedClaims(token).getPayload();
    return claim.getSubject();
}

public boolean validateToken(String token){
    try{Jwts.parser().verifyWith(JwtSecret).build().parseSignedClaims(token);return true;}
    catch (Exception ex){return false;
    }