package me.whiteship.refactoring._15_speculative_generality._35_remove_dead_code;

import java.time.LocalDateTime;

public class Reservation {
    private LocalDateTime from;

    private LocalDateTime to;

    private LocalDateTime alarm;

    public Reservation(LocalDateTime from, LocalDateTime to) {
        this.from = from;
        this.to = to;
    }

    public void setAlarmBefore(int minutes) {
        this.alarm = this.from.minusMinutes(minutes);
    }

    public LocalDateTime getAlarm() {
        return alarm;
    }
}
