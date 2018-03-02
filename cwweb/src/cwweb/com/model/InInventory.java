package cwweb.com.model;

public class InInventory {
    private Integer addressId;

    private Integer totalId;

    private String uuid;

    private Double unitPrice;

    private Double commdityTotal;

    private Integer inNumber;

    private Integer commdityUnit;

    private Integer inType;

    private String brokerage;

    private String inDate;

    private String createDate;

    private String updateDate;
    
    TotalInventory totalInventory;
    
    CommodityInfo commodityInfo;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getTotalId() {
        return totalId;
    }

    public void setTotalId(Integer totalId) {
        this.totalId = totalId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getCommdityTotal() {
        return commdityTotal;
    }

    public void setCommdityTotal(Double commdityTotal) {
        this.commdityTotal = commdityTotal;
    }

    public Integer getInNumber() {
        return inNumber;
    }

    public void setInNumber(Integer inNumber) {
        this.inNumber = inNumber;
    }

    public Integer getCommdityUnit() {
        return commdityUnit;
    }

    public void setCommdityUnit(Integer commdityUnit) {
        this.commdityUnit = commdityUnit;
    }

    public Integer getInType() {
        return inType;
    }

    public void setInType(Integer inType) {
        this.inType = inType;
    }

    public String getBrokerage() {
        return brokerage;
    }

    public void setBrokerage(String brokerage) {
        this.brokerage = brokerage == null ? null : brokerage.trim();
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate == null ? null : inDate.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate == null ? null : updateDate.trim();
    }

    public TotalInventory getTotalInventory() {
        return totalInventory;
    }

    public void setTotalInventory(TotalInventory totalInventory) {
        this.totalInventory = totalInventory;
    }

    public CommodityInfo getCommodityInfo() {
        return commodityInfo;
    }

    public void setCommodityInfo(CommodityInfo commodityInfo) {
        this.commodityInfo = commodityInfo;
    }

    @Override
    public String toString() {
        return "InInventory [addressId=" + addressId + ", totalId=" + totalId + ", uuid=" + uuid + ", unitPrice="
                + unitPrice + ", commdityTotal=" + commdityTotal + ", inNumber=" + inNumber + ", commdityUnit="
                + commdityUnit + ", inType=" + inType + ", brokerage=" + brokerage + ", inDate=" + inDate
                + ", createDate=" + createDate + ", updateDate=" + updateDate + ", totalInventory=" + totalInventory
                + ", commodityInfo=" + commodityInfo + "]";
    }
    
    
}