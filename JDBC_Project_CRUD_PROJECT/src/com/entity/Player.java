package com.entity;

public class Player {
	private int jerseyno;
	private String name;
	private  int runs;
	private int wickets;
	private int age;
	private int joindate;
	private String tname;
	
	public Player() {
		super();
	}
	public Player(int jerseyno, String name, int runs, int wickets, int age, int joindate,String tname) {
		super();
		this.jerseyno = jerseyno;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.age = age;
		this.joindate = joindate;
		this.tname=tname;
	}
	/**
	 * @return the jerseyno
	 */
	public int getJerseyno() {
		return jerseyno;
	}
	/**
	 * @param jerseyno the jerseyno to set
	 */
	public void setJerseyno(int jerseyno) {
		this.jerseyno = jerseyno;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the runs
	 */
	public int getRuns() {
		return runs;
	}
	/**
	 * @param runs the runs to set
	 */
	public void setRuns(int runs) {
		this.runs = runs;
	}
	/**
	 * @return the wickets
	 */
	public int getWickets() {
		return wickets;
	}
	/**
	 * @param wickets the wickets to set
	 */
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the joindate
	 */
	public int getJoindate() {
		return joindate;
	}
	/**
	 * @param joindate the joindate to set
	 */
	public void setJoindate(int joindate) {
		this.joindate = joindate;
	}
	/**
	 * @return the tname
	 */
	public String getTname() {
		return tname;
	}
	/**
	 * @param tname the tname to set
	 */
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Player [jerseyno=" + jerseyno + ", name=" + name + ", runs=" + runs + ", wickets=" + wickets + ", age="
				+ age + ", joindate=" + joindate + ", tname=" + tname + "]";
	}
	
	
}
