package com.innayedzinovich.projects.model;

import java.util.Objects;

public class CourseIdea {
    private String title;
    private String creator;

    public CourseIdea(String creator, String title) {
        this.creator = creator;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getCreator() {
        return creator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseIdea that = (CourseIdea) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(creator, that.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, creator);
    }


}
