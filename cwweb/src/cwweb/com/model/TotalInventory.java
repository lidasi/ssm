package cwweb.com.model;

public class TotalInventory {
    private Integer totalinId;

    private String uuid;

    private Integer commodityId;

    private Integer totalNumber;

    private Integer commdityUnit;

    private String createDate;

    private String updateDate;

    public Integer getTotalinId() {
        return totalinId;
    }

    public void setTotalinId(Integer totalinId) {
        this.totalinId = totalinId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Integer getCommdityUnit() {
        return commdityUnit;
    }

    public void setCommdityUnit(Integer commdityUnit) {
        this.commdityUnit = commdityUnit;
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

    @Override
    public String toString() {
        return "TotalInventory [totalinId=" + totalinId + ", uuid=" + uuid + ", commodityId=" + commodityId
                + ", totalNumber=" + totalNumber + ", commdityUnit=" + commdityUnit + ", createDate=" + createDate
                + ", updateDate=" + updateDate + "]";
    }
    
    
}