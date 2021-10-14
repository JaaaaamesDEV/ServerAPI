package net.minecrime.serverapi.util;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class ThreadManager implements Runnable {

    private Thread thread;
    private boolean running;
    private Player player;
    private Location location;

    public ThreadManager(Player player, Location loc) {
        this.player = player;
        this.location = loc;
        this.thread = new Thread(this);
    }

    public void start() {
        this.running = true;
        if(running) {
            this.thread.start();
        }
    }

    @SuppressWarnings("deprecation")
    public void stop() {
        this.running = false;
        this.thread.stop();
    }

    @Override
    public void run() {
        while(running) {

        }
    }
}
