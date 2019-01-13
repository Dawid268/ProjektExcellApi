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

import java.io.File;

import java.io.IOException;
import java.util.List;
import java.util.Set;

@Component
public class ExcellService {
    @Autowired
    private ExcelRepository excelRepository;
    @Autowired
    private MYRepo myRepo;

    //@EventListener(ApplicationReadyEvent.class)
    public void readFile()  {
        try {
            DBModel dbModel;
            File file;
            Workbook workbook;
            file = new File("/home/dawid/Dokumenty/Video Games/Dobry.xls");
            workbook = Workbook.getWorkbook(file);
            Sheet sheet = workbook.getSheet(0);
                for (int j=1;j<sheet.getRows(); j++) {
                    String name = sheet.getCell(0,j).getContents();
                    System.out.println(name);
                    String platform = sheet.getCell(1,j).getContents();
                    System.out.println(platform);
                    String year_of_release = sheet.getCell(2,j).getContents();
                    int year = Integer.parseInt(year_of_release);
                    System.out.println(year);
                    String genre = sheet.getCell(3,j).getContents();
                    System.out.println(genre);
                    String publisher = sheet.getCell(4,j).getContents();
                    System.out.println(publisher);
                    String na_sales = sheet.getCell(5,j).getContents();
                    System.out.println(na_sales);
                    double na_saless = Double.parseDouble(na_sales);
                    String eu_sales = sheet.getCell(6,j).getContents();
                    System.out.println(eu_sales);
                    double eu_saless = Double.parseDouble(eu_sales);

                    String jp_sales = sheet.getCell(7,j).getContents();
                    double jp_saless = Double.parseDouble(jp_sales);
                    System.out.println(jp_sales);

                    String other_sales = sheet.getCell(8,j).getContents();
                    double other_saless = Double.parseDouble(other_sales);
                    System.out.println(other_saless);

                    String global_sales = sheet.getCell(9,j).getContents();
                    double global_saless = Double.parseDouble(global_sales);
                    System.out.println(global_saless);

                    String critic_score = sheet.getCell(10,j).getContents();
                    double critic_scoree = Double.parseDouble(critic_score);
                    System.out.println(critic_scoree);

                    String critic_count =sheet.getCell(11,j).getContents();
                    double critic_countt = Double.parseDouble(critic_count);
                    System.out.println(critic_countt);

                    String user_score = sheet.getCell(12,j).getContents();
                    double user_scoree = Double.parseDouble(user_score);
                    System.out.println(user_scoree);

                    String user_count = sheet.getCell(13,j).getContents();
                    double user_countt = Double.parseDouble(user_count);
                    System.out.println(user_countt);

                    String developer = sheet.getCell(14,j).getContents();
                    System.out.println(developer);

                    String rating = sheet.getCell(15,j).getContents();
                    System.out.println(rating);

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
    public List<DBModel> getAllFromDB() {
     List<DBModel> allList;
     allList  = (List<DBModel>) myRepo.findAll();
     System.out.println("Pobrałem z bazy");
     return (List<DBModel>) allList.subList(1,500);
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
        return  test_array.subList(1,50);
    }

    public Integer GetByYear(int a, int b){
        Integer dbModels =  myRepo.countSales(a,b);
        return  dbModels;
    }

}
