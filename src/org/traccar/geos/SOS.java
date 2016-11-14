package org.traccar.geos;
/*
 * Copyright 2016 Digicore Australia (support@digicore-australia.com.au)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.net.URL;
import java.net.MalformedURLException;

import org.traccar.Config;

public class SOS{
    private static final String SOS_URL = "sos.url";
    private static final String SOS_USER = "sos.user";
    private static final String SOS_PASSWORD = "sos.password";

    private URL url = null;
    private String user = null;
    private String pass = null;

    public SOS(Config config) throws MalformedURLException{
        if(config.hasKey(SOS_URL)){
            url = new URL(config.getString(SOS_URL));
        }

        if(config.hasKey(SOS_USER)){
            user = config.getString(SOS_USER);
        }

        if(config.hasKey(SOS_PASSWORD)){
            pass = config.getString(SOS_PASSWORD);
        }
    }
}
