package com.java.excell.api.projektexcellapi.Repository;

import com.java.excell.api.projektexcellapi.Entity.DBModel;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MYRepo extends ExcelRepository{

    @Query("SELECT Name FROM DBModel")
    List<DBModel> findByName();
    @Query("SELECT Year_of_Release FROM DBModel")
    List<DBModel> findByYear_of_Release();
    //@Query("SELECT Year_of_Release,Na_Sales,JP_Sales,EU_Sales FROM DBModel")
    @Query("SELECT c.JP_Sales,c.EU_Sales,c.Na_Sales FROM DBModel c group by c.Year_of_Release,c.id")
    List<DBModel> findByYear_of_ReleaseAndNa_SalesAndJP_SalesAndEU_Sales();
}
