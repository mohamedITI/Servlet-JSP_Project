package POJO;

// Generated Mar 22, 2014 10:38:48 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Userinfo generated by hbm2java
 */
public class Userinfo implements java.io.Serializable {

	private String userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	private String userBirthdate;
	private String userJob;
	private String userCreditnumber;
	private double userCreditbalance;
	private String userInterests;
	private String userImage;
	private Set userCarts = new HashSet(0);

	public Userinfo() {
	}

	public Userinfo(String userId, String userName, String userEmail,
			String userPassword, String userBirthdate, double userCreditbalance) {
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userBirthdate = userBirthdate;
		this.userCreditbalance = userCreditbalance;
	}

	public Userinfo(String userId, String userName, String userEmail,
			String userPassword, String userBirthdate, String userJob,
			String userCreditnumber, double userCreditbalance,
			String userInterests, String userImage, Set userCarts) {
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userBirthdate = userBirthdate;
		this.userJob = userJob;
		this.userCreditnumber = userCreditnumber;
		this.userCreditbalance = userCreditbalance;
		this.userInterests = userInterests;
		this.userImage = userImage;
		this.userCarts = userCarts;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserBirthdate() {
		return this.userBirthdate;
	}

	public void setUserBirthdate(String userBirthdate) {
		this.userBirthdate = userBirthdate;
	}

	public String getUserJob() {
		return this.userJob;
	}

	public void setUserJob(String userJob) {
		this.userJob = userJob;
	}

	public String getUserCreditnumber() {
		return this.userCreditnumber;
	}

	public void setUserCreditnumber(String userCreditnumber) {
		this.userCreditnumber = userCreditnumber;
	}

	public double getUserCreditbalance() {
		return this.userCreditbalance;
	}

	public void setUserCreditbalance(double userCreditbalance) {
		this.userCreditbalance = userCreditbalance;
	}

	public String getUserInterests() {
		return this.userInterests;
	}

	public void setUserInterests(String userInterests) {
		this.userInterests = userInterests;
	}

	public String getUserImage() {
		return this.userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public Set getUserCarts() {
		return this.userCarts;
	}

	public void setUserCarts(Set userCarts) {
		this.userCarts = userCarts;
	}

}
