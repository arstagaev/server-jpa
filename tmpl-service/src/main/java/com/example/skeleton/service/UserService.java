package com.example.skeleton.service;

import com.example.skeleton.model.dto.UserDto;

import java.util.List;

public interface UserService {

    /**
     * Получение списка всех пользователей
     *
     * @return список пользователей
     */
    List<UserDto> getAllUsers();

    /**
     * Добавление нового пользователя
     *
     * @param userDto данные пользователя
     * @return данные добавленного пользователя
     */
    UserDto addUser(UserDto userDto);

    /**
     * Обновление параметров пользователя
     *
     * @param userId  ИД пользователя
     * @param userDto данные пользователя
     * @return обновленные данные пользователя
     */
    UserDto changeUser(Long userId, UserDto userDto);
}
