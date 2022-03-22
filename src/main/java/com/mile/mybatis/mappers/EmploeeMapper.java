package com.mile.mybatis.mappers;

import com.mile.mybatis.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmploeeMapper {

    Employee selectEmpById(Integer id);

    List<Employee> selectByTJ(@Param("employee") Employee employee);

    List<Employee> selectEmp(@Param("ids") String ids);
    List<Employee> selectEmpByEmail(Map email);

    int insertEmployee(@Param("emps") List<Employee> emps);

    int deleteEmployee(@Param("ids") Integer[] ids);

}
