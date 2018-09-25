package com.oldboy.many2many;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private Integer id;
    private String tname;
    private List<Student>  list=new ArrayList<Student>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public void addStudent(Student...stu){
        for (Student student : stu) {
            this.addStudent(student);
            student.setTeacher(this);
        }
    }
}
