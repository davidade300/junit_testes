package com.david.service;

import java.util.List;

public interface CourseService {

    public List<String> retrieveCourses(String student);

//    public List<String> doSomething();
    void deleteCourses(String course);
}
