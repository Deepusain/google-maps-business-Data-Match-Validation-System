package GMB_Data_Match_AND_Validation_System.Repository;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class excelSheetUtility {

	static int rowcount = 1;
	static String sheetName = "Google Publisher";
	static HSSFWorkbook wb = new HSSFWorkbook();
	static HSSFSheet sheet = wb.createSheet(sheetName);
	static String writecode = ("/home/Deepu/eclipse-workspace/google maps business Data Match & Validation System/src/main/java/GMB_Data_Match_AND_Validation_System/Excel/Sample_Output_Test.xlsx");

	// code is to write url value in excel sheet..
	public static void failcode(String ClientStoreid, String ActualStoreid, String brandName, String Websiteurl,
			String Maplinks, String GMBwebsiteText, String GMBStatus, String coverphoto, String Category,
			String address, String phonenumber, String plusocode, String screenmode, String attributeyimestatus,
			String Business, String Service, String Accessibility, String Amenities, String Crowd, String Recycling,
			String Payments, String Ratings, String Reviews, String TwentyThree, String TwentyFour, String TwentyFive,
			String TwentySix) throws IOException {

		HSSFRow row = sheet.createRow(rowcount);

		int cellUrl = 0;
		HSSFCell cellurl = row.createCell(cellUrl);
		cellurl.setCellValue(ClientStoreid);

		int cellUrlone = 1;
		HSSFCell cellurlone = row.createCell(cellUrlone);
		cellurlone.setCellValue(ActualStoreid);

		int cellUrltwo = 2;
		HSSFCell cellurltwo = row.createCell(cellUrltwo);
		cellurltwo.setCellValue(brandName);

		int cellUrlthree = 3;
		HSSFCell cellurlthree = row.createCell(cellUrlthree);
		cellurlthree.setCellValue(Websiteurl);

		int cellUrlfour = 4;
		HSSFCell cellurlfour = row.createCell(cellUrlfour);
		cellurlfour.setCellValue(Maplinks);

		int cellUrlfive = 5;
		HSSFCell cellurlfive = row.createCell(cellUrlfive);
		cellurlfive.setCellValue(GMBwebsiteText);

		int cellUrlsix = 6;
		HSSFCell cellurlsix = row.createCell(cellUrlsix);
		cellurlsix.setCellValue(GMBStatus);

		int cellUrlseven = 7;
		HSSFCell cellurlseven = row.createCell(cellUrlseven);
		cellurlseven.setCellValue(coverphoto);

		int cellUrleight = 8;
		HSSFCell cellurleight = row.createCell(cellUrleight);
		cellurleight.setCellValue(Category);

		int cellUrlnine = 9;
		HSSFCell cellurlnine = row.createCell(cellUrlnine);
		cellurlnine.setCellValue(address);

		int cellUrlten = 10;
		HSSFCell cellurlten = row.createCell(cellUrlten);
		cellurlten.setCellValue(phonenumber);

		int cellUrleleven = 11;
		HSSFCell cellurleleven = row.createCell(cellUrleleven);
		cellurleleven.setCellValue(plusocode);

		int cellUrltwelve = 12;
		HSSFCell cellurltwelve = row.createCell(cellUrltwelve);
		cellurltwelve.setCellValue(screenmode);

		int cellUrlthirteen = 13;
		HSSFCell cellurlthirteen = row.createCell(cellUrlthirteen);
		cellurlthirteen.setCellValue(attributeyimestatus);

		int cellUrlfourteen = 14;
		HSSFCell cellurlfourteen = row.createCell(cellUrlfourteen);
		cellurlfourteen.setCellValue(Business);

		int cellUrlfifteen = 15;
		HSSFCell cellurlfifteen = row.createCell(cellUrlfifteen);
		cellurlfifteen.setCellValue(Service);

		int cellUrlsixteen = 16;
		HSSFCell cellurlsixteen = row.createCell(cellUrlsixteen);
		cellurlsixteen.setCellValue(Accessibility);

		int cellUrlseventeen = 17;
		HSSFCell cellurlseventeen = row.createCell(cellUrlseventeen);
		cellurlseventeen.setCellValue(Amenities);

		int cellUrleighteen = 18;
		HSSFCell cellurleighteen = row.createCell(cellUrleighteen);
		cellurleighteen.setCellValue(Crowd);

		int cellUrlnineteen = 19;
		HSSFCell cellurlnineteen = row.createCell(cellUrlnineteen);
		cellurlnineteen.setCellValue(Recycling);

		int cellUrltwenty = 20;
		HSSFCell cellurltwenty = row.createCell(cellUrltwenty);
		cellurltwenty.setCellValue(Payments);

		int cellUrltwentyone = 21;
		HSSFCell cellurltwentyone = row.createCell(cellUrltwentyone);
		cellurltwentyone.setCellValue(Ratings);

		int cellUrltwentytwo = 22;
		HSSFCell cellurltwentytwo = row.createCell(cellUrltwentytwo);
		cellurltwentytwo.setCellValue(Reviews);

		FileOutputStream fileOut1 = new FileOutputStream(writecode);
		wb.write(fileOut1);
		rowcount++;
	}

	public static void Passcode(String GMBStatus, String StoreCode, String ActualClientId, String Maplinks,
			String Business_Name, String SIaddress, String Locality, String City, String State, String Landmark,
			String Pincode, String SILat, String SILong, String SIBusinessHours, String Phonenumber, String Website,
			String Category, String Businessname, String Matched_Business, String GMB_Address, String Matched_Address,
			int similarityScore, String GMB_Locality, String Matched_Loclity, String GMB_City, String Matched_City,
			String GMB_State, String Matched_State, String GMB_Landmark, String Matched_Landmark, String pincodegmb,
			String Matched_Pincode, String map_lat, String map_long, String Matched_LatLong, double dist,
			String rearrangedPattern, String Matched_Hours, String GMB_Phone, String Matched_Phone, String GMBWebLink,
			String Matched_Website, String CategoryGMB, String Matched_Category, String biffurcateService,
			String biffurcateAccessibility, String biffurcatePayments, String biffurcateAmenities, String Google_Post,
			String Matched_Chat, String Matched_Products, String amphtmlText, String Ratings, String Reviews,
			String Responsebyowner, String fullsizeImagesAvailable) throws IOException {
		HSSFRow row = sheet.createRow(rowcount);
		int cellIndex = 0; // Initialize the cell index

		HSSFCell cell = row.createCell(cellIndex++);
		cell.setCellValue(GMBStatus);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(StoreCode);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(ActualClientId);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Maplinks);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Business_Name);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(SIaddress);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Locality);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(City);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(State);
		
		cell = row.createCell(cellIndex++);
		cell.setCellValue(Landmark);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Pincode);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(SILat);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(SILong);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(SIBusinessHours);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Phonenumber);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Website);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Category);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Businessname);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Matched_Business);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(GMB_Address);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Matched_Address);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(similarityScore);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(GMB_Locality);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Matched_Loclity);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(GMB_City);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Matched_City);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(GMB_State);
		
		cell = row.createCell(cellIndex++);
		cell.setCellValue(Matched_State);
		
		cell = row.createCell(cellIndex++);
		cell.setCellValue(GMB_Landmark);
		
		cell = row.createCell(cellIndex++);
		cell.setCellValue(Matched_Landmark);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(pincodegmb);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Matched_Pincode);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(map_lat);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(map_long);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Matched_LatLong);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(dist);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(rearrangedPattern);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Matched_Hours);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(GMB_Phone);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Matched_Phone);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(GMBWebLink);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Matched_Website);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(CategoryGMB);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Matched_Category);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(biffurcateService);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(biffurcateAccessibility);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(biffurcatePayments);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(biffurcateAmenities);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Google_Post);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Matched_Chat);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Matched_Products);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(amphtmlText);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Ratings);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Reviews);

		cell = row.createCell(cellIndex++);
		cell.setCellValue(Responsebyowner);

		cell = row.createCell(cellIndex);
		cell.setCellValue(fullsizeImagesAvailable);

		try (FileOutputStream fileOut1 = new FileOutputStream(writecode)) {
			wb.write(fileOut1);
		}
		rowcount++;
	}

	public static void headerValues() throws IOException {
		int newrow = 0;
		HSSFRow row1 = sheet.createRow(newrow);

		ArrayList<String> names = new ArrayList<>(Arrays.asList("GMBStatus", "StoreCode", "Actual Client id",
				"Maplinks", "Business Name", "Address", "Locality", "City", "State", "Landmark",
				"Pincode", "Latitude", "Longitude", "Hours", "Phone Number", "Website", "Category",
				"GMB-Business Name", "Matched", "GMB-Address", "Matched", "Percentage match", "GMB-Locality", "Matched",
				"GMB-City", "Matched", "GMB-State", "Matched", "GMB-Landmark", "Matched", "GMB-Pincode", "Matched",
				"GMB-Latitude", "GMB-Longitude", "Matched", "Distance(in m)", "GMB-Hours", "Matched",
				"GMB-Phone Number", "Matched", "GMB-Website", "Matched", "GMB-Category", "Matched", "GMB-Service",
				"GMB-Acccessbility", "GMB-Payments", "GMB-Amenities", "GMB-Google Post",
				"GMB-Google Business Messaging", "GMB-Google Products", "AMP Presence", "GMB-Rating", "GMB-Review",
				"GMB-Review reply happening", "GMB-Images Count"));


		// Create styles
		CellStyle matchedHeaderStyle = wb.createCellStyle();
		matchedHeaderStyle.setFillForegroundColor(IndexedColors.LIGHT_TURQUOISE.getIndex());
		matchedHeaderStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		HSSFFont font = wb.createFont();
		font.setItalic(false);
		matchedHeaderStyle.setFont(font);

		CellStyle headingStyle = wb.createCellStyle();
		headingStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
		headingStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		CellStyle duplicateHeaderStyle = wb.createCellStyle();
		duplicateHeaderStyle.setFillForegroundColor(IndexedColors.PALE_BLUE.getIndex());
		duplicateHeaderStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		// Track encountered header names
		Set<String> encounteredHeaderNames = new HashSet<>();

		int c = 0;
		for (String cellName : names) {
			HSSFCell cell = row1.createCell(c++);
			cell.setCellValue(cellName);

			if (cellName.contains("")) {
				cell.setCellStyle(matchedHeaderStyle);
			} else {
				if (encounteredHeaderNames.contains(cellName)) {
					cell.setCellStyle(duplicateHeaderStyle);
				} else {
					if (cellName.contains("GMB-") || cellName.contains("Distance") || cellName.contains("AMP Presence")
							|| cellName.contains("Percentage match")) {
						cell.setCellStyle(duplicateHeaderStyle);
					} else if (cellName.contains("Matched")) {
						cell.setCellStyle(headingStyle);

					} else {
						cell.setCellStyle(headingStyle);
						encounteredHeaderNames.add(cellName);
					}

				}
			}
		}

		// Write to the file
		try (FileOutputStream fileOut = new FileOutputStream(writecode)) {
			wb.write(fileOut);
		}
	}
}
