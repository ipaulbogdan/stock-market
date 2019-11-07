package model.converter;

import model.dto.UserDto;
import model.entity.User;

public class UserDtoConverter {

    public User convertToEntity(UserDto userDto) {
        return User.builder().username(userDto.getUsername()).build();
    }

    public UserDto convertFromEntity(User user) {
        return UserDto.builder().username(user.getUsername()).build();
    }
}
