package me.therbz.randomevents.events;

import me.therbz.randomevents.RandomEvents;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class ExampleRandomEvent extends RandomEvent {
    RandomEvents main;

    public ExampleRandomEvent(RandomEvents main, int length) {
        super(main, length);
    }


    @Override
    public @NotNull String getName() {
        return "Example Event";
    }

    @EventHandler
    private void onDoingSomething(PlayerEvent e) {
        Player player = e.getPlayer();
        UUID uuid = player.getUniqueId();
        this.updateScore(uuid, this.getScore(uuid) + 1);

        player.sendMessage("You did something! Your score is now: " + this.getScore(uuid));
    }
}
