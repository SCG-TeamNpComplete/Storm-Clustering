package com.milestone1.mesos;

import com.milestone1.aurora.AuroraClient;

import java.io.IOException;

public class MesosService implements Runnable {
    private Thread mesosServiceThread;

    public MesosService() {
        mesosServiceThread = new Thread(this);
    }

    public void execute() {
        mesosServiceThread.start();
    }

    @Override
    public void run() {
        try {
            AuroraClient auroraClient = new AuroraClient();
            auroraClient.createJob();
        } catch (IOException e) {
        } catch (Exception e) {
        } finally {
        }

    }

}
