package com.goit.hw11.testapp.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class Note {
    public long id;
    public String title;
    public String content;

}
