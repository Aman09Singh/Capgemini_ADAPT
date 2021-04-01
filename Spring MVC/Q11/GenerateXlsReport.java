
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

public class GenerateXlsReport extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		
		response.setHeader("Content-Disposition", "attachment;filename=\"employees.xlsx\"");
		

		 @SuppressWarnings("unchecked")
		List<Employee> empList = (List<Employee>) model.get("empList");
		 Sheet sheet = workbook.createSheet("Employee Data");
		 Row header = sheet.createRow(0);
		 header.createCell(0).setCellValue("ID");
		 header.createCell(1).setCellValue("Name");
		 header.createCell(2).setCellValue("Salary");
		  
		 int rowNum = 1;
		 for(Employee emp:empList){
		 Row row = sheet.createRow(rowNum++);
		 row.createCell(0).setCellValue(emp.getId());
		 row.createCell(1).setCellValue(emp.getName());
		 row.createCell(2).setCellValue(emp.getSalary());
		 }
		
	}

}
