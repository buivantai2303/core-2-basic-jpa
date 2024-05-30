package com.example.demo_2.Controller;

import com.example.demo_2.Model.HocSinh;
import com.example.demo_2.Model.Lop;
import com.example.demo_2.Services.HocSinhServices;
import com.example.demo_2.Services.LopServices;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "api/version/1.0")
public class HocSinhController {

    @Autowired
    private HocSinhServices hocSinhServices;

    @Autowired
    private LopServices lopServices;

    @RequestMapping(value = "studentList", method = RequestMethod.GET)
    public List<HocSinh> getAllStudents() {
        return hocSinhServices.getAllStudents();
    }

    @RequestMapping(value = "student", method = RequestMethod.GET)
    public HocSinh getStudent(@RequestParam int Id) {
        return hocSinhServices.getStudentByID(Id);
    }

    @RequestMapping(value = "newStudent", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public HocSinh addStudent(@RequestBody String hocSinh) {
        Gson gson = new Gson();
        HocSinh hs = gson.fromJson(hocSinh, HocSinh.class);
        return hocSinhServices.addNewStudent(hs);
    }

    @RequestMapping(value = "deletionStudent", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public HocSinh deleteStudent(@RequestParam int Id) {
        return hocSinhServices.deleteStudent(Id);
    }

    @RequestMapping(value = "updateStudent", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public HocSinh updateStudent(@RequestBody String hocSinh) {
        Gson gson = new Gson();
        HocSinh hs = gson.fromJson(hocSinh, HocSinh.class);

        return hocSinhServices.remakeStudent(hs);
    }

    @RequestMapping(value = "layHocSinhTheoLop", method = RequestMethod.GET)
    public Set<HocSinh> getHocSinhByLopId(@RequestParam int idLop) {
        return lopServices.getHocSinhOfThisLop(idLop);
    }

    @RequestMapping(value = "classesList", method = RequestMethod.GET)
    public List<Lop> getAllClasses() {
        return lopServices.getAllClasses();
    }
}
