package com.bos.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Long value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Long value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Long value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Long value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Long value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Long value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Long> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Long> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Long value1, Long value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Long value1, Long value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCnoIsNull() {
            addCriterion("cno is null");
            return (Criteria) this;
        }

        public Criteria andCnoIsNotNull() {
            addCriterion("cno is not null");
            return (Criteria) this;
        }

        public Criteria andCnoEqualTo(String value) {
            addCriterion("cno =", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotEqualTo(String value) {
            addCriterion("cno <>", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThan(String value) {
            addCriterion("cno >", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThanOrEqualTo(String value) {
            addCriterion("cno >=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThan(String value) {
            addCriterion("cno <", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThanOrEqualTo(String value) {
            addCriterion("cno <=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLike(String value) {
            addCriterion("cno like", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotLike(String value) {
            addCriterion("cno not like", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoIn(List<String> values) {
            addCriterion("cno in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotIn(List<String> values) {
            addCriterion("cno not in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoBetween(String value1, String value2) {
            addCriterion("cno between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotBetween(String value1, String value2) {
            addCriterion("cno not between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNull() {
            addCriterion("ctype is null");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNotNull() {
            addCriterion("ctype is not null");
            return (Criteria) this;
        }

        public Criteria andCtypeEqualTo(String value) {
            addCriterion("ctype =", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotEqualTo(String value) {
            addCriterion("ctype <>", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThan(String value) {
            addCriterion("ctype >", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ctype >=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThan(String value) {
            addCriterion("ctype <", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThanOrEqualTo(String value) {
            addCriterion("ctype <=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLike(String value) {
            addCriterion("ctype like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotLike(String value) {
            addCriterion("ctype not like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeIn(List<String> values) {
            addCriterion("ctype in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotIn(List<String> values) {
            addCriterion("ctype not in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeBetween(String value1, String value2) {
            addCriterion("ctype between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotBetween(String value1, String value2) {
            addCriterion("ctype not between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCownerIsNull() {
            addCriterion("cowner is null");
            return (Criteria) this;
        }

        public Criteria andCownerIsNotNull() {
            addCriterion("cowner is not null");
            return (Criteria) this;
        }

        public Criteria andCownerEqualTo(String value) {
            addCriterion("cowner =", value, "cowner");
            return (Criteria) this;
        }

        public Criteria andCownerNotEqualTo(String value) {
            addCriterion("cowner <>", value, "cowner");
            return (Criteria) this;
        }

        public Criteria andCownerGreaterThan(String value) {
            addCriterion("cowner >", value, "cowner");
            return (Criteria) this;
        }

        public Criteria andCownerGreaterThanOrEqualTo(String value) {
            addCriterion("cowner >=", value, "cowner");
            return (Criteria) this;
        }

        public Criteria andCownerLessThan(String value) {
            addCriterion("cowner <", value, "cowner");
            return (Criteria) this;
        }

        public Criteria andCownerLessThanOrEqualTo(String value) {
            addCriterion("cowner <=", value, "cowner");
            return (Criteria) this;
        }

        public Criteria andCownerLike(String value) {
            addCriterion("cowner like", value, "cowner");
            return (Criteria) this;
        }

        public Criteria andCownerNotLike(String value) {
            addCriterion("cowner not like", value, "cowner");
            return (Criteria) this;
        }

        public Criteria andCownerIn(List<String> values) {
            addCriterion("cowner in", values, "cowner");
            return (Criteria) this;
        }

        public Criteria andCownerNotIn(List<String> values) {
            addCriterion("cowner not in", values, "cowner");
            return (Criteria) this;
        }

        public Criteria andCownerBetween(String value1, String value2) {
            addCriterion("cowner between", value1, value2, "cowner");
            return (Criteria) this;
        }

        public Criteria andCownerNotBetween(String value1, String value2) {
            addCriterion("cowner not between", value1, value2, "cowner");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNull() {
            addCriterion("caddress is null");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNotNull() {
            addCriterion("caddress is not null");
            return (Criteria) this;
        }

        public Criteria andCaddressEqualTo(String value) {
            addCriterion("caddress =", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotEqualTo(String value) {
            addCriterion("caddress <>", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThan(String value) {
            addCriterion("caddress >", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThanOrEqualTo(String value) {
            addCriterion("caddress >=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThan(String value) {
            addCriterion("caddress <", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThanOrEqualTo(String value) {
            addCriterion("caddress <=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLike(String value) {
            addCriterion("caddress like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotLike(String value) {
            addCriterion("caddress not like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressIn(List<String> values) {
            addCriterion("caddress in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotIn(List<String> values) {
            addCriterion("caddress not in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressBetween(String value1, String value2) {
            addCriterion("caddress between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotBetween(String value1, String value2) {
            addCriterion("caddress not between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCuseCharacterIsNull() {
            addCriterion("cuse_character is null");
            return (Criteria) this;
        }

        public Criteria andCuseCharacterIsNotNull() {
            addCriterion("cuse_character is not null");
            return (Criteria) this;
        }

        public Criteria andCuseCharacterEqualTo(String value) {
            addCriterion("cuse_character =", value, "cuseCharacter");
            return (Criteria) this;
        }

        public Criteria andCuseCharacterNotEqualTo(String value) {
            addCriterion("cuse_character <>", value, "cuseCharacter");
            return (Criteria) this;
        }

        public Criteria andCuseCharacterGreaterThan(String value) {
            addCriterion("cuse_character >", value, "cuseCharacter");
            return (Criteria) this;
        }

        public Criteria andCuseCharacterGreaterThanOrEqualTo(String value) {
            addCriterion("cuse_character >=", value, "cuseCharacter");
            return (Criteria) this;
        }

        public Criteria andCuseCharacterLessThan(String value) {
            addCriterion("cuse_character <", value, "cuseCharacter");
            return (Criteria) this;
        }

        public Criteria andCuseCharacterLessThanOrEqualTo(String value) {
            addCriterion("cuse_character <=", value, "cuseCharacter");
            return (Criteria) this;
        }

        public Criteria andCuseCharacterLike(String value) {
            addCriterion("cuse_character like", value, "cuseCharacter");
            return (Criteria) this;
        }

        public Criteria andCuseCharacterNotLike(String value) {
            addCriterion("cuse_character not like", value, "cuseCharacter");
            return (Criteria) this;
        }

        public Criteria andCuseCharacterIn(List<String> values) {
            addCriterion("cuse_character in", values, "cuseCharacter");
            return (Criteria) this;
        }

        public Criteria andCuseCharacterNotIn(List<String> values) {
            addCriterion("cuse_character not in", values, "cuseCharacter");
            return (Criteria) this;
        }

        public Criteria andCuseCharacterBetween(String value1, String value2) {
            addCriterion("cuse_character between", value1, value2, "cuseCharacter");
            return (Criteria) this;
        }

        public Criteria andCuseCharacterNotBetween(String value1, String value2) {
            addCriterion("cuse_character not between", value1, value2, "cuseCharacter");
            return (Criteria) this;
        }

        public Criteria andCmodelIsNull() {
            addCriterion("cmodel is null");
            return (Criteria) this;
        }

        public Criteria andCmodelIsNotNull() {
            addCriterion("cmodel is not null");
            return (Criteria) this;
        }

        public Criteria andCmodelEqualTo(String value) {
            addCriterion("cmodel =", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelNotEqualTo(String value) {
            addCriterion("cmodel <>", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelGreaterThan(String value) {
            addCriterion("cmodel >", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelGreaterThanOrEqualTo(String value) {
            addCriterion("cmodel >=", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelLessThan(String value) {
            addCriterion("cmodel <", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelLessThanOrEqualTo(String value) {
            addCriterion("cmodel <=", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelLike(String value) {
            addCriterion("cmodel like", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelNotLike(String value) {
            addCriterion("cmodel not like", value, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelIn(List<String> values) {
            addCriterion("cmodel in", values, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelNotIn(List<String> values) {
            addCriterion("cmodel not in", values, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelBetween(String value1, String value2) {
            addCriterion("cmodel between", value1, value2, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCmodelNotBetween(String value1, String value2) {
            addCriterion("cmodel not between", value1, value2, "cmodel");
            return (Criteria) this;
        }

        public Criteria andCvinIsNull() {
            addCriterion("cvin is null");
            return (Criteria) this;
        }

        public Criteria andCvinIsNotNull() {
            addCriterion("cvin is not null");
            return (Criteria) this;
        }

        public Criteria andCvinEqualTo(String value) {
            addCriterion("cvin =", value, "cvin");
            return (Criteria) this;
        }

        public Criteria andCvinNotEqualTo(String value) {
            addCriterion("cvin <>", value, "cvin");
            return (Criteria) this;
        }

        public Criteria andCvinGreaterThan(String value) {
            addCriterion("cvin >", value, "cvin");
            return (Criteria) this;
        }

        public Criteria andCvinGreaterThanOrEqualTo(String value) {
            addCriterion("cvin >=", value, "cvin");
            return (Criteria) this;
        }

        public Criteria andCvinLessThan(String value) {
            addCriterion("cvin <", value, "cvin");
            return (Criteria) this;
        }

        public Criteria andCvinLessThanOrEqualTo(String value) {
            addCriterion("cvin <=", value, "cvin");
            return (Criteria) this;
        }

        public Criteria andCvinLike(String value) {
            addCriterion("cvin like", value, "cvin");
            return (Criteria) this;
        }

        public Criteria andCvinNotLike(String value) {
            addCriterion("cvin not like", value, "cvin");
            return (Criteria) this;
        }

        public Criteria andCvinIn(List<String> values) {
            addCriterion("cvin in", values, "cvin");
            return (Criteria) this;
        }

        public Criteria andCvinNotIn(List<String> values) {
            addCriterion("cvin not in", values, "cvin");
            return (Criteria) this;
        }

        public Criteria andCvinBetween(String value1, String value2) {
            addCriterion("cvin between", value1, value2, "cvin");
            return (Criteria) this;
        }

        public Criteria andCvinNotBetween(String value1, String value2) {
            addCriterion("cvin not between", value1, value2, "cvin");
            return (Criteria) this;
        }

        public Criteria andCengineNoIsNull() {
            addCriterion("cengine_no is null");
            return (Criteria) this;
        }

        public Criteria andCengineNoIsNotNull() {
            addCriterion("cengine_no is not null");
            return (Criteria) this;
        }

        public Criteria andCengineNoEqualTo(String value) {
            addCriterion("cengine_no =", value, "cengineNo");
            return (Criteria) this;
        }

        public Criteria andCengineNoNotEqualTo(String value) {
            addCriterion("cengine_no <>", value, "cengineNo");
            return (Criteria) this;
        }

        public Criteria andCengineNoGreaterThan(String value) {
            addCriterion("cengine_no >", value, "cengineNo");
            return (Criteria) this;
        }

        public Criteria andCengineNoGreaterThanOrEqualTo(String value) {
            addCriterion("cengine_no >=", value, "cengineNo");
            return (Criteria) this;
        }

        public Criteria andCengineNoLessThan(String value) {
            addCriterion("cengine_no <", value, "cengineNo");
            return (Criteria) this;
        }

        public Criteria andCengineNoLessThanOrEqualTo(String value) {
            addCriterion("cengine_no <=", value, "cengineNo");
            return (Criteria) this;
        }

        public Criteria andCengineNoLike(String value) {
            addCriterion("cengine_no like", value, "cengineNo");
            return (Criteria) this;
        }

        public Criteria andCengineNoNotLike(String value) {
            addCriterion("cengine_no not like", value, "cengineNo");
            return (Criteria) this;
        }

        public Criteria andCengineNoIn(List<String> values) {
            addCriterion("cengine_no in", values, "cengineNo");
            return (Criteria) this;
        }

        public Criteria andCengineNoNotIn(List<String> values) {
            addCriterion("cengine_no not in", values, "cengineNo");
            return (Criteria) this;
        }

        public Criteria andCengineNoBetween(String value1, String value2) {
            addCriterion("cengine_no between", value1, value2, "cengineNo");
            return (Criteria) this;
        }

        public Criteria andCengineNoNotBetween(String value1, String value2) {
            addCriterion("cengine_no not between", value1, value2, "cengineNo");
            return (Criteria) this;
        }

        public Criteria andCregisterDateIsNull() {
            addCriterion("cregister_date is null");
            return (Criteria) this;
        }

        public Criteria andCregisterDateIsNotNull() {
            addCriterion("cregister_date is not null");
            return (Criteria) this;
        }

        public Criteria andCregisterDateEqualTo(Date value) {
            addCriterion("cregister_date =", value, "cregisterDate");
            return (Criteria) this;
        }

        public Criteria andCregisterDateNotEqualTo(Date value) {
            addCriterion("cregister_date <>", value, "cregisterDate");
            return (Criteria) this;
        }

        public Criteria andCregisterDateGreaterThan(Date value) {
            addCriterion("cregister_date >", value, "cregisterDate");
            return (Criteria) this;
        }

        public Criteria andCregisterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cregister_date >=", value, "cregisterDate");
            return (Criteria) this;
        }

        public Criteria andCregisterDateLessThan(Date value) {
            addCriterion("cregister_date <", value, "cregisterDate");
            return (Criteria) this;
        }

        public Criteria andCregisterDateLessThanOrEqualTo(Date value) {
            addCriterion("cregister_date <=", value, "cregisterDate");
            return (Criteria) this;
        }

        public Criteria andCregisterDateIn(List<Date> values) {
            addCriterion("cregister_date in", values, "cregisterDate");
            return (Criteria) this;
        }

        public Criteria andCregisterDateNotIn(List<Date> values) {
            addCriterion("cregister_date not in", values, "cregisterDate");
            return (Criteria) this;
        }

        public Criteria andCregisterDateBetween(Date value1, Date value2) {
            addCriterion("cregister_date between", value1, value2, "cregisterDate");
            return (Criteria) this;
        }

        public Criteria andCregisterDateNotBetween(Date value1, Date value2) {
            addCriterion("cregister_date not between", value1, value2, "cregisterDate");
            return (Criteria) this;
        }

        public Criteria andCissusDateIsNull() {
            addCriterion("cissus_date is null");
            return (Criteria) this;
        }

        public Criteria andCissusDateIsNotNull() {
            addCriterion("cissus_date is not null");
            return (Criteria) this;
        }

        public Criteria andCissusDateEqualTo(Date value) {
            addCriterion("cissus_date =", value, "cissusDate");
            return (Criteria) this;
        }

        public Criteria andCissusDateNotEqualTo(Date value) {
            addCriterion("cissus_date <>", value, "cissusDate");
            return (Criteria) this;
        }

        public Criteria andCissusDateGreaterThan(Date value) {
            addCriterion("cissus_date >", value, "cissusDate");
            return (Criteria) this;
        }

        public Criteria andCissusDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cissus_date >=", value, "cissusDate");
            return (Criteria) this;
        }

        public Criteria andCissusDateLessThan(Date value) {
            addCriterion("cissus_date <", value, "cissusDate");
            return (Criteria) this;
        }

        public Criteria andCissusDateLessThanOrEqualTo(Date value) {
            addCriterion("cissus_date <=", value, "cissusDate");
            return (Criteria) this;
        }

        public Criteria andCissusDateIn(List<Date> values) {
            addCriterion("cissus_date in", values, "cissusDate");
            return (Criteria) this;
        }

        public Criteria andCissusDateNotIn(List<Date> values) {
            addCriterion("cissus_date not in", values, "cissusDate");
            return (Criteria) this;
        }

        public Criteria andCissusDateBetween(Date value1, Date value2) {
            addCriterion("cissus_date between", value1, value2, "cissusDate");
            return (Criteria) this;
        }

        public Criteria andCissusDateNotBetween(Date value1, Date value2) {
            addCriterion("cissus_date not between", value1, value2, "cissusDate");
            return (Criteria) this;
        }

        public Criteria andCnumIsNull() {
            addCriterion("cnum is null");
            return (Criteria) this;
        }

        public Criteria andCnumIsNotNull() {
            addCriterion("cnum is not null");
            return (Criteria) this;
        }

        public Criteria andCnumEqualTo(String value) {
            addCriterion("cnum =", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumNotEqualTo(String value) {
            addCriterion("cnum <>", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumGreaterThan(String value) {
            addCriterion("cnum >", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumGreaterThanOrEqualTo(String value) {
            addCriterion("cnum >=", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumLessThan(String value) {
            addCriterion("cnum <", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumLessThanOrEqualTo(String value) {
            addCriterion("cnum <=", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumLike(String value) {
            addCriterion("cnum like", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumNotLike(String value) {
            addCriterion("cnum not like", value, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumIn(List<String> values) {
            addCriterion("cnum in", values, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumNotIn(List<String> values) {
            addCriterion("cnum not in", values, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumBetween(String value1, String value2) {
            addCriterion("cnum between", value1, value2, "cnum");
            return (Criteria) this;
        }

        public Criteria andCnumNotBetween(String value1, String value2) {
            addCriterion("cnum not between", value1, value2, "cnum");
            return (Criteria) this;
        }

        public Criteria andCweightIsNull() {
            addCriterion("cweight is null");
            return (Criteria) this;
        }

        public Criteria andCweightIsNotNull() {
            addCriterion("cweight is not null");
            return (Criteria) this;
        }

        public Criteria andCweightEqualTo(Integer value) {
            addCriterion("cweight =", value, "cweight");
            return (Criteria) this;
        }

        public Criteria andCweightNotEqualTo(Integer value) {
            addCriterion("cweight <>", value, "cweight");
            return (Criteria) this;
        }

        public Criteria andCweightGreaterThan(Integer value) {
            addCriterion("cweight >", value, "cweight");
            return (Criteria) this;
        }

        public Criteria andCweightGreaterThanOrEqualTo(Integer value) {
            addCriterion("cweight >=", value, "cweight");
            return (Criteria) this;
        }

        public Criteria andCweightLessThan(Integer value) {
            addCriterion("cweight <", value, "cweight");
            return (Criteria) this;
        }

        public Criteria andCweightLessThanOrEqualTo(Integer value) {
            addCriterion("cweight <=", value, "cweight");
            return (Criteria) this;
        }

        public Criteria andCweightIn(List<Integer> values) {
            addCriterion("cweight in", values, "cweight");
            return (Criteria) this;
        }

        public Criteria andCweightNotIn(List<Integer> values) {
            addCriterion("cweight not in", values, "cweight");
            return (Criteria) this;
        }

        public Criteria andCweightBetween(Integer value1, Integer value2) {
            addCriterion("cweight between", value1, value2, "cweight");
            return (Criteria) this;
        }

        public Criteria andCweightNotBetween(Integer value1, Integer value2) {
            addCriterion("cweight not between", value1, value2, "cweight");
            return (Criteria) this;
        }

        public Criteria andCpicIsNull() {
            addCriterion("cpic is null");
            return (Criteria) this;
        }

        public Criteria andCpicIsNotNull() {
            addCriterion("cpic is not null");
            return (Criteria) this;
        }

        public Criteria andCpicEqualTo(String value) {
            addCriterion("cpic =", value, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicNotEqualTo(String value) {
            addCriterion("cpic <>", value, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicGreaterThan(String value) {
            addCriterion("cpic >", value, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicGreaterThanOrEqualTo(String value) {
            addCriterion("cpic >=", value, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicLessThan(String value) {
            addCriterion("cpic <", value, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicLessThanOrEqualTo(String value) {
            addCriterion("cpic <=", value, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicLike(String value) {
            addCriterion("cpic like", value, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicNotLike(String value) {
            addCriterion("cpic not like", value, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicIn(List<String> values) {
            addCriterion("cpic in", values, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicNotIn(List<String> values) {
            addCriterion("cpic not in", values, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicBetween(String value1, String value2) {
            addCriterion("cpic between", value1, value2, "cpic");
            return (Criteria) this;
        }

        public Criteria andCpicNotBetween(String value1, String value2) {
            addCriterion("cpic not between", value1, value2, "cpic");
            return (Criteria) this;
        }

        public Criteria andCuserIsNull() {
            addCriterion("cuser is null");
            return (Criteria) this;
        }

        public Criteria andCuserIsNotNull() {
            addCriterion("cuser is not null");
            return (Criteria) this;
        }

        public Criteria andCuserEqualTo(Long value) {
            addCriterion("cuser =", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserNotEqualTo(Long value) {
            addCriterion("cuser <>", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserGreaterThan(Long value) {
            addCriterion("cuser >", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserGreaterThanOrEqualTo(Long value) {
            addCriterion("cuser >=", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserLessThan(Long value) {
            addCriterion("cuser <", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserLessThanOrEqualTo(Long value) {
            addCriterion("cuser <=", value, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserIn(List<Long> values) {
            addCriterion("cuser in", values, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserNotIn(List<Long> values) {
            addCriterion("cuser not in", values, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserBetween(Long value1, Long value2) {
            addCriterion("cuser between", value1, value2, "cuser");
            return (Criteria) this;
        }

        public Criteria andCuserNotBetween(Long value1, Long value2) {
            addCriterion("cuser not between", value1, value2, "cuser");
            return (Criteria) this;
        }

        public Criteria andCstatusIsNull() {
            addCriterion("cstatus is null");
            return (Criteria) this;
        }

        public Criteria andCstatusIsNotNull() {
            addCriterion("cstatus is not null");
            return (Criteria) this;
        }

        public Criteria andCstatusEqualTo(Integer value) {
            addCriterion("cstatus =", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotEqualTo(Integer value) {
            addCriterion("cstatus <>", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThan(Integer value) {
            addCriterion("cstatus >", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cstatus >=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThan(Integer value) {
            addCriterion("cstatus <", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThanOrEqualTo(Integer value) {
            addCriterion("cstatus <=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusIn(List<Integer> values) {
            addCriterion("cstatus in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotIn(List<Integer> values) {
            addCriterion("cstatus not in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusBetween(Integer value1, Integer value2) {
            addCriterion("cstatus between", value1, value2, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cstatus not between", value1, value2, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCenableIsNull() {
            addCriterion("cenable is null");
            return (Criteria) this;
        }

        public Criteria andCenableIsNotNull() {
            addCriterion("cenable is not null");
            return (Criteria) this;
        }

        public Criteria andCenableEqualTo(Integer value) {
            addCriterion("cenable =", value, "cenable");
            return (Criteria) this;
        }

        public Criteria andCenableNotEqualTo(Integer value) {
            addCriterion("cenable <>", value, "cenable");
            return (Criteria) this;
        }

        public Criteria andCenableGreaterThan(Integer value) {
            addCriterion("cenable >", value, "cenable");
            return (Criteria) this;
        }

        public Criteria andCenableGreaterThanOrEqualTo(Integer value) {
            addCriterion("cenable >=", value, "cenable");
            return (Criteria) this;
        }

        public Criteria andCenableLessThan(Integer value) {
            addCriterion("cenable <", value, "cenable");
            return (Criteria) this;
        }

        public Criteria andCenableLessThanOrEqualTo(Integer value) {
            addCriterion("cenable <=", value, "cenable");
            return (Criteria) this;
        }

        public Criteria andCenableIn(List<Integer> values) {
            addCriterion("cenable in", values, "cenable");
            return (Criteria) this;
        }

        public Criteria andCenableNotIn(List<Integer> values) {
            addCriterion("cenable not in", values, "cenable");
            return (Criteria) this;
        }

        public Criteria andCenableBetween(Integer value1, Integer value2) {
            addCriterion("cenable between", value1, value2, "cenable");
            return (Criteria) this;
        }

        public Criteria andCenableNotBetween(Integer value1, Integer value2) {
            addCriterion("cenable not between", value1, value2, "cenable");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
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