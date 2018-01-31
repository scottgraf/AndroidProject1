/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author SGraf
 */
public class time {

    private String time;
    private String secondTime;

    private ArrayList parts = new ArrayList();
    private ArrayList parts1 = new ArrayList();

    public time(String time, String secondTime) {
        this.time = time;
        this.secondTime = secondTime;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSecondTime() {
        return secondTime;
    }

    public void setSecondTime(String secondTime) {
        this.secondTime = secondTime;
    }

    public int getHourOne() {
        String hours = getTime();
        String[] parts = hours.split(":");
        String hourOne = parts[0];

        int result = Integer.parseInt(hourOne);

        return result;
    }

    public int getMinuteOne() {
        String hours = getTime();
        String[] parts = hours.split(":");
        String minuteOne = parts[1];

        int result = Integer.parseInt(minuteOne);

        return result;
    }

    public int getHourTwo() {
        String hours1 = getSecondTime();
        String[] parts1 = hours1.split(":");
        String HourTwo = parts1[0];

        int result = Integer.parseInt(HourTwo);

        return result;
    }

    public int getMinuteTwo() {
        String hours1 = getSecondTime();
        String[] parts1 = hours1.split(":");
        String minuteTwo = parts1[1];

        int result = Integer.parseInt(minuteTwo);

        return result;
    }

    public int getHours() {
        return Math.abs(getHourTwo() - getHourOne());
    }

    public int getMinutes() {
        return Math.abs((getMinuteTwo() - getMinuteOne()));
    }

    public String minutes() {
        if (getMinutes() < 10) {
            return ("0" + getMinutes());
        } else {
            return ("" + getMinutes());
        }
    }

    @Override
    public String toString() {
        return "The difference: " + getHours() + ":" + minutes();
    }

}
