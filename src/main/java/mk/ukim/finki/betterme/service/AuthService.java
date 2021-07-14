package mk.ukim.finki.betterme.service;

import mk.ukim.finki.betterme.model.User;

public interface AuthService {
    User login(String username, String password);
}
