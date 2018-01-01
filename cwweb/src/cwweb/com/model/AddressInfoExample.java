package cwweb.com.model;

import java.util.ArrayList;
import java.util.List;

public class AddressInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressInfoExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAddrNameIsNull() {
            addCriterion("addr_name is null");
            return (Criteria) this;
        }

        public Criteria andAddrNameIsNotNull() {
            addCriterion("addr_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddrNameEqualTo(String value) {
            addCriterion("addr_name =", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameNotEqualTo(String value) {
            addCriterion("addr_name <>", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameGreaterThan(String value) {
            addCriterion("addr_name >", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameGreaterThanOrEqualTo(String value) {
            addCriterion("addr_name >=", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameLessThan(String value) {
            addCriterion("addr_name <", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameLessThanOrEqualTo(String value) {
            addCriterion("addr_name <=", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameLike(String value) {
            addCriterion("addr_name like", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameNotLike(String value) {
            addCriterion("addr_name not like", value, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameIn(List<String> values) {
            addCriterion("addr_name in", values, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameNotIn(List<String> values) {
            addCriterion("addr_name not in", values, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameBetween(String value1, String value2) {
            addCriterion("addr_name between", value1, value2, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrNameNotBetween(String value1, String value2) {
            addCriterion("addr_name not between", value1, value2, "addrName");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneIsNull() {
            addCriterion("addr_phone is null");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneIsNotNull() {
            addCriterion("addr_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneEqualTo(String value) {
            addCriterion("addr_phone =", value, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneNotEqualTo(String value) {
            addCriterion("addr_phone <>", value, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneGreaterThan(String value) {
            addCriterion("addr_phone >", value, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("addr_phone >=", value, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneLessThan(String value) {
            addCriterion("addr_phone <", value, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneLessThanOrEqualTo(String value) {
            addCriterion("addr_phone <=", value, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneLike(String value) {
            addCriterion("addr_phone like", value, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneNotLike(String value) {
            addCriterion("addr_phone not like", value, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneIn(List<String> values) {
            addCriterion("addr_phone in", values, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneNotIn(List<String> values) {
            addCriterion("addr_phone not in", values, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneBetween(String value1, String value2) {
            addCriterion("addr_phone between", value1, value2, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andAddrPhoneNotBetween(String value1, String value2) {
            addCriterion("addr_phone not between", value1, value2, "addrPhone");
            return (Criteria) this;
        }

        public Criteria andPeopleAddrIsNull() {
            addCriterion("people_addr is null");
            return (Criteria) this;
        }

        public Criteria andPeopleAddrIsNotNull() {
            addCriterion("people_addr is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleAddrEqualTo(String value) {
            addCriterion("people_addr =", value, "peopleAddr");
            return (Criteria) this;
        }

        public Criteria andPeopleAddrNotEqualTo(String value) {
            addCriterion("people_addr <>", value, "peopleAddr");
            return (Criteria) this;
        }

        public Criteria andPeopleAddrGreaterThan(String value) {
            addCriterion("people_addr >", value, "peopleAddr");
            return (Criteria) this;
        }

        public Criteria andPeopleAddrGreaterThanOrEqualTo(String value) {
            addCriterion("people_addr >=", value, "peopleAddr");
            return (Criteria) this;
        }

        public Criteria andPeopleAddrLessThan(String value) {
            addCriterion("people_addr <", value, "peopleAddr");
            return (Criteria) this;
        }

        public Criteria andPeopleAddrLessThanOrEqualTo(String value) {
            addCriterion("people_addr <=", value, "peopleAddr");
            return (Criteria) this;
        }

        public Criteria andPeopleAddrLike(String value) {
            addCriterion("people_addr like", value, "peopleAddr");
            return (Criteria) this;
        }

        public Criteria andPeopleAddrNotLike(String value) {
            addCriterion("people_addr not like", value, "peopleAddr");
            return (Criteria) this;
        }

        public Criteria andPeopleAddrIn(List<String> values) {
            addCriterion("people_addr in", values, "peopleAddr");
            return (Criteria) this;
        }

        public Criteria andPeopleAddrNotIn(List<String> values) {
            addCriterion("people_addr not in", values, "peopleAddr");
            return (Criteria) this;
        }

        public Criteria andPeopleAddrBetween(String value1, String value2) {
            addCriterion("people_addr between", value1, value2, "peopleAddr");
            return (Criteria) this;
        }

        public Criteria andPeopleAddrNotBetween(String value1, String value2) {
            addCriterion("people_addr not between", value1, value2, "peopleAddr");
            return (Criteria) this;
        }

        public Criteria andAddrSexIsNull() {
            addCriterion("addr_sex is null");
            return (Criteria) this;
        }

        public Criteria andAddrSexIsNotNull() {
            addCriterion("addr_sex is not null");
            return (Criteria) this;
        }

        public Criteria andAddrSexEqualTo(Integer value) {
            addCriterion("addr_sex =", value, "addrSex");
            return (Criteria) this;
        }

        public Criteria andAddrSexNotEqualTo(Integer value) {
            addCriterion("addr_sex <>", value, "addrSex");
            return (Criteria) this;
        }

        public Criteria andAddrSexGreaterThan(Integer value) {
            addCriterion("addr_sex >", value, "addrSex");
            return (Criteria) this;
        }

        public Criteria andAddrSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("addr_sex >=", value, "addrSex");
            return (Criteria) this;
        }

        public Criteria andAddrSexLessThan(Integer value) {
            addCriterion("addr_sex <", value, "addrSex");
            return (Criteria) this;
        }

        public Criteria andAddrSexLessThanOrEqualTo(Integer value) {
            addCriterion("addr_sex <=", value, "addrSex");
            return (Criteria) this;
        }

        public Criteria andAddrSexIn(List<Integer> values) {
            addCriterion("addr_sex in", values, "addrSex");
            return (Criteria) this;
        }

        public Criteria andAddrSexNotIn(List<Integer> values) {
            addCriterion("addr_sex not in", values, "addrSex");
            return (Criteria) this;
        }

        public Criteria andAddrSexBetween(Integer value1, Integer value2) {
            addCriterion("addr_sex between", value1, value2, "addrSex");
            return (Criteria) this;
        }

        public Criteria andAddrSexNotBetween(Integer value1, Integer value2) {
            addCriterion("addr_sex not between", value1, value2, "addrSex");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(String value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(String value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(String value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(String value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(String value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLike(String value) {
            addCriterion("start_date like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotLike(String value) {
            addCriterion("start_date not like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<String> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<String> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(String value1, String value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(String value1, String value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(String value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(String value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(String value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(String value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(String value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLike(String value) {
            addCriterion("end_date like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotLike(String value) {
            addCriterion("end_date not like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<String> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<String> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(String value1, String value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(String value1, String value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
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