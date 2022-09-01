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

public class Pdfmodule {
    

    public static void generate() {

		try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("C:/Users/Rokia/Desktop/Liste des modules.pdf"));
            document.open();
            Image img = Image.getInstance("C:/Users/Rokia/Desktop/INSA +/Png.png");
            img.scalePercent(20);
            document.add(img);
            PdfPTable table = new PdfPTable(1);
            PdfPCell cellule1 = new PdfPCell(new Phrase("Nom"));
            cellule1.setHorizontalAlignment(1);
            cellule1.setGrayFill(0.8f);
            table.addCell(cellule1);
            
            
            connection connection = new connection(); 
    		Connection conn = connection.getCconnection(); 

    		String sql = "SELECT * FROM module";
    	
    		PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
		
			while (rs.next())
			{
				table.addCell(rs.getString("modulecol"));
			
		}
			document.add(table);	           	
           	
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}