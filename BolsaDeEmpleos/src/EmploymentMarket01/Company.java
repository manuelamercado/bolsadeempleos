package EmploymentMarket01;

import EmploymentMarket01.Address;
import EmploymentMarket01.CompanyType;

public class Company {

	private String Name;
	private String WebPage;
	private CompanyType AreaC;
	private Address addressCompany;
	private String area;
	private String ID;
	private String Phone;
	private String Mobile;
	private String Email;
	private String RNC;

	public Company(String name, String webPage, CompanyType area2,
			String area1, Address address) {
		Name = name;
		WebPage = webPage;
		setAreaC(area2);
		area = area1;
		addressCompany = address;
	}

	public Company() {
		Name = "";
		WebPage = "";
		area = "";
		ID = "";
		Phone = "";
		Mobile = "";
		Email = "";
		addressCompany = new Address("", "", "", 0, 0);
		setRNC("");
	}

	public Company(String name, String webPage, String area1, String City,
			String Sector, String Calle, int HouseNumber, long PostalCode) {
		Name = name;
		WebPage = webPage;
		area = area1;
		addressCompany.setCity(City);
		addressCompany.setSector(Sector);
		addressCompany.setCalle(Calle);
		addressCompany.setHouseNumber(HouseNumber);
		addressCompany.setPostalCode(PostalCode);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getWebPage() {
		return WebPage;
	}

	public void setWebPage(String webPage) {
		WebPage = webPage;
	}

	public Address getAddressCompany() {
		return addressCompany;
	}

	public void setAddressCompany(Address addressCompany) {
		this.addressCompany = addressCompany;
	}

	public String getCity() {
		return addressCompany.getCity();
	}

	public void setCity(String city) {
		addressCompany.setCity(city);
	}

	public String getSector() {
		return addressCompany.getSector();
	}

	public void setSector(String sector) {
		addressCompany.setSector(sector);
	}

	public String getCalle() {
		return addressCompany.getCalle();
	}

	public void setCalle(String calle) {
		addressCompany.setCalle(calle);
	}

	public int getHouseNumber() {
		return addressCompany.getHouseNumber();
	}

	public void setHouseNumber(int houseNumber) {
		addressCompany.setHouseNumber(houseNumber);
	}

	public long getPostalCode() {
		return addressCompany.getPostalCode();
	}

	public void setPostalCode(long postalCode) {
		addressCompany.setPostalCode(postalCode);
	}

	public CompanyType getAreaC() {
		return AreaC;
	}

	public void setAreaC(CompanyType area1) {
		AreaC = area1;
	}

	public void setArea(String area2) {
		this.area = area2;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getArea() {
		return area;
	}

	public String getRNC() {
		return RNC;
	}

	public void setRNC(String rNC) {
		RNC = rNC;
	}

}