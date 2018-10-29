package com.noynaert.csc254;

import java.util.Objects;

public class Section implements Comparable<Section> {
    String courseId;
    String courseTitle;
    String crn;


    public Section(String courseId, String courseTitle, String crn) {
        setCourseId(courseId);
        setCourseTitle(courseTitle);
        setCrn(crn);
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    @Override
    public String toString() {
        return "Section{" +
                "courseId='" + courseId + '\'' +
                ", courseTitle='" + courseTitle + '\'' +
                ", crn='" + crn + '\'' +
                '}';
    }

    @Override
    public int compareTo(Section other) {
        int result = 0;
        result = this.courseId.compareTo(other.courseId);
        if(result == 0)
            result = this.crn.compareTo(other.crn);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Section section = (Section) o;
        return Objects.equals(courseId, section.courseId) &&
                Objects.equals(crn, section.crn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, crn);
    }
}
