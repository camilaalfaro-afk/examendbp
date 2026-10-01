package dto;
import Entity.User;

public class RegisterRequest {
    @NotBlank(message = "username oblligatorio")
    private String username;
    @NotBlank(message = "password oblligatorio")
    private String password;
    @NotBlank(message = "role oblligatorio")
    private RoleName role;
    @Email(message = "formato de email invalido")
    private String email;
}
