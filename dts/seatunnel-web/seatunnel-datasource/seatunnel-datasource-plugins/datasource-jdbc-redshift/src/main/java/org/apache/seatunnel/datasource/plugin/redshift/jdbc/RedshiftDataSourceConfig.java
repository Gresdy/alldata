/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.datasource.plugin.redshift.jdbc;

import org.apache.seatunnel.api.configuration.util.OptionRule;
import org.apache.seatunnel.datasource.plugin.api.DataSourcePluginInfo;
import org.apache.seatunnel.datasource.plugin.api.DatasourcePluginTypeEnum;

import com.google.common.collect.Sets;

import java.util.Set;

public class RedshiftDataSourceConfig {

    public static final String PLUGIN_NAME = "JDBC-Redshift";

    public static final DataSourcePluginInfo REDSHIFT_DATASOURCE_PLUGIN_INFO =
            DataSourcePluginInfo.builder()
                    .name(PLUGIN_NAME)
                    .icon("redshift")
                    .version("1.0.0")
                    .type(DatasourcePluginTypeEnum.DATABASE.getCode())
                    .build();

    public static final Set<String> REDSHIFT_SYSTEM_TABLES =
            Sets.newHashSet(
                    "information_schema",
                    "pg_catalog",
                    "root",
                    "pg_toast",
                    "pg_temp_1",
                    "pg_toast_temp_1",
                    "postgres",
                    "template0",
                    "template1");

    public static final OptionRule OPTION_RULE =
            OptionRule.builder()
                    .required(RedshiftOptionRule.URL, RedshiftOptionRule.DRIVER)
                    .optional(RedshiftOptionRule.USER, RedshiftOptionRule.PASSWORD)
                    .build();

    public static final OptionRule METADATA_RULE =
            OptionRule.builder()
                    .required(RedshiftOptionRule.DATABASE, RedshiftOptionRule.TABLE)
                    .build();
}
