package org.example.entitys;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Request {
    private String name;
    private String roll_number;
    private String address;
}
