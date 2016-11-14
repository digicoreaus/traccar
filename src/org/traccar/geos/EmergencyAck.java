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

import org.traccar.Config;

public class EmergencyAck{
    private String deviceID;
    private String type;
    private String ticketnumber;
    private String status;

    public String getDeviceID(){
        return deviceID;
    }

    public void setDeviceID(String deviceID){
        this.deviceID = deviceID;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getTicketnumber(){
        return ticketnumber;
    }

    public void setTicketnumber(String ticketnumber){
        this.ticketnumber = ticketnumber;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
