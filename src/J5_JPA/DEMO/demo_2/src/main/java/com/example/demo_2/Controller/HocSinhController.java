package com.example.demo_2.Controller;

import com.example.demo_2.Model.HocSinh;
import com.example.demo_2.Model.LopHocSinh;
import com.example.demo_2.Services.HocSinhServices;
import com.example.demo_2.Services.LopServices;
import com.google.gson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "api/version1.0")
public class HocSinhController {
    @Autowired
    private HocSinhServices hocSinhServices;

    @Autowired
    private LopServices lopServices;

    @RequestMapping(value = "layTatCaDuLieuHocSinh", method = RequestMethod.GET)
    public List<HocSinh> getAllHocSinh() {
        return hocSinhServices.getAllHocSinh();
    }

    @RequestMapping(value = "layMotHocSinh", method = RequestMethod.GET)
    public HocSinh getMotHocSinh(@RequestParam int id) {
        return hocSinhServices.getHocSinhById(id);
    }

    @RequestMapping(value = "layHocSinhTheo2Id", method = RequestMethod.GET)
    public List<HocSinh> getHocSinhTheo2Id(@RequestParam int beginId, int endId) {
        return hocSinhServices.getByBetween(beginId, endId);
    }


    @RequestMapping(value = "layHocSinhTheoLop", method = RequestMethod.GET)
    public Set<HocSinh> getHocSinhByLopId(@RequestParam int idLop) {
        return lopServices.getHocSinhOfThisLop(idLop);
    }

    @RequestMapping(value = "themMotHocSinh", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public HocSinh addNewHocSinh(@RequestBody String hocSinh) {

        // Gson Date Formatter
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
            @Override
            public LocalDate deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws
                    JsonIOException {
                return LocalDate.parse(json.getAsJsonPrimitive().getAsString());
            }
        }).create();

        HocSinh hs = gson.fromJson(hocSinh, HocSinh.class);
        return hocSinhServices.addNewHocSinh(hs);
    }

    @RequestMapping(value = "xoaHocSinh", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public HocSinh deleteMotHocSinh(@RequestParam int id) {
        return hocSinhServices.deleteMotHocSinh(id);
    }

    @RequestMapping(value = "suaHocSinh", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public HocSinh remakeHocSinh(@RequestBody String hocSinhSua) {
        Gson gson = new Gson();
        HocSinh hs = gson.fromJson(hocSinhSua, HocSinh.class);
        return hocSinhServices.remakeHocSinh(hs);
    }

}
