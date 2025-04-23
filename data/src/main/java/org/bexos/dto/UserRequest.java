package org.bexos.dto;

public record UserRequest(
        String username,
        String email,
        String password
) {
}
