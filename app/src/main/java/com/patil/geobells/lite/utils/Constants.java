package com.patil.geobells.lite.utils;


public class Constants {

    public static final String BASE64_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzSIFuh8cAYT0m8mtgGKsG/uUudQhaf5s3wqc3Ibs6JjpP+zfXj/B53AsQ1aEXrMoiXeCQK1drjGWO9ebnvQsswmGhU8OPyCJiUYidENDFwJ4tZi1vhyDJWiONnfFork1iLVhE8ptb1gPC+tjbwWKwXhdxYzHEX06mZgE2l8nOa4xffDC9s08lR6wEPtI34ujWFz78P4eUsyz/CDVGYqArhN7+8N8xIatHSFgZpOkYozKvvvwnKOyq0UlqnRnhjbJeXZewLXnN7FoNTV4fBVmBdFkB0C/aHmR9LfHBwTDkTu6CpYDd3C826bkGwa1helBnq/Ja3psuei8WIQk3IhS9QIDAQAB";
    public static final byte[] SALT = {18, 60, 12, 77, 15, 25, 98, 40, 95, 88, 77, 82, 58, 68, 39, 34, 40, 00, 76, 76};


    public static final int TRANSITION_ENTER = 0;
    public static final int TRANSITION_EXIT = 1;
    public static final int TRANSITION_ENTER_TO_EXIT = 2;
    public static final int[] PROXIMITY_DISTANCES = new int[] {15, 30, 90, 200, 400, 800, 1600, 3200, 8000, 16000};
    public static final int PROXIMITY_DISTANCES_DEFAULT_INDEX = 5;
    public static final String PREFERENCES_DATA = "data";
    public static final String PREFERENCES_DATA_KEY = "reminders";
    public static final long TIME_COMPLETED_DEFAULT = -1;
    public static final int TYPE_FIXED = 0;
    public static final int TYPE_DYNAMIC = 1;

    // primary colors: blue, deep orange, purple, amber, brown, green, red
    public static final String[] COLORS = new String[] {"#5677fc", "#ff5722", "#9c27b0", "#ffc107", "#795548", "#259b24", "#e51c23"};
    public static final String COLOR_ACTION_BAR = "#0a7e07";

    public static final String PLACES_API_BASE = "https://maps.googleapis.com/maps/api/place";
    public static final String PLACES_AUTOCOMPLETE_TYPE_ADDRESS = "geocode";
    public static final String PLACES_AUTOCOMPLETE_TYPE_BUSINESS = "establishment";
    public static final String PLACES_TYPE_AUTOCOMPLETE = "/autocomplete";
    public static final String PLACES_TYPE_NEARBYSEARCH = "/nearbysearch";
    public static final String PLACES_TYPE_TEXTSEARCH = "/textsearch";
    public static final String PLACES_OUT_JSON = "/json";
    public static final String PLACES_API_KEY_AUTOCOMPLEE_LITE = "AIzaSyCzEMbwj8vbLH8i1_QegjVd6B-3oFUFyp8";
    public static final String PLACES_API_KEY_AUTOCOMPLETE_PRO = "AIzaSyCTNKrFcWPsBGe-g-hIxhmPTH6i1H3FaAs";
    public static final String PLACES_API_KEY_SEARCH_PRO = "AIzaSyBvvP27YFCUWApMSQGLaaDMWwwTYLW81_U";
    public static final String PLACES_API_KEY_SEARCH_LITE = "AIzaSyBvX3peWY0KFaB0t67KFdeLK7KtprOgPwE";

    public static final String GEOCODE_API_BASE=  "http://maps.googleapis.com/maps/api/geocode";
    public static final String GEOCODE_OUT_JSON =  "/json";

    public static final String STATIC_MAP_API_BASE = "http://maps.googleapis.com/maps/api/staticmap";

    public static final String METHOD_PLACES_DIALOG_ADDRESS = "address";
    public static final String METHOD_PLACES_CREATE = "create";
    public static final String METHOD_PLACES_DIALOG_VIEW = "view";

    public static final String METHOD_GEOCODE_CREATE = "create";
    public static final String METHOD_GEOCODE_START_MAP = "startmap";
    public static final String METHOD_REVERSE_GEOCODE_VIEW_MAP = "startmap";
    public static final String GEOCODE_STATUS_OK = "OK";
    public static final String GEOCODE_STATUS_NORESULTS = "ZERO_RESULTS";
    public static final Double GEOCODE_RESPONSE_NORESULTS = -1.0;
    public static final Double GEOCODE_RESPONSE_ERROR = -2.0;
    public static final String FILE_NAME_TEMP = "temp";

    public static final String EXTRA_REMINDER_INDEX = "index";
    public static final String EXTRA_REMINDER_LATITUDE = "latitude";
    public static final String EXTRA_REMINDER_LONGITUDE = "longitude";
    public static final String EXTRA_REMINDER_ADDRESS = "address";


    public static final String MAPS_API_KEY_DEBUG = "AIzaSyAtycxCYF1MvdR2MgxTT3W3EQCiMj4DStQ";

    public static final String MAPS_API_KEY_RELEASE_LITE = "AIzaSyATyb204l0YsDRHqLiFsZavOlgvI0MlPwY";
    public static final String MAPS_API_KEY_RELEASE_PRO = "AIzaSyAiaxyfDtCYgexpmvj4J60cF1nU_Z2gelg";
    public static final double NO_REMINDER_LATITUDE = -1;
    public static final double INVALID_REMINDER_LATITUDE = -2;
    public static final double NO_REMINDER_LONGITUDE = -1;
    public static final double INVALID_REMINDER_LONGITUDE = -2;
    public static final String NO_REMINDER_ADDRESS = "";

    public static final String GEOCODE_REVERSE_RESPONSE_ERROR = "ERROR";
    public static final String GEOCODE_REVERSE_RESPONSE_NORESULTS = "ZERO_RESULTS";
    public static final String EXTRA_MARKER_ADDRESS = "markeraddress";
    public static final int ACTIVITY_REQUEST_CODE_PICK_MAP = 109;
    public static final int ACTIVITY_REQUEST_CODE_CREATE_REMINDER = 102;
    public static final int MAP_DEFAULT_ZOOM = 11;
    public static final int ACTIVITY_REQUEST_CODE_SETTINGS = 124;
    public static final String EXTRA_ACTIVITY = "activity";

    // Base polling interval of 12 seconds
    public static final int BASE_POLLING_INTERVAL = 8000;
    public static final int ACTIVITY_DRIVING = 0;
    public static final int ACTIVITY_BIKING = 1;
    public static final int ACTIVITY_WALKING = 2;
    public static final int ACTIVITY_STANDING = 3;
    public static final int ACTIVITY_UNKNOWN = 4;
    public static final int ACTIVITY_TILTING = 5;
    // In order of activity
    public static final int[] ACTIVITY_MULTIPLIERS = new int[] {1, 6, 18, -1, 18, 18};
    public static final int ACTIVITY_MULTIPLIER_DEFAULT = 6;
    public static final double MULTIPLIER_LOW_POWER = 1;


    public static final int POLLING_INTERVAL_STANDING = 240000; // Actually should be infinite
    public static final int POLLING_INTERVAL_WALKING = 90000;
    public static final int POLLING_INTERVAL_BIKING = 35000;
    public static final int POLLING_INTERVAL_DRIVING = 12000;
    public static final int POLLING_INTERVAL_UNKNOWN = 40000;
    public static final int POLLING_INTERVAL_TILTING = 60000; // Actually should be infinite
    public static final String EXTRA_SPEAKTEXT = "text";
    public static final long POLLING_INTERVAL_ACTIVITY_RECOGNITION = 90000;
    public static int  POLLING_INTERVAL_ACTIVITY_RECOGNITION_MINIMUM = 45000;

    public static final int NOTIFICATION_ID = 7;

    public static final int SIZE_IMAGE_PREVIEW_HORIZONTAL = 200;
    public static final int SIZE_IMAGE_PREVIEW_VERTICAL = 200;
    public static final int SIZE_IMAGE_LARGE_HORIZONTAL = 600;
    public static final int SIZE_IMAGE_LARGE_VERTICAL = 600;
    public static final String EXTRA_EDIT_REMINDER = "editreminder";
    public static final int ACTIVITY_REQUEST_CODE_EDIT_REMINDER = 1;
    public static final int ACTIVITY_REQUEST_CODE_VIEW_REMINDER = 9;
    public static final int REMINDER_LIMIT = 3;
}