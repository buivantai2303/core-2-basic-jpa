package com.example.demo_2.Controller;

import com.example.demo_2.Model.HocSinh;
import com.example.demo_2.Model.Lop;
import com.example.demo_2.Model.LopHocSinh;
import com.example.demo_2.Services.LopServices;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "api/version/1.0")
public class LopController {

    @Autowired
    private LopServices lopServices;

    @RequestMapping(value = "classes", method = RequestMethod.GET)
    public List<Lop> getAllClasses() {
        return lopServices.getAllClasses();
    }

    @RequestMapping(value = "class", method = RequestMethod.GET)
    public Lop getClassList(@RequestParam int Id) {
        return lopServices.findClassById(Id);
    }

    @RequestMapping(value = "newClass", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Lop addClass(@RequestBody String lop) {
        Gson gson = new Gson();
        Lop lopNew = gson.fromJson(lop, Lop.class);
        return lopServices.addNewClass(lopNew);
    }

    @RequestMapping(value = "deletionClass", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Lop deleteClass(@RequestParam int Id) {
        return lopServices.deleteClass(Id);
    }

    @RequestMapping(value = "updateClass", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Lop updateClass(@RequestBody String lop) {
        Gson gson = new Gson();
        Lop lopNew = gson.fromJson(lop, Lop.class);
        return lopServices.remakeClass(lopNew);
    }

}
