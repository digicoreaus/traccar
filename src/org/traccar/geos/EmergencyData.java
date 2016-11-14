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

public class EmergencyData{
    private String deviceModel;
    private String deviceLocation;
    //private String deviceBattery;
    private String deviceNumber;
    private String gmtDateTime;
    private String alarmInfo;
    private String additionalInfo;
    /*
    private Customer customer;
    private Contact contact1;
    private Contact contact2;
    */
    private GPSDetails gpsDetails;

    public String getDeviceModel(){
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel){
        this.deviceModel = deviceModel;
    }

    public String getDeviceLocation(){
        return deviceLocation;
    }

    public void setDeviceLocation(String deviceLocation){
        this.deviceLocation = deviceLocation;
    }
/*
    public String getDeviceBattery(){
        return deviceBattery;
    }

    public void setDeviceBattery(String deviceBattery){
        this.deviceBattery = deviceBattery;
    }
*/
    public String getDeviceNumber(){
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber){
        this.deviceNumber = deviceNumber;
    }

    public String getGmtDateTime(){
        return gmtDateTime;
    }

    public void setGmtDateTime(String gmtDateTime){
        this.gmtDateTime = gmtDateTime;
    }

    public String getAlarmInfo(){
        return alarmInfo;
    }

    public void setAlarmInfo(String alarmInfo){
        this.alarmInfo = alarmInfo;
    }

    public String getAdditionalInfo(){
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo){
        this.additionalInfo = additionalInfo;
    }
/*
    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public Contact getContact1(){
        return contact1;
    }

    public void setContact1(Contact contact1){
        this.contact1 = contact1;
    }

    public Contact getContact2(){
        return contact2;
    }

    public void setContact2(Contact contact2){
        this.contact2 = contact2;
    }
*/
    public GPSDetails getGpsDetails(){
        return gpsDetails;
    }

    public void setGpsDetails(GPSDetails gpsDetails){
        this.gpsDetails = gpsDetails;
    }

    public static class Builder{
        EmergencyData emergencyData = new EmergencyData();
        public EmergencyData build(){
            return emergencyData;
        }

        public Builder setDeviceModel(String deviceModel){
            emergencyData.deviceModel = deviceModel;
            return this;
        }

        public Builder setDeviceLocation(String deviceLocation){
            emergencyData.deviceLocation = deviceLocation;
            return this;
        }
/*
        public Builder setDeviceBattery(String deviceBattery){
            emergencyData.deviceBattery = deviceBattery;
            return this;
        }
*/

        public Builder setDeviceNumber(String deviceNumber){
            emergencyData.deviceNumber = deviceNumber;
            return this;
        }

        public Builder setGmtDateTime(String gmtDateTime){
            emergencyData.gmtDateTime = gmtDateTime;
            return this;
        }

        public Builder setAlarmInfo(String alarmInfo){
            emergencyData.alarmInfo = alarmInfo;
            return this;
        }

        public Builder setAdditionalInfo(String additionalInfo){
            emergencyData.additionalInfo = additionalInfo;
            return this;
        }
/*
        public Builder setCustomer(Customer customer){
            emergencyData.customer = customer;
            return this;
        }

        public Builder setContact1(Contact contact1){
            emergencyData.contact1 = contact1;
            return this;
        }

        public Builder setContact2(Contact contact2){
            emergencyData.contact2 = contact2;
            return this;
        }
*/
        public Builder setGpsDetails(GPSDetails gpsDetails){
            emergencyData.gpsDetails = gpsDetails;
            return this;
        }
    }
}
