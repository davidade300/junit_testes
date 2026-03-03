package com.david.business;

import com.david.service.CourseService;
import com.david.service.stubs.CourseServiceStub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseBusinessStubTest {

    @Test
    void testGetCoursesRelatedToSpringWhenUsingAStub() {
        CourseService stubServbice = new CourseServiceStub();
        CourseBusiness business = new CourseBusiness(stubServbice);

        var filteredCourses = business.retriveCoursesRelatedToSpring("Leandro");


        assertEquals(4, filteredCourses.size());
    }

    @Test
    void testCoursesRelatedToSpringWhenUsingAFooBarStudent() {
        CourseService stubServbice = new CourseServiceStub();
        CourseBusiness business = new CourseBusiness(stubServbice);

        var filteredCourses = business.retriveCoursesRelatedToSpring("Foo Bar");


        assertEquals(0, filteredCourses.size());
    }
}