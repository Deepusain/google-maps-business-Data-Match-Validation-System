package GMB_Data_Match_AND_Validation_System.Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale.Category;

import org.apache.commons.text.similarity.LevenshteinDistance;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.aspectj.asm.IProgramElement.Accessibility;
import org.openqa.selenium.By;
import org.apache.commons.text.similarity.JaroWinklerDistance;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import GMB_Data_Match_AND_Validation_System.Driver.*;
import GMB_Data_Match_AND_Validation_System.Repository.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.Cookie;
import org.apache.poi.hssf.usermodel.HSSFCell;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;

public class GMB_Matched {

	static GMB_Data_Match_AND_Validation_System.Driver.SingletonClassChromeNew singleton = GMB_Data_Match_AND_Validation_System.Driver.SingletonClassChromeNew
			.getInstanceOfSingletonBrowserClass();
	static WebDriver driver = singleton.getDriver();
	static int rowcount = 0;
	static boolean error = false;
	static boolean chatlive = false;
	static int datacount = 0;
	static int passcount = 0;
	static int urlnumbercount = 0;
	static int failcount = 0;
	static WebElement element = null;
	static WebElement elementseo = null;
	static String biffurcateattribute = null;
	static String biffurcateabout = null;
	static String attributeyimestatus = null;
	static String ownernow = null;
	static String attributecover = null;
	static String coverphoto = null;
	static String GMBWebLink = null;
	static String tabname = null;
	static List<String> alladdress = new ArrayList();
	static String FromTheBusiness = null;
	static String Serviceoptions = null;
	static String Accessibilities = null;
	static String brandnames = null;
	static String amphtmlText = null;
	static String urlsText = null;
	static String ampHtmlUrlText = null;
	static List<String> allabout = new ArrayList();
	static List<String> Business = new ArrayList();
	static List<String> Service = new ArrayList();
	static List<String> Accessibility = new ArrayList();
	static List<String> Amenities = new ArrayList();
	static List<String> Crowd = new ArrayList();
	static List<String> Recycling = new ArrayList();
	static List<String> Payments = new ArrayList();
	static String biffurcateAccessibility = null;
	static String biffurcateBusiness = null;
	static String biffurcateService = null;
	static String biffurcateAmenities = null;
	static String biffurcateCrowd = null;
	static String biffurcateRecycling = null;
	static String biffurcatePayments = null;
	static String address = null;
	static String website = null;
	static String phonenumber = null;
	static String plusocode = null;
	static String screenmode = null;
	static String AmenitiesText = null;
	static String PaymentsText = null;
	static String CrowdText = null;
	static String RecyclingText = null;
	static String Ratings = null;
	static String Reviews = null;
	static String CategoryGMB = null;
	static boolean googlelinkmatched = false;
	static String Responsebyowner = null;
	static String GooglelinkText = null;
	static int size = 0;
	static String Businessname = null;
	static String rearrangedPattern = null;
	static String Matched_Business = null;
	static String Matched_Address = null;
	static String Matched_Loclity = null;
	static String Matched_City = null;
	static String Matched_Hours = null;
	static String Matched_State = null;
	static String Matched_Phone = null;
	static String GMB_Address = null;
	static String GMB_State = null;
	static String GMB_City = null;
	static String SIPattern = null;
	static String GMB_Locality = null;
	static String GMB_Phone = null;
	static String Matched_Website = null;
	static String Matched_Category = null;
	static String Matched_Service = null;
	static String Matched_Accessbility = null;
	static String Matched_Amenities = null;
	static String Matched_LatLong = null;
	static String Matched_Payments = null;
	static public int si_lat_length = 0;
	static public int si_long_length = 0;
	static public String map_lat = null;
	static public String map_long = null;
	static public int map_lat_length = 0;
	static public int map_long_length = 0;
	static public Double dist = 0.0d;
	static String SIaddress = null;
	static String SIBusinessHours = null;
	static String Google_Post = null;
	static int postsize = 0;
	static String Google_Products = null;
	static String SIService = null;
	static String SIAccessibility = null;
	static String SIPayments = null;
	static String SIAmenities = null;
	static String sortedaddress = null;
	static String sortedSICombineaddress = null;
	static String BusinessMon = null;
	static String BusinessTues = null;
	static String BusinessWed = null;
	static String BusinessThrus = null;
	static String BusinessFri = null;
	static String BusinessSat = null;
	static String BusinessSun = null;
	static String Matched_Chat = null;
	static String Matched_Products = null;
	static String Serachaddress = null;
	static WebDriverWait wait = new WebDriverWait(driver, 90);
	static JavascriptExecutor js = (JavascriptExecutor) driver;
	static String chattext = "";
	static int i = 0;
	static WebDriver driver1;
	static String Locatedin = null;
	static WebElement image = null;
	static List<WebElement> customerElement = null;
	static String cname = null;
	static List<WebElement> fullimage = null;
	static int counter = 0;
	static String CommonImageurl = null;
	static String googleWebLink = null;
	static String imageclientlink = null;
	static boolean nolist = false;
	static String singleimage = null;
	static int fullsize = 0;
	static boolean closedlocation = false;
	static int aboutpresent = 0;
	static int label = 0;
	static String pincodePattern = null;
	static String pincodegmb = null;
	static String SIBrandSheet=null;
	static String Matched_Pincode=null;
	static int distancepercentage=0;
	static int similarityPercentage=0;
	static String restGMBAddress=null;
	static String Matched_Landmark=null;
	static String GMB_Landmark=null;
	static String SILandmark=null;
	static String gmb_service = null;
	static String gmb_acccessbility = null;
	static String gmb_payments = null;
	static String gmb_amenities = null;


	public GMB_Matched() throws IOException {
		excelSheetUtility.headerValues();
	}

	@Test(dataProvider = "dataprov")
	public static void getdata(String GMBStatus, String StoreCode, String ActualClientId, String Business_Name, String Address1,
			String Address2, String Locality, String Landmark, String City, String State,String Pincode, String SILat, String SILong,
			String Maplinks, String Phonenumber, String Merge_Business_Hours, String Website, String Category)
			throws InterruptedException, IOException, ClassNotFoundException, URISyntaxException {

		Actions actions = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		JavascriptExecutor jschat = (JavascriptExecutor) driver1;

		try {
			System.out.println(StoreCode);
			address = "Not Found";
			rearrangedPattern = "-";
			GooglelinkText = "No";
			closedlocation = false;
			SIaddress = "No";
			googlelinkmatched = false;
			PaymentsText = "No";
			allabout.clear();
			Business.clear();
			Service.clear();
			Accessibility.clear();
			Google_Post = "No";
			Amenities.clear();
			Payments.clear();
			CategoryGMB = "-";
			address = "No";
			GMB_Address = "No";
			website = "No";
			coverphoto = "No";
			phonenumber = "No";
			plusocode = "No";
			screenmode = "No";
			biffurcateAccessibility = "-";
			biffurcateBusiness = "-";
			biffurcateService = "-";
			biffurcateAmenities = "-";
			biffurcateCrowd = "-";
			biffurcateRecycling = "-";
			attributeyimestatus = "-";
			biffurcatePayments = "-";
			GMB_Locality = "-";
			GMB_State = "-";
			GMB_City = "-";
			Reviews = "-";
			Ratings = "-";
			si_lat_length = 0;
			si_long_length = 0;
			map_lat = "No";
			map_long = "No";
			closedlocation = false;
			map_lat_length = 0;
			map_long_length = 0;
			Google_Products = "No";
			Matched_Phone = "No";
			Matched_Website = "No";
			Matched_Category = "No";
			Matched_Service = "No";
			Matched_Accessbility = "No";
			Matched_LatLong = "No";
			Matched_Payments = "No";
			Matched_Business = "No";
			Matched_Address = "No";
			Matched_Loclity = "No";
			Matched_City = "No";
			Matched_Hours = "No";
			Matched_State = "No";
			dist = 0.0d;
			postsize = 0;
			SIService = "No";
			SIAccessibility = "No";
			SIPayments = "No";
			SIAmenities = "No";
			sortedaddress = null;
			sortedSICombineaddress = "No";
			BusinessMon = null;
			BusinessTues = null;
			BusinessWed = null;
			BusinessThrus = null;
			BusinessFri = null;
			BusinessSat = null;
			BusinessSun = null;
			SIBusinessHours = null;
			Matched_Chat = "No";
			Matched_Products = "No";
			Serachaddress = null;
			chatlive = false;
			GMBWebLink = "-";
			Responsebyowner = "-";
			GMB_Phone = "No";
			fullsize = 0;
			aboutpresent = 0;
			label = 0;
			phonenumber = null;
			Businessname = null;
			SIBrandSheet = null;
			Matched_Pincode = "No";
			restGMBAddress = null;
			pincodegmb = "-";
			Matched_Landmark = "No";
			GMB_Landmark = "-";
			SILandmark = null;
			gmb_amenities = "-";
			gmb_service = "-";
			gmb_acccessbility = "-";
			gmb_payments = "-";
			
			if (Maplinks != null && !Maplinks.isEmpty()) {

				try {
					System.out.println(StoreCode);
					System.out.println(StoreCode);

					address = "No";
					rearrangedPattern = "-";
					GooglelinkText = "No";
					closedlocation = false;
					SIaddress = "No";
					googlelinkmatched = false;
					PaymentsText = "No";
					allabout.clear();
					Business.clear();
					Service.clear();
					Accessibility.clear();
					Google_Post = "No";
					Amenities.clear();
					Payments.clear();
					CategoryGMB = "-";
					address = "No";
					GMB_Address = "No";
					website = "No";
					coverphoto = "No";
					phonenumber = "No";
					plusocode = "No";
					screenmode = "No";
					biffurcateAccessibility = "-";
					biffurcateBusiness = "No";
					biffurcateService = "-";
					biffurcateAmenities = "-";
					biffurcateCrowd = "-";
					biffurcateRecycling = "-";
					attributeyimestatus = "-";
					biffurcatePayments = "-";
					GMB_Locality = "-";
					GMB_State = "-";
					GMB_City = "-";
					Reviews = "-";
					Ratings = "-";
					si_lat_length = 0;
					si_long_length = 0;
					map_lat = "No";
					map_long = "No";
					closedlocation = false;
					map_lat_length = 0;
					map_long_length = 0;
					Google_Products = "No";
					Matched_Phone = "No";
					Matched_Website = "No";
					Matched_Category = "No";
					Matched_Service = "No";
					Matched_Accessbility = "No";
					Matched_LatLong = "No";
					Matched_Payments = "No";
					Matched_Business = "No";
					Matched_Address = "No";
					Matched_Loclity = "No";
					Matched_City = "No";
					Matched_Hours = "No";
					Matched_State = "No";
					dist = 0.0d;
					postsize = 0;
					SIService = "No";
					SIAccessibility = "No";
					SIPayments = "No";
					SIAmenities = "No";
					sortedaddress = null;
					sortedSICombineaddress = "No";
					BusinessMon = null;
					BusinessTues = null;
					BusinessWed = null;
					BusinessThrus = null;
					BusinessFri = null;
					BusinessSat = null;
					BusinessSun = null;
					SIBusinessHours = null;
					Matched_Chat = "No";
					Matched_Products = "No";
					Serachaddress = null;
					chatlive = false;
					GMBWebLink = "-";
					Responsebyowner = "-";
					fullsize = 0;
					aboutpresent = 0;
					label = 0;
					GMB_Phone = "No";
					phonenumber = "-";
					Businessname = "-";
					SIBrandSheet = null;
					SILandmark = null;
					gmb_amenities = "-";
					gmb_service = "-";
					gmb_acccessbility = "-";
					gmb_payments = "-";

					JavascriptExecutor executor = (JavascriptExecutor) driver;
					driver.get(Maplinks); 
					Thread.sleep(2000);

					if (driver.findElements(By.cssSelector(".Dx2nRe")).size() > 0) {
						Thread.sleep(2000);
						System.out.println("aug2");
						WebElement str = driver.findElement(By.cssSelector(".YkuOqf"));
						actions.moveToElement(str).perform(); // Perform mouse hover
						Thread.sleep(2000);
						String value = str.getText();
						System.out.println("aug4");
						System.out.println(
								"The text value is******************************************************888888 "
										+ value);

						if (!value.isEmpty() && value.matches("\\d+")) {
							value = value.replaceAll(",", ""); // removes the comma from the string
							fullsize = Integer.parseInt(value.replaceAll("\\D+", "")); // extracts the integer value
							System.out.println("outer size issss------*******************************8" + fullsize); // prints
																														// 2897
						}

						else {

							System.out.println("Here 111111111111111111111");
							if (driver.findElements(By.cssSelector(".aoRNLd.kn2E5e.NMjTrf.lvtCsd>img")).size() > 0) {
								System.out.println("RB1");
								List<WebElement> cover = driver
										.findElements(By.cssSelector(".aoRNLd.kn2E5e.NMjTrf.lvtCsd>img"));
								for (WebElement attributecover : cover) {
									singleimage = attributecover.getAttribute("src");
									fullsize = 1;
								}
							}

						}
					}

					Thread.sleep(11000);
					System.out.println(Maplinks);
					if (SILat != null && !SILat.isEmpty() && SILong != null && !SILong.isEmpty()) {
						// Let's compare Lat Long
						String curr_map_url = driver.getCurrentUrl();
						Thread.sleep(5000); // Ideally, replace this with a proper wait method if possible

						try {
							String[] urlParts = curr_map_url.split("@")[1].split(",");
							map_lat = urlParts[0];
							map_long = urlParts[1].split(",")[0];

							Double newmap_lat = Double.valueOf(map_lat);
							Double newmap_long = Double.valueOf(map_long);
							Double newsi_lat = Double.valueOf(SILat);
							Double newsi_long = Double.valueOf(SILong);

							System.out.println("Latitude: " + newmap_lat + " SI Lat: " + newsi_lat);
							System.out.println("Longitude: " + newmap_long + " SI Long: " + newsi_long);

							// Calculate distance in meters
							dist = GMB_Functions.calculateDistance(newsi_lat, newmap_lat, newsi_long, newmap_long);

							System.out.println("Distance in meters: " + dist);

							// Set the threshold to 50 meters
							double thresholdist = 50;

							if (dist < thresholdist) {
								Matched_LatLong = "Yes";
							} else {
								Matched_LatLong = "No";
							}
						} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
							System.err.println("Invalid latitude or longitude values: " + e.getMessage());
							Matched_LatLong = "No";
						}
					} else {
						Matched_LatLong = "No";
					}

					Thread.sleep(2000);
					if (driver.findElements(By.cssSelector("button.DkEaL")).size() > 0) {
						CategoryGMB = driver.findElement(By.cssSelector("button.DkEaL")).getText();
						System.out.println(CategoryGMB);

						if (CategoryGMB.isEmpty() || Category.isEmpty()) {
							Matched_Category = "No";
						} else {
							Matched_Category = (CategoryGMB.toLowerCase().contains(Category.toLowerCase())) ? "Yes"
									: "No";
						}
					}
					Thread.sleep(2000);
					// Let's compare Business Name
					Businessname = driver.findElement(By.cssSelector("h1.DUwDvf.lfPIob")).getText();
					System.out.println(Businessname);
					if (Businessname.isEmpty() || Business_Name.isEmpty()) {
						Matched_Business = "No";

						if (Businessname.length() < 0) {
							closedlocation = true;
							System.out.println("Null attribues");
						}
					} else {
						Matched_Business = (Businessname.equalsIgnoreCase(Business_Name)) ? "Yes" : "No";
					}
					wait.until(ExpectedConditions
							.presenceOfAllElementsLocatedBy(By.cssSelector(".Io6YTe.fontBodyMedium.kR99db")));
					List<WebElement> attributesGMB = driver.findElements(By.cssSelector(".CsEnBe"));

					overloop: for (WebElement attribute : attributesGMB) {
						System.out.println("JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ");
						Thread.sleep(2000);
						System.out.println();
						js.executeScript("arguments[0].scrollIntoView()", attribute);
						System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
						String tooltipdata = attribute.getAttribute("data-tooltip");
						System.out.println("TolTipdata-" + tooltipdata);

						if (tooltipdata != null) {
							// Let's compare Address component
							if (tooltipdata.equals("Copy address")) {

								System.out.println("<1>");
								address = attribute.getAttribute("aria-label");

								pincodePattern = "\\b\\d{6}\\b";
								System.out.println(pincodePattern);

								// Use a regular expression to find and remove the PIN code

								address = address.replace("Address:", "");

								Serachaddress = address;

								try {

									pincodegmb = "No";
									String pincodePattern = "(\\b\\d{6}\\b)"; // Assuming the PIN code is a 6-digit
																				// number
									Pattern pattern1 = Pattern.compile(pincodePattern);
									Matcher matcher = pattern1.matcher(Serachaddress);
									if (matcher.find()) {
										pincodegmb = matcher.group(1); // Get the matched PIN code
									}

									Matched_Pincode = pincodegmb.equals(Pincode) ? "Yes" : "No";

									System.out.println(
											"Address without PIN code: " + address.replaceAll(pincodePattern, ""));
									System.out.println("Extracted PIN code: " + pincodegmb);
								} catch (Exception ep) {
									System.err.println("An error occurred: " + ep.getMessage());
									ep.printStackTrace();
								}

								address = address.replaceAll(pincodePattern, "");

								System.out.println("Final Address------" + address);
								// Now, the 'address' variable contains the address without the PIN code
								System.out.println("Address without PIN code: " + address);

								if (Address1 != null && !Address1.isEmpty() && !Address1.equals("0")) {
									SIaddress = Address1;

									if (Address2 != null && !Address2.isEmpty() && !Address2.equals("0")) {
										SIaddress += " " + Address2;
									}
									if (Locality != null && !Locality.isEmpty() && !Locality.equals("0")) {
										SIaddress += " " + Locality;
									}

									if (Landmark != null && !Landmark.isEmpty() && !Landmark.equals("0")) {
										SIaddress += " " + Landmark;
									}
									if (City != null && !City.isEmpty() && !City.equals("0")) {
										SIaddress += " " + City;
									}
									if (State != null && !State.isEmpty() && !State.equals("0")) {
										SIaddress += " " + State;
									}
								} else {
									// Handle the case where Address1 is null or empty
									SIaddress = "-";
								}

								SIBrandSheet = SIaddress;

								if (SIBrandSheet != null && !SIBrandSheet.isEmpty() && !SIBrandSheet.equals("0")) {
									SIBrandSheet += " " + Pincode;
								}

								System.out.println("Final Address Without zeroooooooooooooooooo------" + SIaddress);

								String attributeAddress = Serachaddress.toLowerCase();
								attributeAddress.replaceAll("[,\\s]", "").toLowerCase().replace("rd ", "road");
								String SIaddresscobine = SIBrandSheet.replaceAll("[,\\s]", "").toLowerCase()
										.replace("rd ", "road");

								System.out.println("Print SI Address " + attributeAddress);
								System.out.println("Print GMB Address " + SIaddresscobine);

								String[] attributeWordsaddress = attributeAddress.split("\\s*,\\s*");
								String[] SIaddressWords = SIaddresscobine.split("\\s*,\\s*");
								Arrays.sort(attributeWordsaddress);
								Arrays.sort(SIaddressWords);
								sortedaddress = String.join(", ", attributeWordsaddress);
								sortedSICombineaddress = String.join(", ", SIaddressWords);
								System.out.println("------------------" + sortedSICombineaddress);
								System.out.println("--" + sortedaddress);

								Matched_Address = sortedaddress.replaceAll("[,\\s]", "").toLowerCase().contains(
										sortedSICombineaddress.replaceAll("[,\\s]", "").toLowerCase()) ? "Yes" : "No";

								System.out.println("******- " + sortedaddress.replaceAll("[,\\s]", "").toLowerCase());
								System.out.println(
										"******-" + sortedSICombineaddress.replaceAll("[,\\s]", "").toLowerCase());

								if (Locality.isEmpty() || !address.toLowerCase()
										.contains(Locality.replaceAll("[,\\s]", "").toLowerCase())) {

									String cleanedlocality1 = cleanAndStandardizeAddress(Locality);
									String cleanedlocality2 = cleanAndStandardizeAddress(Serachaddress);
									System.out.println(cleanedlocality1 + "<>" + cleanedlocality2);

									if (cleanedlocality1.contains(cleanedlocality2)
											|| cleanedlocality2.contains(cleanedlocality1)) {
										Matched_Loclity = "Yes";

									} else {
										LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
										int distance = levenshteinDistance.apply(cleanedlocality1, cleanedlocality2);

										double similarityThreshold = 0.8; // Adjust as needed
										int percentageThreshold = (int) (similarityThreshold * 100);

										double similarityScore = calculateJaroWinklerSimilarity(cleanedlocality1,
												cleanedlocality2);
										similarityPercentage = (int) (similarityScore * 100);

										if (similarityScore >= similarityThreshold) {
											Matched_Loclity = "Yes";
											GMB_Locality = Locality;
										} else {
											Matched_Loclity = "No";

										}

									}

									similarityPercentage = 0;

								} else {
									Matched_Loclity = "Yes";
								}

								if (City.isEmpty() || !address.toLowerCase().contains(City.toLowerCase())) {
									Matched_City = "No";
								} else {
									Matched_City = "Yes";
								}

								// Handle Matched_State
								if (State.isEmpty()) {
									System.out.println("################################################3333");
									Matched_State = "No";
								} else {

									if (!address.toLowerCase().contains(State.toLowerCase())) {
										Matched_State = "No";
									} else {
										System.out.println("****************************************************");
										Matched_State = "Yes";
									}
								}

								if (Matched_Loclity.equals("Yes")) {
									GMB_Locality = Locality;
									address = address.replaceAll(Pattern.quote(Locality + ", "), "").trim();

									System.out.println("Address without Locality-" + address);
								}

								if (Matched_City.equals("Yes")) {
									GMB_City = City;
									address = address.replaceAll(Pattern.quote(City + ", "), "").trim();
									System.out.println("Address without City-" + address);
								}
								if (Matched_State.equals("Yes")) {

									System.out.println("Checcccccccccccccccccck Hereee");
									GMB_State = State;
									System.out.println("State iss---" + State);

									// Remove the State and any trailing commas and spaces using a regular
									// expression
									String statePattern = "\\b" + Pattern.quote(State) + "\\b";
									address = address.replaceAll(statePattern + ",*", "").trim();

									System.out.println("Address without State****-" + address);
								}

								if (Landmark.isEmpty()) {
									System.out.println("Landmark blank!!!!!!!!!");
									Matched_Landmark = "No";
									SILandmark = null;
								} else {

									System.out.println("Landmark else start");
									if (Landmark != null && !Landmark.isEmpty() && !Landmark.equals("0")) {
										System.out.println("Landmark else start - if 1");

										if (!address.toLowerCase().contains(Landmark.toLowerCase())) {
											similarityPercentage = 0;
											System.out.println("Landmark else start - if 2");
											String cleanedlandmark1 = cleanAndStandardizeAddress(Landmark);
											String cleanedlandmar2 = cleanAndStandardizeAddress(Serachaddress);
											System.out.println(cleanedlandmark1 + "<>" + cleanedlandmar2);

											if (cleanedlandmark1.contains(cleanedlandmar2)
													|| cleanedlandmar2.contains(cleanedlandmark1)) {
												Matched_Landmark = "Yes";
												SILandmark = Landmark;
												System.out.println("Landmark else start - if 3");
											} else {
												System.out.println("Landmark else start -else 1");
												LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
												int distance = levenshteinDistance.apply(cleanedlandmark1,
														cleanedlandmar2);

												double similarityThreshold1 = 0.8; // Adjust as needed
												int percentageThreshold = (int) (similarityThreshold1 * 100);

												double similarityScore1 = calculateJaroWinklerSimilarity(
														cleanedlandmark1, cleanedlandmar2);
												similarityPercentage = (int) (similarityScore1 * 100);

												if (similarityScore1 >= similarityThreshold1) {
													Matched_Landmark = "Yes";
													GMB_Landmark = Landmark;
													SILandmark = Landmark;
													System.out.println("Landmark else start -if 4");
												} else {
													Matched_Landmark = "No";
													SILandmark = Landmark;
													System.out.println("Landmark else start else 2");

												}
												System.out.println("dump!!!!!!!!!!!!!!!!");
											}

											similarityPercentage = 0;
										} else {
											SILandmark = Landmark;
											GMB_Landmark = Landmark;
											Matched_Landmark = "Yes";
											System.out.println("second last else1");
										}
									} else {
										Landmark = null;
										SILandmark = "-";
										System.out.println("second last else2");
									}
								}

								if (Matched_Landmark.equals("Yes")) {
									GMB_Landmark = Landmark;
									address = address.replaceAll(Pattern.quote(Landmark + ", "), "").trim();

									System.out.println("Address without Locality-" + address);

									System.out.println("second final matcghed");
								}

								// Rest of the address
								restGMBAddress = Serachaddress;

								if (Matched_Address.equals("Yes")) {
									GMB_Address = Serachaddress;
									Address1 = cleanAndStandardizeAddress(Address1);
									Address2 = cleanAndStandardizeAddress(Address2);
									distancepercentage = 100;
									similarityPercentage = 100;
								} else {

									String cleanedAddress1 = cleanAndStandardizeAddress(Serachaddress);
									String cleanedAddress2 = cleanAndStandardizeAddress(SIBrandSheet);
									System.out.println(cleanedAddress1 + "<>" + cleanedAddress2);

									if (cleanedAddress1.contains(cleanedAddress2)
											|| cleanedAddress2.contains(cleanedAddress1)) {
										Matched_Address = "Yes";
										distancepercentage = 100;
										similarityPercentage = 100;
										GMB_Address = restGMBAddress;
									} else {
										LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
										int distance = levenshteinDistance.apply(cleanedAddress1, cleanedAddress2);

										double similarityThreshold = 0.8; // Adjust as needed
										int percentageThreshold = (int) (similarityThreshold * 100);

										double similarityScore = calculateJaroWinklerSimilarity(cleanedAddress1,
												cleanedAddress2);
										similarityPercentage = (int) (similarityScore * 100);

										if (similarityScore >= similarityThreshold) {
											Matched_Address = "Yes";
											distancepercentage = 100;
											GMB_Address = restGMBAddress;
										} else {
											Matched_Address = "No";
											SIaddress = SIBrandSheet;
											GMB_Address = restGMBAddress;
										}

										int threshold = 20;
										System.out.println(
												"distance--------------------------------------------------------"
														+ distance);
										distancepercentage = 100 - distance;

										if (distance <= threshold) {
											System.out.println("Addresses are similar.");
										} else {
											System.out.println("Addresses are not similar.");
											SIaddress = SIBrandSheet;
										}
									}
								}

								if (!Merge_Business_Hours.isEmpty()) {
									SIBusinessHours += Merge_Business_Hours;
								} else {
									SIBusinessHours += "";
								}

								// Remove the trailing comma and space if the string is not empty
								SIBusinessHours = SIBusinessHours.replace("null", "");
								System.out.println("%%%%%%%%%%%%%%%%%%%%%" + SIBusinessHours);

								SIBusinessHours = GMB_Functions.rearrangeStringSI(SIBusinessHours);

								if (driver.findElements(By.cssSelector("span.puWIL.hKrmvd.google-symbols.OazX1c"))
										.size() > 0) {
									Thread.sleep(1000);
									WebElement element = driver.findElement(By.cssSelector(".ZDu9vd"));

									if (element.isDisplayed()) {

										executor.executeScript("arguments[0].click();", element);
									}

									else {
										System.out.println("No Hereee");
										js.executeScript(
												"arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'center' });",
												element);
										executor.executeScript("arguments[0].click();", element);
									}

									Thread.sleep(1500);
									String FullBusinesshours = driver
											.findElement(By.cssSelector(".t39EBf.GUrTXd"))
											.getText();
									System.out.println("1111111111111111111111111111111111111111111111111111111111111");
									System.out.println(FullBusinesshours);
									FullBusinesshours= FullBusinesshours.replace(" Suggest new hours", "");
									Pattern pattern = Pattern.compile("\\s*\\([^\\)]*\\)");
									Matcher matcher = pattern.matcher(FullBusinesshours);

									// Removing matched text
									FullBusinesshours = matcher.replaceAll("");

									// Removing other specific phrases
									FullBusinesshours = FullBusinesshours
											.replace("Hide open hours for the week", "");
									FullBusinesshours = FullBusinesshours.replace("Hours might differ",
											"");

									System.out.println("Filtered Business Hours: " + FullBusinesshours);

									GMB_Functions.extractDayTime(FullBusinesshours);
									String pattern2 = GMB_Functions.extractDayTime(FullBusinesshours);

									// Now you can use the pattern as needed
									System.out.println("Pattern:" + pattern);
									System.out.println("Pattern:" + pattern2);



									// Now you can use the pattern as needed
									System.out.println("Pattern:" + pattern);

									rearrangedPattern = GMB_Functions.rearrangeString(pattern2);

									if (SIBusinessHours.isEmpty() || rearrangedPattern.isEmpty()) {
										Matched_Hours = "No";
									} else {

										// Compare the rearranged string with the second string
										Matched_Hours = (rearrangedPattern.toLowerCase()
												.equals(SIBusinessHours.toLowerCase())) ? "Yes" : "No";
									}

								}

								if (driver.findElements(By.cssSelector("div a[data-item-id='authority']")).size() > 0) {
									GMBWebLink = driver.findElement(By.cssSelector("div a[data-item-id='authority']"))
											.getAttribute("href");
									System.out.println(GMBWebLink);
									Matched_Website = (GMBWebLink.toLowerCase().contains(Website.toLowerCase())) ? "Yes"
											: "No";

								}
							}
							
							else if (tooltipdata.equals("Copy phone number")) {
								System.out.println("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
								phonenumber = attribute.getAttribute("aria-label");
								System.out.println("Arial Value " + phonenumber);
								GMB_Phone = phonenumber.trim().replaceAll("Phone:", "").replaceAll("\\s+", "");
								System.out.println("Map Contact " + GMB_Phone);
								Phonenumber = Phonenumber.replace("+91", "").replaceAll("\\s+", "");
								System.out.println("SI Contacts " + Phonenumber);

								// Normalize the phone numbers to handle different formats including toll-free
								// numbers
								GMB_Phone = normalizephone(GMB_Phone);
								Phonenumber = normalizephone(Phonenumber);

								if (GMB_Phone.isEmpty() || Phonenumber.isEmpty()) {
									Matched_Phone = "No";
								} else {
									if (!GMB_Phone.contains(Phonenumber)) {
										Matched_Phone = "No";
									} else {
										Matched_Phone = "Yes";
									}
								}
							}

							

							else if (tooltipdata.equals("Copy plus code") && tooltipdata != null) {
								System.out.println("<3>");
								plusocode = attribute.getAttribute("aria-label");

								plusocode = plusocode.replace("Plus code:", "");
								System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx" + plusocode);

								String[] parts = plusocode.split(" ");

								if (parts.length > 0) {
									// Trim the dynamic code
									String eLocatedin = parts[0].trim();

									Locatedin = eLocatedin;
									System.out.println(
											"Locatedin--------------------------------------------------------------"
													+ Locatedin);

								}
							} 
						}

					}

					System.out.println("Marketinggggg");

					List<WebElement> attributespostfind = driver
							.findElements(By.cssSelector(".fontHeadlineSmall.zSdcRe.PiF0we"));

					overbreak: for (WebElement attributwherepost : attributespostfind) {
						JavascriptExecutor js1 = (JavascriptExecutor) driver;
						js1.executeScript("arguments[0].scrollIntoView()", attributwherepost);
						System.out.println("Find Post");
						String Postname = attributwherepost.getText();
						System.out.println(Postname);
						if (Postname.equals("From the owner") || Postname.contains("From the")) {
							Thread.sleep(1000);
							if (driver.findElements(By.cssSelector(".VpMB0")).size() > 0) {
								driver.findElement(By.cssSelector(".S3NLN")).click();
								Thread.sleep(2000);
								List<WebElement> findinnerpost = driver.findElements(By.cssSelector(".kf0LHf"));
								postsize = findinnerpost.size();
								System.out.println(postsize);
								if (postsize > 0) {
									Google_Post = "Yes";
									System.out.println("Posttttttttttttttttttttttttttt Presentttttttttttttttttttttttt");
									break overbreak;
								} else {
									System.out.println("Not Present");
									Google_Post = "No";
								}
								Google_Post = "No";
							}
						}

					}
					SIAmenities = "";

					String[] SIAmenitiesOptionsArray = SIAmenities.split(", ");
					StringBuilder filteredSIAmenitiesBuilder = new StringBuilder();

					for (String option : SIAmenitiesOptionsArray) {
						if (!option.isEmpty()) {
							if (filteredSIAmenitiesBuilder.length() > 0) {
								filteredSIAmenitiesBuilder.append(", ");
							}
							filteredSIAmenitiesBuilder.append(option);
						}
					}

					String filteredSIAmenities = filteredSIAmenitiesBuilder.toString();
					System.out.println(filteredSIAmenities);

					// Join the filtered array back into a string with commas and spaces
					SIAmenities = String.join(", ", filteredSIAmenities);

					System.out.println(SIAmenities);

					SIAccessibility = "";

					String[] SIAccessibilityOptionsArray = SIAccessibility.split(", ");
					StringBuilder filteredSIAccessibilityBuilder = new StringBuilder();

					for (String option : SIAccessibilityOptionsArray) {
						if (!option.isEmpty()) {
							if (filteredSIAccessibilityBuilder.length() > 0) {
								filteredSIAccessibilityBuilder.append(", ");
							}
							filteredSIAccessibilityBuilder.append(option);
						}
					}

					String filteredSIAccessibility = filteredSIAccessibilityBuilder.toString();
					System.out.println(filteredSIAccessibility);

					SIPayments = "";

					// Split the string by commas and spaces
					String[] paymentOptionsArray = SIPayments.split(", ");
					StringBuilder filteredPaymentsBuilder = new StringBuilder();

					for (String option : paymentOptionsArray) {
						if (!option.isEmpty()) {
							if (filteredPaymentsBuilder.length() > 0) {
								filteredPaymentsBuilder.append(", ");
							}
							filteredPaymentsBuilder.append(option);
						}
					}

					SIPayments = filteredPaymentsBuilder.toString();
					System.out.println(SIPayments);

					SIService = "";

					// Split the string by commas and spaces
					String[] serviceOptionsArray = SIService.split(", ");
					StringBuilder filteredServiceOptionsBuilder = new StringBuilder();

					for (String option : serviceOptionsArray) {
						if (!option.isEmpty()) {
							if (filteredServiceOptionsBuilder.length() > 0) {
								filteredServiceOptionsBuilder.append(", ");
							}
							filteredServiceOptionsBuilder.append(option);
						}
					}

					SIService = filteredServiceOptionsBuilder.toString();

					System.out.println(SIService);

					driver.get(Maplinks);
					if (driver.findElements(By.cssSelector("button.hh2c6")).size() > 0) {
						size = driver.findElements(By.cssSelector("button.hh2c6")).size();
						System.out.println("Size of tab is---" + size);

						for (int i = 2; i <= size; i++) {
							System.out.println("value of i=========================" + i);
							if (driver.findElements(By.cssSelector("button:nth-child(" + i + ") > div.LRkQ2"))
									.size() > 0) {
								WebElement tab = driver
										.findElement(By.cssSelector("button:nth-child(" + i + ") > div.LRkQ2"));
								tabname = tab.getText();
								tab.click();
								System.out.println(tabname);
								Thread.sleep(2000);
							}

							if (tabname.equals("Reviews")) {
								Thread.sleep(4000);
								if (driver.findElements(By.cssSelector(".fontDisplayLarge")).size() > 0) {
									Ratings = driver.findElement(By.cssSelector(".fontDisplayLarge")).getText();
									if (Ratings.length() > 0) {
										Ratings = Ratings + " Ratings";
									}
									System.out.println(Ratings);
								}
								Thread.sleep(3000);
								if (driver.findElements(By.cssSelector(".fontBodySmall")).size() > 0) {
									System.out.println("Here to get reviews");
									WebElement reviewview = driver.findElement(By.cssSelector(".fontBodySmall"));
									js.executeScript("arguments[0].scrollIntoView()", reviewview);
									Reviews = driver.findElement(By.cssSelector("div.fontBodySmall:nth-child(3)"))
											.getText();
									System.out.println(Reviews);

									if (Reviews.length() > 0) {
										System.out.println("Checking Posttttt Reviews Reply");

										List<WebElement> ownerreply = driver.findElements(By.cssSelector(".nM6d2c"));

										for (WebElement attributereviewreply : ownerreply) {
											js.executeScript("arguments[0].scrollIntoView()", attributereviewreply);
											String reviewindo = attributereviewreply.getText();
											System.out.println(reviewindo);
											if (reviewindo.contains("Response from the owner")) {
												Responsebyowner = "Yes";
												System.out.println("Responseeeeeeeeeeee");
											} else {
												Responsebyowner = "No";

											}
										}

									}

								}
							}
							
							Map<String, Object> aboutattribute = new LinkedHashMap<>();

							if (tabname.equals("About")) {
								Thread.sleep(500);
								System.out.println(
										"DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
								Map<String, List<String>> availableAttributes = new HashMap<>();
								Map<String, List<String>> unavailableAttributes = new HashMap<>();

								gmb_amenities = "-";
								gmb_service = "-";
								gmb_acccessbility = "-";

								gmb_payments = "-";

								Thread.sleep(400);
								if (driver.findElements(By.cssSelector(".iL3Qke.fontTitleSmall")).size() > 0) {
									List<WebElement> headings = driver
											.findElements(By.cssSelector(".iL3Qke.fontTitleSmall"));

									for (WebElement heading : headings) {
										Thread.sleep(400);
										String headingText = heading.getText().trim(); // Get the current heading's
																						// text
										String normalizedHeading = 
												normalizeToSnakeCase(headingText);
										WebElement parentElement1 = wait
												.until(ExpectedConditions.presenceOfNestedElementLocatedBy(heading,
														By.xpath("following-sibling::ul")));
										WebElement parentElement = heading
												.findElement(By.xpath("following-sibling::ul"));
										WebElement parentElement2 = wait.until(
												ExpectedConditions.presenceOfNestedElementLocatedBy(parentElement,
														By.cssSelector("li")));
										List<WebElement> items = parentElement.findElements(By.cssSelector("li"));

										Thread.sleep(700);
										for (WebElement item : items) {
											Thread.sleep(200);
											WebElement parentElement3 = wait
													.until(ExpectedConditions.presenceOfNestedElementLocatedBy(item,
															By.cssSelector("span[aria-label]")));
											WebElement spanElement = item
													.findElement(By.cssSelector("span[aria-label]"));
											String valueText = spanElement.getAttribute("aria-label").trim();

											String normalizedAttribute = 
													normalizeAttribute(valueText);

											// Check the class of the icon span to determine availability
											Thread.sleep(200);
											WebElement iconElement = item
													.findElement(By.cssSelector("span[aria-hidden='true']"));
											String iconClass = iconElement.getAttribute("class");

											// Use the icon class to distinguish available and unavailable
											// attributes
											if (iconClass.contains("SwaGS")) { // Assuming "SwaGS" indicates
																				// available
												availableAttributes
														.computeIfAbsent(normalizedHeading, k -> new ArrayList<>())
														.add(normalizedAttribute);
											} else if (iconClass.contains("OazX1c")) { // Assuming "OazX1c"
																						// indicates
																						// unavailable
												unavailableAttributes
														.computeIfAbsent(normalizedHeading, k -> new ArrayList<>())
														.add(normalizedAttribute);
											}
										}
									}

									aboutattribute.put("available_attributes",
											availableAttributes.isEmpty() ? null : availableAttributes);
									aboutattribute.put("unavailable_attributes",
											unavailableAttributes.isEmpty() ? null : unavailableAttributes);

									String parking = extractValue(availableAttributes, "parking");
									gmb_amenities = extractValue(availableAttributes, "amenities");
									gmb_service = extractValue(availableAttributes,
											"service_options");
									gmb_acccessbility = extractValue(availableAttributes,
											"accessibility");

									gmb_payments = extractValue(availableAttributes, "payments");
								}
							}

							System.out.println("Finish i loop");
							System.out.println("gmb_payments " + gmb_payments);
							System.out.println("gmb_amenities " + gmb_amenities);
							System.out.println("gmb_acccessbility " + gmb_acccessbility);
							System.out.println("gmb_service " + gmb_service);
						}
					}

					

					System.out.println("Check AMP");

					if (GMBWebLink != null && Matched_Website.contains("Yes")) {
						amphtmlText = "AMPfied";
					} else {
						amphtmlText = "No";
					}

					if (Businessname != null && Serachaddress != null) {
						System.out.println("Lets start responsive");
						System.setProperty("webdriver.chrome.driver",
								"/home/Deepu/eclipse-workspace/google maps business Data Match & Validation System/src/main/java/GMB_Data_Match_AND_Validation_System/Driver/chromedriver-linux/chromedriver");

						ChromeOptions chromeOptions = new ChromeOptions();
						chromeOptions.addArguments("--window-size=360,740");
						chromeOptions.addArguments("--disable-extensions");
						chromeOptions.addArguments("--disable-infobars");
						chromeOptions.addArguments("--disable-notifications");
						chromeOptions.addArguments("--disable-popup-blocking");
						chromeOptions.addArguments("--disable-save-password-bubble");
						chromeOptions.addArguments("--disable-translate");
						chromeOptions.addArguments("--disable-web-security");
						chromeOptions.addArguments("--enable-automation");
						chromeOptions.addArguments("--start-maximized");
						chromeOptions.addArguments(
								"--user-agent=Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.9999.9999 Mobile Safari/537.36");
						// Create a WebDriver instance with the configured options
						driver1 = new ChromeDriver(chromeOptions);

						driver1.get("https://www.google.com");
						elementseo = driver1.findElement(By.name("q"));
						Thread.sleep(2000);
						// element.sendKeys(Businessname+sortedSICombineaddress+Locality+City+State);
						System.out.println(Serachaddress);

						elementseo.sendKeys(Businessname + Serachaddress);
						Thread.sleep(2000);

						elementseo.sendKeys(Keys.ENTER);

						Thread.sleep(2000);

						System.out.println("Mode on");
						Thread.sleep(7000);
						if (driver1.findElements(By.cssSelector(".JWyTcc")).size() > 0) {
							List<WebElement> Chatenable = driver1.findElements(By.cssSelector(".JWyTcc"));
							System.out.println("Check Chat---------");

							chatloop: for (WebElement GMBchat : Chatenable) {
								((JavascriptExecutor) driver1).executeScript("arguments[0].scrollBy(0, -100);",
										GMBchat);

								Thread.sleep(2000);
								String chatbutton = GMBchat.getText();
								if (chatbutton.equalsIgnoreCase("Chat")) {

									chatlive = true;
									break chatloop;
								}
							}

							if (chatlive == true) {
								System.out.println("Chat Present");

								Matched_Chat = "Yes";
							} else {
								System.out.println("Chat Not Present");
								Matched_Chat = "No";
							}

						}

						System.out.println("Lets Find Products1");
						List<WebElement> Products = driver1.findElements(By.cssSelector(".F3Istb.sSWCId,RLSHPd"));
						productloop: for (WebElement GMBProducts : Products) {
							System.out.println("Lets Find Products2");
							Thread.sleep(2000);
							System.out.println("Scrolling started");
							Thread.sleep(1000);
							String tooltipdata = GMBProducts.getText();
							System.out.println("TolTipdataProducct-" + tooltipdata);

							if (tooltipdata != null) {
								// Let's compare Address component
								if (tooltipdata.equalsIgnoreCase("Products")) {

									System.out.println("<PPPPPPPP>Product Present");
									Matched_Products = "Yes";
									break productloop;

								} else {
									System.out.println("Not Present");
									Matched_Products = "No";
								}
							} else {
								Matched_Products = "No";
							}
						}
						driver1.quit();

					}

					System.out.println("Final Address Without zeroooooooooooooooooo again------" + SIaddress);

					if (closedlocation == false) {
						System.out.println("Open Listing");
						excelSheetUtility.Passcode(GMBStatus, StoreCode, ActualClientId, Maplinks, Business_Name,
								SIBrandSheet, Locality, City, State, SILandmark, Pincode, SILat, SILong,
								SIBusinessHours, Phonenumber, Website, Category, Businessname, Matched_Business,
								Serachaddress, Matched_Address, similarityPercentage, GMB_Locality, Matched_Loclity,
								GMB_City, Matched_City, GMB_State, Matched_State, GMB_Landmark, Matched_Landmark,
								pincodegmb, Matched_Pincode, map_lat, map_long, Matched_LatLong, dist,
								rearrangedPattern, Matched_Hours, GMB_Phone, Matched_Phone, GMBWebLink, Matched_Website,
								CategoryGMB, Matched_Category,gmb_service, gmb_acccessbility, gmb_payments,
								gmb_amenities, Google_Post, Matched_Chat, Matched_Products,
								amphtmlText, Ratings, Reviews, Responsebyowner, fullsize + " Images Available");

					} else {

						System.out.println("Closed Listing");

						excelSheetUtility.Passcode(GMBStatus, StoreCode, ActualClientId, Maplinks, Business_Name,
								SIBrandSheet, Locality, City, State, SILandmark, Pincode, SILat, SILong,
								SIBusinessHours, Phonenumber, Website, Category, Businessname, Matched_Business,
								Serachaddress, Matched_Address, similarityPercentage, GMB_Locality, Matched_Loclity,
								GMB_City, Matched_City, GMB_State, Matched_State, GMB_Landmark, Matched_Landmark,
								pincodegmb, Matched_Pincode, map_lat, map_long, Matched_LatLong, dist,
								rearrangedPattern, Matched_Hours, GMB_Phone, Matched_Phone, GMBWebLink, Matched_Website,
								CategoryGMB, Matched_Category, gmb_service, gmb_acccessbility, gmb_payments,
								gmb_amenities, Google_Post, Matched_Chat, Matched_Products,
								"Listing Deleted", Ratings, Reviews, Responsebyowner, fullsize + " Images Available");

					}
				} catch (Exception e) {

					excelSheetUtility.Passcode(GMBStatus, StoreCode, ActualClientId, Maplinks, Business_Name,
							SIBrandSheet, Locality, City, State, SILandmark, Pincode, SILat, SILong, SIBusinessHours,
							Phonenumber, Website, Category, Businessname, Matched_Business, Serachaddress,
							Matched_Address, similarityPercentage, GMB_Locality, Matched_Loclity, GMB_City,
							Matched_City, GMB_State, Matched_State, GMB_Landmark, Matched_Landmark, pincodegmb,
							Matched_Pincode, map_lat, map_long, Matched_LatLong, dist, rearrangedPattern, Matched_Hours,
							GMB_Phone, Matched_Phone, GMBWebLink, Matched_Website, CategoryGMB, Matched_Category,
							gmb_service, gmb_acccessbility, gmb_payments,
							gmb_amenities,
							Google_Post, Matched_Chat, Matched_Products, "Catch", Ratings, Reviews, Responsebyowner,
							fullsize + " Images Available");

				}
			} else {

				excelSheetUtility.Passcode(GMBStatus, StoreCode, ActualClientId, "GMB Not Linked", Business_Name,
						SIBrandSheet, Locality, City, State, SILandmark, Pincode, SILat, SILong, SIBusinessHours,
						Phonenumber, Website, Category, Businessname, Matched_Business, Serachaddress, Matched_Address,
						similarityPercentage, GMB_Locality, Matched_Loclity, GMB_City, Matched_City, GMB_State,
						Matched_State, GMB_Landmark, Matched_Landmark, pincodegmb, Matched_Pincode, map_lat, map_long,
						Matched_LatLong, dist, rearrangedPattern, Matched_Hours, GMB_Phone, Matched_Phone, GMBWebLink,
						Matched_Website, CategoryGMB, Matched_Category, gmb_service, gmb_acccessbility, gmb_payments,
						gmb_amenities, Google_Post, Matched_Chat, Matched_Products,
						amphtmlText, Ratings, Reviews, Responsebyowner, fullsize + " Images Available");

			}
		} catch (Exception e) {
			System.out.println("Catch Here Out!!!!!!!1");
			excelSheetUtility.Passcode(GMBStatus, StoreCode, ActualClientId, Maplinks, Business_Name, SIBrandSheet,
					Locality, City, State, SILandmark, Pincode, SILat, SILong, SIBusinessHours, Phonenumber, Website,
					Category, Businessname, Matched_Business, Serachaddress, Matched_Address, similarityPercentage,
					GMB_Locality, Matched_Loclity, GMB_City, Matched_City, GMB_State, Matched_State, GMB_Landmark,
					Matched_Landmark, pincodegmb, Matched_Pincode, map_lat, map_long, Matched_LatLong, dist,
					rearrangedPattern, Matched_Hours, GMB_Phone, Matched_Phone, GMBWebLink, Matched_Website,
					CategoryGMB, Matched_Category, gmb_service, gmb_acccessbility, gmb_payments,
					gmb_amenities, Google_Post, Matched_Chat, Matched_Products, "Catch", Ratings, Reviews,
					Responsebyowner, fullsize + " Images Available");

			System.out.println(e.getMessage());
			if (e instanceof SocketException) {
				// Handle SomeSpecificException
			} else if (e instanceof ArithmeticException) {
				// Handle AnotherSpecificException
			} else {
				// Handle other exceptions
				System.out.println("An exception occurred: " + e.getMessage());
			}
		}

	}

public static String cleanAndStandardizeAddress(String address) {
    // Normalize address: remove special characters and convert to lowercase
    return address.replaceAll("[,\\s]", "").replace("rd ", "road").toLowerCase();
}

private static double calculateJaroWinklerSimilarity(String address1, String address2) {
    JaroWinklerDistance jaroWinklerDistance = new JaroWinklerDistance();
    return jaroWinklerDistance.apply(address1, address2);
}
private static String normalizephone(String phone) {
    // Remove all non-digit characters
    phone = phone.replaceAll("\\D", "");

    // Check for toll-free numbers starting with 1800
    if (phone.startsWith("1800") && (phone.length() == 11 || phone.length() == 13)) {
        return phone;
    }

    // Remove leading 91 or 0 if present
    if (phone.startsWith("91") && phone.length() > 10) {
        phone = phone.substring(2);
    } else if (phone.startsWith("0") && phone.length() > 10) {
        phone = phone.substring(1);
    }

    return phone;
}




	@DataProvider
	public Object[][] dataprov() throws IOException {
		System.out.println("@DataProvider");
		String[][] data = readXLSXFileurl();
		return (data);
	}
	
	public static String normalizeAttribute(String input) {
		String normalized = input.toLowerCase().replaceAll("[^a-z0-9]+", "_").replaceAll("_$", "").replaceAll("^_", "");
		if (normalized.contains("no ")) {
			// normalized = normalized.replace("no ", "");
		}
		if (normalized.contains("has_") || normalized.contains("serves_") || normalized.contains("offers_")
				|| normalized.contains("provides_")) {
			return normalized;
		} else {
			// Add appropriate prefix based on the context or default to 'has_'
			return "has_" + normalized;
		}
	}
	public static String normalizeToSnakeCase(String input) {
		return input.toLowerCase().replaceAll("[^a-z0-9]+", "_").replaceAll("_$", "").replaceAll("^_", "");
	}

	public static String[][] readXLSXFileurl() throws IOException {
		DataFormatter formatter = new DataFormatter();
        InputStream file = new FileInputStream("/home/Deepu/eclipse-workspace/google maps business Data Match & Validation System/src/main/java/GMB_Data_Match_AND_Validation_System/Excel/Sample_Input_Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file); // get my workbook
		XSSFSheet worksheet = wb.getSheetAt(0);// get my sheet from workbook
		XSSFRow Row = worksheet.getRow(0); // get my Row which start from 0

		int RowNum = worksheet.getPhysicalNumberOfRows();// count my number of Rows
		int ColNum = Row.getLastCellNum(); // get last ColNum
		int rowIndex = 0;

		String Data[][] = new String[RowNum - 1][ColNum]; // pass my count data in array

		for (int i = 0; i < RowNum - 1; i++) // Loop work for Rows
		{
			System.out.println("1");
			XSSFRow row = worksheet.getRow(i + 1);

			for (int j = 0; j < ColNum; j++) // Loop work for colNum
			{
				// System.out.println("2");
				if (row == null) {
					// System.out.println("3");
					Data[i][j] = "";
				} else {
					XSSFCell cell = row.getCell(j);
					if (cell == null) {
						// System.out.println("4");
						Data[i][j] = ""; // if it get Null value it pass no data
					} else if (cell.getCellType() == HSSFCell.CELL_TYPE_STRING) {
						// System.out.println("String value");
						String value = formatter.formatCellValue(cell);
						Data[i][j] = value;
					} else {
						// System.out.println("5");
						String value = new java.text.DecimalFormat("0").format(cell.getNumericCellValue());
						System.out.println(value);
						Data[i][j] = value;
					}
				}
			}
			rowIndex++;
		}
		return Data;
	}
	
	public static String extractValue(Map<String, List<String>> attributesMap, String key) {
	    List<String> values = attributesMap.get(key);
	    if (values != null) {
	        return String.join(", ", values); // Join list items with a comma separator
	    }
	    return ""; // Return empty string if key is not found
	}
	

	@AfterTest
	public void aftertest() {

//		Sendmail.mail("Automation ::: ND Google Demo : Indane : AD Listings All Attributes");
		File deletefileallure = new File(System.getProperty("user.dir") + "\\allure-results");
		for (File file : deletefileallure.listFiles()) {
			System.out.println("enter in allure");
			if (!file.isDirectory()) {
				file.getPath();
				file.delete();
				System.out.println("Files deleted" + file.getName());
			}

		}
		driver.quit();

	}
}