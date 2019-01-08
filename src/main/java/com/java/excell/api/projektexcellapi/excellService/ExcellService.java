package com.java.excell.api.projektexcellapi.excellService;

import com.java.excell.api.projektexcellapi.Entity.DBModel;
import com.java.excell.api.projektexcellapi.Repository.ExcelRepository;
import com.java.excell.api.projektexcellapi.Repository.MYRepo;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.io.File;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class ExcellService {
    @Autowired
    private ExcelRepository excelRepository;
    @Autowired
    private MYRepo myRepo;

    @EventListener(ApplicationReadyEvent.class)
    public void readFile()  {
        try {
            DBModel dbModel;
            File file;
            Workbook workbook;
            file = new File("/home/dawid/Pobrane/Przetworzone.xls");
            workbook = Workbook.getWorkbook(file);
            Sheet sheet = workbook.getSheet(0);
                for (int j=1;j<sheet.getRows(); j++) {
                    String name = sheet.getCell(0,j).getContents();
                    String platform = sheet.getCell(1,j).getContents();
                    String year_of_release = sheet.getCell(2,j).getContents();
                    int year = Integer.parseInt(year_of_release);
                    String genre = sheet.getCell(3,j).getContents();
                    String publisher = sheet.getCell(4,j).getContents();
                    String na_sales = sheet.getCell(5,j).getContents();
                    double na_saless = Double.parseDouble(na_sales);
                    String eu_sales = sheet.getCell(6,j).getContents();
                    double eu_saless = Double.parseDouble(eu_sales);

                    String jp_sales = sheet.getCell(7,j).getContents();
                    double jp_saless = Double.parseDouble(jp_sales);

                    String other_sales = sheet.getCell(8,j).getContents();
                    double other_saless = Double.parseDouble(other_sales);

                    String global_sales = sheet.getCell(9,j).getContents();
                    double global_saless = Double.parseDouble(global_sales);

                    String critic_score = sheet.getCell(10,j).getContents();
                    double critic_scoree = Double.parseDouble(critic_score);

                    String critic_count =sheet.getCell(11,j).getContents();
                    double critic_countt = Double.parseDouble(critic_count);

                    String user_score = sheet.getCell(12,j).getContents();
                    double user_scoree = Double.parseDouble(user_score);

                    String user_count = sheet.getCell(13,j).getContents();
                    double user_countt = Double.parseDouble(user_count);

                    String developer = sheet.getCell(14,j).getContents();
                    String rating = sheet.getCell(15,j).getContents();
                    dbModel =  new DBModel(name,platform,year,genre,publisher,na_saless,eu_saless,jp_saless,other_saless,global_saless,
                            critic_scoree,critic_countt,user_scoree,user_countt,developer,rating);
                    //if (dbModel.getCritic_Count() != "" && dbModel.getNa_Sales()!= 0.00 && dbModel.getEU_Sales() != 0.00 && dbModel.getEU_Sales() != 0.00
                    //&& dbModel.getJP_Sales()!= 0.00){
                    excelRepository.save(dbModel);
                    System.out.println(dbModel.getId()+ " Object saved "+dbModel.getYear_of_Release());
                    //}

                }
            } catch (IOException e1) {
            e1.printStackTrace();
        } catch (BiffException e1) {
            e1.printStackTrace();
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }
            System.out.println("workbook close");
            System.out.println("file close");
    }
    public Set<DBModel> getAllFromDB() {
     List<DBModel> allList;
     List<DBModel> secondList;
     Set<DBModel> removedList;
     allList  = (List<DBModel>) myRepo.findAll();
     System.out.println("Pobrałem z bazy");
     secondList = allList.subList(0,100);
        removedList =  new HashSet<>(secondList);
     System.out.println("Zapisałem do HashSet:D ");
     return removedList;
    }

    public List<DBModel> getName(){
        return  myRepo.findByName();
    }
    public List<DBModel> getByYearOfRelease(){
        return  myRepo.findByYear_of_Release();
    }
    public List<DBModel> getYear_NaSales_JpSales_EuSales(){
        List<DBModel> test_array;
        test_array = myRepo.findByYear_of_ReleaseAndNa_SalesAndJP_SalesAndEU_Sales();
        return  test_array.subList(1,5);
    }

}
