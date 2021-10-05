package com.github.aruru_weed.battleofbuilders.api;

import java.util.HashMap;
import java.util.Map;

public interface GameClass extends BoBObject {
    Map<String,GameClass> resister = new HashMap<>();
}
