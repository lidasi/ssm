package cwweb.com.model;

import java.util.ArrayList;
import java.util.List;

public class ResumeInventoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumeInventoryExample() {
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

        public Criteria andResinIdIsNull() {
            addCriterion("resin_id is null");
            return (Criteria) this;
        }

        public Criteria andResinIdIsNotNull() {
            addCriterion("resin_id is not null");
            return (Criteria) this;
        }

        public Criteria andResinIdEqualTo(Integer value) {
            addCriterion("resin_id =", value, "resinId");
            return (Criteria) this;
        }

        public Criteria andResinIdNotEqualTo(Integer value) {
            addCriterion("resin_id <>", value, "resinId");
            return (Criteria) this;
        }

        public Criteria andResinIdGreaterThan(Integer value) {
            addCriterion("resin_id >", value, "resinId");
            return (Criteria) this;
        }

        public Criteria andResinIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resin_id >=", value, "resinId");
            return (Criteria) this;
        }

        public Criteria andResinIdLessThan(Integer value) {
            addCriterion("resin_id <", value, "resinId");
            return (Criteria) this;
        }

        public Criteria andResinIdLessThanOrEqualTo(Integer value) {
            addCriterion("resin_id <=", value, "resinId");
            return (Criteria) this;
        }

        public Criteria andResinIdIn(List<Integer> values) {
            addCriterion("resin_id in", values, "resinId");
            return (Criteria) this;
        }

        public Criteria andResinIdNotIn(List<Integer> values) {
            addCriterion("resin_id not in", values, "resinId");
            return (Criteria) this;
        }

        public Criteria andResinIdBetween(Integer value1, Integer value2) {
            addCriterion("resin_id between", value1, value2, "resinId");
            return (Criteria) this;
        }

        public Criteria andResinIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resin_id not between", value1, value2, "resinId");
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

        public Criteria andCommodityIdIsNull() {
            addCriterion("commodity_id is null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIsNotNull() {
            addCriterion("commodity_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityIdEqualTo(Integer value) {
            addCriterion("commodity_id =", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotEqualTo(Integer value) {
            addCriterion("commodity_id <>", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThan(Integer value) {
            addCriterion("commodity_id >", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("commodity_id >=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThan(Integer value) {
            addCriterion("commodity_id <", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdLessThanOrEqualTo(Integer value) {
            addCriterion("commodity_id <=", value, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdIn(List<Integer> values) {
            addCriterion("commodity_id in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotIn(List<Integer> values) {
            addCriterion("commodity_id not in", values, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdBetween(Integer value1, Integer value2) {
            addCriterion("commodity_id between", value1, value2, "commodityId");
            return (Criteria) this;
        }

        public Criteria andCommodityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("commodity_id not between", value1, value2, "commodityId");
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

        public Criteria andOutNumberIsNull() {
            addCriterion("out_number is null");
            return (Criteria) this;
        }

        public Criteria andOutNumberIsNotNull() {
            addCriterion("out_number is not null");
            return (Criteria) this;
        }

        public Criteria andOutNumberEqualTo(Integer value) {
            addCriterion("out_number =", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotEqualTo(Integer value) {
            addCriterion("out_number <>", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberGreaterThan(Integer value) {
            addCriterion("out_number >", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_number >=", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberLessThan(Integer value) {
            addCriterion("out_number <", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberLessThanOrEqualTo(Integer value) {
            addCriterion("out_number <=", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberIn(List<Integer> values) {
            addCriterion("out_number in", values, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotIn(List<Integer> values) {
            addCriterion("out_number not in", values, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberBetween(Integer value1, Integer value2) {
            addCriterion("out_number between", value1, value2, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("out_number not between", value1, value2, "outNumber");
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

        public Criteria andOperationTypeIsNull() {
            addCriterion("operation_type is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNotNull() {
            addCriterion("operation_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(Integer value) {
            addCriterion("operation_type =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(Integer value) {
            addCriterion("operation_type <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(Integer value) {
            addCriterion("operation_type >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_type >=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(Integer value) {
            addCriterion("operation_type <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("operation_type <=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIn(List<Integer> values) {
            addCriterion("operation_type in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<Integer> values) {
            addCriterion("operation_type not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(Integer value1, Integer value2) {
            addCriterion("operation_type between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_type not between", value1, value2, "operationType");
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

        public Criteria andOutDateIsNull() {
            addCriterion("out_date is null");
            return (Criteria) this;
        }

        public Criteria andOutDateIsNotNull() {
            addCriterion("out_date is not null");
            return (Criteria) this;
        }

        public Criteria andOutDateEqualTo(String value) {
            addCriterion("out_date =", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateNotEqualTo(String value) {
            addCriterion("out_date <>", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateGreaterThan(String value) {
            addCriterion("out_date >", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateGreaterThanOrEqualTo(String value) {
            addCriterion("out_date >=", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateLessThan(String value) {
            addCriterion("out_date <", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateLessThanOrEqualTo(String value) {
            addCriterion("out_date <=", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateLike(String value) {
            addCriterion("out_date like", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateNotLike(String value) {
            addCriterion("out_date not like", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateIn(List<String> values) {
            addCriterion("out_date in", values, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateNotIn(List<String> values) {
            addCriterion("out_date not in", values, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateBetween(String value1, String value2) {
            addCriterion("out_date between", value1, value2, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateNotBetween(String value1, String value2) {
            addCriterion("out_date not between", value1, value2, "outDate");
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