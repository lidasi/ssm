package cwweb.com.model;

public class AdminUser {
    private Integer adminId;

    private String adminUser;

    private String adminPassword;

    private String adminName;

    private Integer adminSex;

    private Integer adminAge;

    private String adminPhone;

    private String adminRelatives;

    private Integer education;

    private Integer position;

    private String entryDate;

    private String createDate;

    private String updateDate;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser == null ? null : adminUser.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public Integer getAdminSex() {
        return adminSex;
    }

    public void setAdminSex(Integer adminSex) {
        this.adminSex = adminSex;
    }

    public Integer getAdminAge() {
        return adminAge;
    }

    public void setAdminAge(Integer adminAge) {
        this.adminAge = adminAge;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone == null ? null : adminPhone.trim();
    }

    public String getAdminRelatives() {
        return adminRelatives;
    }

    public void setAdminRelatives(String adminRelatives) {
        this.adminRelatives = adminRelatives == null ? null : adminRelatives.trim();
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate == null ? null : entryDate.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate == null ? null : updateDate.trim();
    }
}