package com.dhu.domain;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
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

        public Criteria andAddressidIsNull() {
            addCriterion("addressId is null");
            return (Criteria) this;
        }

        public Criteria andAddressidIsNotNull() {
            addCriterion("addressId is not null");
            return (Criteria) this;
        }

        public Criteria andAddressidEqualTo(String value) {
            addCriterion("addressId =", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotEqualTo(String value) {
            addCriterion("addressId <>", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThan(String value) {
            addCriterion("addressId >", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThanOrEqualTo(String value) {
            addCriterion("addressId >=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThan(String value) {
            addCriterion("addressId <", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThanOrEqualTo(String value) {
            addCriterion("addressId <=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLike(String value) {
            addCriterion("addressId like", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotLike(String value) {
            addCriterion("addressId not like", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidIn(List<String> values) {
            addCriterion("addressId in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotIn(List<String> values) {
            addCriterion("addressId not in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidBetween(String value1, String value2) {
            addCriterion("addressId between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotBetween(String value1, String value2) {
            addCriterion("addressId not between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressprovinceIsNull() {
            addCriterion("addressProvince is null");
            return (Criteria) this;
        }

        public Criteria andAddressprovinceIsNotNull() {
            addCriterion("addressProvince is not null");
            return (Criteria) this;
        }

        public Criteria andAddressprovinceEqualTo(String value) {
            addCriterion("addressProvince =", value, "addressprovince");
            return (Criteria) this;
        }

        public Criteria andAddressprovinceNotEqualTo(String value) {
            addCriterion("addressProvince <>", value, "addressprovince");
            return (Criteria) this;
        }

        public Criteria andAddressprovinceGreaterThan(String value) {
            addCriterion("addressProvince >", value, "addressprovince");
            return (Criteria) this;
        }

        public Criteria andAddressprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("addressProvince >=", value, "addressprovince");
            return (Criteria) this;
        }

        public Criteria andAddressprovinceLessThan(String value) {
            addCriterion("addressProvince <", value, "addressprovince");
            return (Criteria) this;
        }

        public Criteria andAddressprovinceLessThanOrEqualTo(String value) {
            addCriterion("addressProvince <=", value, "addressprovince");
            return (Criteria) this;
        }

        public Criteria andAddressprovinceLike(String value) {
            addCriterion("addressProvince like", value, "addressprovince");
            return (Criteria) this;
        }

        public Criteria andAddressprovinceNotLike(String value) {
            addCriterion("addressProvince not like", value, "addressprovince");
            return (Criteria) this;
        }

        public Criteria andAddressprovinceIn(List<String> values) {
            addCriterion("addressProvince in", values, "addressprovince");
            return (Criteria) this;
        }

        public Criteria andAddressprovinceNotIn(List<String> values) {
            addCriterion("addressProvince not in", values, "addressprovince");
            return (Criteria) this;
        }

        public Criteria andAddressprovinceBetween(String value1, String value2) {
            addCriterion("addressProvince between", value1, value2, "addressprovince");
            return (Criteria) this;
        }

        public Criteria andAddressprovinceNotBetween(String value1, String value2) {
            addCriterion("addressProvince not between", value1, value2, "addressprovince");
            return (Criteria) this;
        }

        public Criteria andAddresscityIsNull() {
            addCriterion("addressCity is null");
            return (Criteria) this;
        }

        public Criteria andAddresscityIsNotNull() {
            addCriterion("addressCity is not null");
            return (Criteria) this;
        }

        public Criteria andAddresscityEqualTo(String value) {
            addCriterion("addressCity =", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityNotEqualTo(String value) {
            addCriterion("addressCity <>", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityGreaterThan(String value) {
            addCriterion("addressCity >", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityGreaterThanOrEqualTo(String value) {
            addCriterion("addressCity >=", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityLessThan(String value) {
            addCriterion("addressCity <", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityLessThanOrEqualTo(String value) {
            addCriterion("addressCity <=", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityLike(String value) {
            addCriterion("addressCity like", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityNotLike(String value) {
            addCriterion("addressCity not like", value, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityIn(List<String> values) {
            addCriterion("addressCity in", values, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityNotIn(List<String> values) {
            addCriterion("addressCity not in", values, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityBetween(String value1, String value2) {
            addCriterion("addressCity between", value1, value2, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddresscityNotBetween(String value1, String value2) {
            addCriterion("addressCity not between", value1, value2, "addresscity");
            return (Criteria) this;
        }

        public Criteria andAddressareaIsNull() {
            addCriterion("addressArea is null");
            return (Criteria) this;
        }

        public Criteria andAddressareaIsNotNull() {
            addCriterion("addressArea is not null");
            return (Criteria) this;
        }

        public Criteria andAddressareaEqualTo(String value) {
            addCriterion("addressArea =", value, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaNotEqualTo(String value) {
            addCriterion("addressArea <>", value, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaGreaterThan(String value) {
            addCriterion("addressArea >", value, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaGreaterThanOrEqualTo(String value) {
            addCriterion("addressArea >=", value, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaLessThan(String value) {
            addCriterion("addressArea <", value, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaLessThanOrEqualTo(String value) {
            addCriterion("addressArea <=", value, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaLike(String value) {
            addCriterion("addressArea like", value, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaNotLike(String value) {
            addCriterion("addressArea not like", value, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaIn(List<String> values) {
            addCriterion("addressArea in", values, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaNotIn(List<String> values) {
            addCriterion("addressArea not in", values, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaBetween(String value1, String value2) {
            addCriterion("addressArea between", value1, value2, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressareaNotBetween(String value1, String value2) {
            addCriterion("addressArea not between", value1, value2, "addressarea");
            return (Criteria) this;
        }

        public Criteria andAddressdescriptionIsNull() {
            addCriterion("addressDescription is null");
            return (Criteria) this;
        }

        public Criteria andAddressdescriptionIsNotNull() {
            addCriterion("addressDescription is not null");
            return (Criteria) this;
        }

        public Criteria andAddressdescriptionEqualTo(String value) {
            addCriterion("addressDescription =", value, "addressdescription");
            return (Criteria) this;
        }

        public Criteria andAddressdescriptionNotEqualTo(String value) {
            addCriterion("addressDescription <>", value, "addressdescription");
            return (Criteria) this;
        }

        public Criteria andAddressdescriptionGreaterThan(String value) {
            addCriterion("addressDescription >", value, "addressdescription");
            return (Criteria) this;
        }

        public Criteria andAddressdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("addressDescription >=", value, "addressdescription");
            return (Criteria) this;
        }

        public Criteria andAddressdescriptionLessThan(String value) {
            addCriterion("addressDescription <", value, "addressdescription");
            return (Criteria) this;
        }

        public Criteria andAddressdescriptionLessThanOrEqualTo(String value) {
            addCriterion("addressDescription <=", value, "addressdescription");
            return (Criteria) this;
        }

        public Criteria andAddressdescriptionLike(String value) {
            addCriterion("addressDescription like", value, "addressdescription");
            return (Criteria) this;
        }

        public Criteria andAddressdescriptionNotLike(String value) {
            addCriterion("addressDescription not like", value, "addressdescription");
            return (Criteria) this;
        }

        public Criteria andAddressdescriptionIn(List<String> values) {
            addCriterion("addressDescription in", values, "addressdescription");
            return (Criteria) this;
        }

        public Criteria andAddressdescriptionNotIn(List<String> values) {
            addCriterion("addressDescription not in", values, "addressdescription");
            return (Criteria) this;
        }

        public Criteria andAddressdescriptionBetween(String value1, String value2) {
            addCriterion("addressDescription between", value1, value2, "addressdescription");
            return (Criteria) this;
        }

        public Criteria andAddressdescriptionNotBetween(String value1, String value2) {
            addCriterion("addressDescription not between", value1, value2, "addressdescription");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("userPhone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("userPhone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("userPhone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("userPhone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("userPhone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("userPhone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("userPhone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("userPhone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("userPhone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("userPhone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("userPhone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("userPhone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("userPhone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("userPhone not between", value1, value2, "userphone");
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