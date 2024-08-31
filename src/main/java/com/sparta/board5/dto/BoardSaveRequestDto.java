package com.sparta.board5.dto;


import lombok.Getter;

@Getter
public class BoardSaveRequestDto {

    private String title;
    private String contents;
    private String username;
}