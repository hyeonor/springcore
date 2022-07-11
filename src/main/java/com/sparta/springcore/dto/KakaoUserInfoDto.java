package com.sparta.springcore.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class KakaoUserInfoDto {
    private Long id;
    private String nickname;
    private String email;

//   @AllArgsConstructor lombok이 이 기능을 대신함함
//   public KakaoUserInfoDto(Long id, String nickname, String email) {
//        this.id = id;
//        this.nickname = nickname;
//        this.email = email;
//    }
}
