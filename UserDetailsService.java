package Security;

import Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class UserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetailsloadByUsername(String email)throws usernameNotFounExceptional{
        User user=userRepository.findByEmail(email)
        .orElseThrow()->new UsernameNotFoundException("user no encontrado: "+email);
        return new org.springframework.security.core.userdetails.User(
                user.getEmail(), user.getPassword(), Collections.singletonList(new SimpleGrantedAuthority(user.getRole().name());
        )
    }

}
