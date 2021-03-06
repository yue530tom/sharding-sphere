/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
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
 * </p>
 */

package io.shardingsphere.core.rule;

import io.shardingsphere.core.constant.transaction.ProxyPoolType;
import lombok.Getter;
import lombok.Setter;

/**
 * Data source parameters.
 *
 * @author zhangyonglun
 */
@Getter
@Setter
public final class DataSourceParameter {
    
    public static final String DATA_SOURCE_POOL_CLASS_NAME = "com.zaxxer.hikari.HikariDataSource";
    
    private static final long DEFAULT_CONNECTION_TIMEOUT_MILLIS = 30 * 1000;
    
    private static final long DEFAULT_IDLE_TIMEOUT_MILLIS = 60 * 1000;
    
    private static final long DEFAULT_MAINTENANCE_INTERVAL = 30 * 1000;
    
    private static final long DEFAULT_MAX_LIFE_TIME_MILLIS = 0;
    
    private static final int DEFAULT_MAX_POOL_SIZE = 50;
    
    private static final int DEFAULT_MIN_POOL_SIZE = 1;
    
    private ProxyPoolType proxyDatasourceType = ProxyPoolType.VENDOR;
    
    private String url;
    
    private String username;
    
    private String password;
    
    private boolean autoCommit;
    
    private long connectionTimeout = DEFAULT_CONNECTION_TIMEOUT_MILLIS;
    
    private long idleTimeout = DEFAULT_IDLE_TIMEOUT_MILLIS;
    
    private long maxLifetime = DEFAULT_MAX_LIFE_TIME_MILLIS;
    
    private int maximumPoolSize = DEFAULT_MAX_POOL_SIZE;
    
    private int minimumPoolSize = DEFAULT_MIN_POOL_SIZE;
    
    private long maintenanceInterval = DEFAULT_MAINTENANCE_INTERVAL;
}
