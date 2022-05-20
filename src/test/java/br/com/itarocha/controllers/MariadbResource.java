package br.com.itarocha.controllers;

import io.quarkus.test.common.QuarkusTestResourceConfigurableLifecycleManager;
import org.testcontainers.containers.BindMode;
import org.testcontainers.containers.MariaDBContainer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MariadbResource implements QuarkusTestResourceConfigurableLifecycleManager {

    //container.withInitScript("betesda-dml.sql");
    static MariaDBContainer<?> db = new MariaDBContainer<>("mariadb:10.3.6")
            .withDatabaseName("betesda")
            //.withUsername("root")
            //.withPassword("root")
            .withInitScript("betesda-dml.sql");
//            .withClasspathResourceMapping("init.sql",
//                    "/docker-entrypoint-initdb.d/init.sql",
//                    BindMode.READ_ONLY);

    @Override
    public Map<String, String> start() {
        db.start();
        var map = new HashMap<String, String>();
        map.put("quarkus.datasource.jdbc.url", db.getJdbcUrl());
        map.put("quarkus.datasource.username", db.getUsername() );
        map.put("quarkus.datasource.password", db.getPassword());

        System.out.println(db.getJdbcUrl());
        System.out.println(db.getUsername());
        System.out.println(db.getPassword());

        return map;
        //return Collections.singletonMap("quarkus.datasource.jdbc.url", db.getJdbcUrl());
    }

    @Override
    public void stop() {
        db.close();
    }
}
