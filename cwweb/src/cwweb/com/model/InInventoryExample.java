package cwweb.com.model;

import java.util.ArrayList;
import java.util.List;

import cwweb.com.model.CommodityInfoExample.Criteria;

public class InInventoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InInventoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andCommdityIdIsNull() {
            addCriterion("commdity_id is null");
            return (Criteria) this;
        }

        public Criteria andCommdityIdIsNotNull() {
            addCriterion("commdity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommdityIdEqualTo(Integer value) {
            addCriterion("commdity_id =", value, "commdityId");
            return (Criteria) this;
        }

        public Criteria andCommdityIdNotEqualTo(Integer value) {
            addCriterion("commdity_id <>", value, "commdityId");
            return (Criteria) this;
        }

        public Criteria andCommdityIdGreaterThan(Integer value) {
            addCriterion("commdity_id >", value, "commdityId");
            return (Criteria) this;
        }

        public Criteria andCommdityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commdity_id >=", value, "commdityId");
            return (Criteria) this;
        }

        public Criteria andCommdityIdLessThan(Integer value) {
            addCriterion("commdity_id <", value, "commdityId");
            return (Criteria) this;
        }

        public Criteria andCommdityIdLessThanOrEqualTo(Integer value) {
            addCriterion("commdity_id <=", value, "commdityId");
            return (Criteria) this;
        }

        public Criteria andCommdityIdIn(List<Integer> values) {
            addCriterion("commdity_id in", values, "commdityId");
            return (Criteria) this;
        }

        public Criteria andCommdityIdNotIn(List<Integer> values) {
            addCriterion("commdity_id not in", values, "commdityId");
            return (Criteria) this;
        }

        public Criteria andCommdityIdBetween(Integer value1, Integer value2) {
            addCriterion("commdity_id between", value1, value2, "commdityId");
            return (Criteria) this;
        }

        public Criteria andCommdityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commdity_id not between", value1, value2, "commdityId");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(String value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(String value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(String value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(String value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(String value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(String value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLike(String value) {
            addCriterion("unit_price like", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotLike(String value) {
            addCriterion("unit_price not like", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<String> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<String> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(String value1, String value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(String value1, String value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andCommdityTotalIsNull() {
            addCriterion("commdity_total is null");
            return (Criteria) this;
        }

        public Criteria andCommdityTotalIsNotNull() {
            addCriterion("commdity_total is not null");
            return (Criteria) this;
        }

        public Criteria andCommdityTotalEqualTo(String value) {
            addCriterion("commdity_total =", value, "commdityTotal");
            return (Criteria) this;
        }

        public Criteria andCommdityTotalNotEqualTo(String value) {
            addCriterion("commdity_total <>", value, "commdityTotal");
            return (Criteria) this;
        }

        public Criteria andCommdityTotalGreaterThan(String value) {
            addCriterion("commdity_total >", value, "commdityTotal");
            return (Criteria) this;
        }

        public Criteria andCommdityTotalGreaterThanOrEqualTo(String value) {
            addCriterion("commdity_total >=", value, "commdityTotal");
            return (Criteria) this;
        }

        public Criteria andCommdityTotalLessThan(String value) {
            addCriterion("commdity_total <", value, "commdityTotal");
            return (Criteria) this;
        }

        public Criteria andCommdityTotalLessThanOrEqualTo(String value) {
            addCriterion("commdity_total <=", value, "commdityTotal");
            return (Criteria) this;
        }

        public Criteria andCommdityTotalLike(String value) {
            addCriterion("commdity_total like", value, "commdityTotal");
            return (Criteria) this;
        }

        public Criteria andCommdityTotalNotLike(String value) {
            addCriterion("commdity_total not like", value, "commdityTotal");
            return (Criteria) this;
        }

        public Criteria andCommdityTotalIn(List<String> values) {
            addCriterion("commdity_total in", values, "commdityTotal");
            return (Criteria) this;
        }

        public Criteria andCommdityTotalNotIn(List<String> values) {
            addCriterion("commdity_total not in", values, "commdityTotal");
            return (Criteria) this;
        }

        public Criteria andCommdityTotalBetween(String value1, String value2) {
            addCriterion("commdity_total between", value1, value2, "commdityTotal");
            return (Criteria) this;
        }

        public Criteria andCommdityTotalNotBetween(String value1, String value2) {
            addCriterion("commdity_total not between", value1, value2, "commdityTotal");
            return (Criteria) this;
        }

        public Criteria andInNumberIsNull() {
            addCriterion("in_number is null");
            return (Criteria) this;
        }

        public Criteria andInNumberIsNotNull() {
            addCriterion("in_number is not null");
            return (Criteria) this;
        }

        public Criteria andInNumberEqualTo(Integer value) {
            addCriterion("in_number =", value, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberNotEqualTo(Integer value) {
            addCriterion("in_number <>", value, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberGreaterThan(Integer value) {
            addCriterion("in_number >", value, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_number >=", value, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberLessThan(Integer value) {
            addCriterion("in_number <", value, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberLessThanOrEqualTo(Integer value) {
            addCriterion("in_number <=", value, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberIn(List<Integer> values) {
            addCriterion("in_number in", values, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberNotIn(List<Integer> values) {
            addCriterion("in_number not in", values, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberBetween(Integer value1, Integer value2) {
            addCriterion("in_number between", value1, value2, "inNumber");
            return (Criteria) this;
        }

        public Criteria andInNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("in_number not between", value1, value2, "inNumber");
            return (Criteria) this;
        }

        public Criteria andCommdityUnitIsNull() {
            addCriterion("commdity_unit is null");
            return (Criteria) this;
        }

        public Criteria andCommdityUnitIsNotNull() {
            addCriterion("commdity_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCommdityUnitEqualTo(Integer value) {
            addCriterion("commdity_unit =", value, "commdityUnit");
            return (Criteria) this;
        }

        public Criteria andCommdityUnitNotEqualTo(Integer value) {
            addCriterion("commdity_unit <>", value, "commdityUnit");
            return (Criteria) this;
        }

        public Criteria andCommdityUnitGreaterThan(Integer value) {
            addCriterion("commdity_unit >", value, "commdityUnit");
            return (Criteria) this;
        }

        public Criteria andCommdityUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("commdity_unit >=", value, "commdityUnit");
            return (Criteria) this;
        }

        public Criteria andCommdityUnitLessThan(Integer value) {
            addCriterion("commdity_unit <", value, "commdityUnit");
            return (Criteria) this;
        }

        public Criteria andCommdityUnitLessThanOrEqualTo(Integer value) {
            addCriterion("commdity_unit <=", value, "commdityUnit");
            return (Criteria) this;
        }

        public Criteria andCommdityUnitIn(List<Integer> values) {
            addCriterion("commdity_unit in", values, "commdityUnit");
            return (Criteria) this;
        }

        public Criteria andCommdityUnitNotIn(List<Integer> values) {
            addCriterion("commdity_unit not in", values, "commdityUnit");
            return (Criteria) this;
        }

        public Criteria andCommdityUnitBetween(Integer value1, Integer value2) {
            addCriterion("commdity_unit between", value1, value2, "commdityUnit");
            return (Criteria) this;
        }

        public Criteria andCommdityUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("commdity_unit not between", value1, value2, "commdityUnit");
            return (Criteria) this;
        }

        public Criteria andInTypeIsNull() {
            addCriterion("in_type is null");
            return (Criteria) this;
        }

        public Criteria andInTypeIsNotNull() {
            addCriterion("in_type is not null");
            return (Criteria) this;
        }

        public Criteria andInTypeEqualTo(Integer value) {
            addCriterion("in_type =", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeNotEqualTo(Integer value) {
            addCriterion("in_type <>", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeGreaterThan(Integer value) {
            addCriterion("in_type >", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_type >=", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeLessThan(Integer value) {
            addCriterion("in_type <", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeLessThanOrEqualTo(Integer value) {
            addCriterion("in_type <=", value, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeIn(List<Integer> values) {
            addCriterion("in_type in", values, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeNotIn(List<Integer> values) {
            addCriterion("in_type not in", values, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeBetween(Integer value1, Integer value2) {
            addCriterion("in_type between", value1, value2, "inType");
            return (Criteria) this;
        }

        public Criteria andInTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("in_type not between", value1, value2, "inType");
            return (Criteria) this;
        }

        public Criteria andBrokerageIsNull() {
            addCriterion("brokerage is null");
            return (Criteria) this;
        }

        public Criteria andBrokerageIsNotNull() {
            addCriterion("brokerage is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerageEqualTo(String value) {
            addCriterion("brokerage =", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageNotEqualTo(String value) {
            addCriterion("brokerage <>", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageGreaterThan(String value) {
            addCriterion("brokerage >", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageGreaterThanOrEqualTo(String value) {
            addCriterion("brokerage >=", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageLessThan(String value) {
            addCriterion("brokerage <", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageLessThanOrEqualTo(String value) {
            addCriterion("brokerage <=", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageLike(String value) {
            addCriterion("brokerage like", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageNotLike(String value) {
            addCriterion("brokerage not like", value, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageIn(List<String> values) {
            addCriterion("brokerage in", values, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageNotIn(List<String> values) {
            addCriterion("brokerage not in", values, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageBetween(String value1, String value2) {
            addCriterion("brokerage between", value1, value2, "brokerage");
            return (Criteria) this;
        }

        public Criteria andBrokerageNotBetween(String value1, String value2) {
            addCriterion("brokerage not between", value1, value2, "brokerage");
            return (Criteria) this;
        }

        public Criteria andInDateIsNull() {
            addCriterion("in_date is null");
            return (Criteria) this;
        }

        public Criteria andInDateIsNotNull() {
            addCriterion("in_date is not null");
            return (Criteria) this;
        }

        public Criteria andInDateEqualTo(String value) {
            addCriterion("in_date =", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotEqualTo(String value) {
            addCriterion("in_date <>", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThan(String value) {
            addCriterion("in_date >", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThanOrEqualTo(String value) {
            addCriterion("in_date >=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThan(String value) {
            addCriterion("in_date <", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThanOrEqualTo(String value) {
            addCriterion("in_date <=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLike(String value) {
            addCriterion("in_date like", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotLike(String value) {
            addCriterion("in_date not like", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateIn(List<String> values) {
            addCriterion("in_date in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotIn(List<String> values) {
            addCriterion("in_date not in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateBetween(String value1, String value2) {
            addCriterion("in_date between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotBetween(String value1, String value2) {
            addCriterion("in_date not between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("create_date like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("create_date not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(String value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(String value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(String value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(String value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(String value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(String value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLike(String value) {
            addCriterion("update_date like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotLike(String value) {
            addCriterion("update_date not like", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<String> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<String> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(String value1, String value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(String value1, String value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
        
        //this is a commdity info name
        public Criteria andCommodityNameIsNull() {
            addCriterion("commodity_name is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("commodity_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("commodity_name =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("commodity_name <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("commodity_name >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_name >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("commodity_name <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("commodity_name <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("commodity_name like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("commodity_name not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("commodity_name in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("commodity_name not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("commodity_name between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("commodity_name not between", value1, value2, "commodityName");
            return (Criteria) this;
        }
        
        //this is a commdity info bar
        public Criteria andCommodityBarIsNull() {
            addCriterion("commodity_bar is null");
            return (Criteria) this;
        }

        public Criteria andCommodityBarIsNotNull() {
            addCriterion("commodity_bar is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityBarEqualTo(String value) {
            addCriterion("commodity_bar =", value, "commodityBar");
            return (Criteria) this;
        }

        public Criteria andCommodityBarNotEqualTo(String value) {
            addCriterion("commodity_bar <>", value, "commodityBar");
            return (Criteria) this;
        }

        public Criteria andCommodityBarGreaterThan(String value) {
            addCriterion("commodity_bar >", value, "commodityBar");
            return (Criteria) this;
        }

        public Criteria andCommodityBarGreaterThanOrEqualTo(String value) {
            addCriterion("commodity_bar >=", value, "commodityBar");
            return (Criteria) this;
        }

        public Criteria andCommodityBarLessThan(String value) {
            addCriterion("commodity_bar <", value, "commodityBar");
            return (Criteria) this;
        }

        public Criteria andCommodityBarLessThanOrEqualTo(String value) {
            addCriterion("commodity_bar <=", value, "commodityBar");
            return (Criteria) this;
        }

        public Criteria andCommodityBarLike(String value) {
            addCriterion("commodity_bar like", value, "commodityBar");
            return (Criteria) this;
        }

        public Criteria andCommodityBarNotLike(String value) {
            addCriterion("commodity_bar not like", value, "commodityBar");
            return (Criteria) this;
        }

        public Criteria andCommodityBarIn(List<String> values) {
            addCriterion("commodity_bar in", values, "commodityBar");
            return (Criteria) this;
        }

        public Criteria andCommodityBarNotIn(List<String> values) {
            addCriterion("commodity_bar not in", values, "commodityBar");
            return (Criteria) this;
        }

        public Criteria andCommodityBarBetween(String value1, String value2) {
            addCriterion("commodity_bar between", value1, value2, "commodityBar");
            return (Criteria) this;
        }

        public Criteria andCommodityBarNotBetween(String value1, String value2) {
            addCriterion("commodity_bar not between", value1, value2, "commodityBar");
            return (Criteria) this;
        }
        
        //this is a commdity info type
        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }
        
        //this is a commdity info size
        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Integer value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Integer value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Integer value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Integer value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Integer value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Integer> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Integer> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Integer value1, Integer value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }
        
        //this is a commdity info color
        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(Integer value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(Integer value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(Integer value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(Integer value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(Integer value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(Integer value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<Integer> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<Integer> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(Integer value1, Integer value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(Integer value1, Integer value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }
        
        //this is a commdity info style
        public Criteria andStyleIsNull() {
            addCriterion("style is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("style is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(Integer value) {
            addCriterion("style =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(Integer value) {
            addCriterion("style <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(Integer value) {
            addCriterion("style >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(Integer value) {
            addCriterion("style >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(Integer value) {
            addCriterion("style <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(Integer value) {
            addCriterion("style <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<Integer> values) {
            addCriterion("style in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<Integer> values) {
            addCriterion("style not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(Integer value1, Integer value2) {
            addCriterion("style between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(Integer value1, Integer value2) {
            addCriterion("style not between", value1, value2, "style");
            return (Criteria) this;
        }
        
        //this is a commdity info market
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}