package com.lizhihao.cms.pojo;

public class User {
	private Integer id;
	
	private String username;
	
	private String headimg;
	
	private String password;
	
	private String nickname;
	
	private String birthday;
	
	private Integer gender;
	
	private Integer locked;
	
	private Integer score;
	
	private Integer role;
	
	private String url;
	
	private String creat_time;
	
	private String update_time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHeadimg() {
		return headimg;
	}

	public void setHeadimg(String headimg) {
		this.headimg = headimg;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getLocked() {
		return locked;
	}

	public void setLocked(Integer locked) {
		this.locked = locked;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCreat_time() {
		return creat_time;
	}

	public void setCreat_time(String creat_time) {
		this.creat_time = creat_time;
	}

	public String getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", headimg=" + headimg + ", password=" + password
				+ ", nickname=" + nickname + ", birthday=" + birthday + ", gender=" + gender + ", locked=" + locked
				+ ", score=" + score + ", role=" + role + ", url=" + url + ", creat_time=" + creat_time
				+ ", update_time=" + update_time + "]";
	}

	public User(Integer id, String username, String headimg, String password, String nickname, String birthday,
			Integer gender, Integer locked, Integer score, Integer role, String url, String creat_time,
			String update_time) {
		super();
		this.id = id;
		this.username = username;
		this.headimg = headimg;
		this.password = password;
		this.nickname = nickname;
		this.birthday = birthday;
		this.gender = gender;
		this.locked = locked;
		this.score = score;
		this.role = role;
		this.url = url;
		this.creat_time = creat_time;
		this.update_time = update_time;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
