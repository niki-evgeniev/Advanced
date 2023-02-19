package guild;

import java.util.ArrayList;
import java.util.List;

public class Guild {
    private String name;
    private int capacity;
    private List<Player> roster;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        if (roster.size() < capacity) {
            roster.add(player);
        }
    }

    public boolean removePlayer(String name) {
        for (Player player : roster) {
            if (player.getName().equals(name)) {
                roster.remove(player);
                return true;
            }
        }
        return false;
    }

    public void promotePlayer(String name) {
        for (Player player : roster) {
            String id = player.getRank();
            if (player.getName().equals(name)) {
                if (id.equals("Trial")) {
                    player.setRank("Member");
                }
            }
        }
    }

    public void demotePlayer(String name) {
        for (Player player : roster) {
            String id = player.getRank();
            if (player.getName().equals(name)) {
                if (id.equals("Member")) {
                    player.setRank("Trial");
                }
            }
        }
    }

    public Player[] kickPlayersByClass(String clazz) {
        List<Player> playerToKick = new ArrayList<>();
        for (Player player : roster) {
            if (player.getClazz().contains(clazz)) {
                playerToKick.add(player);
            }
        }
        Player[] kickedPlayer = new Player[playerToKick.size()];
        for (int i = 0; i < playerToKick.size(); i++) {
            kickedPlayer[i] = playerToKick.get(i);
            roster.remove(playerToKick.get(i));
        }
        return kickedPlayer;
    }

    public int count() {
        return roster.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator());
        sb.append("Players in the guild: ").append(name).append(":");
        sb.append(System.lineSeparator());
        for (Player player : roster) {
            sb.append(player);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

}
