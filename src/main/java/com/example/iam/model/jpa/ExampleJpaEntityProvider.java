package com.example.iam.model.jpa;

import com.example.iam.model.Carrier;
import com.example.iam.model.SecurityPIN;
import org.keycloak.connections.jpa.entityprovider.JpaEntityProvider;

import java.util.ArrayList;
import java.util.List;


public class ExampleJpaEntityProvider implements JpaEntityProvider {

    @Override
    public List<Class<?>> getEntities() {

        List<Class<?>> entities = new ArrayList<>();
        entities.add(SecurityPIN.class);
        entities.add(Carrier.class);

        return entities;
    }

    @Override
    public String getChangelogLocation() {
        return "META-INF/example-changelog.xml";
    }

    @Override
    public void close() {
    }

    @Override
    public String getFactoryId() {
        return ExampleJpaEntityProviderFactory.ID;
    }
}