package com.mogacko.admin.web.dto;

import lombok.*;

@Getter
@AllArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
