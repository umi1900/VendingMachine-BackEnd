package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "report")
public class Report
{
	
	private Long id;
	private String report;
	
	
	public Report() {
	
	}


	public Report(String report) {
		
		this.report = report;
	}

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	 @Column(name = "message", nullable = false)
	public String getReport() {
		return report;
	}


	public void setReport(String report) {
		this.report = report;
	}


	@Override
	public String toString() {
		return "Report [id=" + id + ", report=" + report + "]";
	}
	
	
}
