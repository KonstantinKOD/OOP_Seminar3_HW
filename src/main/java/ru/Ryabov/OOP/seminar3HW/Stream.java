package ru.Ryabov.OOP.seminar3HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> groups;

    public Stream(){
        groups = new ArrayList<>();

    }

    public void addGroup(StudentGroup group){
        groups.add(group);
    }

    @Override
    public Iterator<StudentGroup> iterator(){
        return groups.iterator();
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }
}
