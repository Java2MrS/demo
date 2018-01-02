package com.dhcc.entity;

public class ObdDrivers {
    private Long cdId;

    private String drivername;

    private String cardno;

    private String telephone;

    private String driverNum;

    private String licesingTime;

    private String drivertypeCode;

    private String driverAge;

    private String compId;

    private String deptmtId;

    private String isDelete;

    private String image;

    public Long getCdId() {
        return cdId;
    }

    public void setCdId(Long cdId) {
        this.cdId = cdId;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername == null ? null : drivername.trim();
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getDriverNum() {
        return driverNum;
    }

    public void setDriverNum(String driverNum) {
        this.driverNum = driverNum == null ? null : driverNum.trim();
    }

    public String getLicesingTime() {
        return licesingTime;
    }

    public void setLicesingTime(String licesingTime) {
        this.licesingTime = licesingTime == null ? null : licesingTime.trim();
    }

    public String getDrivertypeCode() {
        return drivertypeCode;
    }

    public void setDrivertypeCode(String drivertypeCode) {
        this.drivertypeCode = drivertypeCode == null ? null : drivertypeCode.trim();
    }

    public String getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(String driverAge) {
        this.driverAge = driverAge == null ? null : driverAge.trim();
    }

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId == null ? null : compId.trim();
    }

    public String getDeptmtId() {
        return deptmtId;
    }

    public void setDeptmtId(String deptmtId) {
        this.deptmtId = deptmtId == null ? null : deptmtId.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}