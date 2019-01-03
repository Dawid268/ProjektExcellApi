package com.java.excell.api.projektexcellapi.Repository;

import com.java.excell.api.projektexcellapi.Entity.DBModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExcelRepository  extends CrudRepository<DBModel, Long>  {



}
