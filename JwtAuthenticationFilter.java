package Security;

import org.springframework.beans.factory.annotation.Autowired;

@Component
public class JwtAuthenticationFilter extends OnePerRequestFilter{
    @Autowired
    private JwtTokenProvider tokenProvider;
    @Autowired
    private UserDetailsService userDetailsService;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,FilterChain filterChain) throws ServltException,IOException{
         String token = getJwtFromRequest(request);
        if(StringUtils.hasText(token)&& tokenProvider.validateToken(token)){
            String username=tokenProvider.getUsernameFromJwt(token);
            UserDetails userDetails= userDetailsService.loadUserByUsername(username);
        }
    }

}