package com.restdemo.rest.user.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Class to demo the validation of request using annotations
 * from javax.validation
 */
public class UserRequest {

    @NotNull(message = "First name cannot be null")
    private String firstName;
    @NotBlank(message = "Last name cannot be empty")
    private String lastName;
    @NotNull(message = "Email name cannot be null")
    @Email
    private String  email;
    @NotNull(message = "password name cannot be null")
    @Size(min=8,max=16, message = "password should be equal to or greater than 8 characters and less than 16 characters")
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
