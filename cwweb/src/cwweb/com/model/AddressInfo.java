package cwweb.com.model;

public class AddressInfo {
    private Integer addressId;

    private Integer userId;

    private String addrName;

    private String addrPhone;

    private String peopleAddr;

    private Integer addrSex;

    private String startDate;

    private String endDate;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddrName() {
        return addrName;
    }

    public void setAddrName(String addrName) {
        this.addrName = addrName == null ? null : addrName.trim();
    }

    public String getAddrPhone() {
        return addrPhone;
    }

    public void setAddrPhone(String addrPhone) {
        this.addrPhone = addrPhone == null ? null : addrPhone.trim();
    }

    public String getPeopleAddr() {
        return peopleAddr;
    }

    public void setPeopleAddr(String peopleAddr) {
        this.peopleAddr = peopleAddr == null ? null : peopleAddr.trim();
    }

    public Integer getAddrSex() {
        return addrSex;
    }

    public void setAddrSex(Integer addrSex) {
        this.addrSex = addrSex;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }
}