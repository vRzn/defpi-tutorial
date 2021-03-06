package org.flexiblepower.defpi.lightsimulator.observation_publisher._1;

import java.io.IOException;

import javax.annotation.Generated;

import org.flexiblepower.defpi.lightsimulator.LightSimulator;
import org.flexiblepower.defpi.lightsimulator.observation_publisher.ObservationPublisher;
import org.flexiblepower.defpi.lightsimulator.observation_publisher._1.proto.ObservationPublisher_1Proto.Observation;
import org.flexiblepower.service.Connection;

/**
 * ObservationPublisher_1ConnectionHandlerImpl
 *
 * File generated by org.flexiblepower.create-service-maven-plugin.
 * NOTE: This file is generated as a stub, and has to be implemented by the user. Re-running the codegen plugin will
 * not change the contents of this file.
 * Template by TNO, 2017
 *
 * @author coenvl
 */
@Generated(value = "org.flexiblepower.plugin.servicegen", date = "Nov 8, 2017 4:10:46 PM")
public class ObservationPublisher_1ConnectionHandlerImpl
        implements ObservationPublisher_1ConnectionHandler, ObservationPublisher {

    private final Connection connection;

    private final LightSimulator service;

    /**
     * Auto-generated constructor for the ConnectionHandlers of the provided service
     *
     * @param service The service for which to handle the connections
     */
    public ObservationPublisher_1ConnectionHandlerImpl(final Connection connection, final LightSimulator service) {
        this.connection = connection;
        this.service = service;
        this.service.addObservationPublisher(this);
    }

    @Override
    public void observe(final Observation o) {
        if (this.connection.isConnected()) {
            try {
                this.connection.send(o);
            } catch (final IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onSuspend() {
        // TODO Auto-generated method stub

    }

    @Override
    public void resumeAfterSuspend() {
        // TODO Auto-generated method stub

    }

    @Override
    public void onInterrupt() {
        // TODO Auto-generated method stub

    }

    @Override
    public void resumeAfterInterrupt() {
        // TODO Auto-generated method stub

    }

    @Override
    public void terminated() {
        this.service.removeObservationPublisher(this);
    }

}