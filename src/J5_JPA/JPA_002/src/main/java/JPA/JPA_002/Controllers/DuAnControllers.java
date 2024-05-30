package J5_JPA.JPA_002.src.main.java.JPA.JPA_002.Controllers;

import JPA.JPA_002.Models.DuAn;
import JPA.JPA_002.Services.DuAnServices;
import com.google.gson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(value = "api/version/1.0")
public class DuAnControllers {

    private final DuAnServices duAnServices;

    @Autowired
    private DuAnControllers(DuAnServices duAnServices) {
        this.duAnServices = duAnServices;
    }


    @GetMapping(value = "getAllProject")
    public List<DuAn> getAllDuAn() {
        return duAnServices.getAllDuAn();
    }

    @GetMapping(value = "getProjectById")
    public DuAn getDuAnById(@RequestParam int Id) {
        return duAnServices.getDuAnById(Id);
    }

    @PostMapping(value = "newProject")
    public DuAn addNewDuAn(@RequestBody String duAn) {
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
            @Override
            public LocalDate deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws
                    JsonIOException {
                return LocalDate.parse(json.getAsJsonPrimitive().getAsString());
            }
        }).create();
        DuAn newDuAn = gson.fromJson(duAn, DuAn.class);

        duAnServices.addNewDuAn(newDuAn);
        return newDuAn;
    }

    @PutMapping(value = "modifyProject")
    public DuAn modifyDuAn(@RequestBody String duAn) {
        Gson gson = new Gson();
        DuAn newDuAn = gson.fromJson(duAn, DuAn.class);
        return duAnServices.addNewDuAn(newDuAn);
    }

    @DeleteMapping(value = "removeProject")
    public DuAn removeDuAn(@RequestParam int Id) {
        return duAnServices.removeDuAn(Id);
    }
}
