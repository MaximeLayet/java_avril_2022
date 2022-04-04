package org.humanbooster.monprojet.model;

import java.util.Objects;

public class Status {

    private boolean manager = false;
    private int year;

    public Status(int year) {
        this.year = year;
    }

    public Status(int year, boolean manager) {
        this(year);
        this.manager = manager;
    }

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return manager == status.manager && year == status.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manager, year);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Status{");
        sb.append("manager=").append(manager);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
}
