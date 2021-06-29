package com.example.roady;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ModelConfig {
    public static String MODEL_FILENAME = "model.lite";

    public static final int INPUT_IMG_SIZE_WIDTH = 224;
    public static final int INPUT_IMG_SIZE_HEIGHT = 224;
    public static final int FLOAT_TYPE_SIZE = 4;
    public static final int PIXEL_SIZE = 3;
    public static final int MODEL_INPUT_SIZE = FLOAT_TYPE_SIZE * INPUT_IMG_SIZE_WIDTH * INPUT_IMG_SIZE_HEIGHT * PIXEL_SIZE;
    public static final int IMAGE_MEAN = 0;
    public static final float IMAGE_STD = 255.0f;
    public static final List<String> OUTPUT_LABELS = Collections.unmodifiableList(
            Arrays.asList(
                    "speed_limit",
                    "speed_limit",
                    "speed_limit",
                    "speed_limit",
                    "speed_limit",
                    "speed_limit",
                    "end_of_speed_limit",
                    "speed_limit",
                    "speed_limit",
                    "no_overtaking_general",
                    "no_overtaking_trucks",
                    "right_of_way",
                    "priority_road",
                    "give_way",
                    "stop",
                    "no_way",
                    "no_way_trucks",
                    "entry_prohibited",
                    "danger",
                    "single_curve",
                    "single_curve",
                    "double_curve",
                    "attention_bumpers",
                    "attention_slippery",
                    "road_narrows",
                    "construction_site",
                    "traffic_light",
                    "attention_pedestrian",
                    "attention_children",
                    "attention_bikes",
                    "risk_of_ice",
                    "wild_animals",
                    "end_of_prohibitions",
                    "mandatory_direction_of_travel",
                    "mandatory_direction_of_travel",
                    "mandatory_direction_of_travel",
                    "mandatory_direction_of_travel",
                    "mandatory_direction_of_travel",
                    "mandatory_direction_of_travel",
                    "mandatory_direction_of_travel",
                    "roundabout",
                    "end_of_no_overtaking",
                    "end_of_no_overtaking_trucks"
            ));

    public static final int MAX_CLASSIFICATION_RESULTS = 3;
    public static final float CLASSIFICATION_THRESHOLD = 0.1f;
}

