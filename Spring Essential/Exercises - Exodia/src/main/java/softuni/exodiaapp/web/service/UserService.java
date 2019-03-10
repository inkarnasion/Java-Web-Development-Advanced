package softuni.exodiaapp.web.service;

import softuni.exodiaapp.web.domain.models.service.UserServiceModel;

public interface UserService {

    boolean registerUser(UserServiceModel userServiceModel);

    UserServiceModel loginUser(UserServiceModel userServiceModel);
}
