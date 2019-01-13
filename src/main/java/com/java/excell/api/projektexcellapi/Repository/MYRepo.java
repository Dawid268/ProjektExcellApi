package com.java.excell.api.projektexcellapi.Repository;

import com.java.excell.api.projektexcellapi.Entity.DBModel;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MYRepo extends ExcelRepository{

    @Query("SELECT Name FROM DBModel")
    List<DBModel> findByName();
    @Query("SELECT Year_Of_Release FROM DBModel")
    List<DBModel> findByYear_of_Release();
    //@Query("SELECT Year_of_Release,Na_Sales,JP_Sales,EU_Sales FROM DBModel")
    @Query(
            value = "SELECT COUNT(*) FROM games u WHERE u.Year_of_Release between 2000 and 2016",
            nativeQuery = true)
    List<DBModel> findByYear_of_ReleaseAndNa_SalesAndJP_SalesAndEU_Sales();
    @Query(
            //value = "SELECT COUNT(u.Year_of_Release), SUM(u.na_Sales) FROM games u WHERE u.Year_of_Release between ?1 and ?2",
            value = "SELECT   SUM(u.NA_Sales) FROM games u WHERE u.Year_Of_Release between ?1 and ?2",
            nativeQuery = true)
    Integer countSales(Integer date1,Integer date2);
}
