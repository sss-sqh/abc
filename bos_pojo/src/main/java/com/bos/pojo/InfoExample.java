package com.bos.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfoExample() {
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

        public Criteria andIidIsNull() {
            addCriterion("iid is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("iid is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(Long value) {
            addCriterion("iid =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(Long value) {
            addCriterion("iid <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(Long value) {
            addCriterion("iid >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(Long value) {
            addCriterion("iid >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(Long value) {
            addCriterion("iid <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(Long value) {
            addCriterion("iid <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<Long> values) {
            addCriterion("iid in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<Long> values) {
            addCriterion("iid not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(Long value1, Long value2) {
            addCriterion("iid between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(Long value1, Long value2) {
            addCriterion("iid not between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andInameIsNull() {
            addCriterion("iname is null");
            return (Criteria) this;
        }

        public Criteria andInameIsNotNull() {
            addCriterion("iname is not null");
            return (Criteria) this;
        }

        public Criteria andInameEqualTo(String value) {
            addCriterion("iname =", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotEqualTo(String value) {
            addCriterion("iname <>", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameGreaterThan(String value) {
            addCriterion("iname >", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameGreaterThanOrEqualTo(String value) {
            addCriterion("iname >=", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLessThan(String value) {
            addCriterion("iname <", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLessThanOrEqualTo(String value) {
            addCriterion("iname <=", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLike(String value) {
            addCriterion("iname like", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotLike(String value) {
            addCriterion("iname not like", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameIn(List<String> values) {
            addCriterion("iname in", values, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotIn(List<String> values) {
            addCriterion("iname not in", values, "iname");
            return (Criteria) this;
        }

        public Criteria andInameBetween(String value1, String value2) {
            addCriterion("iname between", value1, value2, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotBetween(String value1, String value2) {
            addCriterion("iname not between", value1, value2, "iname");
            return (Criteria) this;
        }

        public Criteria andIweightIsNull() {
            addCriterion("iweight is null");
            return (Criteria) this;
        }

        public Criteria andIweightIsNotNull() {
            addCriterion("iweight is not null");
            return (Criteria) this;
        }

        public Criteria andIweightEqualTo(Long value) {
            addCriterion("iweight =", value, "iweight");
            return (Criteria) this;
        }

        public Criteria andIweightNotEqualTo(Long value) {
            addCriterion("iweight <>", value, "iweight");
            return (Criteria) this;
        }

        public Criteria andIweightGreaterThan(Long value) {
            addCriterion("iweight >", value, "iweight");
            return (Criteria) this;
        }

        public Criteria andIweightGreaterThanOrEqualTo(Long value) {
            addCriterion("iweight >=", value, "iweight");
            return (Criteria) this;
        }

        public Criteria andIweightLessThan(Long value) {
            addCriterion("iweight <", value, "iweight");
            return (Criteria) this;
        }

        public Criteria andIweightLessThanOrEqualTo(Long value) {
            addCriterion("iweight <=", value, "iweight");
            return (Criteria) this;
        }

        public Criteria andIweightIn(List<Long> values) {
            addCriterion("iweight in", values, "iweight");
            return (Criteria) this;
        }

        public Criteria andIweightNotIn(List<Long> values) {
            addCriterion("iweight not in", values, "iweight");
            return (Criteria) this;
        }

        public Criteria andIweightBetween(Long value1, Long value2) {
            addCriterion("iweight between", value1, value2, "iweight");
            return (Criteria) this;
        }

        public Criteria andIweightNotBetween(Long value1, Long value2) {
            addCriterion("iweight not between", value1, value2, "iweight");
            return (Criteria) this;
        }

        public Criteria andIvolumeIsNull() {
            addCriterion("ivolume is null");
            return (Criteria) this;
        }

        public Criteria andIvolumeIsNotNull() {
            addCriterion("ivolume is not null");
            return (Criteria) this;
        }

        public Criteria andIvolumeEqualTo(Long value) {
            addCriterion("ivolume =", value, "ivolume");
            return (Criteria) this;
        }

        public Criteria andIvolumeNotEqualTo(Long value) {
            addCriterion("ivolume <>", value, "ivolume");
            return (Criteria) this;
        }

        public Criteria andIvolumeGreaterThan(Long value) {
            addCriterion("ivolume >", value, "ivolume");
            return (Criteria) this;
        }

        public Criteria andIvolumeGreaterThanOrEqualTo(Long value) {
            addCriterion("ivolume >=", value, "ivolume");
            return (Criteria) this;
        }

        public Criteria andIvolumeLessThan(Long value) {
            addCriterion("ivolume <", value, "ivolume");
            return (Criteria) this;
        }

        public Criteria andIvolumeLessThanOrEqualTo(Long value) {
            addCriterion("ivolume <=", value, "ivolume");
            return (Criteria) this;
        }

        public Criteria andIvolumeIn(List<Long> values) {
            addCriterion("ivolume in", values, "ivolume");
            return (Criteria) this;
        }

        public Criteria andIvolumeNotIn(List<Long> values) {
            addCriterion("ivolume not in", values, "ivolume");
            return (Criteria) this;
        }

        public Criteria andIvolumeBetween(Long value1, Long value2) {
            addCriterion("ivolume between", value1, value2, "ivolume");
            return (Criteria) this;
        }

        public Criteria andIvolumeNotBetween(Long value1, Long value2) {
            addCriterion("ivolume not between", value1, value2, "ivolume");
            return (Criteria) this;
        }

        public Criteria andIuserIdIsNull() {
            addCriterion("iuser_id is null");
            return (Criteria) this;
        }

        public Criteria andIuserIdIsNotNull() {
            addCriterion("iuser_id is not null");
            return (Criteria) this;
        }

        public Criteria andIuserIdEqualTo(Long value) {
            addCriterion("iuser_id =", value, "iuserId");
            return (Criteria) this;
        }

        public Criteria andIuserIdNotEqualTo(Long value) {
            addCriterion("iuser_id <>", value, "iuserId");
            return (Criteria) this;
        }

        public Criteria andIuserIdGreaterThan(Long value) {
            addCriterion("iuser_id >", value, "iuserId");
            return (Criteria) this;
        }

        public Criteria andIuserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("iuser_id >=", value, "iuserId");
            return (Criteria) this;
        }

        public Criteria andIuserIdLessThan(Long value) {
            addCriterion("iuser_id <", value, "iuserId");
            return (Criteria) this;
        }

        public Criteria andIuserIdLessThanOrEqualTo(Long value) {
            addCriterion("iuser_id <=", value, "iuserId");
            return (Criteria) this;
        }

        public Criteria andIuserIdIn(List<Long> values) {
            addCriterion("iuser_id in", values, "iuserId");
            return (Criteria) this;
        }

        public Criteria andIuserIdNotIn(List<Long> values) {
            addCriterion("iuser_id not in", values, "iuserId");
            return (Criteria) this;
        }

        public Criteria andIuserIdBetween(Long value1, Long value2) {
            addCriterion("iuser_id between", value1, value2, "iuserId");
            return (Criteria) this;
        }

        public Criteria andIuserIdNotBetween(Long value1, Long value2) {
            addCriterion("iuser_id not between", value1, value2, "iuserId");
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

        public Criteria andTypeGood1IsNull() {
            addCriterion("type_good1 is null");
            return (Criteria) this;
        }

        public Criteria andTypeGood1IsNotNull() {
            addCriterion("type_good1 is not null");
            return (Criteria) this;
        }

        public Criteria andTypeGood1EqualTo(Long value) {
            addCriterion("type_good1 =", value, "typeGood1");
            return (Criteria) this;
        }

        public Criteria andTypeGood1NotEqualTo(Long value) {
            addCriterion("type_good1 <>", value, "typeGood1");
            return (Criteria) this;
        }

        public Criteria andTypeGood1GreaterThan(Long value) {
            addCriterion("type_good1 >", value, "typeGood1");
            return (Criteria) this;
        }

        public Criteria andTypeGood1GreaterThanOrEqualTo(Long value) {
            addCriterion("type_good1 >=", value, "typeGood1");
            return (Criteria) this;
        }

        public Criteria andTypeGood1LessThan(Long value) {
            addCriterion("type_good1 <", value, "typeGood1");
            return (Criteria) this;
        }

        public Criteria andTypeGood1LessThanOrEqualTo(Long value) {
            addCriterion("type_good1 <=", value, "typeGood1");
            return (Criteria) this;
        }

        public Criteria andTypeGood1In(List<Long> values) {
            addCriterion("type_good1 in", values, "typeGood1");
            return (Criteria) this;
        }

        public Criteria andTypeGood1NotIn(List<Long> values) {
            addCriterion("type_good1 not in", values, "typeGood1");
            return (Criteria) this;
        }

        public Criteria andTypeGood1Between(Long value1, Long value2) {
            addCriterion("type_good1 between", value1, value2, "typeGood1");
            return (Criteria) this;
        }

        public Criteria andTypeGood1NotBetween(Long value1, Long value2) {
            addCriterion("type_good1 not between", value1, value2, "typeGood1");
            return (Criteria) this;
        }

        public Criteria andIdriverIsNull() {
            addCriterion("idriver is null");
            return (Criteria) this;
        }

        public Criteria andIdriverIsNotNull() {
            addCriterion("idriver is not null");
            return (Criteria) this;
        }

        public Criteria andIdriverEqualTo(Long value) {
            addCriterion("idriver =", value, "idriver");
            return (Criteria) this;
        }

        public Criteria andIdriverNotEqualTo(Long value) {
            addCriterion("idriver <>", value, "idriver");
            return (Criteria) this;
        }

        public Criteria andIdriverGreaterThan(Long value) {
            addCriterion("idriver >", value, "idriver");
            return (Criteria) this;
        }

        public Criteria andIdriverGreaterThanOrEqualTo(Long value) {
            addCriterion("idriver >=", value, "idriver");
            return (Criteria) this;
        }

        public Criteria andIdriverLessThan(Long value) {
            addCriterion("idriver <", value, "idriver");
            return (Criteria) this;
        }

        public Criteria andIdriverLessThanOrEqualTo(Long value) {
            addCriterion("idriver <=", value, "idriver");
            return (Criteria) this;
        }

        public Criteria andIdriverIn(List<Long> values) {
            addCriterion("idriver in", values, "idriver");
            return (Criteria) this;
        }

        public Criteria andIdriverNotIn(List<Long> values) {
            addCriterion("idriver not in", values, "idriver");
            return (Criteria) this;
        }

        public Criteria andIdriverBetween(Long value1, Long value2) {
            addCriterion("idriver between", value1, value2, "idriver");
            return (Criteria) this;
        }

        public Criteria andIdriverNotBetween(Long value1, Long value2) {
            addCriterion("idriver not between", value1, value2, "idriver");
            return (Criteria) this;
        }

        public Criteria andIcarIsNull() {
            addCriterion("icar is null");
            return (Criteria) this;
        }

        public Criteria andIcarIsNotNull() {
            addCriterion("icar is not null");
            return (Criteria) this;
        }

        public Criteria andIcarEqualTo(Long value) {
            addCriterion("icar =", value, "icar");
            return (Criteria) this;
        }

        public Criteria andIcarNotEqualTo(Long value) {
            addCriterion("icar <>", value, "icar");
            return (Criteria) this;
        }

        public Criteria andIcarGreaterThan(Long value) {
            addCriterion("icar >", value, "icar");
            return (Criteria) this;
        }

        public Criteria andIcarGreaterThanOrEqualTo(Long value) {
            addCriterion("icar >=", value, "icar");
            return (Criteria) this;
        }

        public Criteria andIcarLessThan(Long value) {
            addCriterion("icar <", value, "icar");
            return (Criteria) this;
        }

        public Criteria andIcarLessThanOrEqualTo(Long value) {
            addCriterion("icar <=", value, "icar");
            return (Criteria) this;
        }

        public Criteria andIcarIn(List<Long> values) {
            addCriterion("icar in", values, "icar");
            return (Criteria) this;
        }

        public Criteria andIcarNotIn(List<Long> values) {
            addCriterion("icar not in", values, "icar");
            return (Criteria) this;
        }

        public Criteria andIcarBetween(Long value1, Long value2) {
            addCriterion("icar between", value1, value2, "icar");
            return (Criteria) this;
        }

        public Criteria andIcarNotBetween(Long value1, Long value2) {
            addCriterion("icar not between", value1, value2, "icar");
            return (Criteria) this;
        }

        public Criteria andIcountIsNull() {
            addCriterion("icount is null");
            return (Criteria) this;
        }

        public Criteria andIcountIsNotNull() {
            addCriterion("icount is not null");
            return (Criteria) this;
        }

        public Criteria andIcountEqualTo(Long value) {
            addCriterion("icount =", value, "icount");
            return (Criteria) this;
        }

        public Criteria andIcountNotEqualTo(Long value) {
            addCriterion("icount <>", value, "icount");
            return (Criteria) this;
        }

        public Criteria andIcountGreaterThan(Long value) {
            addCriterion("icount >", value, "icount");
            return (Criteria) this;
        }

        public Criteria andIcountGreaterThanOrEqualTo(Long value) {
            addCriterion("icount >=", value, "icount");
            return (Criteria) this;
        }

        public Criteria andIcountLessThan(Long value) {
            addCriterion("icount <", value, "icount");
            return (Criteria) this;
        }

        public Criteria andIcountLessThanOrEqualTo(Long value) {
            addCriterion("icount <=", value, "icount");
            return (Criteria) this;
        }

        public Criteria andIcountIn(List<Long> values) {
            addCriterion("icount in", values, "icount");
            return (Criteria) this;
        }

        public Criteria andIcountNotIn(List<Long> values) {
            addCriterion("icount not in", values, "icount");
            return (Criteria) this;
        }

        public Criteria andIcountBetween(Long value1, Long value2) {
            addCriterion("icount between", value1, value2, "icount");
            return (Criteria) this;
        }

        public Criteria andIcountNotBetween(Long value1, Long value2) {
            addCriterion("icount not between", value1, value2, "icount");
            return (Criteria) this;
        }

        public Criteria andIremarksIsNull() {
            addCriterion("iremarks is null");
            return (Criteria) this;
        }

        public Criteria andIremarksIsNotNull() {
            addCriterion("iremarks is not null");
            return (Criteria) this;
        }

        public Criteria andIremarksEqualTo(String value) {
            addCriterion("iremarks =", value, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksNotEqualTo(String value) {
            addCriterion("iremarks <>", value, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksGreaterThan(String value) {
            addCriterion("iremarks >", value, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksGreaterThanOrEqualTo(String value) {
            addCriterion("iremarks >=", value, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksLessThan(String value) {
            addCriterion("iremarks <", value, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksLessThanOrEqualTo(String value) {
            addCriterion("iremarks <=", value, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksLike(String value) {
            addCriterion("iremarks like", value, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksNotLike(String value) {
            addCriterion("iremarks not like", value, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksIn(List<String> values) {
            addCriterion("iremarks in", values, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksNotIn(List<String> values) {
            addCriterion("iremarks not in", values, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksBetween(String value1, String value2) {
            addCriterion("iremarks between", value1, value2, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIremarksNotBetween(String value1, String value2) {
            addCriterion("iremarks not between", value1, value2, "iremarks");
            return (Criteria) this;
        }

        public Criteria andIreceiverIsNull() {
            addCriterion("ireceiver is null");
            return (Criteria) this;
        }

        public Criteria andIreceiverIsNotNull() {
            addCriterion("ireceiver is not null");
            return (Criteria) this;
        }

        public Criteria andIreceiverEqualTo(String value) {
            addCriterion("ireceiver =", value, "ireceiver");
            return (Criteria) this;
        }

        public Criteria andIreceiverNotEqualTo(String value) {
            addCriterion("ireceiver <>", value, "ireceiver");
            return (Criteria) this;
        }

        public Criteria andIreceiverGreaterThan(String value) {
            addCriterion("ireceiver >", value, "ireceiver");
            return (Criteria) this;
        }

        public Criteria andIreceiverGreaterThanOrEqualTo(String value) {
            addCriterion("ireceiver >=", value, "ireceiver");
            return (Criteria) this;
        }

        public Criteria andIreceiverLessThan(String value) {
            addCriterion("ireceiver <", value, "ireceiver");
            return (Criteria) this;
        }

        public Criteria andIreceiverLessThanOrEqualTo(String value) {
            addCriterion("ireceiver <=", value, "ireceiver");
            return (Criteria) this;
        }

        public Criteria andIreceiverLike(String value) {
            addCriterion("ireceiver like", value, "ireceiver");
            return (Criteria) this;
        }

        public Criteria andIreceiverNotLike(String value) {
            addCriterion("ireceiver not like", value, "ireceiver");
            return (Criteria) this;
        }

        public Criteria andIreceiverIn(List<String> values) {
            addCriterion("ireceiver in", values, "ireceiver");
            return (Criteria) this;
        }

        public Criteria andIreceiverNotIn(List<String> values) {
            addCriterion("ireceiver not in", values, "ireceiver");
            return (Criteria) this;
        }

        public Criteria andIreceiverBetween(String value1, String value2) {
            addCriterion("ireceiver between", value1, value2, "ireceiver");
            return (Criteria) this;
        }

        public Criteria andIreceiverNotBetween(String value1, String value2) {
            addCriterion("ireceiver not between", value1, value2, "ireceiver");
            return (Criteria) this;
        }

        public Criteria andIreceiverPhoneIsNull() {
            addCriterion("ireceiver_phone is null");
            return (Criteria) this;
        }

        public Criteria andIreceiverPhoneIsNotNull() {
            addCriterion("ireceiver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andIreceiverPhoneEqualTo(String value) {
            addCriterion("ireceiver_phone =", value, "ireceiverPhone");
            return (Criteria) this;
        }

        public Criteria andIreceiverPhoneNotEqualTo(String value) {
            addCriterion("ireceiver_phone <>", value, "ireceiverPhone");
            return (Criteria) this;
        }

        public Criteria andIreceiverPhoneGreaterThan(String value) {
            addCriterion("ireceiver_phone >", value, "ireceiverPhone");
            return (Criteria) this;
        }

        public Criteria andIreceiverPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ireceiver_phone >=", value, "ireceiverPhone");
            return (Criteria) this;
        }

        public Criteria andIreceiverPhoneLessThan(String value) {
            addCriterion("ireceiver_phone <", value, "ireceiverPhone");
            return (Criteria) this;
        }

        public Criteria andIreceiverPhoneLessThanOrEqualTo(String value) {
            addCriterion("ireceiver_phone <=", value, "ireceiverPhone");
            return (Criteria) this;
        }

        public Criteria andIreceiverPhoneLike(String value) {
            addCriterion("ireceiver_phone like", value, "ireceiverPhone");
            return (Criteria) this;
        }

        public Criteria andIreceiverPhoneNotLike(String value) {
            addCriterion("ireceiver_phone not like", value, "ireceiverPhone");
            return (Criteria) this;
        }

        public Criteria andIreceiverPhoneIn(List<String> values) {
            addCriterion("ireceiver_phone in", values, "ireceiverPhone");
            return (Criteria) this;
        }

        public Criteria andIreceiverPhoneNotIn(List<String> values) {
            addCriterion("ireceiver_phone not in", values, "ireceiverPhone");
            return (Criteria) this;
        }

        public Criteria andIreceiverPhoneBetween(String value1, String value2) {
            addCriterion("ireceiver_phone between", value1, value2, "ireceiverPhone");
            return (Criteria) this;
        }

        public Criteria andIreceiverPhoneNotBetween(String value1, String value2) {
            addCriterion("ireceiver_phone not between", value1, value2, "ireceiverPhone");
            return (Criteria) this;
        }

        public Criteria andIcostIsNull() {
            addCriterion("icost is null");
            return (Criteria) this;
        }

        public Criteria andIcostIsNotNull() {
            addCriterion("icost is not null");
            return (Criteria) this;
        }

        public Criteria andIcostEqualTo(String value) {
            addCriterion("icost =", value, "icost");
            return (Criteria) this;
        }

        public Criteria andIcostNotEqualTo(String value) {
            addCriterion("icost <>", value, "icost");
            return (Criteria) this;
        }

        public Criteria andIcostGreaterThan(String value) {
            addCriterion("icost >", value, "icost");
            return (Criteria) this;
        }

        public Criteria andIcostGreaterThanOrEqualTo(String value) {
            addCriterion("icost >=", value, "icost");
            return (Criteria) this;
        }

        public Criteria andIcostLessThan(String value) {
            addCriterion("icost <", value, "icost");
            return (Criteria) this;
        }

        public Criteria andIcostLessThanOrEqualTo(String value) {
            addCriterion("icost <=", value, "icost");
            return (Criteria) this;
        }

        public Criteria andIcostLike(String value) {
            addCriterion("icost like", value, "icost");
            return (Criteria) this;
        }

        public Criteria andIcostNotLike(String value) {
            addCriterion("icost not like", value, "icost");
            return (Criteria) this;
        }

        public Criteria andIcostIn(List<String> values) {
            addCriterion("icost in", values, "icost");
            return (Criteria) this;
        }

        public Criteria andIcostNotIn(List<String> values) {
            addCriterion("icost not in", values, "icost");
            return (Criteria) this;
        }

        public Criteria andIcostBetween(String value1, String value2) {
            addCriterion("icost between", value1, value2, "icost");
            return (Criteria) this;
        }

        public Criteria andIcostNotBetween(String value1, String value2) {
            addCriterion("icost not between", value1, value2, "icost");
            return (Criteria) this;
        }

        public Criteria andSprovinceIsNull() {
            addCriterion("sprovince is null");
            return (Criteria) this;
        }

        public Criteria andSprovinceIsNotNull() {
            addCriterion("sprovince is not null");
            return (Criteria) this;
        }

        public Criteria andSprovinceEqualTo(Long value) {
            addCriterion("sprovince =", value, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceNotEqualTo(Long value) {
            addCriterion("sprovince <>", value, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceGreaterThan(Long value) {
            addCriterion("sprovince >", value, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceGreaterThanOrEqualTo(Long value) {
            addCriterion("sprovince >=", value, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceLessThan(Long value) {
            addCriterion("sprovince <", value, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceLessThanOrEqualTo(Long value) {
            addCriterion("sprovince <=", value, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceIn(List<Long> values) {
            addCriterion("sprovince in", values, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceNotIn(List<Long> values) {
            addCriterion("sprovince not in", values, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceBetween(Long value1, Long value2) {
            addCriterion("sprovince between", value1, value2, "sprovince");
            return (Criteria) this;
        }

        public Criteria andSprovinceNotBetween(Long value1, Long value2) {
            addCriterion("sprovince not between", value1, value2, "sprovince");
            return (Criteria) this;
        }

        public Criteria andScityIsNull() {
            addCriterion("scity is null");
            return (Criteria) this;
        }

        public Criteria andScityIsNotNull() {
            addCriterion("scity is not null");
            return (Criteria) this;
        }

        public Criteria andScityEqualTo(Long value) {
            addCriterion("scity =", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotEqualTo(Long value) {
            addCriterion("scity <>", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityGreaterThan(Long value) {
            addCriterion("scity >", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityGreaterThanOrEqualTo(Long value) {
            addCriterion("scity >=", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityLessThan(Long value) {
            addCriterion("scity <", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityLessThanOrEqualTo(Long value) {
            addCriterion("scity <=", value, "scity");
            return (Criteria) this;
        }

        public Criteria andScityIn(List<Long> values) {
            addCriterion("scity in", values, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotIn(List<Long> values) {
            addCriterion("scity not in", values, "scity");
            return (Criteria) this;
        }

        public Criteria andScityBetween(Long value1, Long value2) {
            addCriterion("scity between", value1, value2, "scity");
            return (Criteria) this;
        }

        public Criteria andScityNotBetween(Long value1, Long value2) {
            addCriterion("scity not between", value1, value2, "scity");
            return (Criteria) this;
        }

        public Criteria andScountyIsNull() {
            addCriterion("scounty is null");
            return (Criteria) this;
        }

        public Criteria andScountyIsNotNull() {
            addCriterion("scounty is not null");
            return (Criteria) this;
        }

        public Criteria andScountyEqualTo(Long value) {
            addCriterion("scounty =", value, "scounty");
            return (Criteria) this;
        }

        public Criteria andScountyNotEqualTo(Long value) {
            addCriterion("scounty <>", value, "scounty");
            return (Criteria) this;
        }

        public Criteria andScountyGreaterThan(Long value) {
            addCriterion("scounty >", value, "scounty");
            return (Criteria) this;
        }

        public Criteria andScountyGreaterThanOrEqualTo(Long value) {
            addCriterion("scounty >=", value, "scounty");
            return (Criteria) this;
        }

        public Criteria andScountyLessThan(Long value) {
            addCriterion("scounty <", value, "scounty");
            return (Criteria) this;
        }

        public Criteria andScountyLessThanOrEqualTo(Long value) {
            addCriterion("scounty <=", value, "scounty");
            return (Criteria) this;
        }

        public Criteria andScountyIn(List<Long> values) {
            addCriterion("scounty in", values, "scounty");
            return (Criteria) this;
        }

        public Criteria andScountyNotIn(List<Long> values) {
            addCriterion("scounty not in", values, "scounty");
            return (Criteria) this;
        }

        public Criteria andScountyBetween(Long value1, Long value2) {
            addCriterion("scounty between", value1, value2, "scounty");
            return (Criteria) this;
        }

        public Criteria andScountyNotBetween(Long value1, Long value2) {
            addCriterion("scounty not between", value1, value2, "scounty");
            return (Criteria) this;
        }

        public Criteria andDprovinceIsNull() {
            addCriterion("dprovince is null");
            return (Criteria) this;
        }

        public Criteria andDprovinceIsNotNull() {
            addCriterion("dprovince is not null");
            return (Criteria) this;
        }

        public Criteria andDprovinceEqualTo(Long value) {
            addCriterion("dprovince =", value, "dprovince");
            return (Criteria) this;
        }

        public Criteria andDprovinceNotEqualTo(Long value) {
            addCriterion("dprovince <>", value, "dprovince");
            return (Criteria) this;
        }

        public Criteria andDprovinceGreaterThan(Long value) {
            addCriterion("dprovince >", value, "dprovince");
            return (Criteria) this;
        }

        public Criteria andDprovinceGreaterThanOrEqualTo(Long value) {
            addCriterion("dprovince >=", value, "dprovince");
            return (Criteria) this;
        }

        public Criteria andDprovinceLessThan(Long value) {
            addCriterion("dprovince <", value, "dprovince");
            return (Criteria) this;
        }

        public Criteria andDprovinceLessThanOrEqualTo(Long value) {
            addCriterion("dprovince <=", value, "dprovince");
            return (Criteria) this;
        }

        public Criteria andDprovinceIn(List<Long> values) {
            addCriterion("dprovince in", values, "dprovince");
            return (Criteria) this;
        }

        public Criteria andDprovinceNotIn(List<Long> values) {
            addCriterion("dprovince not in", values, "dprovince");
            return (Criteria) this;
        }

        public Criteria andDprovinceBetween(Long value1, Long value2) {
            addCriterion("dprovince between", value1, value2, "dprovince");
            return (Criteria) this;
        }

        public Criteria andDprovinceNotBetween(Long value1, Long value2) {
            addCriterion("dprovince not between", value1, value2, "dprovince");
            return (Criteria) this;
        }

        public Criteria andDcityIsNull() {
            addCriterion("dcity is null");
            return (Criteria) this;
        }

        public Criteria andDcityIsNotNull() {
            addCriterion("dcity is not null");
            return (Criteria) this;
        }

        public Criteria andDcityEqualTo(Long value) {
            addCriterion("dcity =", value, "dcity");
            return (Criteria) this;
        }

        public Criteria andDcityNotEqualTo(Long value) {
            addCriterion("dcity <>", value, "dcity");
            return (Criteria) this;
        }

        public Criteria andDcityGreaterThan(Long value) {
            addCriterion("dcity >", value, "dcity");
            return (Criteria) this;
        }

        public Criteria andDcityGreaterThanOrEqualTo(Long value) {
            addCriterion("dcity >=", value, "dcity");
            return (Criteria) this;
        }

        public Criteria andDcityLessThan(Long value) {
            addCriterion("dcity <", value, "dcity");
            return (Criteria) this;
        }

        public Criteria andDcityLessThanOrEqualTo(Long value) {
            addCriterion("dcity <=", value, "dcity");
            return (Criteria) this;
        }

        public Criteria andDcityIn(List<Long> values) {
            addCriterion("dcity in", values, "dcity");
            return (Criteria) this;
        }

        public Criteria andDcityNotIn(List<Long> values) {
            addCriterion("dcity not in", values, "dcity");
            return (Criteria) this;
        }

        public Criteria andDcityBetween(Long value1, Long value2) {
            addCriterion("dcity between", value1, value2, "dcity");
            return (Criteria) this;
        }

        public Criteria andDcityNotBetween(Long value1, Long value2) {
            addCriterion("dcity not between", value1, value2, "dcity");
            return (Criteria) this;
        }

        public Criteria andDcountyIsNull() {
            addCriterion("dcounty is null");
            return (Criteria) this;
        }

        public Criteria andDcountyIsNotNull() {
            addCriterion("dcounty is not null");
            return (Criteria) this;
        }

        public Criteria andDcountyEqualTo(Long value) {
            addCriterion("dcounty =", value, "dcounty");
            return (Criteria) this;
        }

        public Criteria andDcountyNotEqualTo(Long value) {
            addCriterion("dcounty <>", value, "dcounty");
            return (Criteria) this;
        }

        public Criteria andDcountyGreaterThan(Long value) {
            addCriterion("dcounty >", value, "dcounty");
            return (Criteria) this;
        }

        public Criteria andDcountyGreaterThanOrEqualTo(Long value) {
            addCriterion("dcounty >=", value, "dcounty");
            return (Criteria) this;
        }

        public Criteria andDcountyLessThan(Long value) {
            addCriterion("dcounty <", value, "dcounty");
            return (Criteria) this;
        }

        public Criteria andDcountyLessThanOrEqualTo(Long value) {
            addCriterion("dcounty <=", value, "dcounty");
            return (Criteria) this;
        }

        public Criteria andDcountyIn(List<Long> values) {
            addCriterion("dcounty in", values, "dcounty");
            return (Criteria) this;
        }

        public Criteria andDcountyNotIn(List<Long> values) {
            addCriterion("dcounty not in", values, "dcounty");
            return (Criteria) this;
        }

        public Criteria andDcountyBetween(Long value1, Long value2) {
            addCriterion("dcounty between", value1, value2, "dcounty");
            return (Criteria) this;
        }

        public Criteria andDcountyNotBetween(Long value1, Long value2) {
            addCriterion("dcounty not between", value1, value2, "dcounty");
            return (Criteria) this;
        }

        public Criteria andIuserPhoneIsNull() {
            addCriterion("iuser_phone is null");
            return (Criteria) this;
        }

        public Criteria andIuserPhoneIsNotNull() {
            addCriterion("iuser_phone is not null");
            return (Criteria) this;
        }

        public Criteria andIuserPhoneEqualTo(String value) {
            addCriterion("iuser_phone =", value, "iuserPhone");
            return (Criteria) this;
        }

        public Criteria andIuserPhoneNotEqualTo(String value) {
            addCriterion("iuser_phone <>", value, "iuserPhone");
            return (Criteria) this;
        }

        public Criteria andIuserPhoneGreaterThan(String value) {
            addCriterion("iuser_phone >", value, "iuserPhone");
            return (Criteria) this;
        }

        public Criteria andIuserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("iuser_phone >=", value, "iuserPhone");
            return (Criteria) this;
        }

        public Criteria andIuserPhoneLessThan(String value) {
            addCriterion("iuser_phone <", value, "iuserPhone");
            return (Criteria) this;
        }

        public Criteria andIuserPhoneLessThanOrEqualTo(String value) {
            addCriterion("iuser_phone <=", value, "iuserPhone");
            return (Criteria) this;
        }

        public Criteria andIuserPhoneLike(String value) {
            addCriterion("iuser_phone like", value, "iuserPhone");
            return (Criteria) this;
        }

        public Criteria andIuserPhoneNotLike(String value) {
            addCriterion("iuser_phone not like", value, "iuserPhone");
            return (Criteria) this;
        }

        public Criteria andIuserPhoneIn(List<String> values) {
            addCriterion("iuser_phone in", values, "iuserPhone");
            return (Criteria) this;
        }

        public Criteria andIuserPhoneNotIn(List<String> values) {
            addCriterion("iuser_phone not in", values, "iuserPhone");
            return (Criteria) this;
        }

        public Criteria andIuserPhoneBetween(String value1, String value2) {
            addCriterion("iuser_phone between", value1, value2, "iuserPhone");
            return (Criteria) this;
        }

        public Criteria andIuserPhoneNotBetween(String value1, String value2) {
            addCriterion("iuser_phone not between", value1, value2, "iuserPhone");
            return (Criteria) this;
        }

        public Criteria andIuserIsNull() {
            addCriterion("iuser is null");
            return (Criteria) this;
        }

        public Criteria andIuserIsNotNull() {
            addCriterion("iuser is not null");
            return (Criteria) this;
        }

        public Criteria andIuserEqualTo(String value) {
            addCriterion("iuser =", value, "iuser");
            return (Criteria) this;
        }

        public Criteria andIuserNotEqualTo(String value) {
            addCriterion("iuser <>", value, "iuser");
            return (Criteria) this;
        }

        public Criteria andIuserGreaterThan(String value) {
            addCriterion("iuser >", value, "iuser");
            return (Criteria) this;
        }

        public Criteria andIuserGreaterThanOrEqualTo(String value) {
            addCriterion("iuser >=", value, "iuser");
            return (Criteria) this;
        }

        public Criteria andIuserLessThan(String value) {
            addCriterion("iuser <", value, "iuser");
            return (Criteria) this;
        }

        public Criteria andIuserLessThanOrEqualTo(String value) {
            addCriterion("iuser <=", value, "iuser");
            return (Criteria) this;
        }

        public Criteria andIuserLike(String value) {
            addCriterion("iuser like", value, "iuser");
            return (Criteria) this;
        }

        public Criteria andIuserNotLike(String value) {
            addCriterion("iuser not like", value, "iuser");
            return (Criteria) this;
        }

        public Criteria andIuserIn(List<String> values) {
            addCriterion("iuser in", values, "iuser");
            return (Criteria) this;
        }

        public Criteria andIuserNotIn(List<String> values) {
            addCriterion("iuser not in", values, "iuser");
            return (Criteria) this;
        }

        public Criteria andIuserBetween(String value1, String value2) {
            addCriterion("iuser between", value1, value2, "iuser");
            return (Criteria) this;
        }

        public Criteria andIuserNotBetween(String value1, String value2) {
            addCriterion("iuser not between", value1, value2, "iuser");
            return (Criteria) this;
        }

        public Criteria andTypeGood2IsNull() {
            addCriterion("type_good2 is null");
            return (Criteria) this;
        }

        public Criteria andTypeGood2IsNotNull() {
            addCriterion("type_good2 is not null");
            return (Criteria) this;
        }

        public Criteria andTypeGood2EqualTo(Long value) {
            addCriterion("type_good2 =", value, "typeGood2");
            return (Criteria) this;
        }

        public Criteria andTypeGood2NotEqualTo(Long value) {
            addCriterion("type_good2 <>", value, "typeGood2");
            return (Criteria) this;
        }

        public Criteria andTypeGood2GreaterThan(Long value) {
            addCriterion("type_good2 >", value, "typeGood2");
            return (Criteria) this;
        }

        public Criteria andTypeGood2GreaterThanOrEqualTo(Long value) {
            addCriterion("type_good2 >=", value, "typeGood2");
            return (Criteria) this;
        }

        public Criteria andTypeGood2LessThan(Long value) {
            addCriterion("type_good2 <", value, "typeGood2");
            return (Criteria) this;
        }

        public Criteria andTypeGood2LessThanOrEqualTo(Long value) {
            addCriterion("type_good2 <=", value, "typeGood2");
            return (Criteria) this;
        }

        public Criteria andTypeGood2In(List<Long> values) {
            addCriterion("type_good2 in", values, "typeGood2");
            return (Criteria) this;
        }

        public Criteria andTypeGood2NotIn(List<Long> values) {
            addCriterion("type_good2 not in", values, "typeGood2");
            return (Criteria) this;
        }

        public Criteria andTypeGood2Between(Long value1, Long value2) {
            addCriterion("type_good2 between", value1, value2, "typeGood2");
            return (Criteria) this;
        }

        public Criteria andTypeGood2NotBetween(Long value1, Long value2) {
            addCriterion("type_good2 not between", value1, value2, "typeGood2");
            return (Criteria) this;
        }

        public Criteria andIstatusIsNull() {
            addCriterion("istatus is null");
            return (Criteria) this;
        }

        public Criteria andIstatusIsNotNull() {
            addCriterion("istatus is not null");
            return (Criteria) this;
        }

        public Criteria andIstatusEqualTo(Integer value) {
            addCriterion("istatus =", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusNotEqualTo(Integer value) {
            addCriterion("istatus <>", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusGreaterThan(Integer value) {
            addCriterion("istatus >", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("istatus >=", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusLessThan(Integer value) {
            addCriterion("istatus <", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusLessThanOrEqualTo(Integer value) {
            addCriterion("istatus <=", value, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusIn(List<Integer> values) {
            addCriterion("istatus in", values, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusNotIn(List<Integer> values) {
            addCriterion("istatus not in", values, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusBetween(Integer value1, Integer value2) {
            addCriterion("istatus between", value1, value2, "istatus");
            return (Criteria) this;
        }

        public Criteria andIstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("istatus not between", value1, value2, "istatus");
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