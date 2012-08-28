/*
 * Copyright 2011 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.shared;

public class ApplicationConstants {
    // This indicates the whole page is generated by us (not embedded)
    public static final String GENERATED_BODY_CLASSNAME = "v-generated-body";

    public static final String APP_REQUEST_PATH = "APP/";

    public static final String UIDL_REQUEST_PATH = "UIDL/";

    public static final String HEARTBEAT_REQUEST_PATH = "HEARTBEAT/";

    public static final String CONNECTOR_RESOURCE_PREFIX = APP_REQUEST_PATH
            + "CONNECTOR";

    public static final String APP_PROTOCOL_PREFIX = "app://";
    public static final String CONNECTOR_PROTOCOL_PREFIX = "connector://";
    public static final String UIDL_SECURITY_TOKEN_ID = "Vaadin-Security-Key";

    public static final String PARAM_UNLOADBURST = "onunloadburst";

    @Deprecated
    public static final String UPDATE_VARIABLE_INTERFACE = "v";
    @Deprecated
    public static final String UPDATE_VARIABLE_METHOD = "v";

    public static final String PORTLET_RESOUCE_URL_BASE = "portletAppURLBase";

    public static final String V_RESOURCE_PATH = "v-resourcePath";

    @Deprecated
    public static final String DRAG_AND_DROP_CONNECTOR_ID = "DD";
}
