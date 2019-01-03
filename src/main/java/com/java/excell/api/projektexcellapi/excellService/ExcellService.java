package com.java.excell.api.projektexcellapi.excellService;

import com.java.excell.api.projektexcellapi.Entity.DBModel;
import com.java.excell.api.projektexcellapi.Repository.ExcelRepository;
import com.java.excell.api.projektexcellapi.Repository.MYRepo;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Component
public class ExcellService {

    @Autowired
    private ExcelRepository excelRepository;
    @Autowired
    private MYRepo myRepo;

    //@EventListener(ApplicationReadyEvent.class)
    public void readFile()  {
        try {
            File file;
            Workbook workbook;
            file = new File("/home/dawid/Pobrane/test.xls");
            workbook = Workbook.getWorkbook(file);
            Sheet sheet = workbook.getSheet(0);
                for (int j=0;j<sheet.getRows(); j++) {
                    String name = sheet.getCell(0,j).getContents();
                    String platform = sheet.getCell(1,j).getContents();
                    String year_of_release = sheet.getCell(2,j).getContents();
                    String genre = sheet.getCell(3,j).getContents();
                    String publisher = sheet.getCell(4,j).getContents();
                    String na_sales = sheet.getCell(5,j).getContents();
                    String eu_sales = sheet.getCell(6,j).getContents();
                    String jp_sales = sheet.getCell(7,j).getContents();
                    String other_sales = sheet.getCell(8,j).getContents();
                    String global_sales = sheet.getCell(9,j).getContents();
                    String critic_score = sheet.getCell(10,j).getContents();
                    String critic_count =sheet.getCell(11,j).getContents();
                    String user_score = sheet.getCell(12,j).getContents();
                    String user_count = sheet.getCell(13,j).getContents();
                    String developer = sheet.getCell(14,j).getContents();
                    String rating = sheet.getCell(15,j).getContents();
                    DBModel dbModel =  new DBModel(name,platform,year_of_release,genre,publisher,na_sales,eu_sales,jp_sales,other_sales,global_sales,
                            critic_score,critic_count,user_score,user_count,developer,rating);
                    excelRepository.save(dbModel);
                    System.out.println(dbModel.getId()+ " Object saved");
                }
            } catch (IOException e1) {
            e1.printStackTrace();
        } catch (BiffException e1) {
            e1.printStackTrace();
        }
            System.out.println("workbook close");
            System.out.println("file close");
    }
    public List<DBModel> getAllFromDB() {
      return (List<DBModel>) excelRepository.findAll();
    }

    public List<DBModel> getName(){
        return  myRepo.findByName();
    }
    public List<DBModel> getByYearOfRelease(){
        return  myRepo.findByYear_of_Release();
    }public List<DBModel> getYear_NaSales_JpSales_EuSales(){
        List<DBModel> test_array;
        test_array = myRepo.findByYear_of_ReleaseAndNa_SalesAndJP_SalesAndEU_Sales();
        return  test_array.subList(1,5);

    }
}
