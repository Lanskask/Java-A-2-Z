package ru.smurtazin.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by a1 on 27.04.17.
 */
@NoArgsConstructor
@Setter @Getter
@ToString(of = "name")
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }
}
