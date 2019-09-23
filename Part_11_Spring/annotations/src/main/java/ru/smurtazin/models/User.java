package ru.smurtazin.models;

import lombok.*;

/**
 * Created by a1 on 27.04.17.
 */
@NoArgsConstructor
@Setter @Getter
@ToString(of = "name")
@AllArgsConstructor
public class User {
    private String name;
}
