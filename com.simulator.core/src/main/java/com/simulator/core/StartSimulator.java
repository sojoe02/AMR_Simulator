package com.simulator.core;

import com.simulator.service.Service;

public class StartSimulator {
    public static void main(String[] args) {

        System.out.println("Hello Simulator!");

        Service service = new Service();

        System.out.println(service.getSquared(39));


    }
}
