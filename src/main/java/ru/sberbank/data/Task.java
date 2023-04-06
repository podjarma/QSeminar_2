package ru.sberbank.data;

public class Task {
    public int id;
    boolean isDeveloped;
    boolean isTested;

    public String summary;

    public Task() {

    }

    public Task(int id, String summary) {
        this.id = id;
        this.summary = summary;
        this.isDeveloped = false;
        this.isTested = false;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", summary='" + summary + '\'' +
                '}';
    }
}
