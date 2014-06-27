package com.github.stormcat24.circleci;

import lombok.NonNull;

/**
 * @author stormcat24
 */
public class CircleCiGradle {

    public String execute(@NonNull String value) {

        return String.format("execute(%s)", value);
    }

}
