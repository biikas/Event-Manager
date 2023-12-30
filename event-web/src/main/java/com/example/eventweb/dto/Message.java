package com.example.eventweb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Bikash Shah
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private String role;
    private String content;//prompt
}
