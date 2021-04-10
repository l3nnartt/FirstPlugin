package com.github.l3nnartt.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandHeal implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender cs, @NotNull Command cmd, @NotNull String s, @NotNull String[] args) {
        Player p = (Player) cs;
        if (args.length == 0) {
            p.setHealth(p.getHealthScale());
            p.setFoodLevel(20);
        } else {
            String healthStr = args[0];
            Integer health = null;

            try {
                health = Integer.parseInt(healthStr);
            } catch (NumberFormatException ignored) {}

            if (health != null) {
                p.setHealth(p.getHealth() + health);
                p.setFoodLevel(20);
            }

        }

        return true;
    }
}