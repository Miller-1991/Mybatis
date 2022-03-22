package com.mile;

import com.mile.mybatis.mappers.EmploeeMapper;
import com.mile.mybatis.mappers.EmptMapper;
import com.mile.mybatis.pojo.Employee;
import com.mile.mybatis.pojo.Empt;
import com.mile.mybatis.untils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTestForEmploee {

    @Test
    public void getEmployee(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmploeeMapper mapper = sqlSession.getMapper(EmploeeMapper.class);
        Employee employee = mapper.selectEmpById(1);
        System.out.println(employee.toString());
    }

    @Test
    public void getEmployee9(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmploeeMapper mapper = sqlSession.getMapper(EmploeeMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("email","张");
        List<Employee> list = mapper.selectEmpByEmail(map);
        list.forEach(employee -> System.out.println(employee.toString()) );
    }

    @Test
    public void getEmployee2(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmploeeMapper mapper = sqlSession.getMapper(EmploeeMapper.class);
        List<Employee> list = mapper.selectEmp("1,2");
        list.forEach(employee -> System.out.println(employee.toString()) );
    }

    @Test
    public void getEmployee3(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmptMapper mapper = sqlSession.getMapper(EmptMapper.class);
        List<Empt> list = mapper.selectEmptById(1);
        list.forEach(empt -> System.out.println(empt.toString()) );
    }

    @Test
    public void getEmployee4(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmptMapper mapper = sqlSession.getMapper(EmptMapper.class);
        List<Empt> list = mapper.selectEmptById2(1);
        list.forEach(empt -> System.out.println(empt.getName()) );

        System.out.println("----------------------------");
        list.forEach(empt -> System.out.println(empt.getList()) );
    }

    @Test
    public void getEmployee5(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmploeeMapper mapper = sqlSession.getMapper(EmploeeMapper.class);
        List<Employee> list = mapper.selectByTJ(new Employee(null,"0","张三",1));
        list.forEach(empt -> System.out.println(empt.toString()) );
    }

    @Test
    public void getEmployee6(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmploeeMapper mapper = sqlSession.getMapper(EmploeeMapper.class);
        Employee employee1 = new Employee(4,"1","aaa",1);
        Employee employee2 = new Employee(5,"1","bbb",1);
        Employee employee3 = new Employee(6,"1","ccc",1);
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);
        int cout  = mapper.insertEmployee(employees);
        System.out.println(cout);
    }

    @Test
    public void getEmployee7(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmploeeMapper mapper = sqlSession.getMapper(EmploeeMapper.class);
        int cout  = mapper.deleteEmployee(new Integer[]{4,5,6});
        System.out.println(cout);
    }
}
