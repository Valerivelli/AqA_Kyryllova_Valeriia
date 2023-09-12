package com.hillel.rest;

import lombok.*;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponceData {
    private String id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;
}
