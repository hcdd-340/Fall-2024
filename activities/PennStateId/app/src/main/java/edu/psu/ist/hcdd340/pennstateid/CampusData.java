package edu.psu.ist.hcdd340.pennstateid;

class CampusData {
    final private String campusName;
    final private int profileImage;
    final private String email;
    final private String phone;

    public CampusData(String campusName, int profileImage,
                      String email, String phone) {
        this.campusName = campusName;
        this.email = email;
        this.phone = phone;
        this.profileImage = profileImage;
    }


    public String getCampusName() {
        return campusName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getProfileImage() {
        return profileImage;
    }
}
