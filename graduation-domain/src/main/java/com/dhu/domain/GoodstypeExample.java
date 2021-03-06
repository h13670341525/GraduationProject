package com.dhu.domain;

import java.util.ArrayList;
import java.util.List;

public class GoodstypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodstypeExample() {
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

        public Criteria andGoodstypeidIsNull() {
            addCriterion("goodstypeId is null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidIsNotNull() {
            addCriterion("goodstypeId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidEqualTo(String value) {
            addCriterion("goodstypeId =", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotEqualTo(String value) {
            addCriterion("goodstypeId <>", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidGreaterThan(String value) {
            addCriterion("goodstypeId >", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidGreaterThanOrEqualTo(String value) {
            addCriterion("goodstypeId >=", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidLessThan(String value) {
            addCriterion("goodstypeId <", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidLessThanOrEqualTo(String value) {
            addCriterion("goodstypeId <=", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidLike(String value) {
            addCriterion("goodstypeId like", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotLike(String value) {
            addCriterion("goodstypeId not like", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidIn(List<String> values) {
            addCriterion("goodstypeId in", values, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotIn(List<String> values) {
            addCriterion("goodstypeId not in", values, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidBetween(String value1, String value2) {
            addCriterion("goodstypeId between", value1, value2, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotBetween(String value1, String value2) {
            addCriterion("goodstypeId not between", value1, value2, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameIsNull() {
            addCriterion("goodstypeName is null");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameIsNotNull() {
            addCriterion("goodstypeName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameEqualTo(String value) {
            addCriterion("goodstypeName =", value, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameNotEqualTo(String value) {
            addCriterion("goodstypeName <>", value, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameGreaterThan(String value) {
            addCriterion("goodstypeName >", value, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameGreaterThanOrEqualTo(String value) {
            addCriterion("goodstypeName >=", value, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameLessThan(String value) {
            addCriterion("goodstypeName <", value, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameLessThanOrEqualTo(String value) {
            addCriterion("goodstypeName <=", value, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameLike(String value) {
            addCriterion("goodstypeName like", value, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameNotLike(String value) {
            addCriterion("goodstypeName not like", value, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameIn(List<String> values) {
            addCriterion("goodstypeName in", values, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameNotIn(List<String> values) {
            addCriterion("goodstypeName not in", values, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameBetween(String value1, String value2) {
            addCriterion("goodstypeName between", value1, value2, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameNotBetween(String value1, String value2) {
            addCriterion("goodstypeName not between", value1, value2, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodsbigtypeidIsNull() {
            addCriterion("goodsbigtypeId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsbigtypeidIsNotNull() {
            addCriterion("goodsbigtypeId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsbigtypeidEqualTo(String value) {
            addCriterion("goodsbigtypeId =", value, "goodsbigtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodsbigtypeidNotEqualTo(String value) {
            addCriterion("goodsbigtypeId <>", value, "goodsbigtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodsbigtypeidGreaterThan(String value) {
            addCriterion("goodsbigtypeId >", value, "goodsbigtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodsbigtypeidGreaterThanOrEqualTo(String value) {
            addCriterion("goodsbigtypeId >=", value, "goodsbigtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodsbigtypeidLessThan(String value) {
            addCriterion("goodsbigtypeId <", value, "goodsbigtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodsbigtypeidLessThanOrEqualTo(String value) {
            addCriterion("goodsbigtypeId <=", value, "goodsbigtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodsbigtypeidLike(String value) {
            addCriterion("goodsbigtypeId like", value, "goodsbigtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodsbigtypeidNotLike(String value) {
            addCriterion("goodsbigtypeId not like", value, "goodsbigtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodsbigtypeidIn(List<String> values) {
            addCriterion("goodsbigtypeId in", values, "goodsbigtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodsbigtypeidNotIn(List<String> values) {
            addCriterion("goodsbigtypeId not in", values, "goodsbigtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodsbigtypeidBetween(String value1, String value2) {
            addCriterion("goodsbigtypeId between", value1, value2, "goodsbigtypeid");
            return (Criteria) this;
        }

        public Criteria andGoodsbigtypeidNotBetween(String value1, String value2) {
            addCriterion("goodsbigtypeId not between", value1, value2, "goodsbigtypeid");
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