package com.example.skeleton.service.impl;

import com.example.skeleton.model.dto.UserDto;
import com.example.skeleton.model.entity.UserEntity;
import com.example.skeleton.repository.UserRepository;
import com.example.skeleton.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    /**
     * Получение списка всех пользователей
     *
     * @return список пользователей
     */
    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userEntity -> UserDto.builder()
                        .id(userEntity.getId())
                        .login(userEntity.getLogin())
                        .build())
                .collect(Collectors.toList());
    }

    /**
     * Добавление нового пользователя
     *
     * @param userDto - данные пользователя
     * @return данные добавленного пользователя
     */
    @Override
    @Transactional
    public UserDto addUser(UserDto userDto) {
        UserEntity userEntity = new UserEntity(
                userDto.getId(),
                userDto.getLogin());

        userRepository.save(userEntity);
        return userDto;
    }

    /**
     * Обновление параметров пользователя
     *
     * @param userId  ИД пользователя
     * @param userDto данные пользователя
     * @return обновленные данные пользователя
     */
    @Override
    @Transactional
    public UserDto changeUser(Long userId, UserDto userDto) {
        UserEntity userEntity = userRepository.findById(userId)
                .orElseThrow(NoSuchElementException::new);

        userEntity.setLogin(userDto.getLogin());

        userRepository.save(userEntity);

        return UserDto.builder()
                .id(userEntity.getId())
                .login(userEntity.getLogin())
                .build();
    }
}
