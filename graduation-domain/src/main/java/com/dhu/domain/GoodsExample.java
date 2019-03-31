package com.dhu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsId is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsId is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(String value) {
            addCriterion("goodsId =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(String value) {
            addCriterion("goodsId <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(String value) {
            addCriterion("goodsId >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(String value) {
            addCriterion("goodsId >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(String value) {
            addCriterion("goodsId <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(String value) {
            addCriterion("goodsId <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLike(String value) {
            addCriterion("goodsId like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotLike(String value) {
            addCriterion("goodsId not like", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<String> values) {
            addCriterion("goodsId in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<String> values) {
            addCriterion("goodsId not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(String value1, String value2) {
            addCriterion("goodsId between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(String value1, String value2) {
            addCriterion("goodsId not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andSaleridIsNull() {
            addCriterion("salerId is null");
            return (Criteria) this;
        }

        public Criteria andSaleridIsNotNull() {
            addCriterion("salerId is not null");
            return (Criteria) this;
        }

        public Criteria andSaleridEqualTo(String value) {
            addCriterion("salerId =", value, "salerid");
            return (Criteria) this;
        }

        public Criteria andSaleridNotEqualTo(String value) {
            addCriterion("salerId <>", value, "salerid");
            return (Criteria) this;
        }

        public Criteria andSaleridGreaterThan(String value) {
            addCriterion("salerId >", value, "salerid");
            return (Criteria) this;
        }

        public Criteria andSaleridGreaterThanOrEqualTo(String value) {
            addCriterion("salerId >=", value, "salerid");
            return (Criteria) this;
        }

        public Criteria andSaleridLessThan(String value) {
            addCriterion("salerId <", value, "salerid");
            return (Criteria) this;
        }

        public Criteria andSaleridLessThanOrEqualTo(String value) {
            addCriterion("salerId <=", value, "salerid");
            return (Criteria) this;
        }

        public Criteria andSaleridLike(String value) {
            addCriterion("salerId like", value, "salerid");
            return (Criteria) this;
        }

        public Criteria andSaleridNotLike(String value) {
            addCriterion("salerId not like", value, "salerid");
            return (Criteria) this;
        }

        public Criteria andSaleridIn(List<String> values) {
            addCriterion("salerId in", values, "salerid");
            return (Criteria) this;
        }

        public Criteria andSaleridNotIn(List<String> values) {
            addCriterion("salerId not in", values, "salerid");
            return (Criteria) this;
        }

        public Criteria andSaleridBetween(String value1, String value2) {
            addCriterion("salerId between", value1, value2, "salerid");
            return (Criteria) this;
        }

        public Criteria andSaleridNotBetween(String value1, String value2) {
            addCriterion("salerId not between", value1, value2, "salerid");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNull() {
            addCriterion("goodsPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNotNull() {
            addCriterion("goodsPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceEqualTo(Double value) {
            addCriterion("goodsPrice =", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotEqualTo(Double value) {
            addCriterion("goodsPrice <>", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThan(Double value) {
            addCriterion("goodsPrice >", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsPrice >=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThan(Double value) {
            addCriterion("goodsPrice <", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThanOrEqualTo(Double value) {
            addCriterion("goodsPrice <=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIn(List<Double> values) {
            addCriterion("goodsPrice in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotIn(List<Double> values) {
            addCriterion("goodsPrice not in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceBetween(Double value1, Double value2) {
            addCriterion("goodsPrice between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotBetween(Double value1, Double value2) {
            addCriterion("goodsPrice not between", value1, value2, "goodsprice");
            return (Criteria) this;
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

        public Criteria andProducedateIsNull() {
            addCriterion("produceDate is null");
            return (Criteria) this;
        }

        public Criteria andProducedateIsNotNull() {
            addCriterion("produceDate is not null");
            return (Criteria) this;
        }

        public Criteria andProducedateEqualTo(Date value) {
            addCriterionForJDBCDate("produceDate =", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("produceDate <>", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateGreaterThan(Date value) {
            addCriterionForJDBCDate("produceDate >", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("produceDate >=", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateLessThan(Date value) {
            addCriterionForJDBCDate("produceDate <", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("produceDate <=", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateIn(List<Date> values) {
            addCriterionForJDBCDate("produceDate in", values, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("produceDate not in", values, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("produceDate between", value1, value2, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("produceDate not between", value1, value2, "producedate");
            return (Criteria) this;
        }

        public Criteria andQualityperiodIsNull() {
            addCriterion("qualityPeriod is null");
            return (Criteria) this;
        }

        public Criteria andQualityperiodIsNotNull() {
            addCriterion("qualityPeriod is not null");
            return (Criteria) this;
        }

        public Criteria andQualityperiodEqualTo(Integer value) {
            addCriterion("qualityPeriod =", value, "qualityperiod");
            return (Criteria) this;
        }

        public Criteria andQualityperiodNotEqualTo(Integer value) {
            addCriterion("qualityPeriod <>", value, "qualityperiod");
            return (Criteria) this;
        }

        public Criteria andQualityperiodGreaterThan(Integer value) {
            addCriterion("qualityPeriod >", value, "qualityperiod");
            return (Criteria) this;
        }

        public Criteria andQualityperiodGreaterThanOrEqualTo(Integer value) {
            addCriterion("qualityPeriod >=", value, "qualityperiod");
            return (Criteria) this;
        }

        public Criteria andQualityperiodLessThan(Integer value) {
            addCriterion("qualityPeriod <", value, "qualityperiod");
            return (Criteria) this;
        }

        public Criteria andQualityperiodLessThanOrEqualTo(Integer value) {
            addCriterion("qualityPeriod <=", value, "qualityperiod");
            return (Criteria) this;
        }

        public Criteria andQualityperiodIn(List<Integer> values) {
            addCriterion("qualityPeriod in", values, "qualityperiod");
            return (Criteria) this;
        }

        public Criteria andQualityperiodNotIn(List<Integer> values) {
            addCriterion("qualityPeriod not in", values, "qualityperiod");
            return (Criteria) this;
        }

        public Criteria andQualityperiodBetween(Integer value1, Integer value2) {
            addCriterion("qualityPeriod between", value1, value2, "qualityperiod");
            return (Criteria) this;
        }

        public Criteria andQualityperiodNotBetween(Integer value1, Integer value2) {
            addCriterion("qualityPeriod not between", value1, value2, "qualityperiod");
            return (Criteria) this;
        }

        public Criteria andGoodsimageIsNull() {
            addCriterion("goodsImage is null");
            return (Criteria) this;
        }

        public Criteria andGoodsimageIsNotNull() {
            addCriterion("goodsImage is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsimageEqualTo(String value) {
            addCriterion("goodsImage =", value, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageNotEqualTo(String value) {
            addCriterion("goodsImage <>", value, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageGreaterThan(String value) {
            addCriterion("goodsImage >", value, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageGreaterThanOrEqualTo(String value) {
            addCriterion("goodsImage >=", value, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageLessThan(String value) {
            addCriterion("goodsImage <", value, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageLessThanOrEqualTo(String value) {
            addCriterion("goodsImage <=", value, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageLike(String value) {
            addCriterion("goodsImage like", value, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageNotLike(String value) {
            addCriterion("goodsImage not like", value, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageIn(List<String> values) {
            addCriterion("goodsImage in", values, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageNotIn(List<String> values) {
            addCriterion("goodsImage not in", values, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageBetween(String value1, String value2) {
            addCriterion("goodsImage between", value1, value2, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageNotBetween(String value1, String value2) {
            addCriterion("goodsImage not between", value1, value2, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsdescriptionIsNull() {
            addCriterion("goodsDescription is null");
            return (Criteria) this;
        }

        public Criteria andGoodsdescriptionIsNotNull() {
            addCriterion("goodsDescription is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsdescriptionEqualTo(String value) {
            addCriterion("goodsDescription =", value, "goodsdescription");
            return (Criteria) this;
        }

        public Criteria andGoodsdescriptionNotEqualTo(String value) {
            addCriterion("goodsDescription <>", value, "goodsdescription");
            return (Criteria) this;
        }

        public Criteria andGoodsdescriptionGreaterThan(String value) {
            addCriterion("goodsDescription >", value, "goodsdescription");
            return (Criteria) this;
        }

        public Criteria andGoodsdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("goodsDescription >=", value, "goodsdescription");
            return (Criteria) this;
        }

        public Criteria andGoodsdescriptionLessThan(String value) {
            addCriterion("goodsDescription <", value, "goodsdescription");
            return (Criteria) this;
        }

        public Criteria andGoodsdescriptionLessThanOrEqualTo(String value) {
            addCriterion("goodsDescription <=", value, "goodsdescription");
            return (Criteria) this;
        }

        public Criteria andGoodsdescriptionLike(String value) {
            addCriterion("goodsDescription like", value, "goodsdescription");
            return (Criteria) this;
        }

        public Criteria andGoodsdescriptionNotLike(String value) {
            addCriterion("goodsDescription not like", value, "goodsdescription");
            return (Criteria) this;
        }

        public Criteria andGoodsdescriptionIn(List<String> values) {
            addCriterion("goodsDescription in", values, "goodsdescription");
            return (Criteria) this;
        }

        public Criteria andGoodsdescriptionNotIn(List<String> values) {
            addCriterion("goodsDescription not in", values, "goodsdescription");
            return (Criteria) this;
        }

        public Criteria andGoodsdescriptionBetween(String value1, String value2) {
            addCriterion("goodsDescription between", value1, value2, "goodsdescription");
            return (Criteria) this;
        }

        public Criteria andGoodsdescriptionNotBetween(String value1, String value2) {
            addCriterion("goodsDescription not between", value1, value2, "goodsdescription");
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