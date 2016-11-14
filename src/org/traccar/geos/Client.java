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

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;

import org.traccar.Config;

public class Client{
    private Invocation.Builder invoker;

    public Client(String target){
        this(new URL(target));
    }

    public Client(URL target){
        javax.ws.rs.client.Client client = ClientBuilder.newClient();
        WebTarget wt = client.target(target).path("Emergency");
        invoker = wt.request(MediaType.APPLICATION_JSON);
    }

    public EmergencyAck send(EmergencyData emergencyData){
        return invoker.post(
            Entity.entity(
                emergencyData,
                MediaType.APPLICATION_JSON
            ),
            EmergencyAck.class
        );
    }
}
