package Creation_pdf;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import application.Etudiants;
import conn.connection;
import javafx.scene.control.Cell;

public class Pdfcoordinateur {
    

    public static void generate() {

		try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("C:/Users/Rokia/Desktop/Liste définitive.pdf"));
            document.open();
            Image img = Image.getInstance("C:/Users/Rokia/Desktop/INSA +/Png.png");
            img.scalePercent(20);
            document.add(img);
            PdfPTable table = new PdfPTable(3);
            PdfPCell cellule1 = new PdfPCell(new Phrase("Nom"));
            cellule1.setHorizontalAlignment(1);
            cellule1.setGrayFill(0.8f);
            PdfPCell cellule2 = new PdfPCell(new Phrase("Prénom"));
            cellule2.setHorizontalAlignment(1);
            cellule2.setGrayFill(0.8f);
            PdfPCell cellule3 = new PdfPCell(new Phrase("Décision"));
            cellule3.setHorizontalAlignment(1);
            cellule3.setGrayFill(0.8f);
            table.addCell(cellule1);
            table.addCell(cellule2);
            table.addCell(cellule3);
            
            
            connection connection = new connection(); 
    		Connection conn = connection.getCconnection(); 

    		String sql = "SELECT * FROM étudiants";
    	
    		PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
		
			while (rs.next())
			{
				table.addCell(rs.getString("nometudiant"));
				table.addCell(rs.getString("prenometudiant"));
				table.addCell(rs.getString("validation"));
			
		}
			document.add(table);	           	
           	
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}