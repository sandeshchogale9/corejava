package incubation.designpatternsproject.structural;

//We have different components (TV, Sound System, DVD Player) that need to be operated together.
class HomeTheaterFacade {
    private TV tv;
    private SoundSystem soundSystem;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.tv = new TV();
        this.soundSystem = new SoundSystem();
        this.dvdPlayer = new DVDPlayer();
    }

    public void watchMovie(String movie) {
        System.out.println("\nStarting Movie Night...");
        tv.turnOn();
        soundSystem.setVolume(10);
        dvdPlayer.playMovie(movie);
    }

    public void endMovie() {
        System.out.println("\nShutting Down Home Theater...");
        tv.turnOff();
    }
}

// Subsystem 1: TV
class TV {
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

// Subsystem 2: Sound System
class SoundSystem {
    public void setVolume(int level) {
        System.out.println("Setting volume to " + level);
    }
}

// Subsystem 3: DVD Player
class DVDPlayer {
    public void playMovie(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}

