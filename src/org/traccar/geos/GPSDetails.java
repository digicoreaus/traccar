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

public class GPSDetails{
    private String gpsDatetime;
    private String gpsFix;
    private String gpsStatus;
    private double lat;
    private double lon;
    private double heading;
    private double speed;
    private double altitude;

    public String getGpsDatetime(){
        return gpsDatetime;
    }

    public void setGpsDatetime(String gpsDatetime){
        this.gpsDatetime = gpsDatetime;
    }

    public String getGpsFix(){
        return gpsFix;
    }

    public void setGpsFix(String gpsFix){
        this.gpsFix = gpsFix;
    }

    public String getGpsStatus(){
        return gpsStatus;
    }

    public void setGpsStatus(String gpsStatus){
        this.gpsStatus = gpsStatus;
    }

    public double getLat(){
        return lat;
    }

    public void setLat(double lat){
        this.lat = lat;
    }

    public double getLon(){
        return lon;
    }

    public void setLon(double lon){
        this.lon = lon;
    }

    public double getHeading(){
        return heading;
    }

    public void setHeading(double heading){
        this.heading = heading;
    }

    public double getSpeed(){
        return speed;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public double getAltitude(){
        return altitude;
    }

    public void setAltitude(double altitude){
        this.altitude = altitude;
    }

    public static class Builder{
        GPSDetails gpsDetails = new GPSDetails();
        public GPSDetails build(){
            return gpsDetails;
        }

        public void setGpsDatetime(String gpsDatetime){
            gpsDetails.gpsDatetime = gpsDatetime;
            return this;
        }

        public void setGpsFix(String gpsFix){
            gpsDetails.gpsFix = gpsFix;
            return this;
        }

        public void setGpsStatus(String gpsStatus){
            gpsDetails.gpsStatus = gpsStatus;
            return this;
        }

        public void setLat(double lat){
            gpsDetails.lat = lat;
            return this;
        }

        public void setLon(double lon){
            gpsDetails.lon = lon;
            return this;
        }

        public void setHeading(double heading){
            gpsDetails.heading = heading;
            return this;
        }

        public void setSpeed(double speed){
            gpsDetails.speed = speed;
            return this;
        }

        public void setAltitude(double altitude){
            gpsDetails.altitude = altitude;
            return this;
        }
    }
}
