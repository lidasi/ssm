package cwweb.com.model;

public class CommodityInfo {
    private Integer commodityId;

    private String commodityName;

    private String commodityBar;

    private Double commodityMarket;

    private Integer shelvesState;

    private Integer style;

    private Integer color;

    private Integer size;

    private Integer type;

    private String updateDate;

    private String createDate;

    public CommodityInfo() {
        
    }
    
    
    
    public CommodityInfo(Integer commodityId, String commodityName, String commodityBar, Double commodityMarket,
            Integer shelvesState, Integer style, Integer color, Integer size, Integer type, String updateDate,
            String createDate) {
        super();
        this.commodityId = commodityId;
        this.commodityName = commodityName;
        this.commodityBar = commodityBar;
        this.commodityMarket = commodityMarket;
        this.shelvesState = shelvesState;
        this.style = style;
        this.color = color;
        this.size = size;
        this.type = type;
        this.updateDate = updateDate;
        this.createDate = createDate;
    }



    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public String getCommodityBar() {
        return commodityBar;
    }

    public void setCommodityBar(String commodityBar) {
        this.commodityBar = commodityBar == null ? null : commodityBar.trim();
    }

    public Double getCommodityMarket() {
        return commodityMarket;
    }

    public void setCommodityMarket(Double commodityMarket) {
        this.commodityMarket = commodityMarket;
    }

    public Integer getShelvesState() {
        return shelvesState;
    }

    public void setShelvesState(Integer shelvesState) {
        this.shelvesState = shelvesState;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate == null ? null : updateDate.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    @Override
    public String toString() {
        return "CommodityInfo [commodityId=" + commodityId + ", commodityName=" + commodityName + ", commodityBar="
                + commodityBar + ", commodityMarket=" + commodityMarket + ", shelvesState=" + shelvesState + ", style="
                + style + ", color=" + color + ", size=" + size + ", type=" + type + ", updateDate=" + updateDate
                + ", createDate=" + createDate + "]";
    }
    
}