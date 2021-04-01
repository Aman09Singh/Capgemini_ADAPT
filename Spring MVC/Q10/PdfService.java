
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class PdfService extends AbstractITextPdfView{

	@Override
	protected voidbuildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
		HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		@SuppressWarnings("unchecked")
		List<Employee> empList = (List<Employee>) model.get("empList");
        
        document.add(new Paragraph("Employee List"));
         
        PdfPTable table = new PdfPTable(3);
        table.setWidthPercentage(100.0f);
        table.setWidths(new float[] {3.0f, 2.0f, 2.0f});
        table.setSpacingBefore(10);
         
        
        Font font = FontFactory.getFont(FontFactory.HELVETICA);       
  
        PdfPCell cell = new PdfPCell();
    
        cell.setPadding(5);
         
       
        cell.setPhrase(new Phrase("Id", font));
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("Name", font));
        table.addCell(cell);
 
        cell.setPhrase(new Phrase("Salary", font));
        table.addCell(cell);
         
       
        for (Employee emp : empList) {
            table.addCell(String.valueOf(emp.getId()));
            table.addCell(emp.getName());
            table.addCell(String.valueOf(emp.getSalary()));
           
        }
         
        document.add(table);
         
    }
		
}
