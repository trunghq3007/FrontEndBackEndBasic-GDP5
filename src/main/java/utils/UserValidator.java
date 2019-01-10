package utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cmc.entity.User;

@Component
public class UserValidator implements Validator {
    @Autowired
    private com.cmc.service.UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return com.cmc.entity.User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
        if (user.getUsernName().length() < 2 || user.getUsernName().length() > 225) {
            errors.rejectValue("username", "Size.userForm.username");
        }
        if (com.cmc.service.UserService.findByUsername(user.getUsernName()) != null) {
            errors.rejectValue("username", "Duplicate.userForm.username");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (user.getPassword().length() < 8 || user.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }

        
    }
}
