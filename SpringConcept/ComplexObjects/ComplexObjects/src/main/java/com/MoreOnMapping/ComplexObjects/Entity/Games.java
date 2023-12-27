package com.MoreOnMapping.ComplexObjects.Entity;

public class Games {
    private int gameId;

    @Override
    public String toString() {
        return "Games{" +
                "gameId=" + gameId +
                ", gameName='" + gameName + '\'' +
                ", launchYear=" + launchYear +
                ", version='" + version + '\'' +
                '}';
    }

    private String gameName;
    private int launchYear;
    private String version;

    public Games() {
    }

    public Games(int gameId, String gameName, int launchYear, String version) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.launchYear = launchYear;
        this.version = version;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
