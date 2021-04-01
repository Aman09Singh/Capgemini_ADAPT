
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDao {
	JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	    
	public List<Employee> getEmployeesByPage(int pageid,int total){    
	    String sql="select * from emp limit "+(pageid-1)+","+total;    
	    return template.query(sql,new RowMapper<Employee>(){    
	        public Employee mapRow(ResultSet rs, int row) throws SQLException {    
	            Employee e=new Employee();    
	            e.setId(rs.getInt(1));    
	            e.setName(rs.getString(2));    
	            e.setSalary(rs.getFloat(3));    
	            return e;    
	        }    
	    });    
	}

	public List<Employee> getAllEmployees(){
		String sql = "select * from emp";
		return template.query(sql,new RowMapper<Employee>(){ 
			public Employee mapRow(ResultSet rs, int row) throws SQLException{
				Employee e2=new Employee();
				e2.setId(rs.getInt(1));
				e2.setName(rs.getString(2));
				e2.setSalary(rs.getFloat(3));
				return e2;
			}
		});
	}
}
