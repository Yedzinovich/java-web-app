package com.innayedzinovich.projects.model;

import com.github.slugify.Slugify;

import java.io.IOException;
import java.util.*;

public class CourseIdea {
    private String title;
    private String creator;
    private String slug;
    private Set<String> voters;

    public CourseIdea(String creator, String title) {
        voters = new HashSet<>();
        this.creator = creator;
        this.title = title;
        try {
            Slugify slugify = new Slugify();
            slug = slugify.slugify(title);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getSlug() {
        return slug;
    }

    public String getTitle() {
        return title;
    }

    public String getCreator() {
        return creator;
    }

    public List<String> getVoters(){
        return new ArrayList<>(voters);
    }

    public  boolean addVoter(String voterUserName){
        return voters.add(voterUserName);
    }

    public  int getVoteCount(){
        return voters.size();
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
