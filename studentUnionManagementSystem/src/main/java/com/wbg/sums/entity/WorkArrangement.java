package com.wbg.sums.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class WorkArrangement {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_arrangement.w_id
     *
     * @mbg.generated
     */
    private Integer wId;

    public DepartmentType getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(DepartmentType departmentType) {
        this.departmentType = departmentType;
    }

    private DepartmentType departmentType;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_arrangement.w_title
     *
     * @mbg.generated
     */
    private String wTitle;


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_arrangement.d_id
     *
     * @mbg.generated
     */
    private Integer dId;



    private String mName;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_arrangement.m_id
     *
     * @mbg.generated
     */


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_arrangement.w_date
     *
     * @mbg.generated
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date wDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_arrangement.w_remarks
     *
     * @mbg.generated
     */
    private String wRemarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column work_arrangement.w_contents
     *
     * @mbg.generated
     */
    private String wContents;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_arrangement.w_id
     *
     * @return the value of work_arrangement.w_id
     *
     * @mbg.generated
     */
    public Integer getwId() {
        return wId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_arrangement.w_id
     *
     * @param wId the value for work_arrangement.w_id
     *
     * @mbg.generated
     */
    public void setwId(Integer wId) {
        this.wId = wId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_arrangement.w_title
     *
     * @return the value of work_arrangement.w_title
     *
     * @mbg.generated
     */
    public String getwTitle() {
        return wTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_arrangement.w_title
     *
     * @param wTitle the value for work_arrangement.w_title
     *
     * @mbg.generated
     */
    public void setwTitle(String wTitle) {
        this.wTitle = wTitle == null ? null : wTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_arrangement.d_id
     *
     * @return the value of work_arrangement.d_id
     *
     * @mbg.generated
     */
    public Integer getdId() {
        return dId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_arrangement.d_id
     *
     * @param dId the value for work_arrangement.d_id
     *
     * @mbg.generated
     */
    public void setdId(Integer dId) {
        this.dId = dId;
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_arrangement.w_date
     *
     * @return the value of work_arrangement.w_date
     *
     * @mbg.generated
     */
    public Date getwDate() {
        return wDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_arrangement.w_date
     *
     * @param wDate the value for work_arrangement.w_date
     *
     * @mbg.generated
     */
    public void setwDate(Date wDate) {
        this.wDate = wDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_arrangement.w_remarks
     *
     * @return the value of work_arrangement.w_remarks
     *
     * @mbg.generated
     */
    public String getwRemarks() {
        return wRemarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_arrangement.w_remarks
     *
     * @param wRemarks the value for work_arrangement.w_remarks
     *
     * @mbg.generated
     */
    public void setwRemarks(String wRemarks) {
        this.wRemarks = wRemarks == null ? null : wRemarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column work_arrangement.w_contents
     *
     * @return the value of work_arrangement.w_contents
     *
     * @mbg.generated
     */
    public String getwContents() {
        return wContents;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column work_arrangement.w_contents
     *
     * @param wContents the value for work_arrangement.w_contents
     *
     * @mbg.generated
     */
    public void setwContents(String wContents) {
        this.wContents = wContents == null ? null : wContents.trim();
    }
}