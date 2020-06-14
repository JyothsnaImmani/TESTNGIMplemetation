package main.UIProperties;

import java.io.IOException;

public class Elements {

        public static java.util.ResourceBundle bundle;
        static{

            try {
                bundle = java.util.ResourceBundle.getBundle("Resources/URL");
                if (bundle == null) {
                    throw new IOException("Resource bundle cannot be loaded");

                }
            }catch(Exception e)
            {
                e.printStackTrace();
            }

        }

        public static String APPLICATION_TEST_BROWSER = bundle.getString("app.test.browser");
        public static String URL = bundle.getString("url");
        public static String DRIVER_TYPE = bundle.getString("drivertype");
        public static String DRIVER_PATH = bundle.getString("driverpath");

    }

