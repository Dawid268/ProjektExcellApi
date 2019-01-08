package com.java.excell.api.projektexcellapi.Controller;

import com.java.excell.api.projektexcellapi.Entity.DBModel;
import com.java.excell.api.projektexcellapi.excellService.ExcellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin
public class ExcelController {
    @Autowired
    ExcellService excellService;

    @GetMapping("/all")
    public Set<DBModel> getAll() {
        return excellService.getAllFromDB();
    }

    @GetMapping("/name")
    public List<DBModel> getByName() {
        return excellService.getName();
    }

    @GetMapping("/hello")
    public String Hello() {
        return "Hello Dawid";
    }

    @GetMapping("/year")
    public List<DBModel> getByYear() {
        return excellService.getByYearOfRelease();
    }

    @GetMapping("/sales")
    @ResponseBody
    public List<DBModel> getByYear_NA_JP_EU() {
        return excellService.getYear_NaSales_JpSales_EuSales();
    }

}
