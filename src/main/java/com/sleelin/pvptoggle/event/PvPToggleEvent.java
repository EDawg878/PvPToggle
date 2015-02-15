package com.sleelin.pvptoggle.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * @author EDawg878 <EDawg878@gmail.com>
 */
public class PvPToggleEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private String world;
    private boolean enabled;
    private boolean cancelled;

    public PvPToggleEvent(Player who, String world, boolean enabled) {
        super(who);
        this.world = world;
        this.enabled = enabled;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public String getWorld() {
        return world;
    }

    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }
}
