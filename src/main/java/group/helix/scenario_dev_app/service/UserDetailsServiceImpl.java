package group.helix.scenario_dev_app.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import group.helix.scenario_dev_app.repository.UserRepository;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<group.helix.scenario_dev_app.entity.User> optionalUser = userRepository.findByUsername(username);
        if (optionalUser.isEmpty()) {
            throw new UsernameNotFoundException("Utilisateur non trouvé : " + username);
        }

        group.helix.scenario_dev_app.entity.User user = optionalUser.get();

        return User.withUsername(user.getUsername()) // Attention ! Ceci vient de Spring Security
                   .password(user.getPassword())
                   .roles(user.getRole()) // Les rôles doivent être en format ROLE_USER, ROLE_ADMIN...
                   .build();
    }
}
