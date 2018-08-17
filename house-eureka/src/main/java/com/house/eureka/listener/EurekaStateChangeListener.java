package com.house.eureka.listener;

import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EurekaStateChangeListener {

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event){
        System.err.println(event.getServerId() + "\t" + event.getAppName() + " server down.");
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent event){
        System.err.println(event.getServerId() + "\t" + event.getAppName() + " renewed.");
    }

    @EventListener
    public void listen(EurekaServerStartedEvent event){
        System.err.println("Eureka Server Started. " + event.hashCode());
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event){
        System.err.println(event.getInstanceInfo().getAppName() + " is registered.");
    }

    @EventListener
    public void listen(EurekaRegistryAvailableEvent event){
        System.err.println("Register Center Started." + event.getTimestamp());
    }
}
